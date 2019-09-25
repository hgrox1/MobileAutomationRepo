package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.SearchFilterPage;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectDatesPage;

public class GRS013_Multiavailabilityrequest_Presel extends DriverCapabilities {
	String location;
	/* public static final String dbName = "Tosca_Analytics";

	    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

	    public static final String serverport = "1433";

	    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";*/

	    
	@Test(groups = { "smoke", "regression" }, enabled = true)
	public void multiavailSpecialReq() throws Exception {
	
		//int ID_Value= 13; 
		// Read data from Database
    	/* String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        DriverWait.staticWait();*/
        /*String PropName = resultSet.get(0);*/
        String PropName = "Austin North - Round Rock";// use presell property where avail not coming and uncomment last 3 lines
        
       /* String Destination = resultSet.get(1)*/;
       String Destination ="CEDAR PARK";
      //  String Brand = resultSet.get(2);
        
		String screenPlayName = "SP40Stage";
		Utility util = new Utility();
		HomePage homeUser = new HomePage(innerDriver);
		LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
		SearchForm searchFormUser = new SearchForm(innerDriver);

		SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
		SearchResultListView searchResult = new SearchResultListView(innerDriver);
		SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);

		// Handling App Permission PopUp
		DriverWait.staticWait();
		homeUser.allowAppPermission();

		// Handling Push Notification PopUp
		homeUser.handlePushNotificationPopUp();
		homeUser.correctPage();

         //Change to INT
		homeUser.changetoINT();
		
		// Clicking on Find Hotel button on Home Page
		util.click(homeUser.home_FindHotelBtn);

		locationSearchUser.correctPage();

		locationSearchUser.inputLocationSpecialEvent(Destination);
		DriverWait.staticWait();
		util.click(locationSearchUser.locationSearchPage_LocList);

		// Click on check in date
		util.click(searchFormUser.searchForm_CheckInDayOfMonth);

		// Verify Select dates page
		selectDateUser.correctPage();

		util.singleScroll();
		DriverWait.staticWait();
				
		// Click on Check In and Check Out date
		
		util.click(selectDateUser.selectDatesPage_CheckInDateValue);
		util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
		DriverWait.staticWait();

		// Click on Apply button
		util.click(selectDateUser.selectDatesPage_DoneBtn);
		DriverWait.staticWait();
		
		// Verifying Search Form page
		searchFormUser.correctPage();

		// Click on Search Button
		util.click(searchFormUser.searchForm_Rate_SearchBtn);

		SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
		searchResultListViewUser.correctPage();
		DriverWait.staticWait();
		util.click(searchBrands.searchFilter_button);
		util.scrollTo("All IHG® Brands");
		util.click(searchBrands.ihgBrand_button);
		util.scrollTo("Holiday Inn Express Hotels & Resorts");
		util.click(searchBrands.ihgBrand_HolidayInn);
		util.click(searchBrands.searchFilter_ApplyBtn);
		logger.info("Filter Applied");
		DriverWait.staticWait();
		util.scrollTo(PropName);
		logger.info("Hotel Found");
		String str = searchResult.searchResultListView_NoRoomAvailable.getText();
		if(util.assertEqualReturnOrignal("No rooms available.", str))
		logger.info("As per Multi availability request Presel for AUSCD, no rooms are available on this date");
		else
			logger.info(" Presel for AUSCD is not set, rooms are available on this date");
	}

}
