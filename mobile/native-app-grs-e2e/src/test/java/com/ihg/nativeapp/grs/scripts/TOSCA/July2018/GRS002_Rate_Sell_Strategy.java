package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.SearchFilterPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARateUpgradePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SignInPage;


public class GRS002_Rate_Sell_Strategy extends DriverCapabilities
{
	
//  Validate that  the existing Hotel Rate Sell Strategy defined for the property in AHP and validate that user is able to view the updated Rates sequence while triggering the availability for that property from Mobile
	//	hotelName = Amsterdam - Sloterdijk Station
	String confirmationMsg, confirmationNo, confirmationTrim;
		 
	    
			@Test(groups = { "smoke", "regression" }, priority = 0)
			public void validateRateCategoryAvailable() throws Exception {
				
				
				String PropName = "Texarkana";
			     String Destination = "Atlanta, TX";
			     String Brand = "Holiday Inn Express Hotels & Resorts";

		        
		        
				HomePage homeuser = new HomePage(innerDriver);
				Utility util = new Utility();
				SignInPage signUser = new SignInPage(innerDriver);
				LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
				SearchForm searchFormUser = new SearchForm(innerDriver);		
				SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
				HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
				SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
				SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
				SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
				SelectARateUpgradePage upgraderate=new SelectARateUpgradePage(innerDriver);
				
				
				// Handling Push Notification PopUp 
				DriverWait.staticWait();
				homeuser.allowAppPermission();
				homeuser.handlePushNotificationPopUp();
				
				//change to INT
				homeuser.changetoINT();
				
				// Clicking Sign In and expanding right rail
				util.click(homeuser.home_btnSignIn);
				DriverWait.staticWait();
				
				// SignIn into IHG
				signUser.signInDB(2);
				signUser.handleConfirmationPageAndReachingHome();
						
				// Clicking on Find Hotel button on Home Page
		        util.click(homeuser.home_FindHotelBtn);
		        DriverWait.staticWait();
		        locationSearchUser.correctPage();
		        
		        //Enter Location
		        locationSearchUser.inputLocationSpecialEvent(Destination);
				DriverWait.staticWait();
				util.click(locationSearchUser.locationSearchPage_LocList);
							
				// Verifying Search Form page
				searchFormUser.correctPage();
				
				// Click on Search Button
				util.click(searchFormUser.searchForm_Rate_SearchBtn);
				searchResultListViewUser.correctPage();
		        DriverWait.staticWait();
		        
		        //Click on filter and search brand
		        util.click(searchBrands.searchFilter_button);
		        logger.info("Pass: Reach to the Filter Page");
		        util.scrollTo("All IHG");
		        logger.info("Pass: Unselect the All IHG Brands");
		        util.click(searchBrands.ihgBrand_button);
		        logger.info(searchBrands.ihgBrand_button.getText()+" are unselected");
		        DriverWait.staticWait();
		        util.scrollTo("Holiday Inn Express Hotels & Resorts");
		        logger.info("Pass: Select the " +searchBrands.searchFilter_HolidayInnExpressHotelsResorts.getText());
		        util.click(searchBrands.searchFilter_HolidayInnExpressHotelsResorts);
		        util.click(searchBrands.searchFilter_ApplyBtn);
		        logger.info("Pass: Filter Applied");
		        DriverWait.staticWait();
		       
		        //Scroll to Property 
		        util.scrollTo(PropName);
		        logger.info("Pass: Hotel Found");     
		        
		        // Selecting Hotel
				searchResultListViewUser.selectHotelSpecific(PropName);
				DriverWait.staticWait();
				hotelDetailUser.correctPage();
			
				// Click on Book Now Button and navigating to select a room page
				util.click(hotelDetailUser.hotelDetail_BookNow);
				
				// Selecting Room
				selectRoomUser.correctPage_Roomtype(); //- For this hotel, this page is skipped==Hotel specific
				selectRoomUser.selectRoom();
				selectRoomUser.selectRoomType19();
				
				
				try {
					if(upgraderate.No_Thanks.isDisplayed()==true)
						upgraderate.No_Thanks.click();
				} catch (Exception e1) {
					
					e1.printStackTrace();
					DriverWait.staticWait();
					selectRateUser.correctPage();
				}
				
								
				//Best flexible rate
				try
				{
					util.display(selectRateUser.selectRate_BestFlexible);
					logger.info("Best Flexible rate is available");
				}
				catch(Exception e)
				{
				     logger.info("Best Flexible rate is not available");
				} 
			
				//Bonus points rate			
			try
				{
					util.singleScroll();
				DriverWait.staticWait();
				
			   util.scrolltoElement(selectRateUser.selectRate_1000Bonus);
				DriverWait.staticWait();
				util.display(selectRateUser.selectRate_1000Bonus);
				
				
				
				logger.info("1000 Bonus Points rate is available");
				}
				catch(Exception e)
				{
				     logger.info("1000 Bonus Points rate is not available");
				} 
				
			
			try
				{
					util.scrollTo("PARKING PACKAGE");
					util.display(selectRateUser.selectRate_parking);
					logger.info("Parking package rate is available");
				}
				catch(Exception e)
				{
				     logger.info("Parking package rate is not available");
				} 
				
			
				
}

