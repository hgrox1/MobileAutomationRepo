package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ReservationCancellationConfirmationPopUp extends DriverCapabilities {

	public ReservationCancellationConfirmationPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_title")
	@iOSFindBy(name = "")
	public MobileElement reservationCancellationConfirmation_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_message")
	@iOSFindBy(name = "")
	public MobileElement reservationCancellationConfirmation_Msg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_bottom_btn")
	@iOSFindBy(name = "")
	public MobileElement reservationCancellationConfirmation_OKBtn;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Confirmation");
			logger.info("PASS: Res Cancel Confirm Pop Up is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Res Cancel Confirm Pop Up is not loaded properly");
		}
	}

}
