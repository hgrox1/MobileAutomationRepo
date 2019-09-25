package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class UpcomingStays extends DriverCapabilities {

	public UpcomingStays(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Upcoming Stays")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_Title;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_reservation_row__day_value")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_Day;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_hotelName;

	// Capturing elements on latest upcoming stay details screen

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_section_boxes_image_header")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_ImgTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_light_gradient")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_ImgFirstHalf;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_image")
	//@iOSFindBy(name = "")
	public MobileElement upcomingStays_ImgSecondHalf;

	public void correctPage() {

		try {
			DriverWait.waitByName("Upcoming Stays");
			logger.info("PASS: Upcoming Stays Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Upcoming Stays Page is not loaded properly");
		}

}
}
