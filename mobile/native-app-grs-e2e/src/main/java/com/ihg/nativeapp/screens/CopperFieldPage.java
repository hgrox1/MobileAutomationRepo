package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CopperFieldPage extends DriverCapabilities {

	public CopperFieldPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")	
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_MaintainYourPoint;
	
	//@AndroidFindBy(name = "SCTASK0010052_IHG_PointsExpiration_LP_hero_Mobile")
	@AndroidFindBy(xpath = "//*[@contentDesc=\"InterContinental Hotels Group\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_ImageHeader;
	
	@AndroidFindBy(name = "What’s next? It’s totally up to you.")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"What’s next? It’s totally up to you.\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_SubHeading;
	
	@AndroidFindBy(name = "You’ve got a lot of great options to choose. Simply stay, earn or redeem points once every 12 months and keep them from expiring!")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"You’ve got a lot of great options to choose. Simply stay, earn or redeem points once every 12 months and keep them from expiring!\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_Text;
	
	@AndroidFindBy(name = "SCTASK0010052_IHG_PointsExpiration_LP_icon1_Mobile")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"SCTASK0010052_IHG_PointsExpiration_LP_icon1_Mobile\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_ImageCode;
	
	@AndroidFindBy(name = "You’re always welcome here")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"You’re always welcome here\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_WelcomeText;
	
	@AndroidFindBy(name = "Book a night at any of our more than 5,000 locations worldwide and you'll make a new memory and get more points.")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"Book a night at any of our more than 5,000 locations worldwide and you'll make a new memory and get more points.\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_BookANight;
	
	@AndroidFindBy(name = "BOOK YOUR STAY")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"BOOK YOUR STAY\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_BookStay_Link;
	
	@AndroidFindBy(name = "SCTASK0010052_IHG_PointsExpiration_LP_icon2_Mobile")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"SCTASK0010052_IHG_PointsExpiration_LP_icon2_Mobile\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_BedImage;
	
	@AndroidFindBy(name = "Get away")
	//@AndroidFindBy(xpath = "//*[@contentDesc=\"Get away\"]")
	@iOSFindBy(name = "")
	public MobileElement accountLanding_CopperField_GetAway;

}