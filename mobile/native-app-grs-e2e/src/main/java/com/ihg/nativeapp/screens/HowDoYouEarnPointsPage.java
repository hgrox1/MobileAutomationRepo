package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HowDoYouEarnPointsPage extends DriverCapabilities {

	public HowDoYouEarnPointsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_TopBar;

	@AndroidFindBy(name = "Navigate up")
	//@AndroidFindBy(className = "android.widget.ImageButton")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/how_to_earn_base_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_BasePtsText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/how_to_earn_elite_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_ElitePtsText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/how_to_earn_bonus_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_BonusPtsText;

	@AndroidFindBy(xpath = "//*[text()=\"In addition to earning points for your stay, in-hotel purchases, when charged to your room, will earn you points. Eligible charges include food and beverage, telephone, laundry, and in-room movies, for example.\"]")
	// @iOSFindBy(name = "")
	public MobileElement howDoYouEarnPoints_AdditionalPtsText;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("How Do You Earn Points?");
			logger.info("PASS: How Do You Earn Points Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: How Do You Earn Points Page is not loaded properly");
		}
	}
}
