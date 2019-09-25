package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SearchResultListView extends DriverCapabilities {

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_brand_icon")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_BrandIcon;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_button")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Result_Map;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_hotels")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Result_HotelNo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_results_navigation_filter")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Result_Filter;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Hotel_Name;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_hotel_distance")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Hotel_Distance;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_rate_name")
    @iOSFindBy(xpath = "//*[@label='HotelImage_Accessibility_0']")
    public MobileElement searchResultListView_RateAvailable;

    /*@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
    @iOSFindBy(xpath = "")
    public List<MobileElement> searchResultListView_RateAvailableWithCurrencyConverter;*/

    @AndroidFindBy(id = "com.ihg.apps.android:id/preferred_rate_view")
    @iOSFindBy(xpath = "")
    public List<MobileElement> preferred_rate_view;
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_rate_value")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_NoRoomAvailable;

    @AndroidFindBy(id = "com.ihg.apps.android:id/currency__value_tv")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Currency_Value;

    @AndroidFindBy(id = "com.ihg.apps.android:id/currency__type_tv")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Currency_Type;

    @AndroidFindBy(id = "com.ihg.apps.android:id/rating")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Hotel_Rating;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reviews")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Hotel_Reviews;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_marketing_text")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Result_Text;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_rate_name")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_Select_Hotel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_CheckInDate;

    @AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_CheckOutDate;

    @AndroidFindBy(name = "Brice Hotel")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_BriceHotel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_kimpton_rate_container")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_KimptonRate;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_explore_kimpton_hotel")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_ExploreKimptonHotelLink;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_section_boxes_image_header")
    // @iOSFindBy(name = "")
    public List<MobileElement> hotelName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
    // @iOSFindBy(name = "")
    public List<MobileElement> hotelNameIvani;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_hotel_distance")
    // @iOSFindBy(name = "")
    public List<MobileElement> hotelDistance;

    @AndroidFindBy(id = "com.ihg.apps.android:id/currency__value_tv")
    // @iOSFindBy(name = "")
    public List<MobileElement> hotelPrice;

    @AndroidFindBy(name = "Introducing YOUR RATE More Rewards. More savings. As a member, you now get better savings when you book direct.  Look for YOUR RATE tag to save time and money. ")
    // @iOSFindBy(name = "")
    public MobileElement insertCard_Description;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_marketing_close")
    // @iOSFindBy(name = "")
    public MobileElement insertCard_CloseBtn;

    @AndroidFindBy(name = "Buckhead Atlanta")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_BuckheadAtlanta;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_result_rate_name")
    // @iOSFindBy(name = "")
    public MobileElement searchResultListView_RateAvailableMacau;

    @AndroidFindBy(name = "All IHG® Brands")
    // @iOSFindBy(name="")
    public MobileElement searchResultListView_Filter_All_Brands;

    @AndroidFindBy(id = "com.ihg.apps.android:id/checkable_filter_item_title")
    // @iOSFindBy(name="")
    public List<MobileElement> searchResultListView_Filter_brand;

    @AndroidFindBy(name = "Apply")
    // @iOSFindBy(name="")
    public MobileElement searchResultListView_Apply;

    @AndroidFindBy(name = "Remington Hotel")
    // @iOSFindBy(name="")
    public MobileElement searchResultListView_SPHotel_Remington;

    @AndroidFindBy(name = "Atlanta - Midtown")
    // @iOSFindBy(name="")
    public MobileElement searchResultListView_AtlantaMidtown;

    @AndroidFindBy(name = "Navigate up")
    public MobileElement searchResultListView_MenuBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    public MobileElement searchResultListView_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")
    public MobileElement searchResultListView_SignIn;

    @AndroidFindBy(name = "Do you love IHG Branded Android Test Application? Let us know :)")
    // @iOSFindBy(name="")
    public MobileElement searchResultListView_DoYouLoveIhgPopUp;

    @AndroidFindBy(xpath="//*[@text=\"GRS TEST PROPERTY FILAT-Opera\"]")
    public MobileElement clickFILAT;
    
    @AndroidFindBy(xpath="//*[@text=\"Atlanta-Buckhead\"]")
    public MobileElement clickATLBK;
    
    String distance[] = new String[2];

    float[] distanceValue = new float[2];
    // ArrayList<Float> sortedDistanceValue = new ArrayList<>();
    String price[] = new String[2];
    int[] priceValue = new int[2];
    Utility util = new Utility();
    
public void selectHotelSpecific(String HotelName) throws InterruptedException {
    	
    	//util.scrollTo(HotelName);
		try
		{
			this.util.click(this.searchResultListView_RateAvailable);
			logger.info("Room is available");
		} catch (NoSuchElementException e)
		{
			logger.error("Hotel Element is not selected");
		}
    }
    
