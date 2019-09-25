package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PointsAndCashPage extends DriverCapabilities {

	public PointsAndCashPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_HamburgerBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_image")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_Img;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_content_headline")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_ContentHeadline;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_content_text1")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_ContentText1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_content_text2")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_ContentText2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_find_hotel")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_FindHotelImg;

	@AndroidFindBy(name = "Find a Hotel")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_FindAHotel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_cash_terms_conditions")
	// @iOSFindBy(name = "")
	public MobileElement pointsAndCashPage_TnC;

	@AndroidFindBy(name = "How Do I Get Started?")
	// @iOSFindBy(name = "")
	public MobileElement deeplink_MsgForNotLoggedIn;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Points & Cash Add Up to Great Rewards");
			logger.info("PASS: Points & Cash Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Points & Cash Page is not loaded properly");
		}
	}

}
