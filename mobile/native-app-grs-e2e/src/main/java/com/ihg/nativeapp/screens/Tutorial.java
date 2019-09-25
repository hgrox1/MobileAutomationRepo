package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Tutorial extends DriverCapabilities {

	public Tutorial(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_access")
	@iOSFindBy(name = "navigation_back_bttn")
	public MobileElement tutorial_AccessUpcoming;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_log_in")
	@iOSFindBy(name = "homescreen_find_hotel_bttn")
	public MobileElement tutorial_SignInText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_dismiss")
	@iOSFindBy(name = "navigation_view")
	public MobileElement tutorial_Dismiss;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_find")
	@iOSFindBy(name = "navigation_view")
	public MobileElement tutorial_BookText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_explore")
	@iOSFindBy(name = "navigation_view")
	public MobileElement tutorial_Explore;

}