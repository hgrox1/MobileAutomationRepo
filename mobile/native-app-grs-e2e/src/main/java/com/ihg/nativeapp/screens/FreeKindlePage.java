package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FreeKindlePage extends DriverCapabilities {
	
	public FreeKindlePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_Title;
	
	@AndroidFindBy(name = "Kindle eBooks are among the many benefits you get with your Spire Elite membership.")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_Desc;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_BackBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_CloseBtn;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"kindle\"]")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_Logo;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"kindle-hero\"]")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_Image;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Get a Free eBook\"]")
	//@iOSFindBy(xpath = "")
	public MobileElement kindle_GetFreeEBookBtn;
	
}
