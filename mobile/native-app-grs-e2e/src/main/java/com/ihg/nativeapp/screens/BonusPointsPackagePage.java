package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BonusPointsPackagePage extends DriverCapabilities {

	public BonusPointsPackagePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_Title;

	@AndroidFindBy(xpath = "//*[@content-desc=\"points-and-cash-couple-in-pool\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_Img;

	@AndroidFindBy(xpath = "//*[@content-desc=\"IHG® Rewards Club Bonus Points Package\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_Heading;

	//@AndroidFindBy(name = "When you book an IHG® Rewards Club Bonus Points package, you can earn up to 5,000 bonus points on your stay at a participating hotel.")
	@AndroidFindBy(xpath = "//*[@content-desc=\"When you book an IHG® Rewards Club Bonus Points package, you can earn up to 5,000 bonus points on your stay at a participating hotel.\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_Msg;

	//@AndroidFindBy(name = "YOUR RATE by IHG® Rewards Club BONUS POINTS")
	@AndroidFindBy(xpath = "//*[@content-desc=\"YOUR RATE by IHG® Rewards Club BONUS POINTS\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_RateByBonusPts;

	//@AndroidFindBy(name = "YOUR RATE by IHG® Rewards Club BONUS POINTS + Breakfast")
	@AndroidFindBy(xpath = "//*[@content-desc=\"YOUR RATE by IHG® Rewards Club BONUS POINTS + Breakfast\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_RateByBonusPtsPlusBreakfast;

	//@AndroidFindBy(name = "1,000 bonus points per night")
	@AndroidFindBy(xpath = "//*[@content-desc=\"1,000 bonus points per night\"]")	
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_ThousandBonusPtsPerNight;

	//@AndroidFindBy(name = "5,000 bonus points per stay")
	@AndroidFindBy(xpath = "//*[@content-desc=\"5,000 bonus points per stay\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_FiveThousandBonusPtsPerStay;

	
	@AndroidFindBy(xpath = "//*[@content-desc=\"1,000 bonus points per night + breakfast\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_ThousandBonusPtsPerNightPlusBreakfast;

	//@AndroidFindBy(name = "2,000 bonus points per stay")
	@AndroidFindBy(xpath = "//*[@content-desc=\"2,000 bonus points per stay\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_TwoThousandBonusPtsPerStay;

	//@AndroidFindBy(name = "Rates are limited and subject to availability.")
	@AndroidFindBy(xpath = "//*[@content-desc=\"Rates are limited and subject to availability.\"]")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_Note;

	@AndroidFindBy(id = "hide1")
	// @iOSFindBy(name = "")
	public MobileElement bonusPointsPackage_TnC;

}
