package com.ihg.nativeapp.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

public class RewardsClubCatalog extends DriverCapabilities {

	public RewardsClubCatalog(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "IHG® Rewards Club Catalog")
	// @iOSFindBy(name = "")
	public MobileElement catalog_title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	// @iOSFindBy(name = "")
	public MobileElement catalog_crossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	// @iOSFindBy(name = "")
	public MobileElement catalog_navigationArrow;

}
