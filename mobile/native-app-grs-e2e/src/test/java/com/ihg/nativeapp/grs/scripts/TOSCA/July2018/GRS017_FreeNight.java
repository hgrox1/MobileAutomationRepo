package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import com.ihg.nativeapp.drivers.DriverCapabilities;
import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.at.framework.common.Constant;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.AboutAndLegalPage;
import com.ihg.nativeapp.screens.GuestInfoForAnonymousUserPage;
import com.ihg.nativeapp.screens.GuestInfoForExplicitUserPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.ReviewReservationPage;
import com.ihg.nativeapp.screens.SearchFilterPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectAnOption;
import com.ihg.nativeapp.screens.SelectDatesPage;
import com.ihg.nativeapp.screens.SelectDestinationPage;
import com.ihg.nativeapp.screens.SignInPage;

public class GRS017_FreeNight extends DriverCapabilities {
	String location="Atlanta, GA";
	//String PropName="GRS TEST PROPERTY FILAT-Opera";
	String PropName="Atlanta-Buckhead";
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
        SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
        GuestInfoForAnonymousUserPage Guestpage=new GuestInfoForAnonymousUserPage(innerDriver);
		
        // Handle All Push Notifications after launching the app
        HomePage homeUser = new HomePage(innerDriver);
        AboutAndLegalPage aboutlegal = new AboutAndLegalPage(innerDriver);
        DriverWait.staticWait();
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();

        //Change Config
        DriverWait.staticWait();
        homeUser.changetoINT();
        
        // Clicking SignIn button on Home Page
       util.click(homeUser.home_btnSignIn);
       DriverWait.staticWait();
       
       // User SignIn
       signInUser.signInDB(16);
       DriverWait.staticWait();
       
       
       
       // Handling Confirmation Page
        signInUser.handleConfirmationPageAndReachingHome();

        // Clicking on Find A Hotel Button in Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocation(this.location);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_LocList);
        util.click(locationSearchUser.locationSearchPage_LocList);
        DriverWait.waitByElementName(locationSearchUser.locationSearchPage_Destination_FilledSearchBox);

        
       // Selecting Check-in/Check-out date
        SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
        util.click(searchFormUser.searchForm_CheckInDayOfMonth);
        selectDateUser.correctPage();
        // util.click(selectDateUser.selectDatesPage_CheckOutLabel);
        util.singleScroll();
        util.click(selectDateUser.selectDatesPage_CheckInDateValue);
        util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
        util.click(selectDateUser.selectDatesPage_DoneBtn);
        DriverWait.staticWait();
        DriverWait.staticWait();
        util.click(searchFormUser.searchForm_Children_PlusBtn);
        //increasing child to 1
        util.click(searchFormUser.searchForm_Children_PlusBtn);
       
        // Selecting Rate
        DriverWait.staticWait();
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        switch (rateKey) {
        		
		case Constant.FreeNight:
			 util.display(searchFormUser.searchForm_Rate_FreeNight);
		     util.click(searchFormUser.searchForm_Rate_FreeNight);
			break;
			
		default:
			 logger.error("FAIL: No Rate passed on Parameters");
			break;
		}
       
        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        DriverWait.waitByElementName(searchResultListViewUser.searchResultListView_Hotel_Distance);

        // Selecting Hotel
        
        util.click(searchBrands.searchFilter_button);
        logger.info("Pass: Reach to the Filter Page");
        util.scrollTo("All IHG");
        logger.info("Pass: Unselect the All IHG Brands");
        util.click(searchBrands.ihgBrand_button);
        logger.info(searchBrands.ihgBrand_button.getText()+" are unselected");
        DriverWait.staticWait();
       /* 
        util.scrollTo("Holiday Inn Hotels & Resorts'");
       logger.info("Pass: Select the " +searchBrands.ihgBrand_HolidayInn.getText());
       util.click(searchBrands.ihgBrand_HolidayInn);*/
        
        //Selecting different hotel
        util.scrollTo("Staybridge Suites");
       logger.info("Pass: Select the " +searchBrands.ihgBrand_StayBridge.getText());
       util.click(searchBrands.ihgBrand_StayBridge);
        
       // Click on Apply
        util.click(searchBrands.searchFilter_ApplyBtn);
        logger.info("Pass: Filter Applied");
        DriverWait.staticWait();
        
        //scroll to property
        util.scrollTo(PropName);
        logger.info("Pass: Hotel Found");

        // Book Hotel
        
        //util.click(searchResultListViewUser.searchResultListView_RateAvailable);
        util.click(searchResultListViewUser.clickATLBK); 
        //util.display(hotelDetailUser.hotelDetail_bookNowRate);
        DriverWait.staticWait();
        DriverWait.staticWait();
        util.click(hotelDetailUser.hotelDetail_BookNow_Freenights);
        
        // Selecting Room
        /*selectRoomUser.selectRoom();
        DriverWait.staticWait();
        selectRoomUser.selectRoomType();
        selectRateUser.correctPage();*/
        
        // new room selection 
        selectRoomUser.selectRoom();
        DriverWait.staticWait();
        selectRoomUser.selectRoomType();
        //selectRateUser.correctPage();
        
        //Check the terms and condition
        Guestpage.correctPage();
        util.scrollTo("I certify that:");
        DriverWait.staticWait();
        util.click(Guestpage.guestInfo_TnC);
       // guestInfoAnonymousUser.GuestInfo();
       
        //Click on Book now
        util.scrollTo("Book Now");
        Guestpage.clickBookNow();
        DriverWait.staticWait();
        confirmationUser.correctPage();
 
        // Clicking on the View Reservation Button on Confirmation Pop Up
        util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
        DriverWait.waitById("com.ihg.apps.android:id/reservation_info_confirmation_number_label");
        util.click(summaryPage.reservationSummaryPage_ConfirmationLabel);
        util.display(resDetailPage.reservationDetailPage_RateName);
    }
	
	
	
	
    
}


