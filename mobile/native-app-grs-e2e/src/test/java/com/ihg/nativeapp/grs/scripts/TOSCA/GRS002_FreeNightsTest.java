package com.ihg.nativeapp.grs.scripts.TOSCA;


import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.AccountLandingPage;
import com.ihg.nativeapp.screens.FreeNightsPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.RedeemPointsPage;
import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.ChargesSummary;
import com.ihg.nativeapp.screens.FindReservationPage;

import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LeftRail;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.ModifyReservationPage;
import com.ihg.nativeapp.screens.ReviewReservationPage;
import com.ihg.nativeapp.screens.ReservationSummaryPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.ReservationDetailsPage;
import com.ihg.nativeapp.screens.ReviewChangesPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectDatesPage;
//import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.ModifySearchPage;
import com.ihg.nativeapp.screens.GuestInfoForExplicitUserPage;


import io.appium.java_client.MobileElement;

public class GRS002_FreeNightsTest extends DriverCapabilities
{
	
	//  Verify the presence of free nights on redeem page
	String confirmationMsg, location, confirmationNo, confirmationTrim;
		@Test(groups = { "smoke", "regression" }, priority = 0)
		public void OneFreeNightTest() throws Exception {
			String screenPlayName = "SP02Stage";
			HomePage homeuser = new HomePage(innerDriver);
			Utility util = new Utility();
			AccountLandingPage accountLandingUser = new AccountLandingPage(innerDriver);
			RedeemPointsPage redeemPointsUser = new RedeemPointsPage(innerDriver);
			SignInPage signUser = new SignInPage(innerDriver);
			FreeNightsPage freeNightUser = new FreeNightsPage(innerDriver);
			//HomePage homeUser = new HomePage(innerDriver);
			//SignInPage signUser = new SignInPage(innerDriver);
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
			
			ModifyReservationPage modifyResUser = new ModifyReservationPage(innerDriver);
			ReviewChangesPage reviewChangesUser = new ReviewChangesPage(innerDriver);
			
			ModifySearchPage modifypage = new ModifySearchPage(innerDriver);
			
			DriverWait.staticWait();

			// Handling Push Notification PopUp 
			homeuser.allowAppPermission();
			homeuser.handlePushNotificationPopUp();

			
			
			// Clicking Sign In and expanding right rail
			util.click(homeuser.home_btnSignIn);
			DriverWait.staticWait();
			
			// SignIn into IHG
			signUser.signInDB(1);
			signUser.handleConfirmationPageAndReachingHome();
			
			// Opening Account Landing Page
			util.click(signUser.signIn_User);
			
			
			
			accountLandingUser.correctPage();
			
			// Clicking on "Redeem Rewards"
			util.click(accountLandingUser.accountLandingPage_RedeemPoints);
			redeemPointsUser.correctPage();
			
			// Verify the presence of Free nights on redeem page
			util.display(redeemPointsUser.redeemPointsPage_FreeNightsTitle);
			
			util.display(redeemPointsUser.redeemPointsPage_FreeNightsTitleDesc);
			
			// Clicking on Free Nights
			util.click(redeemPointsUser.redeemPointsPage_FreeNightsTitle);
			freeNightUser.correctPage();
			
			// Verify the presence elements on free nights page
			//util.display(freeNightUser.FreeNightsPage_bonusPointImage);
			util.display(freeNightUser.FreeNightsPage_chaseAnniversaryText);
			util.display(freeNightUser.FreeNightsPage_availabilityText);
			util.display(freeNightUser.FreeNightsPage_bookingDates);
			
			// Clicking on available free night
			util.click(freeNightUser.FreeNightsPage_chaseAnniversaryText);
			util.display(freeNightUser.FreeNightsPage_freeNightStatus);
			util.display(freeNightUser.FreeNightsPage_promoImage);
			util.display(freeNightUser.FreeNightsPage_congratsDesc);
			util.display(freeNightUser.FreeNightsPage_TandCHeader);
			
			
			
			//Finding Book button and clicking on it
			util.scrollTo("Book Free Night");
			util.click(freeNightUser.FreeNightsPage_BookNow);
			//innerDriver.navigate().back();
			
			
			//Booking flow using free night
			// Clicking on Find Hotel button on Home Page
		    
			locationSearchUser.correctPage();
						
			// Enter Location
			locationSearchUser.inputLocation(location);
			DriverWait.staticWait();
			util.click(locationSearchUser.locationSearchPage_LocList);
			searchFormUser.correctPage();
			
			// Click on check in date
			util.click(searchFormUser.searchForm_CheckInDayOfMonth);

			// Verify Select dates page
			selectDateUser.correctPage();

			util.singleScroll();
			DriverWait.staticWait(1000);
			util.singleScroll();

			// Click on Check In and Check Out date
			util.click(selectDateUser.selectDatesPage_AlipayCheckIn_Date);
			util.click(selectDateUser.selectDatesPage_AlipayCheckOut_Date);

			// Click on Apply button
			util.click(selectDateUser.selectDatesPage_DoneBtn);

			// Verifying Search Form page
			searchFormUser.correctPage();
			
			
			
			// Click on Search Button
			util.click(searchFormUser.searchForm_Rate_SearchBtn);
			searchResultListViewUser.correctPage();
					
			// Selecting Hotel
			searchResultListViewUser.selectHotel();
			hotelDetailUser.correctPageFreeNights();
			
			// Click on Book Now Button and navigating to select a room page
			util.click(hotelDetailUser.hotelDetail_BookNow_Freenights);
			
			selectRoomUser.correctPage();
			util.singleScroll();
					
			// Selecting Room
			selectRoomUser.selectRoom();
			selectRoomUser.selectRoomType();
			selectRateUser.correctPage();

			// Selecting a refundable rate on Select a rate page
			util.scrollTo("Chase Anniversary Free Night");
			util.click(selectRateUser.chase_free_night);
			selectRateUser.handleUpgradePage();
			
			
			
            DriverWait.staticWait();
			
			//enter payment info on OPCO page
			opcoUser.correctPage();
			
			//opcoUser.OPCOentercc("MM"); -- Member is already logged in with already stored card
			
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
			logger.info(confirmationTrim);
			

			// Verifying Confirmation Number
			Utility.match(confirmationMsg, confirmationTrim);
			
			// Clicking on confirmation ID on reservation details screen
			util.click(reservationDetailsUser.reservationDetailPage_confId);
			
			String ChkOutDateAnonymous = reservationDetailsUser.reservationDetailPage_CheckOutDate.getText();
			
			// Clicking on Modify reservation button on reservation details page.
			util.scrollTo("Modify Reservation");
			util.click(reservationDetailsUser.reservationDetailPage_modifyReservationBtn);
			modifyResUser.correctPage();
			
			// Verify the display of elements on Modify reservation page. 1ts block for modify
			util.display(modifyResUser.modifyRes_Title);
			util.display(modifyResUser.modifyRes_hotelName);
			util.display(modifyResUser.modifyRes_confLbl);
			util.display(modifyResUser.modifyRes_confID);
			util.display(modifyResUser.modifyRes_chkInMonth);
			util.display(modifyResUser.modifyRes_chkOutMonth);
			util.display(modifyResUser.modifyRes_chkInDate);
			util.display(modifyResUser.modifyRes_chkOutDate);
			util.display(modifyResUser.modifyRes_chkInDay);
			util.display(modifyResUser.modifyRes_chkOutDay);
			util.display(modifyResUser.modifyRes_roomLbl);
			util.display(modifyResUser.modifyRes_roomsCount);
			util.display(modifyResUser.modifyRes_roomTypeLbl);
			util.display(modifyResUser.modifyRes_roomType);
			util.display(modifyResUser.modifyRes_adultsLbl);
			util.display(modifyResUser.modifyRes_adultsCount);
			util.display(modifyResUser.modifyRes_childrenLbl);
			util.display(modifyResUser.modifyRes_childrenCount);
			util.scroll();
			util.display(modifyResUser.modifyRes_rateLbl);
			util.display(modifyResUser.modifyRes_rateType);
			util.display(modifyResUser.modifyRes_userNameLbl);
			util.display(modifyResUser.modifyRes_UserName);
			util.display(modifyResUser.modifyRes_otherChangesText);
			util.display(modifyResUser.modifyRes_custCareLink);
			util.display(modifyResUser.modifyRes_closeIcon);
			
			// Clicking on check in date to open calendar.
			util.click(modifyResUser.modifyRes_chkInDate);
			selectDateUser.correctPage();
			
			//Selecting new dates
			util.singleScroll();
			util.click(selectDateUser.ModifyselectDatesPage_AlipayCheckIn_Date);
			DriverWait.staticWait();
			util.click(selectDateUser.ModifyselectDatesPage_AlipayCheckOut_Date);
			DriverWait.staticWait();
			util.click(selectDateUser.selectDatesPage_UpdateBtn);		
			modifyResUser.correctPage();
			
			// Verify the presence of modify tag and availability button on modify page
			util.display(modifyResUser.modifyRes_modifiedTag);
			util.display(modifyResUser.modifyRes_AvailabilityBtn);
			
			// Clicking check availability button 
			util.click(modifyResUser.modifyRes_AvailabilityBtn);
			reviewChangesUser.correctPage();
			
			// Verify elements on Review Changes Page
			util.display(reviewChangesUser.reviewChanges_Title);
			util.display(reviewChangesUser.reviewChanges_oldChkInDate);
			util.display(reviewChangesUser.reviewChanges_oldChkOutDate);
			util.display(reviewChangesUser.reviewChanges_newChkInDate);
			util.display(reviewChangesUser.reviewChanges_newChkOutDate);
			util.display(reviewChangesUser.reviewChanges_roomDetails);
			util.display(reviewChangesUser.reviewChanges_roomType);
			util.display(reviewChangesUser.reviewChanges_rateName);
			util.display(reviewChangesUser.reviewChanges_rateType);
			util.display(reviewChangesUser.reviewChanges_changeChargesText);
			util.display(reviewChangesUser.reviewChanges_nightRateLbl);
			util.display(reviewChangesUser.reviewChanges_nightsLbl);
			util.display(reviewChangesUser.reviewChanges_taxesLbl);
			util.display(reviewChangesUser.reviewChanges_totalPriceLbl);
			util.display(reviewChangesUser.reviewChanges_disclaimer);
			util.click(reviewChangesUser.reviewChanges_disclaimer);
			util.display(reviewChangesUser.reviewChanges_disclaimerDesc);
			util.click(reviewChangesUser.reviewChanges_disclaimer);
			util.display(reviewChangesUser.reviewChanges_confirmChangesBtn);
			
			
			/*// Verify whether Room charges after modification are getting changed or not.
			boolean oldChargesDisplayChkAnonymous = reviewChangesUser.reviewChanges_oldTotal.isDisplayed();
			
			if (oldChargesDisplayChkAnonymous == true)
			{
			
					// Fetching the value of new Total charges.
					List<MobileElement> total = innerDriver.findElementsById("com.ihg.apps.android:id/price_charge");
					for (int i = 0; i < total.size(); i++) {
						util.displayList(total, i);
						
					}
					
					// Fetching last element of list
					MobileElement lastElement = total.get(total.size()-1);
					String newtotalValue = lastElement.getText();
					logger.info(newtotalValue);
					
					int newCharges = Integer.parseInt(newtotalValue.substring(0,newtotalValue.indexOf(".")));
					logger.info(newCharges);
					
					// Fetching the value of old total charges before modification
					String oldTotalValue = reviewChangesUser.reviewChanges_oldTotal.getText();
					int Oldcharges = Integer.parseInt(oldTotalValue.substring(0,oldTotalValue.indexOf(".")));
					logger.info(Oldcharges);
			
					// Comparing old and new charges
					if( newCharges > Oldcharges)
					{
						util.display(reviewChangesUser.reviewChanges_changeChargesIncText);
					}
					else
					{
						util.display(reviewChangesUser.reviewChanges_changeChargesDrcText);
			
					}
					
			
			}
			
			else
			{
					util.display(reviewChangesUser.reviewChanges_changeChargesNoChangeText);
				
			}
			*/
					util.scroll();
					// Clicking confirm changes button
					util.display(reviewChangesUser.reviewChanges_cancelChangesBtn);
					util.click(reviewChangesUser.reviewChanges_confirmChangesBtn);
					
					// Verify elements on view reservation on pop- up
					confirmationUser.correctPage();
					util.click(confirmationUser.reservationConfirmation_modificationMsg);
					
					// Fetching confirmation number
					String confIDAnonymous = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();
					
					// Clicking Ok on confirmation pop up
					util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
					
					// Clicking on confirmation ID on reservation details screen
					util.click(reservationDetailsUser.reservationDetailPage_confId);	
					
					// Fetching modified chkin and chkOut dates
					//String UpdatedChkInDateAnonymous = reservationDetailsUser.reservationDetailPage_CheckInDate.getText();
					String UpdatedChkOutDateAnonymous = reservationDetailsUser.reservationDetailPage_CheckOutDate.getText();
					
					// Matching old check in / checkout dates to modified check in/check out dates
					//util.assertNotEqual(UpdatedChkInDateAnonymous, ChkInDateAnonymous);
					util.assertNotEqual(UpdatedChkOutDateAnonymous, ChkOutDateAnonymous);
						
}
}