			//take help from GRS Team and remove the parking package rate from AHP for this hotel and run below function
			@Test(groups = { "smoke", "regression" }, priority = 1)
			public void validateRateCategoryMissing() throws Exception {
				
				 String PropName = "Texarkana";
			     String Destination = "Atlanta, TX";
			     String Brand = "Holiday Inn Express Hotels & Resorts";
		        
				HomePage homeuser = new HomePage(innerDriver);
				Utility util = new Utility();
				SignInPage signUser = new SignInPage(innerDriver);
				LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
				SearchForm searchFormUser = new SearchForm(innerDriver);			
				SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
				HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
				SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
				SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
				SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
				
				

				// Handling Push Notification PopUp 
				DriverWait.staticWait();
				homeuser.allowAppPermission();
				homeuser.handlePushNotificationPopUp();
				
				//Change to   int
				homeuser.changetoINT();
				
				// Clicking Sign In and expanding right rail
				util.click(homeuser.home_btnSignIn);
				DriverWait.staticWait();
				
				// SignIn into IHG
				signUser.signInItinerary();
				signUser.handleConfirmationPageAndReachingHome();
							
				// Clicking on Find Hotel button on Home Page
		        util.click(homeuser.home_FindHotelBtn);
		        
		        locationSearchUser.correctPage();
		        locationSearchUser.inputLocationSpecialEvent(Destination);
				DriverWait.staticWait();
				util.click(locationSearchUser.locationSearchPage_LocList);
								
				// Verifying Search Form page
				searchFormUser.correctPage();
				
				// Click on Search Button
				util.click(searchFormUser.searchForm_Rate_SearchBtn);
				searchResultListViewUser.correctPage();
		        DriverWait.staticWait();
		        
		        util.click(searchBrands.searchFilter_button);
		        logger.info("Pass: Reach to the Filter Page");
		        util.scrollTo("All IHG");
		        logger.info("Pass: Unselect the All IHG Brands");
		        util.click(searchBrands.ihgBrand_button);
		        logger.info(searchBrands.ihgBrand_button.getText()+" are unselected");
		        util.scrollTo("Holiday Inn Express Hotels & Resorts");
		        logger.info("Pass: Select the " +searchBrands.searchFilter_HolidayInnExpressHotelsResorts.getText());
		        util.click(searchBrands.searchFilter_HolidayInnExpressHotelsResorts);
		        
		        util.click(searchBrands.searchFilter_ApplyBtn);
		        logger.info("Pass: Filter Applied");
		        DriverWait.staticWait();
		        util.scrollTo(PropName);
		        logger.info("Pass: Hotel Found");
		        
		        
		        
		        
		        
		        // Selecting Hotel
				searchResultListViewUser.selectHotelSpecific(PropName);
				DriverWait.staticWait();
				hotelDetailUser.correctPage();
			
				// Click on Book Now Button and navigating to select a room page
				util.click(hotelDetailUser.hotelDetail_BookNow);
				
				// Selecting Room
				selectRoomUser.correctPage(); //- For this hotel, this page is skipped
				selectRoomUser.selectRoom();
				selectRoomUser.selectRoomType19();
				
				
				selectRateUser.correctPage();
				try
				{
					util.display(selectRateUser.selectRate_BestFlexible);
					logger.info("Best Flexible rate is available");
				}
				catch(Exception e)
				{
				     logger.info("Best Flexible rate is not available");
				} 
				
				
				try
				{
					util.scrollTo("1,000 Bonus Point Package: 1,000 Bonus Points for Every Night");
					DriverWait.staticWait();
					util.display(selectRateUser.selectRate_1000Bonus);
					logger.info("1000 Bonus Points rate is available");
				}
				catch(Exception e)
				{
				     logger.info("1000 Bonus Points rate is not available");
				} 
				
				try
				{
					util.scrollTo("PARKING PACKAGE");
					util.noDisplay(selectRateUser.selectRate_parking);
					logger.info("Parking package rate is available");
				}
				catch(Exception e)
				{
				     logger.info("Parking package rate is not available");
				} 
}


}
