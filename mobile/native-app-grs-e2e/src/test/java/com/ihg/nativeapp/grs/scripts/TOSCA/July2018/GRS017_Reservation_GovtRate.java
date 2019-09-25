package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import com.ihg.nativeapp.drivers.DriverCapabilities;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.at.framework.common.Constant;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.GuestInfoForAnonymousUserPage;
import com.ihg.nativeapp.screens.GuestInfoForExplicitUserPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.ReviewReservationPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectAnOption;
import com.ihg.nativeapp.screens.SelectDestinationPage;
import com.ihg.nativeapp.screens.SignInPage;

public class GRS017_Reservation_GovtRate extends DriverCapabilities {
	String location;

	@Test(enabled = true, groups = { "smoke", "regression" }, priority = 0)
	@Parameters({"rateKey"})
    public void bookingFlowExplicit(String rateKey) throws Exception {
		System.out.println(rateKey);
		Utility util = new Utility();
        SignInPage signInUser = new SignInPage(innerDriver);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
        ReviewReservationPage opcoUser = new ReviewReservationPage(innerDriver);
        SelectDestinationPage locationSearchUser = new SelectDestinationPage(innerDriver);
        ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
        ReservationSummaryPage summaryPage = new ReservationSummaryPage(innerDriver);
        ReservationDetailsPage resDetailPage = new ReservationDetailsPage(innerDriver);
		
        // Handle All Push Notifications after launching the app
        HomePage homeUser = new HomePage(innerDriver);
        
        DriverWait.staticWait();
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();

        //Change to INT
        homeUser.changetoINT();
        
        // Clicking SignIn button on Home Page
        util.click(homeUser.home_btnSignIn);

        // User SignIn
        signInUser.signInDB(16);

        // Handling Confirmation Page
        signInUser.handleConfirmationPageAndReachingHome();

        // Clicking on Find A Hotel Button in Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocationSingleWord(this.location);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_LocList);
        util.click(locationSearchUser.locationSearchPage_LocList);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_Destination_FilledSearchBox);

        // Selecting Rate
        DriverWait.staticWait();
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        switch (rateKey) {
        		
		case Constant.GOVERNMENT_RATE:
			 util.display(searchFormUser.searchForm_Rate_GovernmentRate);
		     util.click(searchFormUser.searchForm_Rate_GovernmentRate);
			break;
			
		default:
			 logger.error("FAIL: No Rate passed on Parameters");
			break;
		}
       
        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        DriverWait.waitByElementName(searchResultListViewUser.searchResultListView_Hotel_Distance);

        // Selecting Hotel
        searchResultListViewUser.selectHotel();
        DriverWait.waitByElementName(hotelDetailUser.hotelDetail_BookNow);

        // Book Hotel
        //util.display(hotelDetailUser.hotelDetail_bookNowRate);
        util.click(hotelDetailUser.hotelDetail_BookNow);
        
        // Selecting Room
        selectRoomUser.selectRoom();
        DriverWait.staticWait();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();

        // Selecting an Option on Select Rate Page
        switch (rateKey) {
        
        
		case Constant.GOVERNMENT_RATE:
			util.display(selectRateUser.selectRate_GovernmentRate);
			break;
		
		default:
			 logger.error("FAIL: No Rate passed on Parameters");
			break;
		}
        util.clickList(selectRateUser.selectRate_Container, 0);
        
        // Swipe to Book on OPCO Page
        util.display(opcoUser.opco_RateType);
        opcoUser.acceptTnC();
        opcoUser.clickBookNow();
        confirmationUser.correctPage();
        
