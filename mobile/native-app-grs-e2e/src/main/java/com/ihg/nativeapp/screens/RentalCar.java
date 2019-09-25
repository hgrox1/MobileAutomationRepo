package com.ihg.nativeapp.screens;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RentalCar extends DriverCapabilities {

	Utility util = new Utility();

	public RentalCar(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// Capturing elements on RentalCar Screen

	@AndroidFindBy(name = "Car Rental")
	@iOSFindBy(name = "")
	public MobileElement earnRewards_rentalCar;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_logo")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_backArrow;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_crossbtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_name")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_memberName;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Save and get fast rewards on every rental\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_subTitle;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Hertz rentals come with:\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_hertzRental;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Up to 35% savings\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_hertzRentalDes1;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Add Trip Extras\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_hertzRentalDes2;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"500 points per day for Elite members\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_hertzRentalDes3;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"125 points per day for Club members\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_hertzRentalDes4;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Dollar and Thrifty rentals come with:\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_dollarThirfty;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Everyday savings\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_dollarThirftyDes1;
    
	@AndroidFindBy(xpath = "//*[@content-desc=\"125 IHG Rewards Club points per day for all members\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_dollarThirftyDes2;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Show Offer Details\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_showOffer;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Need a Car for Your Trip?\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_needCar;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Pick Up Location\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_pickUp;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Search by city, airport code, or zip code\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_searchTextBox;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Pickup Date\"]")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_pickupDate;
	
	@AndroidFindBy(id= "pickUpDate")	
	@iOSFindBy(name = "")
	public MobileElement rentalCar_pickupDateTextbox;
	
	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_number")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_pointsNumber;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_abbrv")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_pointsLbl;

	@AndroidFindBy(name = "Save up to 35% on your next Hertz rental +")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_herzRentalExpand;

	@AndroidFindBy(name = "Rental Car: Save up to 35%")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_rentalBlade;

	// Capturing elements to expanding +icon of rental hertz

	@AndroidFindBy(name = "Save up to 35% on your next Hertz rental −")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_herzRentalCollapse;

	@AndroidFindBy(name = "Save up to 35%, plus much more when booking Hertz through IHG::")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_saveUptoText;

	@AndroidFindBy(name = "Save up to 35%")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_listItem1;

	@AndroidFindBy(name = "Earn at least 1,500 points.")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_listItem2;

	@AndroidFindBy(name = "Get Up to 500 additional points per day")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_listItem3;

	@AndroidFindBy(name = " Five Star")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_listItem4;

	@AndroidFindBy(name = "Use your points for Reward Nights, gift cards or any item in the IHG")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_usePointsText;

	@AndroidFindBy(name = " Rewards Club catalog.")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_rewardsClub;

	@AndroidFindBy(name = "To reserve your next rental and secure your points through this special offer, click below.")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_toReserveText;

	@AndroidFindBy(name = "Book%20Your%20Car_USEN")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_bookCarBtn;

	@AndroidFindBy(name = "Not an IHG® Rewards Club member?")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_notIhgMember;

	@AndroidFindBy(name = "Join%20Here_USEN")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_joinHereBtn;

	@AndroidFindBy(name = "Terms & Conditions")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_termsConditions;

	@AndroidFindBy(name = "*To qualify for the 1,500 point bonus and the 500 points per day, rental must be booked through the link above. ")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_termsConditions1;

	@AndroidFindBy(name = "Advance reservation required. CDP 22754 must be included in the reservation. Offer is available at participating locations in the US, Canada, Puerto Rico, Mexico, Belgium, Czech Republic, France, Germany, Italy, Luxembourg, Netherlands, Slovakia, Spain, Switzerland, the United Kingdom, Australia and New Zealand. This offer has no cash value, may not be used with Pre-Pay Rates, Tour Rates or Insurance Replacement Rates and cannot be combined with any other certificate, voucher, offer or promotion. Hertz age, driver, credit and qualifying rate restrictions for the renting location apply. Taxes, tax reimbursement, age differential charges, fees and optional service charges, such as refueling, are not included. The CDP savings applies to time and mileage charges only, discounts vary by rental date, location and vehicle type. Modifying your reservation may result in a change in your rate and/or invalidate this offer. Points will not be awarded on travel industry rates, wholesale tour packages, insurance/dealer replacement, other promotional rates or group travel. Offer valid for pickup through December 31, 2016. ")
	@iOSFindBy(name = "")
	public MobileElement rentalCar_termsConditions2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Title;

	@AndroidFindBy(name = "Save and Earn on Car Rental with Hertz")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Desc1;

	@AndroidFindBy(name = "Earn 1,500 IHG® Rewards Club points per rental, PLUS")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Desc2;

	@AndroidFindBy(name = "500 points per day for Elite members")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Desc3;

	@AndroidFindBy(name = "125 points per day for Club members")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Desc4;

	@AndroidFindBy(name = "No payment due at time of reservation")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Desc5;

	@AndroidFindBy(name = "Show Offer Details")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Offer;

	@AndroidFindBy(name = "Hide Offer Details")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_HideOffer;

	@AndroidFindBy(name = "IHG Discount Rate Terms and Conditions")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Offer_TnC;

	@AndroidFindBy(name = "Need a Car for Your Trip?")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Book_Title;

	@AndroidFindBy(name = "Pick Up Location")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Book_PickUpLoc_Heading;

	//@AndroidFindBy(xpath = "//*[@resource-id=\"searchForm.pickUpLocation\"]")
	@AndroidFindBy(xpath = "//*[@resource-id=\"searchForm\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpLocation;

	@AndroidFindBy(xpath = "//*[@resource-id=\"searchForm.willReturnDifferentLocation\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickuploc;

	@AndroidFindBy(id = "searchForm.willReturnDifferentLocation")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_returnToDiffLoc;

	@AndroidFindBy(name = "Pickup Date")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpDate;

	@AndroidFindBy(xpath = "//*[@resource-id=\"pickUpDate\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpDateTxtBox;

	@AndroidFindBy(name = "Pickup Time")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpTime;

	@AndroidFindBy(xpath = "//*[@resource-id=\"pickUpTime\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpTimeTxtBox;

	@AndroidFindBy(name = "26")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_PickUpDate_Enter;

	@AndroidFindBy(name = "27")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ModifyPickUpDate_Enter;

	@AndroidFindBy(name = "8:00")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_pickUpTime_Enter;

	@AndroidFindBy(name = "4:00")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ModifypickUpTime_Enter;

	@AndroidFindBy(name = "Drop Off Date")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffDate;

	@AndroidFindBy(xpath = "//*[@resource-id=\"dropOffDate\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffDateTxtBox;

	@AndroidFindBy(name = "28")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffDate_Enter;

	@AndroidFindBy(name = "30")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ModifydropOffDate_Enter;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Drop Off Time\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffTime;

	@AndroidFindBy(xpath = "//*[@resource-id=\"dropOffTime\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffTimeTxtBox;

	@AndroidFindBy(name = "2:00")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_dropOffTime_Enter;

	@AndroidFindBy(name = "5:00")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ModifydropOffTime_Enter;

	@AndroidFindBy(name = "All Set! Book Your Car Now.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_AllSet;

	@AndroidFindBy(name = "Intermediate 4 Doors C Toyota Corolla or Similar")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarName;

	@AndroidFindBy(name = "$21.14 USD / day")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Day;

	@AndroidFindBy(name = "$107.10 USDTOTAL")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Total;

	@AndroidFindBy(xpath = "//*[@resource-id=\"selectedCarWidget\"]/android.view.View[2]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice;

	@AndroidFindBy(name = "Prices are estimates based on selected car, location, dates, and age of driver.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Desc;

	@AndroidFindBy(name = "1 Day at $21.14 USD")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_DayPrice;

	@AndroidFindBy(name = "Miscellaneous Apf Fee")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Miscellaneous;

	@AndroidFindBy(name = "Customer Facility Charge:")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_CustomerFacility;

	@AndroidFindBy(name = "Miscellaneous Vlf Fee")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Miscellaneous_VlfFee;

	@AndroidFindBy(name = "Energy Surcharge:")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Energy_Surcharge;

	@AndroidFindBy(name = "Taxes")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarPrice_Taxes;

	@AndroidFindBy(name = "Total")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarFullPrice_Total;

	@AndroidFindBy(name = "Add Trip Extras")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Brand;

	@AndroidFindBy(name = "5 Passengers")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Passenger;

	@AndroidFindBy(name = "1 Large Suitcase, 2 Small Suitcases")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Luggage;

	@AndroidFindBy(name = "Automatic Transmission")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Transmission;

	@AndroidFindBy(name = "Air Conditioning")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_AirConditioning;

	@AndroidFindBy(name = "Dual Airbags")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Airbags;

	@AndroidFindBy(name = "ABS")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_ABS;

	@AndroidFindBy(name = "33 miles/gallon or better")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Car_Miles;

	@AndroidFindBy(name = "CHOOSE A DIFFERENT CAR")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_Choose_DiffCar;

	@AndroidFindBy(name = "CAR TYPE")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarType;

	@AndroidFindBy(name = "Compact / Mid-sized")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarType_Compact;

	@AndroidFindBy(name = "Standard / Full-sized")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarType_Standard;

	@AndroidFindBy(name = "SUV / Minivan")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarType_SUV;

	@AndroidFindBy(name = "Premium / Luxury")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_CarType_Premium;

	@AndroidFindBy(name = "First Name")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_FirstName;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_firstName\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_FirstName_TxtBx;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_firstName\"]/ancestor::android.view.View[1]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_firstNameTxt;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm\"]/android.view.View[1]/android.view.View[1]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_firstNameclick;

	@AndroidFindBy(name = "Last Name")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_LastName;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_lastName\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_LastName_TxtBx;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_lastName\"]/ancestor::android.view.View[1]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_lastNameTxt;

	@AndroidFindBy(name = "Email Address")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_EmailAddress;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_emailAddress\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_EmailAddress_TxtBx;

	@AndroidFindBy(name = "IHG")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_IHG;

	@AndroidFindBy(name = " Rewards Club Member Number (Optional)")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_ClubMemberNo;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_iHGRewardsNumber\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_ClubMemberNo_TxtBx;

	//@AndroidFindBy(name = "Hertz Gold Plus Rewards")
	@AndroidFindBy(xpath = "//*[@content-desc=\"Hertz Gold Plus Rewards® Member Number (Optional)\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_GoldPlusReward;

	@AndroidFindBy(name = "Member Number (Optional)")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_MemberNo;

	@AndroidFindBy(xpath = "//*[@resource-id=\"driverInformationForm_submitBtn\"]")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_BookNow;

	@AndroidFindBy(name = "VIEW TERMS & CONDITIONS")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_TnC;

	@AndroidFindBy(name = "Manage Your Car Reservation")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_ManageCar;

	@AndroidFindBy(name = "MODIFY RESERVATION")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_ModifyReservation;

	@AndroidFindBy(name = "CANCEL RESERVATION")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_CancelReservation;

	@AndroidFindBy(name = "UPDATE CAR RESERVATION")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_UpdateModifyReservation;

	@AndroidFindBy(name = "KEEP CAR RESERVATION")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_KeepCarReservation;

	@AndroidFindBy(name = "You have chosen to cancel your current car reservation.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_Chosen_CancelReservation;

	@AndroidFindBy(name = "Cancellations can be made at any time prior to picking up your car on 24 Nov 2016 without any penalties. Once you pick up your car you will be subject to the rate and terms agreed upon for your rental.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_Cancellation_Policy;

	@AndroidFindBy(name = "Are you sure you want to cancel your car reservation at this time?")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_Sure_Reservation;

	@AndroidFindBy(name = "KEEP RESERVATION")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_KeepReservation;

	@AndroidFindBy(name = "Cancel Car Reservation")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_CancelCarReservation;

	@AndroidFindBy(name = "Your reservation has been cancelled.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_Cancellation_Msg;

	@AndroidFindBy(name = "Please write down this number for your records.")
	// @iOSFindBy(name = "")
	public MobileElement rentalCar_ChooseCar_CancellationNo_Note;

	public void inputPickUpLocation()throws IOException, InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		 String loc = (String) readFile.data[8][3];
		util.enterTextinField(rentalCar_pickUpLocation, loc);
		// rentalCar_pickUpLocation.sendKeys(loc);
	}
	public void correctPage() {

		try {
			DriverWait.waitByName("Car Rental");
			logger.info("PASS: Car Rental Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Car Rental Page is not loaded properly");
		}
	}

}