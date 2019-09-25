package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HotelReviewPage extends DriverCapabilities {

	public HotelReviewPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	public MobileElement hotelReview_BackBtn;
	
	@AndroidFindBy(id= "com.ihg.apps.android:id/app_bar_title")
	public MobileElement hotelReview_Title;	
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/header_guest_review__logo")
	public MobileElement hotelReview_BrandLogo;	

	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_from_text")	
	public MobileElement hotelReview_RoomFrom;

	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_price")	
	public MobileElement hotelReview_BookNowPrice;	

	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_book_now_label")	
	public MobileElement hotelReview_BookNow;

	
	public void correctPage() {

		try {
			DriverWait.waitByName(" Reviews");
			logger.info("PASS: Hotel Review Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Hotel Review Page is not loaded properly");
		}
	}
}
