package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ReservationConfirmationPage extends DriverCapabilities {

	public ReservationConfirmationPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "android:id/home")
	@iOSFindBy(name = "//*[@name=\"NA_IHGRESERVATIONDETAILSCONTROLLER\"]/UIAButton[1]")
	public MobileElement reservationConfirmationPage_HamburgerBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_membership_level")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_MembershipLevel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_logo")
	@iOSFindBy(name = "//*[@name='ihg-logo-header']")
	public MobileElement reservationConfirmationPage_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_name")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_UserName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_number")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_PointsNumber;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_abbrv")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_PointsUnit;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_section_boxes_image")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_Img;

	// @AndroidFindBy(id =
	// "com.ihg.apps.android:id/confirmation_number_module__label")
	@AndroidFindBy(name = "Confirmation Number")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_ConfirmationLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_number_module__number")
	// @AndroidFindBy(id =
	// "com.ihg.apps.android:id/dialog_reservation_confirmation_confirmation_number")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_ConfirmationNo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_CheckInDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/arrow")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_Arrow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_CheckOutDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__weather_container")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_Weather;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_module__current_charges")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmationPage_CurrentCharges;

	public void correctPage() {

		try {
			DriverWait.waitByName("Stay Preferences");
			logger.info("PASS: Reservation Summary Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Reservation Summary Page is not loaded properly");
		}
	}

}
