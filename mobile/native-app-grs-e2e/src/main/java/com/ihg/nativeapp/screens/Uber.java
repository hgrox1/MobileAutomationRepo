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

public class Uber extends DriverCapabilities {

	public Uber(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_reminder_button_image")
	@iOSFindBy(name = "")
	public MobileElement uber_image;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_reminder_button_set_a_reminder_label")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderBarTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@iOSFindBy(name = "")
	public MobileElement uber_backBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_header_image")
	@iOSFindBy(name = "")
	public MobileElement uber_ihgUberImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_description")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderDescription;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_mobile_country")
	@iOSFindBy(name = "")
	public MobileElement uber_countryLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_mobile_country_code")
	@iOSFindBy(name = "")
	public MobileElement uber_countryCode;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_mobile_number_edit")
	@iOSFindBy(name = "")
	public MobileElement uber_mobileNumber;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_text")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_date")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderDate;

	@AndroidFindBy(name = "3:00 PM")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_time_zone")
	@iOSFindBy(name = "")
	public MobileElement uber_timeZone;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_terms_header")
	@iOSFindBy(name = "")
	public MobileElement uber_termsHeader;

	@AndroidFindBy(name = "By setting the ride reminder you consent to Uber sending you a ride reminder text message using an autodialer. Text message charges may apply, please contact your service provider for details. To book through Uber you must download and book through the Uber app. Uber's Terms and Conditions and Privacy Policy applies. You are not required to consent to receive texts in order to book or stay at IHG hotels.")
	@iOSFindBy(name = "")
	public MobileElement uber_termsDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_earn_rewards")
	@iOSFindBy(name = "")
	public MobileElement uber_earnRewards;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_set_ride_reminder_button")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderBtn;

	@AndroidFindBy(id = "android:id/alertTitle")
	@iOSFindBy(name = "")
	public MobileElement uber_rideTitle;

	@AndroidFindBy(name = "Aug")
	@iOSFindBy(name = "")
	public MobileElement uber_monthClick;

	@AndroidFindBy(name = "Nov")
	@iOSFindBy(name = "")
	public MobileElement uber_month2Click;

	@AndroidFindBy(name = "Dec")
	@iOSFindBy(name = "")
	public MobileElement uber_decClick;

	@AndroidFindBy(name = "26")
	@iOSFindBy(name = "")
	public MobileElement uber_dateClick;

	@AndroidFindBy(name = "21")
	@iOSFindBy(name = "")
	public MobileElement uber_date1logClick;

	@AndroidFindBy(name = "12")
	@iOSFindBy(name = "")
	public MobileElement uber_date2Click;

	@AndroidFindBy(id = "android:id/button1")
	@iOSFindBy(name = "")
	public MobileElement uber_okBtn;

	@AndroidFindBy(name = "4")
	@iOSFindBy(name = "")
	public MobileElement uber_hour1Click;

	@AndroidFindBy(name = "5")
	@iOSFindBy(name = "")
	public MobileElement uber_hour2Click;

	@AndroidFindBy(name = "59")
	@iOSFindBy(name = "")
	public MobileElement uber_min1Click;

	@AndroidFindBy(name = "58")
	@iOSFindBy(name = "")
	public MobileElement uber_min2Click;

	@AndroidFindBy(name = "AM")
	@iOSFindBy(name = "")
	public MobileElement uber_timeAm;

	@AndroidFindBy(name = "PM")
	@iOSFindBy(name = "")
	public MobileElement uber_timePm;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_error_title")
	@iOSFindBy(name = "")
	public MobileElement uber_errorTitle;

	@AndroidFindBy(name = "Enter your mobile phone number.")
	@iOSFindBy(name = "")
	public MobileElement uber_errorMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_error_btn_ok")
	@iOSFindBy(name = "")
	public MobileElement uber_errorOkBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_iconed__icon")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderSetIcon;

	@AndroidFindBy(name = "Ride Reminder Set")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderSetMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_iconed__btn_ok")
	@iOSFindBy(name = "")
	public MobileElement uber_reminderSetOk;

	@AndroidFindBy(id = "com.ihg.apps.android:id/uber_reminder_button_reminder_set_date_time")
	@iOSFindBy(name = "")
	public MobileElement uber_confirmReminderDisplay;

	@AndroidFindBy(name = "Tap a button. Get a ride.")
	@iOSFindBy(name = "")
	public MobileElement uber_earnRewrdsUber;

	@AndroidFindBy(name = "Here's your Uber reminder:")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelSubtitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_uber_ride_reminder_date_time")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelDateTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_uber_ride_reminder_phone_number")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelMobile;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_uber_ride_reminder_btn_ok")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelOkBtn;

	@AndroidFindBy(id = "android:id/button2")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelBtn;

	@AndroidFindBy(name = "Cancel Reminder Are you sure you want to cancel your Uber Ride Reminder")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelReminderTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_left")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelYes;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_right")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelNo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_uber_ride_reminder_btn_cancel")
	@iOSFindBy(name = "")
	public MobileElement uber_cancelRideBtn;

	public void mobile(String mobileNumber) throws IOException, InterruptedException {

		Utility util = new Utility();
		Uber uberUser = new Uber(innerDriver);
		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		mobileNumber = (String) readFile.data[0][12];
		util.enterTextinField(uberUser.uber_mobileNumber, mobileNumber);
		innerDriver.hideKeyboard();

	}

	public void mobileinvalid(String mobileNumber) throws IOException, InterruptedException {

		Utility util = new Utility();
		Uber uberUser = new Uber(innerDriver);
		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		mobileNumber = (String) readFile.data[1][12];
		util.enterTextinField(uberUser.uber_mobileNumber, mobileNumber);
		innerDriver.hideKeyboard();

	}
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Ride Reminder");
			logger.info("PASS: Uber Ride Reminder Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: Uber Ride Reminder Page is not loaded properly");
		}
	}

}