package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LocationSearchPage;

import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;

import com.ihg.nativeapp.screens.ReviewReservationPage;
import com.ihg.nativeapp.screens.SearchFilterPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;

import com.ihg.nativeapp.screens.SignInPage;

import io.appium.java_client.MobileElement;


public class GRS019_Rate_category_Restrictions extends DriverCapabilities
{
	
//  Verify that Best flexible rate is available and user is able to create reservation and if not then user should be restricted
//  Set Rate Category Restriction for minimum 5 days
	    
	String confirmationMsg, location, confirmationNo, confirmationTrim,Brandname = "";
	
	@Test(groups = { "smoke", "regression" }, priority = 0)
			
	public void ValidateBestFlexibleIsavailable() throws Exception {

				HomePage homeuser = new HomePage(innerDriver);
				Utility util = new Utility();   
				SignInPage signUser = new SignInPage(innerDriver);
				LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
				SearchForm searchFormUser = new SearchForm(innerDriver);
				SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
				HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
				SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
				SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
				ReviewReservationPage opcoUser = new ReviewReservationPage(innerDriver);
				ReservationConfirmationPopUp confirmationPopUpUser = new ReservationConfirmationPopUp(innerDriver);
				ReservationDetailsPage reservationDetailsUser = new ReservationDetailsPage(innerDriver);
				ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
				ReservationSummaryPage reservationConfirmationUser = new ReservationSummaryPage(innerDriver);
				SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
				
				//Test Data
				String PropName = "TEXARKANA";
			    String Destination="Atlanta,TX";
		        System.out.println("Property "+PropName);
				
		        // Handling Push Notification PopUp 
		        DriverWait.staticWait();
				homeuser.allowAppPermission();
				homeuser.handlePushNotificationPopUp();
								
				//change Env to INT
				homeuser.changetoINT();
				
				// Clicking Sign In and expanding right rail
				util.click(homeuser.home_btnSignIn);
				DriverWait.staticWait();
				
				// SignIn into IHG
				signUser.signInDB(16);
				DriverWait.staticWait();
				
				// Handling Confirmation Page
				signUser.handleConfirmationPageAndReachingHome();
								
				// Clicking on Find Hotel button on Home Page
		        util.click(homeuser.home_FindHotelBtn);
		        locationSearchUser.correctPage();

		        //Enter Destination Location
		        locationSearchUser.inputLocationSpecialEvent(Destination);
				DriverWait.staticWait();
				util.click(locationSearchUser.locationSearchPage_LocList);
				DriverWait.staticWait();
				
				//Validate Rate category = Best Flexible 
				util.display(searchFormUser.searchForm_Rate_BestAvailable);
				logger.info("Pass: Best Flexible Rate is selected");
				
				// Verifying Search Form page
				searchFormUser.correctPage();
				
				// Click on Search Button
				util.click(searchFormUser.searchForm_Rate_SearchBtn);
				searchResultListViewUser.correctPage();
		        DriverWait.staticWait();
		        
		        //Click on Filter and select brand
		        util.click(searchBrands.searchFilter_button);
		        logger.info("Pass: Reach to the Filter Page");
		        util.scrollTo("All IHG");
		        logger.info("Pass: Unselect the All IHG Brands");
		        util.click(searchBrands.ihgBrand_button);
		        logger.info(searchBrands.ihgBrand_button.getText()+"is unselected");
		        util.scrollTo("Holiday Inn Express Hotels & Resorts");
		        logger.info("Pass: Select the " +searchBrands.searchFilter_HolidayInnExpressHotelsResorts.getText());
		        util.click(searchBrands.searchFilter_HolidayInnExpressHotelsResorts);
		        util.click(searchBrands.searchFilter_ApplyBtn);
		        logger.info("Pass: Filter Applied");
		        DriverWait.staticWait();
		       
		        //Navigate to property and select it
		        util.scrollTo(PropName);
		        logger.info("Pass: Hotel Found");
		        
		        // Selecting Hotel
				searchResultListViewUser.selectHotelSpecific(PropName);
				hotelDetailUser.correctPage();
			
				// Click on Book Now Button and navigating to select a room page
				util.click(hotelDetailUser.hotelDetail_BookNow);
				selectRoomUser.correctPage();
				util.singleScroll();
						
				// Selecting Room
				selectRoomUser.selectRoom();
				selectRoomUser.selectRoomType19();
				selectRateUser.correctPage();

				// Selecting a refundable rate on Select a rate page
				//if(util.display_return(selectRateUser.selectRate_BestFlexible))
				Iterator <MobileElement> iterator = selectRateUser.selectRate_BestFlexible1.iterator();
				while(iterator.hasNext()) {
					MobileElement currentX = iterator.next();
					System.out.println(currentX.getText());
					if(currentX.getText().equalsIgnoreCase("BEST FLEXIBLE RATE"))
					{
						logger.info("Rate available");
					}
					
					
				    
				}
				//Scroll
				util.singleScroll();
				//again iterating
				Iterator <MobileElement> iterator1 = selectRateUser.selectRate_BestFlexible1.iterator();
				while(iterator1.hasNext()) {
					MobileElement currentX = iterator1.next();
					System.out.println(currentX.getText());
					if(currentX.getText().equalsIgnoreCase("BEST FLEXIBLE RATE"))
					{
						logger.info("Rate available");
					}
					
					
				    
				}
				
				
					logger.info("Rate not available");
				
				selectRateUser.handleUpgradePage();
				/*if(selectRateUser.selectRate_BestFlexible.isDisplayed())
				{
				util.scrollTo("Best Flexible Rate");
				util.click(selectRateUser.selectRate_BestFlexible);
				logger.info("Rate available");
				}
				else 
				{
					logger.info("Rate not available");
				}
				selectRateUser.handleUpgradePage();*/
				
						
				
			}
			
}

