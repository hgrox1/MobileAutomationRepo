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

public class BookingFlowUsingPointsAndCashTest extends DriverCapabilities {

    public static final String dbName = "Tosca_Analytics";
    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";
    public static final String serverport = "1433";
    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    String memberId, pin, checkInDate, checkOutDate, roomType, adultNo, location, hotelName, room, rate, actualHotelName, actualCheckIn, actualCheckOut, actualGuestRoom,
            actualGuestAdult, actualRoom, actualRateType, lastName, actualLastName;

    String pointsBeforeBooking;

    @Test(groups = { "smoke", "regression" }, priority = 0)
    public void byPointsOnly() throws Exception {

        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling App Permission PopUp
        homeUser.allowAppPermission();

        // Handling Push Notification PopUp
        homeUser.handlePushNotificationPopUp();
        homeUser.correctPage();

        String Day = "1";

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

        // Selecting Rate
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        util.click(searchFormUser.searchForm_Rate_RewardNights);

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        DriverWait.waitById("com.ihg.apps.android:id/search_result_hotel_distance");

        // Selecting Hotel
        searchResultListViewUser.selectHotel();
        // DriverWait.waitById("com.ihg.apps.android:id/book_now_book_now_label");

        // Book Hotel
        DriverWait.staticWait();
        util.click(hotelDetailUser.hotelDetail_SelectRoom_BookNow);
        DriverWait.staticWait();

        // Selecting Room
        selectRoomUser.selectRoom();
        DriverWait.staticWait();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();

        // Selecting an Option on Select Rate Page
        this.rate = selectRateUser.selectRate_RewardNights.getText();
        util.click(selectRateUser.selectRate_RewardNights);

        selectAnOptionUser.displayPoints();

        // Clicking an option on Select an Option Page
        util.click(selectAnOptionUser.pointsOption.get(0));
        util.doubleScroll();
        opcoUser.acceptTnC();
        // DriverWait.waitById("com.ihg.apps.android:id/reserve_bow__book_bow_btn");

        // Swipe to Book on OPCO Page
        opcoUser.clickBookNow();
        confirmationUser.correctPage();

        // Taking the value of confirmation number on Confirmation Pop Up
        String confirmationNo_PopUp = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();

        // Clicking on the View Reservation Button on Confirmation Pop Up
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        DriverWait.waitById("com.ihg.apps.android:id/confirmation_number_module__number");

        // Taking the value of confirmation number on Booking Detail Page
        String confirmationNo_Page = reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo.getText();
        String confirmationNo_Page_Trim = confirmationNo_Page.trim();

        // Verifying Confirmation Number
        util.assertEqual(confirmationNo_PopUp, confirmationNo_Page_Trim);

        // Updating Database with Conf Number
        System.out.println("Updating the database with ConfNumber: " + confirmationNo_Page);
        String Query = "UPDATE [Tosca_GRS_TDM].[dbo].[GRS_PreProductionSanity] set ConfNumber3 = '" + confirmationNo_Page_Trim + "' where Day = '1'";
        ReadFromDatabase updateDatabaseWithConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        updateDatabaseWithConfNumber.updateTable();

        // Reading again from Database
        System.out.println("Reading the updated Confirmation Number from Database");
        String Query1 = "SELECT ConfNumber FROM [Tosca_GRS_TDM].[dbo].[GRS_PreProductionSanity] WHERE Day = '1'";
        ;
        ReadFromDatabase readUpdatedConfNumber = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query1);
        ArrayList<String> resultSetConfNumber = readUpdatedConfNumber.readData();
        String updatedConfNumber = resultSetConfNumber.get(0);
        System.out.println("ConfNumber read from Database: " + updatedConfNumber);

    }

}