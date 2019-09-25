package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CookiesUsageAndSettingsPopUp extends DriverCapabilities {

	public CookiesUsageAndSettingsPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "android:id/home")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_membership_level")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_MembershipLevel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_logo")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_IhgLogo;

	@AndroidFindBy(name = "ACCEPT")
	// @iOSFindBy(name = "")
	public MobileElement cookies_AcceptBtn;

}
