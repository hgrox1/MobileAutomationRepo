package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FreeNightsPage  extends DriverCapabilities{
	
	public FreeNightsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
		
	@AndroidFindBy(xpath = "//*[@contentDesc=\"Earn 60,000 Bonus Points chase Plus an Anniversary Free Night. Learn More \"]")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_bonusPointImage;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_header")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_chaseAnniversaryText;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/voucher_availability")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_availabilityText;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/voucher_booking_dates")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_bookingDates;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_redeemed_nights")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_freeNightStatus;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_promo_image")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_promoImage;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_description")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_congratsDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_tandc_header")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_TandCHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_tandc_body")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_TandCDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/free_night_item_book_button")
	//@iOSFindBy(name = "")
	public MobileElement FreeNightsPage_BookNow;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Free Nights");
			logger.info("PASS: Free Nights Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Free Nights Page is not loaded properly");
		}
	}

}
