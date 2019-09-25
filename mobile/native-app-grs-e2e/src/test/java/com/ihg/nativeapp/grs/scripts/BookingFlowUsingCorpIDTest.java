package com.ihg.nativeapp.grs.scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.AccountLandingPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.OpcoPage;
import com.ihg.nativeapp.screens.PointsAndCashPage;
import com.ihg.nativeapp.screens.RedeemPointsPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectAnOption;
import com.ihg.nativeapp.screens.SignInPage;

public class BookingFlowUsingCorpIDTest extends DriverCapabilities {

    // Database Information
    public static final String dbName = "Tosca_Analytics";
    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";
    public static final String serverport = "1433";
    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    String memberId, pin, location, confirmationMsg;

    // TC4: Complete booking flow using Corp id
    @Test(groups = { "smoke", "regression" }, priority = 0)
    public void bookingUsingCorpId() throws Exception {

        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling App Permission PopUp
        homeUser.allowAppPermission();

        // Handling Push Notification PopUp
        homeUser.handlePushNotificationPopUp();
        homeUser.correctPage();

        String Day = "2";

        Utility util = new Utility();
        SignInPage signInUser = new SignInPage(innerDriver);
        RedeemPointsPage redeemPointsUser = new RedeemPointsPage(innerDriver);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
        OpcoPage opcoUser = new OpcoPage(innerDriver);
        ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
        ReservationSummaryPage reservationConfirmationUser = new ReservationSummaryPage(innerDriver);
        PointsAndCashPage pointsAndCashUser = new PointsAndCashPage(innerDriver);
        AccountLandingPage rightRailUser = new AccountLandingPage(innerDriver);
        SelectAnOption selectAnOptionUser = new SelectAnOption(innerDriver);

        // Clicking SignIn button on Home Page
        util.click(homeUser.home_btnSignIn);

        // User SignIn
        signInUser.signInDB(Day);
        signInUser.handleConfirmationPageAndReachingHome();

        // Clicking on Find Hotel button on Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocationSingleWordFromDB(Day);
        util.click(locationSearchUser.locationSearchPage_LocList);
        searchFormUser.correctPage();

        // Enter Corp Id
        searchFormUser.enterCorpIdFromDatabase(Day);

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        searchResultListViewUser.correctPage();

        // Selecting Hotel
        DriverWait.staticWait();
        searchResultListViewUser.selectHotel();
        hotelDetailUser.correctPage();

        // Book Hotel
        util.click(hotelDetailUser.hotelDetail_BookNow);
        selectRoomUser.correctPage();
        util.singleScroll();

        // Selecting Room
        selectRoomUser.selectRoom();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();

        // Selecting a refundable rate on Select a rate page
        util.scrollTo("Best Flexible Rate");
        util.click(selectRateUser.selectRate_BestFlexible);
        selectRateUser.handleUpgradePage();
        opcoUser.correctPage();

        // Making a reservation on OPCO Page
        opcoUser.acceptTnC();
        util.click(opcoUser.opco_BookBtn);
        DriverWait.staticWait();

        confirmationUser.correctPage();

        String confirmationNo_PopUp = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        reservationConfirmationUser.correctPage();

        // Verifying elements on Reservation Detail Page
        util.display(reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo);

        // Taking the value of confirmation number on Booking Detail Page
        String confirmationNo_BookingDetail = reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo.getText();
        String confirmationNo_BookingDetailTrim = confirmationNo_BookingDetail.trim();

        // Verifying Confirmation Number
        util.assertEqual(confirmationNo_PopUp, confirmationNo_BookingDetailTrim);

        // Updating Database with Conf Number
        System.out.println("Updating the database with ConfNumber: " + confirmationNo_BookingDetailTrim);
        String Query = "UPDATE [Tosca_GRS_TDM].[dbo].[GRS_PreProductionSanity] set ConfNumber3 = '" + confirmationNo_BookingDetailTrim + "' where Day = '2'";
        ReadFromDatabase updateDatabaseWithConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        updateDatabaseWithConfNumber.updateTable();

        // Reading again from Database
        System.out.println("Reading the updated Confirmation Number from Database");
        String Query1 = "SELECT ConfNumber3 FROM [Tosca_GRS_TDM].[dbo].[GRS_PreProductionSanity] WHERE Day = '2'";
        ;
        ReadFromDatabase readUpdatedConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query1);
        ArrayList<String> resultSetConfNumber = readUpdatedConfNumber.readData();
        String updatedConfNumber = resultSetConfNumber.get(0);
        System.out.println("ConfNumber read from Database: " + updatedConfNumber);

    }

}