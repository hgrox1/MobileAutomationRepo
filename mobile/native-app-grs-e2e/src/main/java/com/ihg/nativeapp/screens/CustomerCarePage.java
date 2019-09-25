package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class CustomerCarePage extends DriverCapabilities {

	public CustomerCarePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
	@AndroidFindBy(name = "Navigate up")
	//@iOSFindBy(name = "")
	public MobileElement custCare_backBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")	
	public MobileElement custCare_appLogo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")	
	public MobileElement custCare_SignInLbl;
	
	@AndroidFindBy(name = "Customer Care")
	//@iOSFindBy(name = "")
	public MobileElement CustomerCare_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/about_the_app_section_feedback")
	//@iOSFindBy(name = "")
	public MobileElement CustomerCare_Help;

	@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_section_assistant")
	//@iOSFindBy(name = "")
	public MobileElement CustomerCare_VirtualAssistant;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_section_cc")
	//@iOSFindBy(name = "")
	public MobileElement CustomerCare_ContactCare;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_section_recent_stay")
	//@iOSFindBy(name = "")
	public MobileElement Contact_RecentStay;
	
	@AndroidFindBy(name = "Send Us a Note About Your IHG® Rewards Club Account")
	//@iOSFindBy(name = "")
	public MobileElement Contact_SendNote;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_section_note_sub")
	//@iOSFindBy(name = "")
	public MobileElement Contact_SubNote;
	
	@AndroidFindBy(name = "Leave Feedback About the App")
	//@iOSFindBy(name = "")
	public MobileElement Contact_Feedback;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_section_feedback_sub")
	//@iOSFindBy(name = "")
	public MobileElement Contact_SubFeedback;
	
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Customer Care");
			logger.info("PASS: Customer Care Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: Customer Care Page is not loaded properly");
		}
	}
	
	
	
}