        // Clicking on the View Reservation Button on Confirmation Pop Up
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        DriverWait.waitById("com.ihg.apps.android:id/reservation_info_confirmation_number_label");
        util.click(summaryPage.reservationSummaryPage_ConfirmationLabel);
        util.display(resDetailPage.reservationDetailPage_RateName);
    }
	
	
	
	@Test(enabled = true, groups = { "smoke", "regression" }, priority = 1)
	@Parameters({"rateKey"})
    public void bookingFlowAnonymous(String rateKey) throws IOException, InterruptedException {
		System.out.println(rateKey);
		Utility util = new Utility();
        SignInPage signInUser = new SignInPage(innerDriver);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
        ReviewReservationPage opcoUser = new ReviewReservationPage(innerDriver);
        SelectDestinationPage locationSearchUser = new SelectDestinationPage(innerDriver);
        ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
        ReservationSummaryPage summaryPage = new ReservationSummaryPage(innerDriver);
        ReservationDetailsPage resDetailPage = new ReservationDetailsPage(innerDriver);
		
        // Handle All Push Notifications after launching the app
        HomePage homeUser = new HomePage(innerDriver);
        
        DriverWait.staticWait();
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();

        // Handling Confirmation Page
        signInUser.handleConfirmationPageAndReachingHome();

        //Change to INT
        homeUser.changetoINT();
        
        // Clicking on Find A Hotel Button in Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocationSingleWord(this.location);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_LocList);
        util.click(locationSearchUser.locationSearchPage_LocList);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_Destination_FilledSearchBox);

        // Selecting Rate
        DriverWait.staticWait();
        util.click(searchFormUser.searchForm_Children_PlusBtn);
        DriverWait.staticWait();
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        switch (rateKey) {
       
			
		case Constant.AAA_CAA_MEMBERSHIP_RATE:
			 util.display(searchFormUser.searchForm_Rate_GovernmentRate);
		     util.click(searchFormUser.searchForm_Rate_GovernmentRate);
			break;
			
		default:
			 logger.error("FAIL: No Rate passed on Parameters");
			break;
		}
       
        // Click on Search Button
        //util.click(searchFormUser.searchForm_SearchBtn);
        util.click(searchFormUser.searchForm_Rate_SearchBtn);
        DriverWait.waitByElementName(searchResultListViewUser.searchResultListView_Hotel_Distance);

        // Selecting Hotel
        searchResultListViewUser.selectHotel();
        DriverWait.waitByElementName(hotelDetailUser.hotelDetail_BookNow);

        // Book Hotel
        //util.display(hotelDetailUser.hotelDetail_bookNowRate);
        util.click(hotelDetailUser.hotelDetail_BookNow);
        
        // Selecting Room
        selectRoomUser.selectRoom();
        DriverWait.staticWait();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();

        // Selecting an Option on Select Rate Page
        /*switch (rateKey) {
        
			
		case Constant.AAA_CAA_MEMBERSHIP_RATE:
			util.display(selectRateUser.selectRate_GovernmentRate);
			break;
			
		default:
			 logger.error("FAIL: No Rate passed on Parameters");
			break;
		}*/
       // util.clickList(selectRateUser.selectRate_Container, 0);
        
        // Joining membership
        GuestInfoForAnonymousUserPage guestInfoAnonymousUser = new GuestInfoForAnonymousUserPage(innerDriver);
        guestInfoAnonymousUser.correctPage();
        // Entering Guest data
        //guestInfoAnonymousUser.GuestInfostatic();
        guestInfoAnonymousUser.GuestInfo();
        // Swipe to book on Guest Info Page
        //util.click(guestInfoAnonymousUser.guestInfo_SwipeToBook);
        
        
      //  opcoUser.OPCOentercc("MM");
      //  opcoUser.acceptTnC();
        //Scroll to Book Now
        util.scrollTo("Book Now");
        guestInfoAnonymousUser.clickBookNow();
        confirmationUser.correctPage();
     
        // Clicking on the View Reservation Button on Confirmation Pop Up
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        DriverWait.waitById("com.ihg.apps.android:id/reservation_info_confirmation_number_label");
        util.click(summaryPage.reservationSummaryPage_ConfirmationLabel);
        util.display(resDetailPage.reservationDetailPage_RateName);
    }
	
}


