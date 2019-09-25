package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import bsh.util.Util;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SearchResultMapView extends DriverCapabilities {

	public SearchResultMapView(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_button")
	// @iOSFindBy(name = "")
	public MobileElement searchResultMapView_Result_List;

	@AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_hotels")
	// @iOSFindBy(name = "")
	public MobileElement searchResultMapView_Result_HotelNo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_filter")
	// @iOSFindBy(name = "")
	public MobileElement searchResultMapView_Result_Filter;

	@AndroidFindBy(name = "Google Map")
	// @iOSFindBy(name = "")
	public MobileElement searchResultMapView_Result_GoogleMap;

	//@AndroidFindBy(xpath = "//*[@contentDesc=\"Google Map\"]/view[1]")
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Google Map\"]/android.view.View")
	// @iOSFindBy(name="")
	public List<MobileElement> searchResultMapView_Result_pins;

	@AndroidFindBy(name = "Texarkana Arkansas Conv Ctr")
	// @iOSFindBy(name="")
	public MobileElement searchResultMapView_Result_pin1_Hotel;

	Utility util = new Utility();

	public void verifyMapView() {
		//DriverWait.waitById("com.ihg.apps.android:id/search_results_navigation_filter");
		int i = 0;

		try {
			for (MobileElement me : searchResultMapView_Result_pins) {
				util.display(me);
				i++;
			}
			logger.info("PASS:Number of MapView points present" + " " + i);

		} catch (Exception e) {
			logger.info("FAIL:No MapView points are available");

		}
		String[] hotelNoText = searchResultMapView_Result_HotelNo.getText().split("\\s");
		util.assertEqual(String.valueOf(i), hotelNoText[0]);
	}
}
