package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.*;


public class Create_Standalone_reservation extends DriverCapabilities
{
	
//  Validate that  the existing Hotel Rate Sell Strategy defined for the property in AHP and validate that user is able to view the updated Rates sequence while triggering the availability for that property from Mobile
	//	hotelName = Amsterdam - Sloterdijk Station
	String checkInDate, checkOutDate, roomType, adultNo, location, hotelName, room, rate, pin, firstName, lastName, address, address2, address3, city, postalCode, email, mobileNo,
    cCNo, confirmationMsg, confirmationNo, confirmationTrim;

String re_enter_pin;
public int counter;
public String roomName_SelectRatePage, rate_SelectRatePage;
WebDriver driver;

@Test(groups = { "smoke", "regression" }, enabled = true)
public void bookingFlowAsAnonymousUser() throws IOException, InterruptedException {

Utility util = new Utility();
HomePage homeUser = new HomePage(innerDriver);
AboutAndLegalPage aboutlegal = new AboutAndLegalPage(innerDriver);
SelectDestinationPage locationSearchUser = new SelectDestinationPage(innerDriver);
SearchForm searchFormUser = new SearchForm(innerDriver);
SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
SelectARoomPage selectRoomTypeUser = new SelectARoomPage(innerDriver);
GuestInfoForAnonymousUserPage guestInfoAnonymousUser = new GuestInfoForAnonymousUserPage(innerDriver);
SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);

System.out.println(innerDriver.getClass());

//Test Data
String PropName = "TEXARKANA";
String location="Atlanta,TX";
System.out.println("Property "+PropName);

// Handling App Permission PopUp
DriverWait.staticWait();
homeUser.allowAppPermission();

// Handling Push Notification PopUp
homeUser.handlePushNotificationPopUp();
homeUser.correctPage();

// Configuring
util.click(homeUser.home_btnHamburger);
DriverWait.staticWait();
util.click(aboutlegal.legalNotice_Title);
DriverWait.staticWait();
if(aboutlegal.grsEndPoint.isDisplayed()==false)
util.click(aboutlegal.grsEndPoint);
DriverWait.staticWait();
util.click(aboutlegal.switchEnv);
DriverWait.staticWait();
util.click(aboutlegal.selectINT);
DriverWait.staticWait();

// Clicking on Find Hotel button on Home Page
util.click(homeUser.home_FindHotelBtn);
locationSearchUser.correctPage();


// Enter Location
locationSearchUser.inputLocationSingleWord(location);
util.click(locationSearchUser.locationSearchPage_LocList);
searchFormUser.correctPage();

// Selecting Check-in/Check-out date
util.click(searchFormUser.searchForm_CheckInDayOfMonth);
selectDateUser.correctPage();
// util.click(selectDateUser.selectDatesPage_CheckOutLabel);
util.singleScroll();
util.click(selectDateUser.selectDatesPage_CheckInDateValue);
util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
util.click(selectDateUser.selectDatesPage_DoneBtn);
DriverWait.staticWait();

//Increasing child as 2
util.click(searchFormUser.searchForm_Children_PlusBtn);

// Click on Search Button
util.click(searchFormUser.searchForm_SearchBtn);
searchResultListViewUser.correctPage();

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

//Selecting Hotel
searchResultListViewUser.selectHotelSpecific(PropName);
DriverWait.staticWait();
hotelDetailUser.correctPage();

//Book Hotel
util.click(hotelDetailUser.hotelDetail_SelectRoom_BookNow);
DriverWait.staticWait();

// Selecting Room
/*SelectRoomTypePage selectRoomTypeUser = new SelectRoomTypePage(innerDriver);*/
selectRoomTypeUser.selectRoom();
selectRoomTypeUser.selectRoomType();
guestInfoAnonymousUser.correctPage();

// Entering data as Guest
guestInfoAnonymousUser.GuestInfo();

// Swipe to book on Guest Info Page
util.scrollTo("Book Now");
util.click(guestInfoAnonymousUser.guestInfo_SwipeToBook);
ReservationConfirmationPopUp confirmationUser = new ReservationConfirmationPopUp(innerDriver);
confirmationUser.correctPage();

// Taking the value of confirmation number from confirmation pop up
String confirmationNo_PopUp = confirmationUser.reservationConfirmation_ConfirmationNumber.getText();

util.click(confirmationUser.reservationConfirmation_ViewReservationBtn);
ReservationSummaryPage reservationConfirmationUser = new ReservationSummaryPage(innerDriver);
reservationConfirmationUser.correctPage();

// Verifying elements on Reservation Detail Page
util.display(reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo);

// Taking the value of confirmation number on Booking Detail Page
String confirmationNo_BookingDetail = reservationConfirmationUser.reservationConfirmationPage_ConfirmationNo.getText();
String confirmationNo_BookingDetailTrim = confirmationNo_BookingDetail.trim();

/*// Updating Confirmation No. to excel file
WritingToFile writingFileUser = new WritingToFile();
writingFileUser.updateConfirmationNumberToFile(confirmationNo_BookingDetailTrim);*/

// Verifying Confirmation Number
util.assertEqual(confirmationNo_PopUp, confirmationNo_BookingDetailTrim);

}

private void info(String string) {
	// TODO Auto-generated method stub
	
}

}
