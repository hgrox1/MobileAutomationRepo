package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DigitalRewardsPage extends DriverCapabilities {

	public DigitalRewardsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	@iOSFindBy(xpath = "")
	public MobileElement digitalRewards_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	@iOSFindBy(xpath = "")
	public MobileElement digitalRewards_CloseBtn;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	@iOSFindBy(xpath = "")
	public MobileElement digitalRewards_BackBtn;
	public void correctPage() {

		try {
			DriverWait.waitByName("Digital Rewards");
			logger.info("PASS: Digital Rewards Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Digital Rewards Page is not loaded properly");
		}
	}

}
