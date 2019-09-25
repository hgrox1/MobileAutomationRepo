package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class EarnRewardsPage extends DriverCapabilities {

	public EarnRewardsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	@AndroidFindBy(name = "Navigate up")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_HamburgerBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_Title;

	@AndroidFindBy(xpath = "//*[@text=\"Bonus Points Packages\"]")
	@iOSFindBy(xpath = "//*[@label=\"Earn 60,000 Bonus Points\"]")
	public MobileElement earnRewardsPage_BonusPointsPackagesTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Earn up to 5,000 IHG® Rewards Club bonus points on your stay. These bonus points count toward Elite status.\"]")
	@iOSFindBy(xpath = "//*[@label=\"Earn up to 5,000 IHG® Rewards Club bonus points on your stay. These bonus points count toward Elite status.\"]")
	public MobileElement earnRewardsPage_BonusPointsPackagesDesc;

	@AndroidFindBy(name = "Earn 60,000 Bonus Points")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_cc_title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/earn_redeem_item_image")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_cc_image;

	@AndroidFindBy(name = "Plus a free anniversary night every year with the IHG® Rewards Select Credit Card.")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_cc_description;

	@AndroidFindBy(name = "Car Rental")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_carRental_title;

	@AndroidFindBy(name = "Drive for less and earn points every day you’re on the road.")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_carRental_description;

	@AndroidFindBy(name = "UBER")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_Uber_title;

	@AndroidFindBy(name = "Tap a button. Get a ride.")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_Uber_description;

	@AndroidFindBy(name = "Dine & Earn")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_DineEarn_title;

	@AndroidFindBy(name = "Join IHG® Rewards Club Dining program today to start earning up to 8 points per dollar at participating restaurants.")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_DineEarn_description;

	@AndroidFindBy(name = "Bonus Points Packages")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_BonusPoints_title;

	@AndroidFindBy(name = "Earn up to 5,000 IHG® Rewards Club bonus points on your stay. These bonus points count toward Elite status.")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_BonusPoints_description;

	@AndroidFindBy(name = "IHG® Select Credit Card")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_SelectCC_title;

	@AndroidFindBy(name = "com.ihg.apps.android:id/app_bar_close")
	// @iOSFindBy(name = "")
	public MobileElement earnRewardsPage_SelectCC_closeBtn;

	public void correctPage() {

		try {
			DriverWait.waitByName("Earn");
			logger.info("PASS: Earn Reward Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Earn Reward Page is not loaded properly");
		}
	}

}
