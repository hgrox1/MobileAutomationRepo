package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CanadianRatesPopUp extends DriverCapabilities {

	public CanadianRatesPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple__message")
	// @iOSFindBy(name = "")
	public MobileElement canadianRates_Msg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple__btn_ok")
	// @iOSFindBy(name = "")
	public MobileElement canadianRates_OKBtn;

}
