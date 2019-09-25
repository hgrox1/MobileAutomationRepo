package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AdchoicesPage extends DriverCapabilities {

	public AdchoicesPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.android.chrome:id/home_button")
	@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement adchoices_HomeBtn;

	@AndroidFindBy(id = "com.android.vending:id/title_thumbnail")
	@iOSFindBy(name = "homescreen_find_hotel_bttn")
	public MobileElement adchoices_Icon;
   
	public void verifyChoiceUrl() throws InterruptedException {

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String expectedUrl = (String) readFile.data[18][14];		
		String actualUrl = innerDriver.findElementByXPath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]")
				.getAttribute("text");
		Utility.match(actualUrl, expectedUrl);

	}
}
