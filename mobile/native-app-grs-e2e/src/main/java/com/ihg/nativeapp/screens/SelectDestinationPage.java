package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SelectDestinationPage extends DriverCapabilities {
	
	// Database Information
    public static final String dbName = "Tosca_Analytics";

    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

    public static final String serverport = "1433";

    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    

    // @AndroidFindBy(id = "android:id/home")
    @AndroidFindBy(name = "Navigate up")
    public MobileElement locationSearchPage_MenuBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    @iOSFindBy(xpath = "//*[@label=\"Back\"]")
    public MobileElement locationSearchPage_BackBtn;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_logo")
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    @iOSFindBy(xpath = "//*[@name=\"ihgrc-color\"]")
    public MobileElement locationSearchPage_Logo;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_name")
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")
    @iOSFindBy(xpath = "//*[@label=\"Sign In\"]")
    public MobileElement locationSearchPage_SignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_editable_form")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_SearchImg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination")
    @iOSFindBy(xpath = "//*[@label=\"search_destination_locaiton_search_bar\"]")
    public MobileElement locationSearchPage_Destination_SearchBox;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_preview")
    @iOSFindBy(xpath = "//*[@label=\"search_destination_locaiton_search_bar\"]")
    public MobileElement locationSearchPage_Destination_FilledSearchBox;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_location")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_LocImg;

    @AndroidFindBy(name = "Current Location")
    @iOSFindBy(xpath = "//*[@value=\"Current Location\"]")
    public MobileElement locationSearchPage_CurrentLocationBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_location_icon")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_locationIcon;

    @AndroidFindBy(id = "com.ihg.apps.android:id/loclistTitleValue")
    @iOSFindBy(xpath = "//*[@value=\"Atlanta, TX, United States\"]")
    public MobileElement locationSearchPage_LocList;

    @AndroidFindBy(id = "com.ihg.apps.android:id/loclistTitleValue")
    @iOSFindBy(xpath = "//*[@value=\"Macau, China-P.R.C.\"]")
    public MobileElement locationSearchPage_LocListMacau;

    @AndroidFindBy(id = "com.ihg.apps.android:id/loclistTitleValue")
    @iOSFindBy(xpath = "//*[@value=\"Beijing Capital Airport, China\"]")
    public MobileElement locationSearchPage_LocListBeijing;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_remove")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_CrossBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")
    @iOSFindBy(xpath = "//*[@label=\"home_screen_navbar_account_button\"]")
    public MobileElement locationSearchPage_UserFirstName;

    // @AndroidFindBy(id =
    // "com.ihg.apps.android:id/custom_nav_member_points_number")
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_points")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_UserPointsValue;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_abbrv")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_UserPointsUnit;

    @AndroidFindBy(id = "com.ihg.apps.android:id/seperator")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Header_Separator;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_membership_level")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Header_BrandColorLine;

    @AndroidFindBy(name = "Atlanta, TX, United States")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_AtlantaTX;

    @AndroidFindBy(name = "Savannah, Georgia, United States")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_SAV;

    @AndroidFindBy(name = "Bellingham, Washington, United States")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_CARateHotel;

    @AndroidFindBy(name = "Venezuela")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Venezuela;

    @AndroidFindBy(name = "Andalusia, Alabama, United States")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Andalusia;

    @AndroidFindBy(name = "London, United Kingdom")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_London;

    @AndroidFindBy(name = "Dublin, Ireland")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Dublin;

    @AndroidFindBy(name = "Paris, France")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_Paris;

    @AndroidFindBy(name = "Location")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_locPopUpTitle;

    @AndroidFindBy(name = "To search using your current location, please turn on Location permissions for the IHG® app.")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_locPopUpMsg;

    @AndroidFindBy(name = "Cancel")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_cancelBtn;

    @AndroidFindBy(name = "Enable")
    // @iOSFindBy(name = "")
    public MobileElement locationSearchPage_enableBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/recent_searches_title")
    public MobileElement selectDestinationPage_RecentSearches_Title;

    @AndroidFindBy(id = "com.ihg.apps.android:id/no_recent_searches")
    public MobileElement selectDestinationPage_RecentSearches_Zero;

    @AndroidFindBy(id = "com.ihg.apps.android:id/clear_recent_searches")
    public MobileElement selectDestinationPage_RecentSearches_ClearBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_location")
    public List<MobileElement> selectDestinationPage_RecentSearches_location;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_date")
    public List<MobileElement> selectDestinationPage_RecentSearches_Date;

    Utility util = new Utility();

    public SelectDestinationPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void correctPage() {
        try {
        	DriverWait.waitByElementName(this.locationSearchPage_locationIcon);
            logger.info("PASS: Select Destination Page is Opened");
            // extentLogger.log(Status.INFO,"Snapshot below: "
            // +extentLogger.addScreenCaptureFromPath(saveScreenshot(extentLogger)),MediaEntityBuilder.createScreenCaptureFromPath(saveScreenshot(extentLogger)).build());
        } catch (Exception e) {
            logger.error("FAIL: Select Destination Page is not loaded properly");
        }
    }

    public void enterLocationAlternative() {
        Map<String, Object> params2 = new HashMap<>();
        params2.put("label", "type");
        params2.put("text", "Atlanta TX");
        Object result2 = innerDriver.executeScript("mobile:edit-text:set", params2);
    }

    public void inputGuestConnectLocation() throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[4][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocation(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
       // loc = (String) readFile.data[20][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationAlipay(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[2][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationAndalusia(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[10][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationAtlantaBuckhead(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[16][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationAustralia(String loc) throws IOException, InterruptedException {
        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[23][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);

    }

    public void inputLocationChinaIvani(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[3][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationDublin(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[12][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationForCARates() throws InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[19][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationForCorpId(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[10][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationForKimptonHotel() throws InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[21][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationForSPHotel() throws InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[18][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationGoaDb(String location) throws Exception {

            // Read data from Database
        	/* String Query = "SELECT Destination FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = 15"; 
        	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
            ArrayList<String> resultSet = readData.readData();
            String Location = resultSet.get(0);*/
            String Location =" Atlanta, TX, United States";
        
        locationSearchPage_Destination_SearchBox.clear();
        DriverWait.staticWait();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, Location);
        //DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");
    }

    public void inputLocationGreaterChina(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[15][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationGurgaon() throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[17][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationLondon(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[11][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationNewYork(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[4][3];
        locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
    }

    public void inputLocationNewZealand(String loc) throws IOException, InterruptedException {
        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[24][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);

    }

    public void inputLocationNonMainlandChina(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[14][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationParis(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[13][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationRestrictions(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[10][3];
        locationSearchPage_Destination_SearchBox.sendKeys(loc);
    }

    public void inputLocationSingleWord(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
       // loc = (String) readFile.data[0][3];
        // locationSearchPage_Destination_SearchBox.clear();
        String loc1 =" Atlanta, TX, United States";
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc1);
        DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");
    }

    
    public void inputLocationUpgradeRate(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[0][3];
        // locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
        DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");

    }

    public void inputLocationUpgradeShanghai(String loc) throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        loc = (String) readFile.data[4][3];
        // locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
        DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");

    }
    
    public void inputLocationLasVegas() throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String loc = (String) readFile.data[25][3];
        // locationSearchPage_Destination_SearchBox.clear();
        util.enterTextinField(locationSearchPage_Destination_SearchBox, loc);
        DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");
    }
}
