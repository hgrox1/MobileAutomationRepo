package com.ihg.nativeapp.screens;

import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
//import junit.framework.Assert;

public class KimptonImage extends DriverCapabilities {
	public static AppiumDriver innerDriver;

	public KimptonImage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_message")
	@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement kimpton_ConfirmationMessage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_right")
	@iOSFindBy(name = "homescreen_find_hotel_bttn")
	public MobileElement kimpton_ContinueBtn;

	public void verifyUrl() {

		String actualUsername;
		String requiredInputUsername;

		actualUsername = innerDriver.getPageSource();
		requiredInputUsername = "https://www.kimptonhotels.com/kimpton-experience";
		//Assert.assertEquals(actualUsername, requiredInputUsername);
	}

}