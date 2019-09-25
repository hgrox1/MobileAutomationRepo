package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RedeemPointsPage extends DriverCapabilities {

	public RedeemPointsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_HamburgerBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	@iOSFindBy(name = "//*[@label=\"Redeem Points\"]")
	public MobileElement redeemPointsPage_Title;

	@AndroidFindBy(xpath = "//*[@text=\"Reward Nights\"]")
	@iOSFindBy(xpath = "//*[@label=\"Reward Nights\"]")
	public MobileElement redeemPointsPage_RewardNightsTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Use your points to stay at any of our hotels worldwide- with no blackout dates\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_RewardNightsDesc;
	
	@AndroidFindBy(xpath = "//*[@text='Free Nights']")
	@iOSFindBy(name = "")
	public MobileElement redeemPointsPage_FreeNightsTitle;
	
	@AndroidFindBy(xpath = "//*[@text='Use your Free Nights to book a stay at one of our hotels.']")
	@iOSFindBy(name = "")
	public MobileElement redeemPointsPage_FreeNightsTitleDesc;

	@AndroidFindBy(xpath = "//*[@text=\"Points & Cash\"]")
	@iOSFindBy(xpath = "//*[@label=\"Points & Cash\"]")
	public MobileElement redeemPointsPage_PnCTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Combine your points with cash and redeem your Reward Night faster\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_PnCDesc;

	@AndroidFindBy(xpath = "//*[@text=\"IHG® Rewards Club Catalog\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_IHGRewardsClubCatalogTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Whether you're shopping for yourself, family or friends - our online catalog is full of brand name gifts, jewelry, electronic\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_IHGRewardsClubCatalogDesc;

	@AndroidFindBy(xpath = "//*[@text=\"Digital Rewards\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_DigitalRewardsTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Redeem your points to instantly download eBooks, games, software and more\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_DigitalRewardsDesc;

	@AndroidFindBy(xpath = "//*[@text=\"IHG® Rewards Club Auctions\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_IHGRewardsClubAuctionsTitle;

	@AndroidFindBy(xpath = "//*[@text=\"Use your points to bid on behind-the-velvet-rope access to events, unique experiences, and themed bundles.\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_IHGRewardsClubAuctionsDesc;

	@AndroidFindBy(xpath = "//*[@text=\"The Ultimate Travel Tool\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_UltimateTravelToolTitle;

	@AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/earn_redeem_item_image\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_IHGRTranslatorImg;

	@AndroidFindBy(xpath = "//*[@text=\"IHG® Platinum Elite, Spire Elite and Ambassador Members receive full complimentary access!\"]")
	// @iOSFindBy(name = "")
	public MobileElement redeemPointsPage_UltimateTravelToolDesc;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Redeem");
			logger.info("PASS: Redeem Points Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Redeem Points Page is not loaded properly");
		}
	}

}
