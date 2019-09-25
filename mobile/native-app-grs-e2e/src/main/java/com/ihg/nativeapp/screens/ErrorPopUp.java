package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ErrorPopUp extends DriverCapabilities {

	public ErrorPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/simple_alert_dialog__title")
	// @iOSFindBy(name = "")
	public MobileElement errorPopUp_Msg;

	@AndroidFindBy(name = "OK")
	// @iOSFindBy(name = "")
	public MobileElement errorPopUp_OkBtn;

}
