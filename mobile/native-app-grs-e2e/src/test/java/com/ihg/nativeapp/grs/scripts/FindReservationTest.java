package com.ihg.nativeapp.grs.scripts;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.FindReservationPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.LeftRail;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.UpcomingStays;

public class FindReservationTest extends DriverCapabilities {

    String confNumber = null, lastName = null;
    String location;

    @Test(groups = { "smoke", "regression" })
    public void findReservationHappyScenario() throws Exception {

        FindReservationPage findResUser = new FindReservationPage(innerDriver);
        UpcomingStays upcomingUser = new UpcomingStays(innerDriver);
        Utility util = new Utility();
        HomePage homeUser = new HomePage(innerDriver);
        ReservationSummaryPage resSummarUser = new ReservationSummaryPage(innerDriver);
        ReservationDetailsPage resDetailsUser = new ReservationDetailsPage(innerDriver);
        LeftRail leftRailUser = new LeftRail(innerDriver);
        HomePage homeuser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling Push Notification PopUp
        homeuser.allowAppPermission();
        homeuser.handlePushNotificationPopUp();
        homeuser.correctPage();

        // Clicking Hamburger and expanding left rail
        util.click(homeUser.home_btnHamburger);
        leftRailUser.correctPage();

        // Clicking on stays
        util.click(leftRailUser.leftRail_Stays);
        upcomingUser.correctPage();
        util.scrollTo("Find Reservation");

        // Verify scenario when user entered valid confirmation and valid last name
        String confNumberFromDb = findResUser.findReservationHappyScenario();

        // Navigating on Confirmation screen and verifying elements
        util.display(resSummarUser.reservationConfirmationPage_ConfirmationNo);
        util.click(resSummarUser.reservationConfirmationPage_ConfirmationNo);
        DriverWait.staticWait();
        String confirmationNo_BookingDetail = resDetailsUser.reservationDetailPage_ConfirmationNumber.getText();
        String confirmationNo_BookingDetailTrim = confirmationNo_BookingDetail.trim();
        util.assertEqual(confNumberFromDb, confirmationNo_BookingDetailTrim);
    }

}