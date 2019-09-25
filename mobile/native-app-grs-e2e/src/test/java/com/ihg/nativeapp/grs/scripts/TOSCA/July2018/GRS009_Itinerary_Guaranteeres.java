package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.WritingToFile;
import com.ihg.nativeapp.screens.AccountLandingPage;
import com.ihg.nativeapp.screens.ChargesSummary;
import com.ihg.nativeapp.screens.FindReservationPage;
import com.ihg.nativeapp.screens.GuestInfoForExplicitUserPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LeftRail;
import com.ihg.nativeapp.screens.OpcoPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectDestinationPage;
import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.UpcomingStays;

public class GRS009_Itinerary_Guaranteeres extends DriverCapabilities {

	String confNumber = null, lastName = null;
	String location;

	@Test(groups = { "smoke", "regression" }, priority = 0)
	public void findReservationHappyScenario() throws Exception {
		FindReservationPage findResUser = new FindReservationPage(innerDriver);

		UpcomingStays upcomingUser = new UpcomingStays(innerDriver);
		Utility util = new Utility();
		
		HomePage homeUser = new HomePage(innerDriver);
		
		SignInPage signUser = new SignInPage(innerDriver);
		LeftRail leftRailUser = new LeftRail(innerDriver);
		FindReservationPage findReservationUser = new FindReservationPage(innerDriver);
		ReservationSummaryPage reservationSummaryUser = new ReservationSummaryPage(innerDriver);
		

		HomePage homeuser = new HomePage(innerDriver);

		DriverWait.staticWait();
		// Handling Push Notification PopUp
		homeuser.allowAppPermission();
		homeuser.handlePushNotificationPopUp();
		homeuser.correctPage();

		
		//switch to int build
		homeUser.changetoINT();
		
		// Clicking Sign In and expanding account landing page for anonymous
		// user
		util.click(homeuser.home_btnSignIn);
		DriverWait.staticWait();

		// SignIn into IHG
		signUser.signInDB(9);
		//if(signUser.confirmation_number_label.isDisplayed())
		signUser.handleConfirmationPageAndReachingHome();
		DriverWait.staticWait();
		

		/*
		// Capturing last name of logged in user
		util.click(signUser.signIn_User);
		accountLandingUser.correctPage();

		String accountLandingPage_LastName = accountLandingUser.accountLanding_memberName.getText();
		String accountLandingPage_LastNameTrim = accountLandingPage_LastName
				.substring(accountLandingPage_LastName.lastIndexOf(" "));
		logger.info(accountLandingPage_LastNameTrim);

		// Updating Confirmation No. to excel file
		WritingToFile writingFileUser = new WritingToFile();
		writingFileUser.updateLastNameToFile(accountLandingPage_LastNameTrim);
		innerDriver.navigate().back();

		// Clicking on Find Hotel button on Home Page
		util.click(homeuser.home_FindHotelBtn);
		locationSearchUser.correctPage();

		// Enter Location
		locationSearchUser.inputLocation(location);
		DriverWait.staticWait();
		util.click(locationSearchUser.locationSearchPage_LocList);
		searchFormUser.correctPage();

		// Click on Search Button
		util.click(searchFormUser.searchForm_Rate_SearchBtn);
		searchResultListViewUser.correctPage();

		// Selecting Hotel
		searchResultListViewUser.selectHotelChina();
		hotelDetailUser.correctPage();

		// Click on Book Now Button and navigating to select a room page
		// Book Hotel
		util.click(hotelDetailUser.hotelDetail_BookNow);
		selectRoomUser.correctPage();
		util.singleScroll();

		// Selecting Room
		selectRoomUser.selectRoom();
		DriverWait.staticWait();
		selectRoomUser.selectRoomType();
		selectARateUser.correctPage();

		// Selecting a rate on Select a rate page
		util.click(selectRateUser.selectRate_BestFlexible);

		// Continue with current selection
		selectARateUser.handleUpgradePage();
		DriverWait.staticWait();
		opcoUser.correctPage();

		// Swipe to Book on OPCO Page
		opcoUser.acceptTnC();
		opcoUser.clickBookNow();
		confirmationUser.correctPage();

		// Clicking on view reservation on pop- up
		util.click(resDetailsUser.reservationDetailPage_viewReservation);

		// Taking the value of confirmation number on Booking Detail Page
		String confirmationNo_BookingDetail = reservationSummaryUser.reservationConfirmationPage_ConfirmationNo
				.getText();
		String confirmationNo_BookingDetailTrim = confirmationNo_BookingDetail.trim();

		// Updating Confirmation No. to excel file
		writingFileUser.updateConfirmationNumberToFile(confirmationNo_BookingDetailTrim);
*/
		// Clicking Hamburger and expanding left rail
		util.click(homeUser.home_btnHanburgerOpened);
		//homeuser.home_btnHamburger.click();
		leftRailUser.correctPage();

		// Clicking on stays
		util.click(leftRailUser.leftRail_Stays);
		upcomingUser.correctPage();
		util.scrollTo("Find Reservation");

		// Verify scenario when user entered valid confirmation and valid last
		// name
		findResUser.findReservationHappyScenarioStaticDb(9); // there is one more
															// function for DB
        System.out.println("Check1");
		util.display(reservationSummaryUser.reservationSummaryPage_HamburgerBtn);
		util.display(reservationSummaryUser.reservationSummaryPage_Logo);
		util.display(reservationSummaryUser.reservationSummaryPage_UserName);
		util.display(reservationSummaryUser.reservationSummaryPage_PointsNumber);
		System.out.println("Check2");
		util.display(reservationSummaryUser.reservationSummaryPage_UserNameImage);
		//util.display(reservationSummaryUser.reservationSummaryPage_HotelImg);
		util.display(reservationSummaryUser.reservationSummaryPage_hotelName);
		//util.display(reservationSummaryUser.reservationSummaryPage_hotelBrandName);
		//util.display(reservationSummaryUser.reservationSummaryPage_ConfirmationLabel);
		util.display(reservationSummaryUser.reservationSummaryPage_ConfirmationNumber);
		util.display(reservationSummaryUser.reservationSummaryPage_ConfirmationModify);
		util.display(reservationSummaryUser.reservationSummaryPage_BookingDates);
	//	util.display(reservationSummaryUser.reservationSummaryPage_EstimationLabel);
		//util.display(reservationSummaryUser.reservationSummaryPage_EstimationPoint);
	//	util.display(reservationSummaryUser.reservationSummaryPage_ReservationMap);
	//	util.display(reservationSummaryUser.reservationSummaryPage_ReservationMapDesc);
	//	util.display(reservationSummaryUser.reservationSummaryPage_SetStayPrefIcon);
		//util.display(reservationSummaryUser.reservationSummaryPage_SetStayPrefText);

		util.singleScroll();
		DriverWait.staticWait();

	//	util.display(reservationSummaryUser.reservationSummaryPage_GuideText);
	//	util.display(reservationSummaryUser.reservationSummaryPage_GuideImg);
	//	util.display(reservationSummaryUser.reservationSummaryPage_GuideDesc);
		util.display(reservationSummaryUser.reservationSummaryPage_HotelDetailIcon);
		//util.display(reservationSummaryUser.reservationSummaryPage_HotelDetailName);
		util.display(reservationSummaryUser.reservationSummaryPage_TransIcon);
		//util.display(reservationSummaryUser.reservationSummaryPage_TransName);
		util.display(reservationSummaryUser.reservationSummaryPage_ThingstodoIcon);
		//util.display(reservationSummaryUser.reservationSummaryPage_ThingstodoName);
		util.display(reservationSummaryUser.reservationSummaryPage_SharehotelIcon);
		//util.display(reservationSummaryUser.reservationSummaryPage_SharehotelName);
		util.display(reservationSummaryUser.reservationSummaryPage_EmailHotelBtn);
		//util.display(reservationSummaryUser.reservationSummaryPage_EmailHotelName);
		//util.display(reservationSummaryUser.reservationSummaryPage_PhoneHotelBtn);
		//util.display(reservationSummaryUser.reservationSummaryPage_PhoneHotelName);

		util.singleScroll();
		util.display(reservationSummaryUser.reservationSummaryPage_WeatherMonth);
		util.display(reservationSummaryUser.reservationSummaryPage_WeatherHiTemp);
		util.display(reservationSummaryUser.reservationSummaryPage_WeatherLowTemp);
		//util.display(reservationSummaryUser.reservationSummaryPage_InteractPager);

		System.out.println("Script passed");
	}

}

