package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AboutAndLegalPage extends DriverCapabilities{
	
public AboutAndLegalPage(AppiumDriver<MobileElement> innerDriver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
		
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
	//@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement legalNotice_IHGLogo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/environment_choice_debug")
	//@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement switchEnv;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/use_grs_endpoint_debug")
	//@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement grsEndPoint;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/INT")
	//@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement selectINT;
	
	/*
	 * @AndroidFindBy(name = "Navigate up") //@iOSFindBy(name =
	 * "navigation_back_bttn") public MobileElement legalNotice_Backbtn;
	 */

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")	
	public MobileElement legalNotice_SignInLbl;
	
	@AndroidFindBy(xpath = "//*[@text=\"About and Legal\"]")
	//@iOSFindBy(name = "homescreen_find_hotel_bttn")
	public MobileElement legalNotice_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/about_the_app_section_feedback")
	//@iOSFindBy(name = "navigation_view")
	public MobileElement legalNotice_Feedback;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/about_the_app_section_terms_of_use")
	//@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement legalNotice_TermsUse;

	/*
	 * @AndroidFindBy(name =
	 * "com.ihg.apps.android:id/about_the_app_section_terms_and_condititions")
	 * //@iOSFindBy(name = "homescreen_find_hotel_bttn") public MobileElement
	 * legalNotice_TermsCondition;
	 */

	@AndroidFindBy(id = "com.ihg.apps.android:id/about_the_app_section_privacy_statement")
	//@iOSFindBy(name = "navigation_view")
	public MobileElement legalNotice_Privacy;
	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/about_the_app_version")
	//@iOSFindBy(name = "navigation_view")
	public MobileElement legalNotice_AppVersionNo;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("About and Legal");
			logger.info("PASS: About and Legal Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: About and Legal Page is not loaded properly");
		}
	}

}