public void selectHotelSpecificNotAvilable(String HotelName) throws InterruptedException {
    	
    	util.scrollTo(HotelName);
		try
		{
			this.util.click(this.searchResultListView_NoRoomAvailable);
			logger.info("Room is available");
		} catch (NoSuchElementException e)
		{
			logger.error("Hotel Element is not selected");
		}
    }

    public SearchResultListView(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void correctPage() {

        try {
            if (Platform1.equalsIgnoreCase("Android")) {
                DriverWait.waitById("com.ihg.apps.android:id/search_result_hotel_distance");
            } else {
                DriverWait.waitByName("SearchResultsCell_ContainerView");
            }
            logger.info("PASS: Search Result List View Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Search Result List View Page is not loaded properly");
        }
    }

    public void hotelDistanceValue(List<MobileElement> element, int i) {

        try {
            this.distance[i] = element.get(i).getText();
            String arr[] = this.distance[i].split(" ", 2);
            this.distanceValue[i] = Float.parseFloat(arr[0]);

        } catch (NoSuchElementException e) {
            logger.error("FAIL:" + element + "is not present");
        }

    }

    public void hotelPriceValue(List<MobileElement> element, int i) {

        try {
            this.price[i] = element.get(i).getText();
            this.priceValue[i] = Integer.parseInt(this.price[i]);

        } catch (NoSuchElementException e) {
            logger.error("FAIL:" + element + "is not present");
        }

    }

    public void listHotelNameText(List<MobileElement> element, int i) {

        String expectedHotelText = "Texarkana";
        try {
            String actualHotelText = element.get(i).getText();
            if (actualHotelText.equals(expectedHotelText) || actualHotelText.contains(expectedHotelText)) {
                logger.info("PASS: Hotel " + (i + 1) + " is as per destination entered");
            } else {
                logger.error("FAIL: Hotel " + (i + 1) + " is not as per destination entered");
            }
        } catch (Exception e) {
            logger.error("FAIL:" + element + "is not present");
        }
    }

    public void selectFirstHotel() throws InterruptedException {
        try {
            //this.util.clickList(this.searchResultListView_RateAvailableWithCurrencyConverter, 0);
            this.util.clickList(this.preferred_rate_view, 0);
            logger.info("Room is available");
        } catch (NoSuchElementException e) {
            this.util.scroll();
            DriverWait.staticWait();
          //  this.util.click(this.searchResultListView_RateAvailable); changed by me
        }

    }

    public void selectHotel() throws InterruptedException {
        try {
            this.util.click(this.searchResultListView_RateAvailable);
            logger.info("Room is available");
        } catch (NoSuchElementException e) {
            logger.error("Hotel Element is not selected");
        }
    }

    public void selectHotelAtlantaBuckhead() throws InterruptedException {
        try {
            DriverWait.waitById("com.ihg.apps.android:id/search_result_rate_name");
            this.util.click(this.searchResultListView_BuckheadAtlanta);
            logger.info("Room is available");
        } catch (NoSuchElementException e) {
            this.util.scroll();
            DriverWait.staticWait();
            this.util.click(this.searchResultListView_RateAvailableMacau);
        }
    }

    public void selectHotelChina() throws InterruptedException {
        try {
            this.util.click(this.searchResultListView_RateAvailableMacau);
            logger.info("Room is available");
        } catch (NoSuchElementException e) {
            this.util.scroll();
            DriverWait.staticWait();
            this.util.click(this.searchResultListView_RateAvailableMacau);
        }
    }

    public void selectHotelForNonGuaranteeBooking() {

        SearchResultListView searchResultUser = new SearchResultListView(innerDriver);
        SearchFilterPage searchFilterUser = new SearchFilterPage(innerDriver);
        this.util.click(searchResultUser.searchResultListView_Result_Filter);
        searchFilterUser.correctPage();
        this.util.scrollTo("All IHG® Brands");
        this.util.click(searchFilterUser.searchFilter_AllIhgBrands);
        this.util.scrollTo("Staybridge Suites");
        this.util.click(searchFilterUser.searchFilter_StaybridgeSuites);
        this.util.click(searchFilterUser.searchFilter_ApplyBtn);
        searchResultUser.correctPage();
        this.util.scrollTo("Atlanta - Midtown");
        this.util.click(this.searchResultListView_AtlantaMidtown);

    }

    public void selectHotelForUSGunLaw() {

        SearchResultListView searchResultUser = new SearchResultListView(innerDriver);
        SearchFilterPage searchFilterUser = new SearchFilterPage(innerDriver);
        this.util.click(searchResultUser.searchResultListView_Result_Filter);
        searchFilterUser.correctPage();
        this.util.scrollTo("All IHG® Brands");
        this.util.click(searchFilterUser.searchFilter_AllIhgBrands);
        this.util.scrollTo("Holiday Inn Express Hotels & Resorts");
        this.util.click(searchFilterUser.searchFilter_HolidayInnExpressHotelsResorts);
        this.util.click(searchFilterUser.searchFilter_ApplyBtn);
        searchResultUser.correctPage();

    }

    public void selectHotelIvani() throws InterruptedException {
        try {
            for (int i = 0; i < this.hotelNameIvani.size(); i++) {
                this.hotelNameIvani.get(1).click();
            }
        } catch (NoSuchElementException e) {
            logger.error("FAIL: Second hotel not clicked");
        }
    }

    public void selectHotelNonMainlandChina() throws InterruptedException {
        try {
            this.util.click(this.searchResultListView_RateAvailableMacau);
            logger.info("Room is available");
        } catch (NoSuchElementException e) {
            this.util.scroll();
            DriverWait.staticWait();
            this.util.click(this.searchResultListView_RateAvailableMacau);
        }
    }

    public void setfilter(String brand) {

        this.searchResultListView_Result_Filter.click();
        DriverWait.waitByName("Filters");
        // util.scrollTo("All IHG® Brands");
        this.util.singleScroll();
        this.searchResultListView_Filter_All_Brands.tap(1, 1);
        int brandList = this.searchResultListView_Filter_brand.size();
        for (int i = 1; i <= brandList; i++) {
            if (this.searchResultListView_Filter_brand.get(i).getText().contains(brand)) {
                this.searchResultListView_Filter_brand.get(i).tap(1, 1);
                break;
            }

        }
        this.searchResultListView_Apply.click();
        DriverWait.waitById("com.ihg.apps.android:id/view_bar");

    }

    public void verifyHotelDistance() throws InterruptedException {
        for (int i = 0; i < this.hotelDistance.size(); i++) {

            this.hotelDistanceValue(this.hotelDistance, i);
        }

        for (float d : this.distanceValue) {
            logger.info(d);
        }

        /*
         * Collections.sort(sortedDistanceValue);
         * 
         * for(Float g:sortedDistanceValue){ logger.info("Sorted "+ g); }
         */

        // boolean sorted = Ordering.natural().isStrictlyOrdered(distanceValue);

        if (this.distanceValue[0] <= this.distanceValue[1]) {
            // Assert.assertTrue(sortedDistanceValue.equals(distanceValue));
            // logger.info("PASS: Hotels are sorted by distance by default");

        } else {

            logger.error("FAIL: Hotels are not sorted by distance");

        }

        this.util.scroll();
        DriverWait.staticWait();

        for (int i = 0; i < this.hotelDistance.size(); i++) {

            this.hotelDistanceValue(this.hotelDistance, i);
        }

        for (float d : this.distanceValue) {
            logger.info(d);
        }

        if (this.distanceValue[0] <= this.distanceValue[1]) {
            // Assert.assertTrue(sortedDistanceValue.equals(distanceValue));
            logger.info("PASS: Hotels are sorted by distance by default");

        } else {

            logger.error("FAIL: Hotels are not sorted by distance");

        }

    }

    public void verifyHotelNameListAsPerDestination() throws InterruptedException {
        for (int i = 0; i < this.hotelName.size(); i++) {

            this.listHotelNameText(this.hotelName, i);
        }

        this.util.scroll();
        DriverWait.staticWait();

        for (int i = 0; i < this.hotelName.size(); i++) {

            this.listHotelNameText(this.hotelName, i);
        }

    }

    public void verifyHotelPrice() throws InterruptedException {

        for (int i = 0; i < this.hotelPrice.size(); i++) {

            this.hotelPriceValue(this.hotelPrice, i);
        }

        for (int p : this.priceValue) {
            logger.info(p);
        }

        if (this.priceValue[0] <= this.priceValue[1]) {

            // logger.info("PASS: Hotels are sorted by price");

        } else {

            logger.error("FAIL: Hotels are not sorted by price");

        }

        this.util.scroll();
        DriverWait.staticWait();

        for (int i = 0; i < this.hotelPrice.size(); i++) {

            this.hotelPriceValue(this.hotelPrice, i);
        }

        for (int p : this.priceValue) {
            logger.info(p);
        }

        if (this.priceValue[0] <= this.priceValue[1]) {

            logger.info("PASS: Hotels are sorted by price (low to high)");

        } else {

            logger.error("FAIL: Hotels are not sorted by price");

        }

    }

}
