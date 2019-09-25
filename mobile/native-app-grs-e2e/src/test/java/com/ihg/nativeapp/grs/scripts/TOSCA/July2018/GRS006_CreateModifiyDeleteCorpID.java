package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.FindReservationPage;
import com.ihg.nativeapp.screens.GuestInfoForAnonymousUserPage;
import com.ihg.nativeapp.screens.HomePage;
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
import com.ihg.nativeapp.screens.SignInPage;
//import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.UpcomingStays;
import io.appium.java_client.MobileElement;
import com.ihg.nativeapp.screens.SearchFilterPage;

public class GRS006_CreateModifiyDeleteCorpID extends DriverCapabilities {

	String confirmationMsg, location, confirmationNo,confirmationTrim;

	// Database Information
   /* public static final String dbName = "Tosca_Analytics";

    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

    public static final String serverport = "1433";

    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";*/

    
    
	@Test(groups = { "smoke", "regression" }, priority = 0)
	public void ModifyResTest() throws Exception {

		/*commenting the creation part*/
		int ID_Value= 6; 
		// Read data from Database
    	 /*String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        DriverWait.staticWait();*/
        String PropName = "Atlanta-Johns Creek";
        System.out.println("Property name is "+PropName);
        /*String Destination = resultSet.get(1);
        System.out.println("Destination is "+Destination);
        String Brand = resultSet.get(2);
        */
		Utility util = new Utility();
		// SignInPage signUser = new SignInPage(innerDriver);
		LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
		SearchForm searchFormUser = new SearchForm(innerDriver);
		SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
		SignInPage signUser = new SignInPage(innerDriver);
		SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
		
		SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
		HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
		SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
		SelectARatePage selectRateUser = new SelectARatePage(innerDriver);
		ReviewReservationPage opcoUser = new ReviewReservationPage(innerDriver);
		GuestInfoForAnonymousUserPage guestInfoAnonymousUser = new GuestInfoForAnonymousUserPage(innerDriver);
		ReservationConfirmationPopUp confirmationPopUpUser = new ReservationConfirmationPopUp(innerDriver);
		ReservationDetailsPage reservationDetailsUser = new ReservationDetailsPage(innerDriver);
		ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
		ReservationSummaryPage reservationConfirmationUser = new ReservationSummaryPage(innerDriver);
		ModifyReservationPage modifyResUser = new ModifyReservationPage(innerDriver);
		ReviewChangesPage reviewChangesUser = new ReviewChangesPage(innerDriver);
		LeftRail leftRailUser = new LeftRail(innerDriver);
		UpcomingStays upcomingUser = new UpcomingStays(innerDriver);
		FindReservationPage findResUser = new FindReservationPage(innerDriver);

		// Handling Push Notification PopUp
		HomePage homeUser = new HomePage(innerDriver);
		DriverWait.staticWait();
		homeUser.allowAppPermission();
		homeUser.handlePushNotificationPopUp();

		//Change To INT
		homeUser.changetoINT();
		
		// Clicking Sign In and expanding right rail
		util.click(homeUser.home_btnSignIn);
		DriverWait.staticWait();
				
		// SignIn into IHG
		signUser.signInDB(6);
		signUser.handleConfirmationPageAndReachingHome();
/*
		// Clicking Sign In and expanding right rail
		util.click(homeUser.home_btnSignIn);
		DriverWait.staticWait();
		
		// SignIn into IHG
		signUser.signInDB(6);
		signUser.handleConfirmationPageAndReachingHome();
		
		
		
		// Clicking on Find Hotel button on Home Page
		homeUser.home_FindHotelBtn.click();
		locationSearchUser.correctPage();

		// Enter Location
		//locationSearchUser.inputLocation(Destination);
		//locationSearchUser.inputLocation("Anderson, IN, United States");
		locationSearchUser.inputLocation("ATLANTA");
		DriverWait.staticWait();
		util.click(locationSearchUser.locationSearchPage_LocList);
		searchFormUser.correctPage();

		// Selecting Check-in/Check-out date
		util.click(searchFormUser.searchForm_CheckInDayOfMonth);
		selectDateUser.correctPage();
		util.singleScroll();
		util.singleScroll();
		util.singleScroll();
		util.click(selectDateUser.selectDatesPage_AlipayCheckIn_Date);
		DriverWait.staticWait();
		util.click(selectDateUser.selectDatesPage_AlipayCheckOut_Date);
		DriverWait.staticWait();
		util.click(selectDateUser.selectDatesPage_UpdateBtn);
		DriverWait.staticWait();
		util.click(searchFormUser.searchForm_CorporateId);

		searchFormUser.enterCorpId();

		innerDriver.hideKeyboard();

		// searchFormUser.enterCorpIdFromDatabase("SearchForm");

		searchFormUser.correctPage();

		// Click on Search Button
		util.click(searchFormUser.searchForm_Rate_SearchBtn);
		searchResultListViewUser.correctPage();

		// Selecting Hotel
		searchResultListViewUser.selectHotelSpecific(PropName);
		 DriverWait.staticWait();

		util.click(searchBrands.searchFilter_button);
		logger.info("Pass: Reach to the Filter Page");
		util.scrollTo("All IHG");
		logger.info("Pass: Unselect the All IHG Brands");
		util.click(searchBrands.ihgBrand_button);
		logger.info(searchBrands.ihgBrand_button.getText() + "is unselected");

		util.scrolltoElement(searchBrands.searchFilter_CrownePlazaHotelsResorts);
		logger.info("Pass: Select the " + searchBrands.searchFilter_CrownePlazaHotelsResorts.getText());
		util.click(searchBrands.searchFilter_CrownePlazaHotelsResorts);

		util.click(searchBrands.searchFilter_ApplyBtn);
		logger.info("Pass: Filter Applied");
		DriverWait.staticWait();
		
		
		
		
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
		util.scrollTo("Best Flexible Rate");
		util.click(selectRateUser.selectRate_BestFlexible);
		selectRateUser.handleUpgradePage();
		opcoUser.correctPage();

		// Making a reservation on OPCO Page
		opcoUser.acceptTnC();

		 util.click(opcoUser.opco_BookBtn);
		DriverWait.staticWait();

		// Entering Guest data
		// util.singleScroll();
		//guestInfoAnonymousUser.GuestInfostatic();

		//DriverWait.staticWait();
		// enter payment info on OPCO page
		//opcoUser.correctPage();
		//util.scrollTo("Debit/Credit card");
		//util.click(opcoUser.AddCard);

		//opcoUser.OPCOentercc("MM");

		// Swipe to book on Guest Info Page
		//guestInfoAnonymousUser.bookNow();
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

		// Fetching chkin and chkOut dates
		// String ChkInDate =
		// reservationDetailsUser.reservationDetailPage_CheckInDate.getText();
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
		String lastName = userName.substring(userName.indexOf(" ") + 1);
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
*/
		
		String lastName="donotupdate";
		String confirmationTrim="48463460";
		// Clicking and expanding left rail
		util.click(homeUser.home_btnHanburgerOpened);
		leftRailUser.correctPage();

		util.click(leftRailUser.leftRail_Stays);
		upcomingUser.correctPage();
		util.scrollTo("Find Reservation");

		// Entering confirmation number and last name
		findResUser.findReservation_ConfNumber.sendKeys(confirmationTrim);
		findResUser.findReservation_LastName.sendKeys(lastName);
		util.click(findResUser.findReservation_Btn);
		DriverWait.staticWait();

		// Clicking on confirmation ID on reservation details screen
		util.click(reservationDetailsUser.reservationDetailPage_confId);
		DriverWait.staticWait();

		// Fetching chkin and chkOut dates
		String ChkOutDateAnonymous = reservationDetailsUser.reservationDetailPage_CheckOutDate.getText();

		// Verifying Reservation Details Page 2nd block
		//util.display(reservationDetailsUser.reservationDetailPage_BackBtn);
		util.display(reservationDetailsUser.reservationDetailPage_Title);
		util.display(reservationDetailsUser.reservationDetailPage_ConfirmationLabel);
		util.display(reservationDetailsUser.reservationDetailPage_ConfirmationNumber);
		util.display(reservationDetailsUser.reservationDetailPage_CheckInDate);
		util.display(reservationDetailsUser.reservationDetailPage_Arrow);
		util.display(reservationDetailsUser.reservationDetailPage_CheckOutDate);
		util.display(reservationDetailsUser.reservationDetailPage_CheckInTime);
		util.display(reservationDetailsUser.reservationDetailPage_CheckOutTime);
		util.display(reservationDetailsUser.reservationDetailPage_UserName);
		//util.display(reservationDetailsUser.reservationDetailPage_RoomsAndGuests);
		/*util.display(reservationDetailsUser.reservationDetailPage_RoomChargesHeading);
		util.display(reservationDetailsUser.reservationDetailPage_AverageNightlyRateTitle);
		util.display(reservationDetailsUser.reservationDetailPage_NumberOfNightsTitle);
		util.display(reservationDetailsUser.reservationDetailPage_EstimatedTaxesTitle);*/
		util.scroll();
		util.display(reservationDetailsUser.reservationDetailPage_modifyReservationBtn);
		util.display(reservationDetailsUser.reservationDetailPage_CancelReservationBtn);
		/*util.display(reservationDetailsUser.reservationDetailPage_ModifyCancellationPolicy);
		util.display(reservationDetailsUser.reservationDetailPage_ModifyCancellationPolicyDesc);
		util.display(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);*/
		/*util.click(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);
		util.display(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyDesc);
		util.click(reservationDetailsUser.reservationDetailPage_AdditionalChargesMayApplyText);
		util.display(reservationDetailsUser.reservationDetailPage_DisclaimerText);
		util.click(reservationDetailsUser.reservationDetailPage_DisclaimerText);
		util.display(reservationDetailsUser.reservationDetailPage_DisclaimerDesc);
		util.click(reservationDetailsUser.reservationDetailPage_DisclaimerText);*/

		// Clicking on Modify reservation button on reservation details page.
		util.scrollTo("Modify Reservation");
		util.click(reservationDetailsUser.reservationDetailPage_modifyReservationBtn);
		modifyResUser.correctPage();

		// Verify the display of elements on Modify reservation page. 1ts block
		// for modify
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
		//util.display(modifyResUser.modifyRes_roomLbl);
		/*util.display(modifyResUser.modifyRes_roomsCount);
		util.display(modifyResUser.modifyRes_roomTypeLbl);
		util.display(modifyResUser.modifyRes_roomType);
		util.display(modifyResUser.modifyRes_adultsLbl);
		util.display(modifyResUser.modifyRes_adultsCount);
		util.display(modifyResUser.modifyRes_childrenLbl);
		util.display(modifyResUser.modifyRes_childrenCount);*/
		/*util.scroll();
		util.display(modifyResUser.modifyRes_rateLbl);
		util.display(modifyResUser.modifyRes_rateType);
		util.display(modifyResUser.modifyRes_userNameLbl);
		util.display(modifyResUser.modifyRes_UserName);
		util.display(modifyResUser.modifyRes_otherChangesText);
		util.display(modifyResUser.modifyRes_custCareLink);
		util.display(modifyResUser.modifyRes_closeIcon);*/

		// Clicking on check in date to open calender.
		util.click(modifyResUser.modifyRes_chkInDate);
		selectDateUser.correctPage();

		// Selecting new dates
		//util.singleScroll();
		util.click(selectDateUser.selectDatesPage_CheckInDateValue);
		DriverWait.staticWait();
		util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
		DriverWait.staticWait();
		util.click(selectDateUser.selectDatesPage_UpdateBtn);
		DriverWait.staticWait();
		modifyResUser.correctPage();

		// Verify the presence of modify tag and availability button on modify
		// page
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
		//util.display(reviewChangesUser.reviewChanges_nightRateLbl);
		//util.display(reviewChangesUser.reviewChanges_nightsLbl);
		//util.display(reviewChangesUser.reviewChanges_taxesLbl);
		//util.display(reviewChangesUser.reviewChanges_totalPriceLbl);
		util.display(reviewChangesUser.reviewChanges_disclaimer);
		util.click(reviewChangesUser.reviewChanges_disclaimer);
		//'util.display(reviewChangesUser.reviewChanges_disclaimerDesc);
		util.click(reviewChangesUser.reviewChanges_disclaimer);
		util.display(reviewChangesUser.reviewChanges_confirmChangesBtn);

		// Verify whether Room charges after modification are getting changed or
		// not.
		boolean oldChargesDisplayChkAnonymous = reviewChangesUser.reviewChanges_oldTotal.isDisplayed();

		if (oldChargesDisplayChkAnonymous == true) {

			// Fetching the value of new Total charges.
			List<MobileElement> total = innerDriver.findElementsById("com.ihg.apps.android:id/charge_item_price");
			for (int i = 0; i < total.size(); i++) {
				util.displayList(total, i);

			}

			// Fetching last element of list
			MobileElement lastElement = total.get(total.size() - 1);
			String newtotalValue = lastElement.getText();
			logger.info(newtotalValue);

			int newCharges = Integer.parseInt(newtotalValue.substring(0, newtotalValue.indexOf(".")));
			logger.info(newCharges);

			// Fetching the value of old total charges before modification
			String oldTotalValue = reviewChangesUser.reviewChanges_oldTotal.getText();
			int Oldcharges = Integer.parseInt(oldTotalValue.substring(0, oldTotalValue.indexOf(".")));
			logger.info(Oldcharges);

			// Comparing old and new charges
			if (newCharges > Oldcharges) {
				util.display(reviewChangesUser.reviewChanges_changeChargesText);
				System.out.println(reviewChangesUser.reviewChanges_changeChargesText.getText());
			} else {
				util.display(reviewChangesUser.reviewChanges_changeChargesText);
				System.out.println(reviewChangesUser.reviewChanges_changeChargesText.getText());
			}

		}

		else {
			util.display(reviewChangesUser.reviewChanges_changeChargesText);
			System.out.println(reviewChangesUser.reviewChanges_changeChargesText.getText());
		}

		util.scroll();
		// Clicking confirm changes button
		util.display(reviewChangesUser.reviewChanges_cancelChangesBtn);
		util.click(reviewChangesUser.reviewChanges_confirmChangesBtn);

		// Verify elements on view reservation on pop- up
		confirmationUser.correctPage();
		
		// Fetching confirmation number
		String confIDAnonymous = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();
		
		//Click On OK
		util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);// to be chnged click on ok
        DriverWait.staticWait();
        
		/*// Clicking Ok on confirmation pop up
		util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);*/

		// Clicking on confirmation ID on reservation details screen
		util.click(reservationDetailsUser.reservationDetailPage_confId);

		// Fetching modified chkin and chkOut dates
		// String UpdatedChkInDateAnonymous =
		// reservationDetailsUser.reservationDetailPage_CheckInDate.getText();
		String UpdatedChkOutDateAnonymous = reservationDetailsUser.reservationDetailPage_CheckOutDate.getText();

		// Matching old check in / checkout dates to modified check in/check out
		// dates
		// util.assertNotEqual(UpdatedChkInDateAnonymous, ChkInDateAnonymous);
		util.assertNotEqual(UpdatedChkOutDateAnonymous, ChkOutDateAnonymous);

	}

}
