package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MessagesPage extends DriverCapabilities {

	public MessagesPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_message_subject")
	//@iOSFindBy(xpath = "")
	public MobileElement messages_Subject;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_messages_empty_view")
	//@iOSFindBy(xpath = "")
	public MobileElement messages_NoMsgs;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_message_right_arrow")
	//@iOSFindBy(xpath = "")
	public MobileElement messages_RightArrow;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	public MobileElement messages_BackBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	public MobileElement messages_Title;

}