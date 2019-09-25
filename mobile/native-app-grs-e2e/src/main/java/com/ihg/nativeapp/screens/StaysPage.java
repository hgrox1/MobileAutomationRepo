package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StaysPage extends DriverCapabilities {
	public StaysPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	
	@AndroidFindBy(id = "com.ihg.apps.android:id/upcoming_stays_anonymous_view")
	public MobileElement upcoming_signIn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__header")
	public MobileElement findReservation_upcoming;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__confirmation_number")
	public MobileElement confirmation_field;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__last_name")
	public MobileElement lastName_field;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__find_reservation_button")
	public MobileElement findReservation_Button;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__looking_for_kimpton")
	public MobileElement kimptonHotel_link;
	
	@AndroidFindBy(name = "Past Stays")
	public MobileElement pastStay_tab;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stays_anonymous_view")
	public MobileElement pastStay_signIn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_number_module__number")
	public MobileElement confirmation_number;
	
	@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/upcoming_stays_recycler_view\"]/group[1]/group[1]/image[1]")
	public MobileElement firstStay_upcoming;
	
	@AndroidFindBy(name= "Upcoming Stays")
	public MobileElement upcomingStay_tab;
	
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Upcoming Stays");
			logger.info("PASS: Stays Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Stays Page is not loaded properly");
		}
	
	}
}
