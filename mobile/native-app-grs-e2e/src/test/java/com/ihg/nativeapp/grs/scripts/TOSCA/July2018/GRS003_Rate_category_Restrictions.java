package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import java.io.IOException;
import java.util.ArrayList;

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
import com.ihg.nativeapp.screens.SelectDatesPage;
import com.ihg.nativeapp.screens.SignInPage;

public class GRS003_Rate_category_Restrictions extends DriverCapabilities
{
	
//  Verify that Best flexible rate is available and user is able to create reservation and if not then user should be restricted
//	hotelname Arlington - Ballpark - Stadium	
	String confirmationMsg,  confirmationNo, confirmationTrim;
		
		

		// Database Information
	    /*public static final String dbName = "Tosca_Analytics";

	    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

	    public static final String serverport = "1433";

	    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";*/

	    
	    
			@Test(groups = { "smoke", "regression" }, priority = 0)
			public void ValidateBestFlexibleIsavailable() throws Exception {
				/*int ID_Value= 3; 
				// Read data from Database
		    	 String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
		    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
		        ArrayList<String> resultSet = readData.readData();*/
		        DriverWait.staticWait();
		        /*String PropName = resultSet.get(0);
		        String Destination = resultSet.get(1);
		        String Brand = resultSet.get(2);*/
		        
		        //String PropName = "SPS TEST HOTEL AH";
		        String PropName = "Atlanta-Johns Creek";
		        String Destination ="ATLANTA";
		        //String Brand = resultSet.get(2);
		        
				HomePage homeuser = new HomePage(innerDriver);
				Utility util = new Utility();
				
				SignInPage signUser = new SignInPage(innerDriver);
				
				LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
				SearchForm searchFormUser = new SearchForm(innerDriver);
				SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
				
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
				
				DriverWait.staticWait();

				// Handling Push Notification PopUp 
				homeuser.allowAppPermission();
				homeuser.handlePushNotificationPopUp();
				
				// Clicking Sign In and expanding right rail
				util.click(homeuser.home_btnSignIn);
				DriverWait.staticWait();
				
				// SignIn into IHG
				signUser.signInDB(3);
				signUser.handleConfirmationPageAndReachingHome();
				
				
				
				// Clicking on Find Hotel button on Home Page
		        util.click(homeuser.home_FindHotelBtn);
		        
		        locationSearchUser.correctPage();

		        locationSearchUser.inputLocationSpecialEvent(Destination);
				DriverWait.staticWait();
				util.click(locationSearchUser.locationSearchPage_LocList);
				
				//Validate Rate category = Best Flexible 
				util.display(searchFormUser.searchForm_Rate_BestAvailable);
				logger.info("Pass: Best Flexible Rate is selected");
				
				
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
		        logger.info(searchBrands.ihgBrand_button.getText()+"is unselected");
		        
		        /*util.scrolltoElement(searchBrands.searchFilter_CrownePlazaHotelsResorts);
		        logger.info("Pass: Select the " +searchBrands.searchFilter_CrownePlazaHotelsResorts.getText());
		        util.click(searchBrands.searchFilter_CrownePlazaHotelsResorts);*/
		        //searchFilter_HolidayInnExpressHotelsResorts
		        util.scrolltoElement(searchBrands.searchFilter_HolidayInnExpressHotelsResorts);
		        logger.info("Pass: Select the " +searchBrands.searchFilter_HolidayInnExpressHotelsResorts.getText());
		        util.click(searchBrands.searchFilter_HolidayInnExpressHotelsResorts);
		        
		        ///////////////
		        
		        
		        util.click(searchBrands.searchFilter_ApplyBtn);
		        logger.info("Pass: Filter Applied");
		        DriverWait.staticWait();
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
				selectRoomUser.selectRoomType();
				selectRateUser.correctPage();

				// Selecting a refundable rate on Select a rate page
				if(util.display_return(selectRateUser.selectRate_BestFlexible))
				{
				util.scrollTo("Best Flexible Rate");
				util.click(selectRateUser.selectRate_BestFlexible);
				logger.info("Rate not available");
				}
				else 
				{
					logger.info("Rate not available");
				}
				selectRateUser.handleUpgradePage();
				
				
			
	            DriverWait.staticWait();
				
	          //Reach to the OPCO page
				opcoUser.correctPage();
				
			    //opcoUser.OPCOentercc("MM"); //-- Member is already logged in with already stored card
				
				// Accepting Terms and Condition
				opcoUser.acceptTnC();

		        // Swipe to Book on OPCO page
		        util.scrollTo("Book Now");
		        util.click(opcoUser.opco_BookBtn);
				
				
				// Res Summary Page
		        
				confirmationPopUpUser.correctPage();
							
				confirmationMsg = confirmationUser.reservationConfirmation_Msg.getText();

				util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);

