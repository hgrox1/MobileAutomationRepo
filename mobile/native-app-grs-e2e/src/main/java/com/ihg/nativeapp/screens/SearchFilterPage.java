package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SearchFilterPage extends DriverCapabilities {

	public SearchFilterPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/activity_search_filter__cancel_button")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_CancelBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/activity_search_filter__title_field")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_Title;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/activity_search_filter__apply_button")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_ApplyBtn;
	
	@AndroidFindBy(name = "Sort By")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_SortBy;
	
	@AndroidFindBy(name = "Distance")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_Distance;
	
	@AndroidFindBy(name = "Price (low to high)")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_PriceLowToHigh;
	
	@AndroidFindBy(name = "Guest Rating")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_GuestRating;
	
	@AndroidFindBy(name = "All IHG® Brands")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_AllIhgBrands;
	
	@AndroidFindBy(name = "InterContinental Hotels & Resorts")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_InterContinentalHotelsResorts;
	
	@AndroidFindBy(name = "Kimpton Hotels & Resorts")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_KimptonHotelsResorts;
	
	@AndroidFindBy(name = "HUALUXE™ Hotels & Resorts")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HUALUXEHotelsResorts;
	
	@AndroidFindBy(name = "Crowne Plaza Hotels & Resorts")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_CrownePlazaHotelsResorts;
	
	@AndroidFindBy(name = "Hotel Indigo")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HotelIndigo;
	
	@AndroidFindBy(name = "EVEN™ Hotels")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_EvenHotels;
	
	//@AndroidFindBy(name = "Holiday Inn Hotels & Resorts")
	//@AndroidFindBy(xpath = "//android.widget.TextView[@text='Holiday Inn Hotels & Resorts']")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HolidayInnHotelsResorts;
	
	//@AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/checkable_filter_item_title\"]//*[@text=\"Holiday Inn Express Hotels & Resorts\"]")
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Holiday Inn Express Hotels & Resorts']")
//	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HolidayInnExpressHotelsResorts;
	
	@AndroidFindBy(name = "Holiday Inn Resorts")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HolidayInnResorts;
	
	@AndroidFindBy(name = "Holiday Inn Club Vacations")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_HolidayInnClubVacations;
	
	@AndroidFindBy(name = "Staybridge Suites")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_StaybridgeSuites;
	
	@AndroidFindBy(name = "Candlewood Suites")
	@iOSFindBy(xpath = "")
	public MobileElement searchFilter_CandlewoodSuites;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/activity_search_filter__narrow_results_by_brand_parent")
	@iOSFindBy(xpath = "")
	public List<MobileElement> hotelBrands;
	
	@AndroidFindBy(id ="com.ihg.apps.android:id/activity_search_filter__amenities_list")
	@iOSFindBy(id ="")
	public List<MobileElement> amenities;
	
	@AndroidFindBy(name="In-Hotel Restaurant")
	@iOSFindBy(name="")
	public MobileElement searchFilter_InHotelRestaurant;
	
	@AndroidFindBy(name="Internet/WiFi")
	@iOSFindBy(name="")
	public MobileElement searchFilter_InternetWiFi;
	
	@AndroidFindBy(name="Kitchenette")
	@iOSFindBy(name="")
	public MobileElement searchFilter_Kitchenette;
	
	@AndroidFindBy(name="Airport Shuttle")
	@iOSFindBy(name="")
	public MobileElement searchFilter_AirportShuttle;
	
	@AndroidFindBy(name="Non-Smoking Rooms")
	@iOSFindBy(name="")
	public MobileElement searchFilter_NonSmokingRooms;
	
	@AndroidFindBy(name="Pool")
	@iOSFindBy(name="")
	public MobileElement searchFilter_Pool;
	
	@AndroidFindBy(name="Health/Fitness Center")
	@iOSFindBy(name="")
	public MobileElement searchFilter_HealthFitnessCenter;
	
	@AndroidFindBy(name="Pets Allowed")
	@iOSFindBy(name="")
	public MobileElement searchFilter_PetsAllowed;
	
	@AndroidFindBy(name="Breakfast Included")
	@iOSFindBy(name="")
	public MobileElement searchFilter_BreakfastIncluded;
	
	
	@AndroidFindBy(id="com.ihg.apps.android:id/search_results_navigation_filter")
	@iOSFindBy(name="")
	public MobileElement searchFilter_button;
	
	
	@AndroidFindBy(id="com.ihg.apps.android:id/checkable_filter_item_title")
	@iOSFindBy(name="")
	public MobileElement ihgBrand_button;
	
	
	//@AndroidFindBy(name="Staybridge Suites")
	@AndroidFindBy(xpath = "//*[@text=\"Staybridge Suites\"]")
	@iOSFindBy(name="")
	public MobileElement ihgBrand_StayBridge;
	
	
	//@AndroidFindBy(name="Holiday Inn Express Hotels & Resorts")
	@AndroidFindBy(xpath = "//*[@text=\"Holiday Inn Hotels & Resorts\"]")
	@iOSFindBy(name="")
	public MobileElement ihgBrand_HolidayInn;
	
	public MobileElement selectBrand()  {
		
	List <MobileElement> selectB=innerDriver.findElementsById("com.ihg.apps.android:id/checkable_filter_item_title");
	for(MobileElement element1 : selectB) {
		if(element1.getAttribute("text").equals("Holiday Inn Express Hotels & Resorts")) {
			break;
			//element.click(); 
			
		}
	}
	//element1=selectB.get(9);
	System.out.println("element is"+element1.getText());
	return element1;
	
	
	}
	public void correctPage() {

		try {
			DriverWait.waitByName("Filters");
			logger.info("PASS: Search Filter Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Search Filter Page is not loaded properly");
		}
	}
		
}
