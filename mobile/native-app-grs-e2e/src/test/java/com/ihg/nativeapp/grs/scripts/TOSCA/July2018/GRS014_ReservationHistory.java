package com.ihg.nativeapp.grs.scripts.TOSCA.July2018;



import java.util.ArrayList;

import org.testng.annotations.Test;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;

import com.ihg.nativeapp.screens.FindReservationPage;

import com.ihg.nativeapp.screens.HomePage;

import com.ihg.nativeapp.screens.LeftRail;

import com.ihg.nativeapp.screens.ReservationSummaryPage;

import com.ihg.nativeapp.screens.SignInPage;
import com.ihg.nativeapp.screens.UpcomingStays;

public class GRS014_ReservationHistory extends DriverCapabilities{
	
	 String confNumber = null, lastName = null;
	    String location;
	  /*  public static final String dbName = "Tosca_Analytics";

	    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

	    public static final String serverport = "1433";

	    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

	*/ 
	    

	    @Test(groups = { "smoke", "regression" }, priority = 0)
	    public void findReservationHappyScenario() throws Exception {
	    	/*
	    	int ID_Value= 14; 
			// Read data from Database
	    	 String Query = "SELECT PropName, Destination,Brand  FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+ID_Value+"' ";
	    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
	        ArrayList<String> resultSet = readData.readData();
	        DriverWait.staticWait();
	        String PropName = resultSet.get(0);
	        String Destination = resultSet.get(1);
	        String Brand = resultSet.get(2);*/
	        
	        FindReservationPage findResUser = new FindReservationPage(innerDriver);
	        UpcomingStays upcomingUser = new UpcomingStays(innerDriver);
	        Utility util = new Utility();
	        HomePage homeUser = new HomePage(innerDriver);
	        SignInPage signUser = new SignInPage(innerDriver);
	        LeftRail leftRailUser = new LeftRail(innerDriver);
	        ReservationSummaryPage reservationSummaryUser = new ReservationSummaryPage(innerDriver);
	        HomePage homeuser = new HomePage(innerDriver);
	        DriverWait.staticWait();
	        
	        // Handling Push Notification PopUp
	        homeuser.allowAppPermission();
	        homeuser.handlePushNotificationPopUp();
	        homeuser.correctPage();

	        //Change to INT
	        homeUser.changetoINT();
	        DriverWait.staticWait();
	        
	        // Clicking Sign In and expanding account landing page for anonymous user
	        util.click(homeuser.home_btnSignIn);
	        DriverWait.staticWait();

	        // SignIn into IHG
	        
	        signUser.signInDB(9);
	        signUser.handleConfirmationPageAndReachingHome();

	        // Clicking Hamburger and expanding left rail
	        util.click(homeUser.home_btnHanburgerOpened);
	        leftRailUser.correctPage();

	        // Clicking on stays
	        util.click(leftRailUser.leftRail_Stays);
	        upcomingUser.correctPage();
	        util.scrollTo("Find Reservation");

	        // Verify scenario when user entered valid confirmation and valid last name
	        findResUser.findReservationHappyScenarioStaticDb(9); //there is one more function for DB

	        DriverWait.staticWait();
			util.display(reservationSummaryUser.reservationSummaryPage_HamburgerBtn);
			util.display(reservationSummaryUser.reservationSummaryPage_Logo);
			util.display(reservationSummaryUser.reservationSummaryPage_UserName);
			util.display(reservationSummaryUser.reservationSummaryPage_PointsNumber);
			System.out.println("Check2");
			util.display(reservationSummaryUser.reservationSummaryPage_UserNameImage);
			
			util.display(reservationSummaryUser.reservationSummaryPage_hotelName);
			
			util.display(reservationSummaryUser.reservationSummaryPage_ConfirmationNumber);
			util.display(reservationSummaryUser.reservationSummaryPage_ConfirmationModify);
			util.display(reservationSummaryUser.reservationSummaryPage_BookingDates);
		
			util.singleScroll();
			DriverWait.staticWait();

		
			util.display(reservationSummaryUser.reservationSummaryPage_HotelDetailIcon);
			//util.display(reservationSummaryUser.reservationSummaryPage_HotelDetailName);
			util.display(reservationSummaryUser.reservationSummaryPage_TransIcon);
			//util.display(reservationSummaryUser.reservationSummaryPage_TransName);
			util.display(reservationSummaryUser.reservationSummaryPage_ThingstodoIcon);
			//util.display(reservationSummaryUser.reservationSummaryPage_ThingstodoName);
			util.display(reservationSummaryUser.reservationSummaryPage_SharehotelIcon);
			//util.display(reservationSummaryUser.reservationSummaryPage_SharehotelName);
			util.display(reservationSummaryUser.reservationSummaryPage_EmailHotelBtn);
		

			util.singleScroll();
			util.display(reservationSummaryUser.reservationSummaryPage_WeatherMonth);
			util.display(reservationSummaryUser.reservationSummaryPage_WeatherHiTemp);
			util.display(reservationSummaryUser.reservationSummaryPage_WeatherLowTemp);
			//util.display(reservationSummaryUser.reservationSummaryPage_InteractPager);

			System.out.println("Script passed");
	    }

	   

}