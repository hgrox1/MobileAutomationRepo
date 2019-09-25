package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SelectDatesPage;
import com.ihg.nativeapp.screens.SelectDestinationPage;

public class GRS015_Nonsmoking_accessibleroomtype extends DriverCapabilities{
	public static String location;

   @Test(groups = { "smoke", "regression" }, priority = 0)
    public static void verifyAllFilters() throws Exception {

        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling Push Notification PopUp
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();
        DriverWait.staticWait();
        homeUser.correctPage();

        Utility util = new Utility();
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectDestinationPage locationSearchUser = new SelectDestinationPage(innerDriver);
        SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);

        //Switch env
        homeUser.changetoINT();
        
        // Clicking on Find A Hotel Button in Home Page
        
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();
        DriverWait.staticWait();

        // Enter Location
        locationSearchUser.inputLocationGoaDb(location);
        DriverWait.staticWait();
        util.click(locationSearchUser.locationSearchPage_LocList);
        logger.info("Location retrieved from Database");
        searchFormUser.correctPage();

        // Click on check in date
     			util.click(searchFormUser.searchForm_CheckInDayOfMonth);

     			// Verify Select dates page
     			selectDateUser.correctPage();

     			util.singleScroll();
     			DriverWait.staticWait();
     			//util.singleScroll();

     			// Click on Check In and Check Out date
     			util.click(selectDateUser.selectDatesPage_CheckInDateValue);
     			util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
     			DriverWait.staticWait();

     			// Click on Apply button
     			util.click(selectDateUser.selectDatesPage_DoneBtn);
     			DriverWait.staticWait();
        
        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        searchResultListViewUser.correctPage();

        // Selecting Hotel
        DriverWait.staticWait();
        searchResultListViewUser.selectHotel();
        hotelDetailUser.correctPage();

        // Book Hotel
        DriverWait.staticWait();
        util.click(hotelDetailUser.hotelDetail_SelectRoom_BookNow);
        selectRoomUser.selectRoom();
        selectRoomUser.correctPage();

        // Verify presence of filters on Select a Room page
        util.display(selectRoomUser.selectRoom_AccessibilityFilter);
        //util.display(selectRoomUser.selectRoom_NonSmokingFilter);
        util.display(selectRoomUser.selectRoom_NumberOfRooms);

        
        //remove the non-smoking filter
        //util.click(selectRoomUser.selectRoom_NonSmokingFilter);
        
        // Verify functionality of filters
        
        //Total Rooms
        String numberOfRooms = selectRoomUser.selectRoom_NumberOfRooms.getText();
        int numberOfRoomsWithOutFilters = Integer.parseInt(numberOfRooms.replaceAll("[^0-9]", ""));
        logger.info("Number of rooms mentioned without clicking any filter = " + numberOfRoomsWithOutFilters);
        util.singleScroll();
        
        int numberOfInfoIconsWithoutFilters = selectRoomUser.selectRoom_RoomInfo.size();
        logger.info("Number of rooms present in the list without clicking any filter = " + numberOfInfoIconsWithoutFilters);
        util.assertEqual(numberOfRoomsWithOutFilters, numberOfRoomsWithOutFilters);
        
       //Accessibility filter
        util.click(selectRoomUser.selectRoom_AccessibilityFilter);
        numberOfRooms = selectRoomUser.selectRoom_NumberOfRooms.getText();
        int numberOfRoomsWithAccessibilityFilter = Integer.parseInt(numberOfRooms.replaceAll("[^0-9]", ""));
        logger.info("Number of rooms mentioned after clicking accessibility filter = " + numberOfRoomsWithAccessibilityFilter);
        util.singleScroll();
        int numberOfInfoIconsWithAccessibilityFilter = selectRoomUser.selectRoom_RoomInfo.size();
        logger.info("Number of rooms present in the list after clicking accessibility filter = " + numberOfInfoIconsWithAccessibilityFilter);
        util.assertEqual(numberOfRoomsWithAccessibilityFilter, numberOfInfoIconsWithAccessibilityFilter);
        util.click(selectRoomUser.selectRoom_AccessibilityFilter);
       // util.click(selectRoomUser.selectRoom_NonSmokingFilter);
        numberOfRooms = selectRoomUser.selectRoom_NumberOfRooms.getText();
        int numberOfRoomsWithSmokingFilter = Integer.parseInt(numberOfRooms.replaceAll("[^0-9]", ""));
        logger.info("Number of rooms mentioned after clicking smoking filter = " + numberOfRoomsWithSmokingFilter);
        util.singleScroll();
        int numberOfInfoIconsWithSmokingFilter = selectRoomUser.selectRoom_RoomInfo.size();
        logger.info("Number of rooms present in the list after clicking smoking filter = " + numberOfInfoIconsWithSmokingFilter);
        util.assertEqual(numberOfRoomsWithSmokingFilter, numberOfInfoIconsWithSmokingFilter);

    }

   @Test(groups = { "smoke", "regression" }, priority = 1)
    public static void verifyNonSmokingHotelMessage() throws Exception {

        HomePage homeUser = new HomePage(innerDriver);
        DriverWait.staticWait();

        // Handling Push Notification PopUp
        homeUser.allowAppPermission();
        homeUser.handlePushNotificationPopUp();
        DriverWait.staticWait();
        homeUser.correctPage();

        Utility util = new Utility();
        SearchForm searchFormUser = new SearchForm(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage selectRoomUser = new SelectARoomPage(innerDriver);
        SelectDestinationPage locationSearchUser = new SelectDestinationPage(innerDriver);

        //Switch env
        homeUser.changetoINT();
        
        // Clicking on Find A Hotel Button in Home Page
        util.click(homeUser.home_FindHotelBtn);
        locationSearchUser.correctPage();
        DriverWait.staticWait();

        // Enter Location
        locationSearchUser.inputLocationSingleWord(location);
        DriverWait.staticWait();
        util.click(locationSearchUser.locationSearchPage_LocList);
        logger.info("Location is retrieved from database");
        searchFormUser.correctPage();

        // Click on Search Button
        util.click(searchFormUser.searchForm_SearchBtn);
        searchResultListViewUser.correctPage();

        // Selecting Hotel
        DriverWait.staticWait();
        searchResultListViewUser.selectHotel();
        hotelDetailUser.correctPage();
        DriverWait.staticWait();

        // Book Hotel
        util.click(hotelDetailUser.hotelDetail_SelectRoom_BookNow);
        selectRoomUser.correctPage();
        //selectRoomUser.selectRoom();
        DriverWait.staticWait();
		//util.click(selectRoomUser.selectRoom_FirstRoom);
        DriverWait.staticWait();

        selectRoomUser.selectRoom_NonSmokingHotelMsg.click();
        // Verify Non Smoking Hotel message-- to be unchecked
        System.out.println(selectRoomUser.selectRoom_NonSmokingHotelMsg.getText());
        util.assertEqual(selectRoomUser.selectRoom_NonSmokingHotelMsg.getText(), "This is a non-smoking hotel.");
        System.out.println("Pass");

    }
}
