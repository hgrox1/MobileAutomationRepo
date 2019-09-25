package com.ihg.nativeapp.screens;

import java.util.ArrayList;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

public class SearchForm extends DriverCapabilities {

    // Database Information
    public static final String dbName = "Tosca_Analytics";

    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

    public static final String serverport = "1433";

    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    @AndroidFindBy(name = "Navigate up")
    @iOSFindBy(xpath = "//*[@label=\"Back\"]")
    public MobileElement searchForm_HamburgerBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    @iOSFindBy(xpath = "//*[@name=\"ihgrc-color\"]")
    public MobileElement searchForm_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_name")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_SignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_preview")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_SelectDestination;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_preview")
    @iOSFindBy(xpath = "//UIAElement[@name=\"na_information_cell\"]")
    public MobileElement searchForm_Destination;

    @AndroidFindBy(id = "com.ihg.apps.android:id/destination_preview_remove")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Destination_CrossBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_in_month")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckInMonth;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_month")
    @iOSFindBy(xpath = "//*[@label=\"IHGSearchForm_DateCell\"]")
    public MobileElement searchForm_CheckInDayOfMonth;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_week")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckInDayOfWeek;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_out_month")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckOutMonth;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_month")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckOutDayOfMonth;

    @AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_week")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckOutDayOfWeek;

    @AndroidFindBy(id = "com.ihg.apps.android:id/arrow")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Arrow;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__rooms")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Room;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__rooms\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_minus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Room_MinusBtn;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_rooms\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_plus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Room_PlusBtn;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__rooms\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_current_value\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Room_Value;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__adults")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Adults;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_minus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Adults_MinusBtn;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_plus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Adults_PlusBtn;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_current_value\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Adults_Value;

    @AndroidFindBy(name = "Children")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Children;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__children\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_minus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Children_MinusBtn;

    //@AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__children\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_plus\"]")
    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_children\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_plus\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Children_PlusBtn;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/search_form_view__children\"]//*[@resource-id=\"com.ihg.apps.android:id/stepper_current_value\"]")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Children_Value;

    @AndroidFindBy(xpath = "//*[text()='Rate']")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_RateText;

    @AndroidFindBy(xpath = "//*[@text = 'AAA/CAA Membership Rate']")
    public MobileElement searchForm_Rate_AAACCCMembership;
    
    @AndroidFindBy(xpath = "//*[@text = 'Government/Military Rate']")
    public MobileElement searchForm_Rate_GovernmentRate;
    
    @AndroidFindBy(xpath = "//*[@text =\"Chase Anniversary Free Night\"]")
    public MobileElement searchForm_Rate_FreeNight;
    
    //@AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__rates")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text =\"Best Available\"]")
    @iOSFindBy(xpath = "//*[@label=\"IHGSearchForm_RateCell\"]")
    public MobileElement searchForm_RateTypeDropDown;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__corporate_id_label")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CorporateIdLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__corporate_id")
    @iOSFindBy(xpath = "//*[@label=\"IHGSearchForm_CorporateIdCell\"]")
    public MobileElement searchForm_CorporateId;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__submit")
   // @AndroidFindBy(id = "com.ihg.apps.android:id/search_form__submit")
    @AndroidFindBy(xpath = "//*[@text='Search']")
    @iOSFindBy(xpath = "//*[@label='search_form_start_search_btn']")
    public MobileElement searchForm_SearchBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")
    @iOSFindBy(xpath = "//*[@label=\"home_screen_navbar_account_button\"]")
    public MobileElement searchForm_UserFirstName;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_number")
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_points")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_UserPointsValue;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_points_abbrv")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_UserPointsUnit;

    @AndroidFindBy(id = "com.ihg.apps.android:id/seperator")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Header_Separator;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_membership_level")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Header_BrandColorLine;

    @AndroidFindBy(name = "10")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckOut_Date;

    @AndroidFindBy(name = "12")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_CheckIn_Date;

    @AndroidFindBy(name = "Reward Nights")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Rate_RewardNights;

   // @AndroidFindBy(name = "Best Available")
    @AndroidFindBy(xpath = "//*[@text='Best Available']")
    // @iOSFindBy(name = "")
    public MobileElement searchForm_Rate_BestAvailable;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/search_form__submit")
     @AndroidFindBy(xpath = "//*[@text='Search']")
    @iOSFindBy(xpath = "//*[@label=\"search_form_start_search_btn\"]")
    public MobileElement searchForm_Rate_SearchBtn;

    public String corpIdEntered, corpIdInTestData;

    Utility util = new Utility();

    public SearchForm(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void correctPage() {

        try {

            if (Platform1.equalsIgnoreCase("Android")) {
            	DriverWait.waitByElementName(this.searchForm_SearchBtn);
            } else {
                DriverWait.waitByElementName(this.searchForm_SearchBtn);
            }
            logger.info("PASS: Search Form Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Search Form Page is not loaded properly");
        }
    }

    public void enterCorpId() throws InterruptedException {

        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        this.corpIdEntered = (String) readFile.data[0][16];
        this.corpIdInTestData = (String) readFile.data[9][16];
        this.util.enterTextinField(this.searchForm_CorporateId, this.corpIdEntered);
    }

    public void enterCorpIdFromDatabase(String screenPlayName) throws Exception {

        String Query = "SELECT Corporate FROM [Tosca_GRS_TDM].[dbo].[GRS_PreProductionSanity] WHERE Day = '" + screenPlayName + "'";
        ;
        ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String CorporateID = resultSet.get(0);
        this.util.enterTextinField(this.searchForm_CorporateId, CorporateID);
    }

    public void verifyCorpIdPresenceOnLoginWithUserHavingCorpId(String str1, String str2) {
        try {
            Assert.assertEquals(str1, str2);
            logger.info("PASS: " + str2 + " is present");
        }

        catch (AssertionError e) {

            logger.error("FAIL: " + str2 + " is not present");

        }
    }

    public void verifyCorpIdRemoval(String str1, String str2) {
        try {
            Assert.assertEquals(str1, str2);
            logger.error("PASS: " + str1 + " is not removed");
        }

        catch (AssertionError e) {

            logger.info("PASS: " + str1 + " is removed");

        }

    }

    public void verifyCorpIdStickinessOnNavigation(String str1, String str2) {
        try {
            Assert.assertEquals(str1, str2);
            logger.info("PASS: " + str2 + " is not removed");
        }

        catch (AssertionError e) {

            logger.error("FAIL: " + str2 + " is removed");

        }
    }

    public void verifyFindAndBookPageDataUsingPointsAndCash() {

        String expectedRate = "Reward Nights", expectedNumberofRooms = "1 Room", expectedNumberOfMembers = "1 Adult, 0 Children";
        String expectedCheckInDate = this.currentDateMMMdd();
        String expectedCheckOutDate = this.nextDayDateMMMdd();

        /*
         * String actualRate = searchForm_Rate_RewardNights.getText(); String actualCheckInDate = searchForm_CheckIn.getText(); String actualCheckOutDate =
         * searchForm_CheckOut.getText(); String actualNumberOfRooms = searchForm_Room.getText(); String actualNumberofMembers = searchForm_members.getText();
         */

        /*
         * util.assertEqual(actualRate, expectedRate); Utility.match(actualCheckInDate, expectedCheckInDate); Utility.match(actualCheckOutDate, expectedCheckOutDate);
         * util.assertEqual(actualNumberOfRooms, expectedNumberofRooms); util.assertEqual(actualNumberofMembers, expectedNumberOfMembers);
         */
    }

}
