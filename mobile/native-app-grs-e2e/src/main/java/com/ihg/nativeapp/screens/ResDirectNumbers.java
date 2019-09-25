package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ResDirectNumbers extends DriverCapabilities {

	public ResDirectNumbers(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Atlanta Downtown")
	// @iOSFindBy(name = "navigation_back_bttn")
	public MobileElement resDirectNumbers_Hotel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_brand_icon")
	// @iOSFindBy(name = "navigation_back_bttn")
	public MobileElement resDirectNumbers_HotelBrandIcon;

}