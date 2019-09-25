package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class OffersPage extends DriverCapabilities{
	
	public OffersPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "com.ihg.apps.android:id/offers_title_text_view")
	@iOSFindBy(xpath = "//*[@label=\"IHG Offers\"]")
	public MobileElement Offers_title;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")	
	public MobileElement Offers_btnHamburger;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")	
	public MobileElement Offers_appLogo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")	
	public MobileElement Offers_SignInLbl;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("IHG Offers");
			logger.info("PASS: IHG Offers Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: IHG Offers Page is not loaded properly");
		}

}

}
