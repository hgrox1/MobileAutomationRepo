package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MemberBenefitsPage extends DriverCapabilities {

	public MemberBenefitsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Member Benefits")
	//@iOSFindBy(xpath = "")
	public MobileElement memberBenefits_Title;

	@AndroidFindBy(name = "The Benefits of Traveling Well")
	//@iOSFindBy(xpath = "")
	public MobileElement memberBenefits_SubTitle;

	@AndroidFindBy(xpath = "//*[@content-desc=\"IHG® Rewards Club\"]")
	//@iOSFindBy(xpath = "")
	public MobileElement memberBenefits_IhgRewards;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")	
	public MobileElement memberBenefits_HamburgerBtn;

}