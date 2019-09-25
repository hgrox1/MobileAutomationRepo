package com.ihg.nativeapp.grs.scripts.TOSCA;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.FindReservationPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.LeftRail;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.UpcomingStays;

public class SP054_ReservationPromotionToNon extends DriverCapabilities {

    String confNumber = null, lastName = null;
    String location;

    @Test(groups = { "smoke", "regression" })
    public void findReservation() throws Exception {

        String screenPlayName = "SP54Stage";
        FindReservationPage findResUser = new FindReservationPage(innerDriver);
        UpcomingStays upcomingUser = new UpcomingStays(innerDriver);
        Utility util = new Utility();
        HomePage homeUser = new HomePage(innerDriver);
        ReservationSummaryPage resSummaryUser = new ReservationSummaryPage(innerDriver);
        SignInPage signUser = new SignInPage(innerDriver);
        LeftRail leftRailUser = new LeftRail(innerDriver);
        HomePage homeuser = new HomePage(innerDriver);
        ReservationDetailsPage resDetailUser = new ReservationDetailsPage(innerDriver);
        DriverWait.staticWait();

        // Handling Push Notification PopUp
        homeuser.allowAppPermission();
        homeuser.handlePushNotificationPopUp();
        homeuser.correctPage();

        // Clicking Sign In
        util.click(homeuser.home_btnSignIn);
        DriverWait.staticWait();

        // SignIn into IHG
        signUser.signInDB(screenPlayName);
        signUser.handleConfirmationPageAndReachingHome();

        // Clicking Hamburger and expanding left rail
        util.click(homeUser.home_btnHamburger);
        leftRailUser.correctPage();

        // Clicking on stays
        util.click(leftRailUser.leftRail_Stays);
        upcomingUser.correctPage();
        util.scrollTo("Find Reservation");

        // Verify scenario when user entered valid confirmation and valid last name
        String confNumberFromDb = findResUser.findReservationDB(screenPlayName);

        // Navigating on Confirmation screen and verifying elements
        util.display(resSummaryUser.reservationSummaryPage_ConfirmationNumber);
        DriverWait.staticWait();
        String confirmationNo_BookingDetail = resSummaryUser.reservationSummaryPage_ConfirmationNumber.getText();
        util.assertEqual(confNumberFromDb, confirmationNo_BookingDetail);
    }

}