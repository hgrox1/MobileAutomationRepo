package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CancelReservationPopUp extends DriverCapabilities {

	public CancelReservationPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_title")
	@iOSFindBy(name = "")
	public MobileElement cancelReservation_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_message")
	@iOSFindBy(name = "")
	public MobileElement cancelReservation_Msg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_top_btn")
	@iOSFindBy(name = "")
	public MobileElement cancelReservation_NoBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_top_split")
	@iOSFindBy(name = "")
	public MobileElement cancelReservation_BtnSeparator;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_alert_bottom_btn")
	@iOSFindBy(name = "")
	public MobileElement cancelReservation_YesBtn;

}
