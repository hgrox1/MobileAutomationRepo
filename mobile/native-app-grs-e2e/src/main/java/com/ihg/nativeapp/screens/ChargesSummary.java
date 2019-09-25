package com.ihg.nativeapp.screens;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ChargesSummary extends DriverCapabilities {

	public ChargesSummary(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
	@AndroidFindBy(name = "Charges Summary")
	//@iOSFindBy(name = "")
	public MobileElement chargesSummary_title;
	
	@AndroidFindBy(name = "Navigate up")
	//@iOSFindBy(name = "")
	public MobileElement chargesSummary_backIcon;
	
	@AndroidFindBy(name = "Estimated Service Charges")
	@iOSFindBy(xpath = "//*[@label=\"Estimated Service Charges\"]")
	public MobileElement chargesSummary_serviceCharges;
	
	@AndroidFindBy(name = "Estimated Taxes")
	@iOSFindBy(xpath = "//*[@label=\"Estimated Taxes\"]")
	public MobileElement chargesSummary_estimatesTaxes;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/payment_summary__book_now_btn")
	@iOSFindBy(xpath = "//*[@name=\"NA_CHARGESUMMARYCONTROLLER\"]/view[2]")
	public MobileElement chargesSummary_swipeToBook;
	
	@AndroidFindBy(name = "Estimated Service Charges and Taxes")
	@iOSFindBy(xpath = "//*[@label=\"Estimated Service Charges and Taxes\"]")
	public MobileElement chargesSummary_chargesAndTaxes;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Charges Summary");
			logger.info("PASS: Charges Summary Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Charges Summary Page is not loaded properly");
		}
	}
}