				confirmationNo = reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo.getText();
				confirmationTrim = confirmationNo.trim();
				logger.info("Confirmation Number = "+confirmationTrim);
				

				// Verifying Confirmation Number
				Utility.match(confirmationMsg, confirmationTrim);
				
				// Clicking on confirmation ID on reservation details screen
				util.click(reservationDetailsUser.reservationDetailPage_confId);
				
				
				
				// Fetching chkin and chkOut dates
				//String ChkInDate = reservationDetailsUser.reservationDetailPage_CheckInDate.getText();
				String ChkOutDate = reservationDetailsUser.reservationDetailPage_CheckOutDate.getText();
				
				// Verifying Reservation Details Page 1st block
				util.display(reservationDetailsUser.reservationDetailPage_BackBtn);
				util.display(reservationDetailsUser.reservationDetailPage_Title);
				util.display(reservationDetailsUser.reservationDetailPage_ConfirmationLabel);
				util.display(reservationDetailsUser.reservationDetailPage_ConfirmationNumber);
				util.display(reservationDetailsUser.reservationDetailPage_CheckInDate);
				util.display(reservationDetailsUser.reservationDetailPage_Arrow);
				util.display(reservationDetailsUser.reservationDetailPage_CheckOutDate);
				util.display(reservationDetailsUser.reservationDetailPage_CheckInTime);
				util.display(reservationDetailsUser.reservationDetailPage_CheckOutTime);
				util.display(reservationDetailsUser.reservationDetailPage_UserName);
				String userName = reservationDetailsUser.reservationDetailPage_UserName.getText();
				String lastName = userName.substring(userName.indexOf(" ")+1);
				logger.info(lastName);
				util.display(reservationDetailsUser.reservationDetailPage_RoomsAndGuests);
				util.display(reservationDetailsUser.reservationDetailPage_RoomChargesHeading);
				util.display(reservationDetailsUser.reservationDetailPage_AverageNightlyRateTitle);
				util.display(reservationDetailsUser.reservationDetailPage_NumberOfNightsTitle);
				util.display(reservationDetailsUser.reservationDetailPage_EstimatedTaxesTitle);
				util.scroll();
				util.display(reservationDetailsUser.reservationDetailPage_modifyReservationBtn);
				util.display(reservationDetailsUser.reservationDetailPage_CancelReservationBtn);
				util.display(reservationDetailsUser.reservationDetailPage_ModifyCancellationPolicy);
				util.display(reservationDetailsUser.reservationDetailPage_ModifyCancellationPolicyDesc);
				util.display(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);
				util.click(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);
				util.display(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyDesc);
				util.click(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);
				util.display(reservationDetailsUser.reservationDetailPage_DisclaimerText);
				util.click(reservationDetailsUser.reservationDetailPage_DisclaimerText);
				util.display(reservationDetailsUser.reservationDetailPage_DisclaimerDesc);
				util.click(reservationDetailsUser.reservationDetailPage_DisclaimerText);
				
				
			}
			
}
