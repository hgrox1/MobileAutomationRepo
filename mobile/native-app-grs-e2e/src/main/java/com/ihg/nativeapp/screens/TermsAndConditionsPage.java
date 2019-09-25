package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TermsAndConditionsPage extends DriverCapabilities {

	public TermsAndConditionsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Navigate up")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditionsPage_BackBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditions_Title;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditions_CloseBtn;

	@AndroidFindBy(xpath = "//*[@content-desc=\"InterContinental Hotels Group\"]/android.view.View[1]/android.view.View[1]")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditionsPage_IHGRewardsClubLogo;

	@AndroidFindBy(id = "//*[@content-desc=\" REWARDS CLUB GLOBAL MEMBERSHIP TERMS AND CONDITIONS\"]")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditionsPage_TnCHeading;
	
	@AndroidFindBy(id = "//*[@class=\"android.widget.ListView\"]")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditionsPage_TnCBulletPts;
	
	@AndroidFindBy(id = "//*[@content-desc=\"InterContinental Hotels Group\"]/android.view.View[1]/android.view.View[3]")
	// @iOSFindBy(name = "")
	public MobileElement termsAndConditionsPage_TnCDesc;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Terms and Conditions");
			logger.info("PASS: Terms and Conditions Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: Terms and Conditions Page is not loaded properly");
		}
	}

	
}
