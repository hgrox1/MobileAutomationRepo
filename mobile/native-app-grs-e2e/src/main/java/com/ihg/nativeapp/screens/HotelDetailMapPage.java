package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HotelDetailMapPage extends DriverCapabilities {

	public HotelDetailMapPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	public MobileElement hotelMap_BackBtn;
	
	@AndroidFindBy(id= "com.ihg.apps.android:id/top_bar__title")
	public MobileElement hotelMap_Title;	
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/hotel_details__dialog_map_address")
	public MobileElement hotelMap_DialogMapAddress;	

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__dialog_map_btn_directions")	
	public MobileElement hotelMap_GetDirectionBtn;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Google Map\"]//*[@password=\"false\"]")	
	public MobileElement hotelMap_MapPin;	

	

	public void correctPage() {

		try {
			DriverWait.waitByName("Get Directions");
			logger.info("PASS: Hotel Map Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Hotel Map Page is not loaded properly");
		}
	}
}
