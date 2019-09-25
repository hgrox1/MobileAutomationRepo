package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.SearchFilterPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectDatesPage;

public class GRS007_HurdlePoint extends DriverCapabilities {

    String checkInDate, checkOutDate, roomType, adultNo, location, hotelName, room, rate, pin, firstName, lastName, address, address2, address3, city, postalCode, email, mobileNo,
            cCNo, confirmationMsg, confirmationNo, confirmationTrim;

    String re_enter_pin;
    public int counter;
    public String roomName_SelectRatePage, rate_SelectRatePage;

    @Test(groups = { "smoke", "regression" })
    public void propertySearch() throws Exception {
    	String PropName = "Birmingham - Walsall ,Jct.10";//bhxwa
        String Destination ="walsall";
        String Brand="Holiday Inn Hotels & Resorts";
        
        Utility util = new Utility();
        HomePage homeUser = new HomePage(innerDriver);
        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
        SearchResultListView searchResult =new SearchResultListView(innerDriver);
        
        DriverWait.staticWait();
        // Handling Push Notification PopUp
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();
        homeUser.correctPage();
        

       //change to INT
        homeUser.changetoINT();

        // Clicking on Find Hotel button on Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();
        
        //Enter location
        locationSearchUser.inputLocation(Destination);
		DriverWait.staticWait();
		util.click(locationSearchUser.locationSearchPage_LocList);      
        searchFormUser.correctPage();

        /*// Selecting Check-in/Check-out date
        
        util.click(searchFormUser.searchForm_CheckInDayOfMonth);
        selectDateUser.correctPage();
       // util.click(selectDateUser.selectDatesPage_CheckOutLabel);
        util.singleScroll();
        util.click(selectDateUser.selectDatesPage_CheckInDateValue);
        util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
        util.click(selectDateUser.selectDatesPage_DoneBtn);
        DriverWait.staticWait();*/

        // Selecting 2 No. of Rooms
        util.click(searchFormUser.searchForm_Room_PlusBtn);

        // Selecting Rate
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        util.click(searchFormUser.searchForm_Rate_BestAvailable);

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        searchResultListViewUser.correctPage();
        
        //Apply Filter 
        DriverWait.staticWait();
        util.click(searchBrands.searchFilter_button);
        util.scrollTo("All IHG® Brands");
        util.click(searchBrands.ihgBrand_button);
        util.scrollTo(Brand);
        util.click(searchBrands.ihgBrand_HolidayInn);
        util.click(searchBrands.searchFilter_ApplyBtn);
        logger.info("Filter Applied");
        DriverWait.staticWait();
     
        //Scroll to property and check Avail
        util.scrollTo(PropName);
        DriverWait.staticWait();
        logger.info("Hotel Found");
        String  str= searchResult.searchResultListView_NoRoomAvailable.getText();
        System.out.println("String IS "+str);
        try {
			util.assertEqual("No rooms available.",str);
			logger.info("As per Hurdle Point, no rooms are available on this date");
		} catch (Exception e) {
			System.err.println("SET THE HURDLE POINT");
			e.printStackTrace();
		}

}
}
