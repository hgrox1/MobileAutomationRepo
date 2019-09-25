package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LowPointsPopUp extends DriverCapabilities {

	public LowPointsPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/bordered_confirm_dlg__text")
	// @iOSFindBy(name = "")
	public MobileElement lowPointsPopUp_Msg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_btn_ok")
	// @iOSFindBy(name = "")
	public MobileElement lowPointsPopUp_Btn;

}
