package com.ihg.nativeapp.grs.scripts.TOSCA;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectDatesPage;

public class SP040_OverbookingForceSellRes extends DriverCapabilities {

    String checkInDate, checkOutDate, roomType, adultNo, location, hotelName, room, rate, pin, firstName, lastName, address, address2, address3, city, postalCode, email, mobileNo,
            cCNo, confirmationMsg, confirmationNo, confirmationTrim;

    String re_enter_pin;
    public int counter;
    public String roomName_SelectRatePage, rate_SelectRatePage;

    @Test(groups = { "smoke", "regression" }, enabled = true)
    public void propertySearch() throws Exception {

        String screenPlayName = "SP40Stage";
        Utility util = new Utility();
        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling App Permission PopUp
        homeUser.allowAppPermission();
        DriverWait.staticWait();

        // Handling Push Notification PopUp
        homeUser.handlePushNotificationPopUp();
        homeUser.correctPage();

        // Clicking on Find Hotel button on Home Page
        util.click(homeUser.home_FindHotelBtn);
        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
        locationSearchUser.correctPage();

        // Enter Location
        locationSearchUser.inputLocationSingleWordFromDB(screenPlayName);
        util.click(locationSearchUser.locationSearchPage_LocList);
        SearchForm searchFormUser = new SearchForm(innerDriver);
        searchFormUser.correctPage();

        // Selecting Check-in/Check-out date
        SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);
        util.click(searchFormUser.searchForm_CheckInDayOfMonth);
        selectDateUser.correctPage();
        util.click(selectDateUser.selectDatesPage_CheckOutLabel);
        util.singleScroll();
        util.click(selectDateUser.selectDatesPage_CheckInDateValue);
        util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
        util.click(selectDateUser.selectDatesPage_DoneBtn);

        // Selecting Rate
        util.click(searchFormUser.searchForm_RateTypeDropDown);
        util.click(searchFormUser.searchForm_Rate_BestAvailable);

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        searchResultListViewUser.correctPage();

    }

}