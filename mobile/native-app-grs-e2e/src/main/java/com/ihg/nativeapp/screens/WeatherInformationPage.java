package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class WeatherInformationPage extends DriverCapabilities {

	public WeatherInformationPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "")
	public MobileElement weatherInformationPage_weatherTitle;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	@iOSFindBy(xpath = "//*[@label=\"Back\"]")
	public MobileElement weatherInformationPage_backBtn;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Weather");
			logger.info("PASS: Weather Page is Opened");
			
		}

		catch (Exception e) {
			logger.error("FAIL: Weather Page is not loaded properly");
		}
	}


}
