package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AddACarToYourStayPage extends DriverCapabilities {

	Utility util = new Utility();

	public AddACarToYourStayPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_BackBtn;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Show Offer Details\"]")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_ShowOffer;

	@AndroidFindBy(name = "To qualify for the 1,500 point bonus and the 500 points per day, rental must be booked through this site. Advance reservation required. CDP 22754 must be included in the reservation. This offer has no cash value, may not be used with Pre-Pay Rates, Tour Rates or Insurance Replacement Rates and cannot be combined with any other certificate, voucher, offer or promotion. Hertz age, driver, credit and qualifying rate restrictions for the renting location apply. Taxes, tax reimbursement, age differential charges, fees and optional service charges, such as refueling, are not included. The CDP discount applies to time and mileage charges only, discount vary by rental date, location and vehicle type; 35% discount will not apply in all cases. Modifying your reservation may result in a change in your rate and/or invalidate this offer. Points will not be awarded on travel industry rates, wholesale tour packages, insurance/dealer replacement, other promotional rates or group travel. Offer valid for pickup through December 31, 2016.")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_ShowOffer_TnC;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Hide Offer Details\"]")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_HideOffer;

	@AndroidFindBy(name = "Add a Car to Your Stay?")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_SubTitle;

	@AndroidFindBy(xpath = "//*[@content-desc=\"CHOOSE A DIFFERENT CAR\"]")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_ChooseCar;

	@AndroidFindBy(name = "CAR TYPE")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarType;

	@AndroidFindBy(name = "Compact / Mid-sized")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarType_Compact;

	@AndroidFindBy(name = "Standard / Full-sized")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarType_Standard;

	@AndroidFindBy(name = "SUV / Minivan")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarType_SUV;

	@AndroidFindBy(name = "Premium / Luxury")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarType_Luxury;

	@AndroidFindBy(name = "My Car Reservation")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_CarReservation;

	@AndroidFindBy(name = "Pick Up Location")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_PickUpLocation;

	@AndroidFindBy(xpath = "//*[@resource-id=\"searchForm_pickUpLocation\"]")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_PickUpLocation_TxtBox;

	@AndroidFindBy(xpath = "//*[@content-desc=\"CLOSEST RENTAL TO YOUR HOTEL\"]")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_PickUpLocation_ClosestRental;

	@AndroidFindBy(name = "Rental Dates and Times")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_RentalDatesnTimes;

	@AndroidFindBy(name = "Pickup Date")
	//@iOSFindBy(name = "")
	public MobileElement tripExtra_Hertz_Stay_PickupDate;

}