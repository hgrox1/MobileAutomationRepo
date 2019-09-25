package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PushNotificationPopUp extends DriverCapabilities {

	public PushNotificationPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "android:id/message")
	
	@iOSFindBy(xpath = "//*[@value=\"“4.0.0” Would Like to Send You Notifications\"]")
	public MobileElement pushNotificationPopUp_Msg;

	@AndroidFindBy(id = "android:id/button2")	
	@iOSFindBy(xpath = "//*[@label='Don’t Allow']")
	public MobileElement pushNotificationPopUp_NotNowBtn;

	@AndroidFindBy(id = "android:id/button1")
	@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_OKBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/title")
	//@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_IHGBranded;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/yes")
	//@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_IHGBranded_Yes;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/no")
	//@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_IHGBranded_No;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/body")
	//@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_ShareTheLove;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/decline")
	//@iOSFindBy(xpath = "//*[@label=\"Allow\"]")
	public MobileElement pushNotificationPopUp_ShareTheLove_Never;
	
}