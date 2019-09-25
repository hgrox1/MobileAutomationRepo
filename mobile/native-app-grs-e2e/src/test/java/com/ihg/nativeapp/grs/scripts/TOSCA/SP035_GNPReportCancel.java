package com.ihg.nativeapp.grs.scripts.TOSCA;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.GuestInfoForAnonymousUserPage;
import com.ihg.nativeapp.screens.GuestInfoForExplicitUserPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.OpcoPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectDatesPage;
import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.StayPreferencesPage;

public class SP035_GNPReportCancel extends DriverCapabilities {

    // Database Information
    public static final String dbName = "Tosca_Analytics";
    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";
    public static final String serverport = "1433";
    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    String memberId, pin, checkInDate, checkOutDate, roomType, adultNo, location, hotelName, room, rate, actualHotelName, actualCheckIn, actualCheckOut, actualGuestRoom,
            actualGuestAdult, actualRoom, actualRateType, lastName, actualLastName, confirmationMsg, confirmationNo;
    public String confirmationTrim;;

    @Test(groups = { "smoke", "regression" })
    public void bookingAsGuest() throws Exception {

        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();
        String screenPlayName = "SP35Stage";

        // Handling App Permission PopUp
        homeUser.allowAppPermission();

        // Handling Push Notification PopUp
        homeUser.handlePushNotificationPopUp();
        homeUser.correctPage();

        Utility util = new Utility();
        SignInPage signInUser = new SignInPage(innerDriver);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
        OpcoPage opcoUser = new OpcoPage(innerDriver);
        GuestInfoForExplicitUserPage guestInfoExplicitUser = new GuestInfoForExplicitUserPage(innerDriver);
        ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
        ReservationSummaryPage resSummaryUser = new ReservationSummaryPage(innerDriver);
        
     // Clicking SignIn button on Home Page
        util.click(homeUser.home_btnSignIn);

        // User SignIn
        signInUser.signIn();

        // Handling Confirmation Page
        signInUser.handleConfirmationPageAndReachingHome();

        // Clicking on Find A Hotel Button in Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocationSingleWordFromDB(screenPlayName);
        DriverWait.staticWait();
        util.click(locationSearchUser.locationSearchPage_LocList);
        searchFormUser.correctPage();

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        searchResultListViewUser.correctPage();

        // Selecting Hotel
        DriverWait.staticWait();
        searchResultListViewUser.selectHotel();
        hotelDetailUser.correctPage();

        // Book Hotel
        util.click(hotelDetailUser.hotelDetail_SelectRoom_BookNow);
        selectRoomUser.correctPage();
        util.singleScroll();

        // Selecting Room
        selectRoomUser.selectRoom();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();

        // Selecting a refundable rate on Select a rate page
        util.singleScroll();
        util.singleScroll();
        util.clickList(selectRateUser.selectRate_RateTypeList, 2);
        selectRateUser.handleUpgradePage();
        opcoUser.correctPage();

     // Making a reservation on OPCO Page
        opcoUser.acceptTnC();
        util.click(opcoUser.opco_BookBtn);
        DriverWait.staticWait();
        
        confirmationUser.correctPage();

        // Handling Res Confirmation Pop Up
        String confirmationNo_PopUp = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        resSummaryUser.correctPage();

        // Verifying elements on Reservation Detail Page
        util.display(resSummaryUser.reservationConfirmationPage_ConfirmationNo);

        // Taking the value of confirmation number on Booking Detail Page
        String confirmationNo_BookingDetail = resSummaryUser.reservationConfirmationPage_ConfirmationNo.getText();
        String confirmationNo_BookingDetailTrim = confirmationNo_BookingDetail.trim();

        // Verifying Confirmation Number
        util.assertEqual(confirmationNo_PopUp, confirmationNo_BookingDetailTrim);

       /* // Set Stay preferences
        util.click(resSummaryUser.reservationSummaryPage_SetStayPref);
        StayPreferencesPage setPrefUser = new StayPreferencesPage(innerDriver);
        setPrefUser.correctPage();
        util.click(setPrefUser.stayPref_Early_LatePickerBtn);
        util.click(setPrefUser.stayPref_EarlyRadioBtn);
        util.click(setPrefUser.stayPref_ReasonForStayPickerBtn);
        util.click(setPrefUser.stayPref_BusinessTravelRadioBtn);
*/
        // Updating Database with Conf Number
        System.out.println("Updating the database with ConfNumber: " + confirmationNo_BookingDetailTrim);
        String Query = "UPDATE [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] set ConfNumber = '" + confirmationNo_BookingDetailTrim + "' where ScenarioName = '" + screenPlayName
                + "'";
        ReadFromDatabase updateDatabaseWithConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        updateDatabaseWithConfNumber.updateTable();

        // Reading again from Database
        System.out.println("Reading the updated Confirmation Number from Database");
        String Query1 = "SELECT ConfNumber FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = '" + screenPlayName + "'";
        ;
        ReadFromDatabase readUpdatedConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query1);
        ArrayList<String> resultSetConfNumber = readUpdatedConfNumber.readData();
        String updatedConfNumber = resultSetConfNumber.get(0);
        System.out.println("ConfNumber read from Database: " + updatedConfNumber);

    }

}