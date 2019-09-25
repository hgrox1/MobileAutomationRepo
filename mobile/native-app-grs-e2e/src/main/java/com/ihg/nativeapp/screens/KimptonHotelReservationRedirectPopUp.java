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

public class KimptonHotelReservationRedirectPopUp extends DriverCapabilities {

	public KimptonHotelReservationRedirectPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_message")
	@iOSFindBy(xpath = "")
	public MobileElement kimptonHotelReservationRedirectPopUp_ConfirmationMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_left")
	@iOSFindBy(xpath = "")
	public MobileElement kimptonHotelReservationRedirectPopUp_GoBackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_right")
	@iOSFindBy(xpath = "")
	public MobileElement kimptonHotelReservationRedirectPopUp_ContinueBtn;

	public void verifyHotelUrl() throws InterruptedException {

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String expectedUrl = (String) readFile.data[21][17];
		// String actualUrl =
		// innerDriver.findElementByXPath("//*[@resource-id=\"org.mozilla.firefox:id/url_bar_title\"]").getAttribute("text");
		String actualUrl = innerDriver.findElementByXPath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]")
				.getAttribute("text");
		Utility.match(actualUrl, expectedUrl);

	}

	public void verifyRateUrl() {

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String expectedUrl = (String) readFile.data[20][17];
		// String actualUrl =
		// innerDriver.findElementByXPath("//*[@resource-id=\"org.mozilla.firefox:id/url_bar_title\"]").getAttribute("text");
		String actualUrl = innerDriver.findElementByXPath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]")
				.getAttribute("text");
		Utility.match(actualUrl, expectedUrl);

	}

}
