package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CurrentChargesPage extends DriverCapabilities {

	public CurrentChargesPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_BackBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_Title;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"FILAA OPERA QA\"]")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_FILAA;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Nov 29, 2016 → Nov 30, 2016\"]")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_Dates;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Confirmation Number: 60808374\"]")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_ConfNo;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Date / Description\"]")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_DateOrDesc;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Amount (USD)\"]")
	// @iOSFindBy(name = "")
	public MobileElement currentChargesPage_Amount;
	
	
}
