package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SelectAnOption extends DriverCapabilities {

	public SelectAnOption(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__pac_rooms_button")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_RoomBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__pac_rates_button")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_RateBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__pac_row_points")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_PointsOnly;

	@AndroidFindBy(name = "10.000 Points + ")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_PointsPlusCash;
	
	@AndroidFindBy(name = "10,000 Points")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_10KPoints;

	@AndroidFindBy(name = "5.000 Points + ")
	// @iOSFindBy(name = "")
	public MobileElement selectAnOption_PointsPlusCash2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__pac_row_points")
	public List<MobileElement> pointsOption;

	Utility util = new Utility();

	public void displayPoints() {
		for (int i = 0; i < pointsOption.size(); i++) {
			util.displayList(pointsOption, i);

		}
	}
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Select an Option");
			logger.info("PASS: Select an Option Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: Select an Option Page is not loaded properly");
		}
	}

}
