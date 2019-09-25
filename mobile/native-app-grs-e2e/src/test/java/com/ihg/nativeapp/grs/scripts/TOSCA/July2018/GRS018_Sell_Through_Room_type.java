package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;


import java.util.ArrayList;

import org.testng.Assert;
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
public class GRS018_Sell_Through_Room_type extends DriverCapabilities
{
	//This script is specific to brand: HOLIDAY INN EXPRESS AND SUITES and hotel is MOORE.
		/*String location;
		String hotelname = "Moore";
		public static final String dbName = "Tosca_Analytics";

	    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

	    public static final String serverport = "1433";

	    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";*/

	    
		@Test(groups = { "smoke", "regression" }, enabled = true)
	    public void multiavailSpecialReq() throws Exception {
			int ID_Value= 18; 
			// Read data from Database
	    /*	 String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
	    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
	        ArrayList<String> resultSet = readData.readData();*/
	        DriverWait.staticWait();
	        /*String PropName = resultSet.get(0);
	        String Destination = resultSet.get(1);
	        String Brand = resultSet.get(2);*/
	        String PropName = "KEY LARGO";
	        String Destination = "KEY LARGO";
	        //String Brand = resultSet.get(2);
	      
	        System.out.println("Property "+PropName);
	        
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

	        //switch to int build
			homeUser.changetoINT();

			// Clicking on Find Hotel button on Home Page
	        util.click(homeUser.home_FindHotelBtn);
	        
	        locationSearchUser.correctPage();

	        locationSearchUser.inputLocationSpecialEvent(Destination);
			DriverWait.staticWait();
			util.click(locationSearchUser.locationSearchPage_LocList);
			
			
			
			// Verifying Search Form page
			searchFormUser.correctPage();
			
			// Click on Search Button
			util.click(searchFormUser.searchForm_Rate_SearchBtn);
						
	        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
	        searchResultListViewUser.correctPage();
	        DriverWait.staticWait();
	        util.click(searchBrands.searchFilter_button);
	        logger.info("Pass: Reach to the Filter Page");
	        util.scrollTo("All IHG");
	        logger.info("Pass: Unselect the All IHG Brands");
	        util.click(searchBrands.ihgBrand_button);
	        logger.info(searchBrands.ihgBrand_button.getText()+"is unselected");
	        
	        util.scrollTo("Holiday Inn Hotels & Resorts");
	        logger.info("Pass: Select the " +searchBrands.ihgBrand_HolidayInn.getText());
	        util.click(searchBrands.ihgBrand_HolidayInn);
	        
	        util.click(searchBrands.searchFilter_ApplyBtn);
	        logger.info("Pass: Filter Applied");
	        DriverWait.staticWait();
	        util.scrollTo(PropName);
	        logger.info("Pass: Hotel Found");
	       String  str= searchResult.searchResultListView_RateAvailable.getText();
	       util.assertEqual("YOUR RATE is Available",str);
	       if(str == "YOUR RATE is Available")
	       logger.info("Pass: As per Sell_Through_Room_type , Rooms are available on this date");
	       

	}
	}
