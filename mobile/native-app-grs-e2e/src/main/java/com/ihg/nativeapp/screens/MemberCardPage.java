package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MemberCardPage extends DriverCapabilities {

	public MemberCardPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/member_card_lock_btn")
	//@iOSFindBy(xpath = "")
	public MobileElement memberCard_CloseBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/member_card_background")
	//@iOSFindBy(xpath = "")
	public MobileElement memberCard_Background;

}
