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


public class GRS012_MulAvailSpecialReq extends DriverCapabilities
{
	
		String location;
		
		// Database Information
/*	    public static final String dbName = "Tosca_Analytics";

	    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

	    public static final String serverport = "1433";

	    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

*/	    
	    
		
		@Test(groups = { "smoke", "regression" }, enabled = true)
	    public void multiavailSpecialReq() throws Exception {
			/*int ID_Value= 12; 
			// Read data from Database
	    	 String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
	    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
	        ArrayList<String> resultSet = readData.readData();
	        DriverWait.staticWait();*/
	       /* String PropName = resultSet.get(0);
	        String Destination = resultSet.get(1);
	        String Brand = resultSet.get(2)*/;
	        String PropName = "BIMINGHAM - WALSALL JCT 10";//bhxwa
	        String Destination ="walsall";
	        String Brand="Holiday Inn Hotels & Resorts";
	       
	        Utility util = new Utility();
	        HomePage homeUser = new HomePage(innerDriver);
	        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
			SearchForm searchFormUser = new SearchForm(innerDriver);
			
			SearchFilterPage searchBrands = new SearchFilterPage(innerDriver);
			SearchResultListView searchResult =new SearchResultListView(innerDriver);
			

	        // Handling App Permission PopUp
			 DriverWait.staticWait();
	        homeUser.allowAppPermission();
	       

	        // Handling Push Notification PopUp
	        homeUser.handlePushNotificationPopUp();
	        homeUser.correctPage();

	        // Clicking on Find Hotel button on Home Page
	        util.click(homeUser.home_FindHotelBtn);
	        
	        locationSearchUser.correctPage();

	        locationSearchUser.inputLocationSpecialEvent(Destination);
			DriverWait.staticWait();
			util.click(locationSearchUser.locationSearchPage_LocList);
			
			// Verifying Search Form page
			searchFormUser.correctPage();
			
			// Click on Search Button
			
			// Selecting Check-in/Check-out date
			SelectDatesPage selectDateUser = new SelectDatesPage(innerDriver);


			util.click(searchFormUser.searchForm_CheckInDayOfMonth);
			selectDateUser.correctPage();
			// util.click(selectDateUser.selectDatesPage_CheckOutLabel);
			util.singleScroll();
			util.click(selectDateUser.selectDatesPage_CheckInDateValue);
			util.click(selectDateUser.selectDatesPage_CheckOutDateValue);
			util.click(selectDateUser.selectDatesPage_DoneBtn);
			DriverWait.staticWait();
			util.click(searchFormUser.searchForm_Children_PlusBtn);
						
			util.click(searchFormUser.searchForm_Rate_SearchBtn);
						
	        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
	        searchResultListViewUser.correctPage();
	        DriverWait.staticWait();
	        util.click(searchBrands.searchFilter_button);
	        util.scrollTo("All IHG® Brands");
	        util.click(searchBrands.ihgBrand_button);
	        util.scrollTo(Brand);
	        util.click(searchBrands.ihgBrand_HolidayInn);
	        util.click(searchBrands.searchFilter_ApplyBtn);
	        logger.info("Filter Applied");
	        DriverWait.staticWait();
	        util.scrollTo(PropName);
	        logger.info("Hotel Found");
	       String  str= searchResult.searchResultListView_NoRoomAvailable.getText();
	       util.assertEqual("No rooms available.",str);
	       logger.info("As per Mullti Avail Special Requirement, no rooms are available on this date");
	      
	       
		}
	}