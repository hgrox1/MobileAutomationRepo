package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
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

public class SignInPage extends DriverCapabilities {

    static boolean textBox_memberID;

    static String actualUsername, requiredInputUsername;

    // Database Information
    public static final String dbName = "Tosca_Analytics";

    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

    public static final String serverport = "1433";

    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_member_id")
    @iOSFindBy(xpath = "//*[@label='login_gate_email_input_field_id']")
    public MobileElement signIn_MemberId;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_pin")
    @iOSFindBy(xpath = "//*[@label='login_gate_pin_input_field_id']")
    public MobileElement signIn_Pin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_action_btn")
    @iOSFindBy(xpath = "//*[@label='login_gate_sign_ib_button_id']")
    public MobileElement signIn_SignInButton;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")
    @iOSFindBy(xpath = "//*[@label=\"home_screen_navbar_account_button\"]")
    public MobileElement signIn_User;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    public MobileElement signIn_AppLogo;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_member_name")
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_icon")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_User;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__hint_keep_signed_in")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_KeepMeSignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__remember_checkbox")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_RememberChkBox;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__right_anonymous_forgot_pin_button")
    // @iOSFindBy(name = "navigation_back_bttn")
    public MobileElement signIn_ForgetPin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__priority_text")
    // @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement signIn_RewardText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__list_items")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_RewardListItems;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__benefits_link_tv")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_BenefitsLink;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_join_now")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_JoinNowButton;

    @AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__sign_in_button")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_btn;

    @AndroidFindBy(name = "Sign Out")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signOut_Button;

    @AndroidFindBy(name = "Se déconnecter")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signOut_Button_fr;

    @AndroidFindBy(name = "Esci")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signOut_Button_it;

    @AndroidFindBy(name = "Salir")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signOut_Button_es;

    @AndroidFindBy(className = "android.view.View")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement popup_AcceptButton;

    @AndroidFindBy(id = "android:id/button1")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_PopUp_OK;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_crossIcon;

    @AndroidFindBy(className = "android.widget.Button")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_PopUp_Invalid_OK;

    @AndroidFindBy(id = "android:id/message")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signInErrorMsgBlank;

    @AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_number_module__label")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signInConfirmHandle;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__hint_please_sign_in")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_pleaseSignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__right_anonymous_forgot_pin_button")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_forgotPin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__priority_text")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_notRewardMember;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__list_items")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_joiningText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in__benefits_link_tv")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement sinIn_exploreBenefits;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")
    @iOSFindBy(xpath = "//*[@label='Please Sign In']")
    public MobileElement RightRail_SigninLbl;

    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_title")
    // @iOSFindBy(name = "navigation_view")
    public MobileElement signIn_label;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
    @iOSFindBy(xpath = "//*[@label=\"LoginGateCrossButton\"]")
    public MobileElement signIn_CloseBtn;

    @AndroidFindBy(name = "Please enter member Id.")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorMsg_BlankId;

    @AndroidFindBy(name = "Please enter pin.")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorMsg_BlankPin;

    @AndroidFindBy(name = "Unable to sign in")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorPopUpHeading_UnableToSignIn;

    @AndroidFindBy(name = "Your email address matches more than one account. Please try again with your IHG® Rewards Club number or contact Customer Care for assistance")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorPopUpMsg_MoreThanOneAccAssociated;

    @AndroidFindBy(name = "We're sorry, the member #, email, or PIN you entered don't appear to work together. To retrieve your PIN, select “Retrieve PIN.” If you'd like help, please contact our Customer Care team and they'd be happy to assist.")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorPopUpMsg_WrongCredentials;

    @AndroidFindBy(name = "We're sorry, the member #, email, or PIN you entered don't appear to work together. For security reasons, we have temporarily disabled your account. To retrieve your PIN, select “Retrieve PIN.” If you'd like help, please contact our Customer Care team and they'd be happy to assist.  Please wait 15 minutes before trying again.")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ErrorPopUpMsg_SoftLock;
    @AndroidFindBy(name = "Contact Us")
    // @iOSFindBy(name = "")
    public MobileElement signIn_ContactUsBtn;
    @AndroidFindBy(name = "OK")
    // @iOSFindBy(name = "")
    public MobileElement signIn_OKBtn;
    @AndroidFindBy(id = "com.ihg.apps.android:id/sign_in_last_name")
    // @iOSFindBy(name = "")
    public MobileElement signIn_LastName;
    @AndroidFindBy(name = "Please enter last name.")
    // @iOSFindBy(name = "")
    public MobileElement signIn_BlankLastNameError;
    boolean confirmationHandle;
    
  //  @AndroidFindBy(id="com.ihg.apps.android:id/reservation_info_confirmation_number_label")
    @AndroidFindBy(xpath="//*[contains(@text,'Confirmation')]")
    public MobileElement confirmation_number_label;

    boolean textBox_pin;
    public String userLastName;
    ReadingFromFile readFile = new ReadingFromFile();
    public Utility util = new Utility();
    HomePage homeUser = new HomePage(innerDriver);;

    public SignInPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }
    public void signInItinerary() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        //String memberID = (String) this.readFile.data[6][0];
        //String PIN = (String) this.readFile.data[6][1];
        /*String memberID = "132595376";
        String PIN = "9876";*/
        String memberID = "178385702";
        String PIN = "4556";
        this.signIn_MemberId.clear();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }
    public void correctPage() {

        try {
            DriverWait.waitByName("Sign In");
            logger.info("PASS: Sign In Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Sign In Page is not loaded properly");
        }
    }

    public void firstLoginAttemptWithWrongPin() throws InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[23][0];
        String PIN = (String) this.readFile.data[0][1];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
        DriverWait.waitByName("Unable to sign in");

    }

    public void handleConfirmationPageAndReachingHome() throws InterruptedException {
        try {

            //if (Platform1.equalsIgnoreCase("Android")) {
        	{
            	
                DriverWait.waitById("com.ihg.apps.android:id/reservation_info_confirmation_number_label");
                innerDriver.navigate().back();
            } /*else {
                DriverWait.waitByName("ihg-logo-header");
                ReservationSummaryPage resConfUser = new ReservationSummaryPage(innerDriver);
                this.util.click(resConfUser.reservationSummaryPage_Logo);
            }*/
            HomePage homeuser = new HomePage(innerDriver);
            homeuser.correctPage();

        } catch (Exception e) {

        }
    }

    public void handleConfirmationPageAndReachingRightRail() throws InterruptedException {
        try {
            DriverWait.staticWait();
            this.signInConfirmHandle.isDisplayed();
            DriverWait.staticWait();
            this.util.click(this.sinIn_User);
            DriverWait.waitById("com.ihg.apps.android:id/menu_recent_activity_title");

        } catch (NoSuchElementException e) {

            this.util.click(this.signIn_User);
            DriverWait.waitById("com.ihg.apps.android:id/menu_recent_activity_title");
        }
    }

    public void handleConfirmationPageAndReachingRRail() {
        try {
            this.confirmationHandle = this.signInConfirmHandle.isDisplayed();
            if (this.confirmationHandle == true) {
                DriverWait.waitById("com.ihg.apps.android:id/custom_nav_member_name");
                this.signIn_User.click();
                this.util.scroll();
            }
        } catch (NoSuchElementException e) {
            this.util.scroll();
        }
    }

    public void handleConfirmationPageAndSignOut() throws InterruptedException {
        try {
            DriverWait.staticWait();
            this.confirmationHandle = this.signInConfirmHandle.isDisplayed();
            if (this.confirmationHandle == true) {
                this.signIn_User.click();
                this.util.scroll();
                this.signOut_Button.click();
            }
        } catch (NoSuchElementException e) {
            this.util.scroll();
            this.signOut_Button.click();
        }
    }

   

    public void invalidLoginAttemptWithValidLastNameButInvalidPin() throws InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String lastname = (String) this.readFile.data[23][5];
        this.signIn_Pin.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_LastName, lastname);
        this.util.click(this.signIn_SignInButton);
        DriverWait.waitByName("Unable to sign in");
    }

    public void loginAttemptWithWrongPin() throws InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[18][0];
        String PIN = (String) this.readFile.data[0][1];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
        DriverWait.waitByName("Unable to sign in");

    }

    public void loginWithValidInputsAfterWrongAttempts() throws InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String PIN = (String) this.readFile.data[18][1];
        String lastname = (String) this.readFile.data[18][5];
        this.signIn_Pin.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.enterTextinField(this.signIn_LastName, lastname);
        this.util.click(this.signIn_SignInButton);
        DriverWait.waitById("com.ihg.apps.android:id/app_bar_user_name");
    }

    public void signIn() throws Exception {

        // Read data from Database
        String Query = "SELECT MemberID, Pin FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = 'SP24Stage';";
        ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String memberID = resultSet.get(0);
        String PIN = resultSet.get(1);

        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);

    }

    public void signInAccountLanding() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[6][0];
        String PIN = (String) this.readFile.data[6][1];
        this.userLastName = (String) this.readFile.data[3][5];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInAmazonKindle() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[25][0];
        String PIN = (String) this.readFile.data[25][1];
        this.signIn_MemberId.clear();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInByUserHavingCorpId() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[9][0];
        String PIN = (String) this.readFile.data[9][1];
        this.userLastName = (String) this.readFile.data[9][5];
        this.util.click(this.homeUser.home_btnSignIn);
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInByUserHavingSufficientPoints() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[21][0];
        String PIN = (String) this.readFile.data[21][1];
        this.userLastName = (String) this.readFile.data[8][5];
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInCopperField() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[20][0];
        String PIN = (String) this.readFile.data[20][1];
        // userLastName = (String) readFile.data[0][5];
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }
    
    public void signInDB(String Screenplay) throws Exception {

        // Read data from Database
    	 String Query = "SELECT MemberID, Pin FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo =1"; 
    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String memberID = resultSet.get(0);
        String PIN = resultSet.get(1);

        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);

    }
    public void signInDB(int SNo) throws Exception {

    	/*//change this function to static
        // Read data from Database
    	 String Query = "SELECT MemberID, Pin FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+SNo+"' "; 
    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String memberID = resultSet.get(0);
        String PIN = resultSet.get(1);*/
    	String memberID = "142882871";
        String PIN ="9876";
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
        DriverWait.staticWait();
        DriverWait.staticWait();

    }
    
    public void signInDB_GRS002() throws Exception {

        // Read data from Database
    	 String Query = "SELECT MemberID, Pin FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = 2"; 
    	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String memberID = resultSet.get(0);
        String PIN = resultSet.get(1);

        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);

    }
   
    public void signInModifyRes() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[7][0];
        String PIN = (String) this.readFile.data[7][1];
        this.userLastName = (String) this.readFile.data[1][5];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInNoPastStayLoggedIn() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[5][0];
        String PIN = (String) this.readFile.data[5][1];
        this.signIn_MemberId.clear();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInOnlyMiles() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[22][0];
        String PIN = (String) this.readFile.data[22][1];

        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInOnlyPoints() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[21][0];
        String PIN = (String) this.readFile.data[21][1];
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInPastStayLoggedIn() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[6][0];
        String PIN = (String) this.readFile.data[6][1];
        this.signIn_MemberId.clear();
        DriverWait.waitById("com.ihg.apps.android:id/sign_in__member_number_et");
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
    }

    public void signInSingleFreeNight() throws IOException, InterruptedException {
    	 String memberID = "179213116";
         String PIN = "9876";
         this.signIn_MemberId.clear();
         this.util.enterTextinField(this.signIn_MemberId, memberID);
         this.util.enterTextinField(this.signIn_Pin, PIN);
         this.util.click(this.signIn_SignInButton);

        /* Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[6][0];
        String PIN = (String) this.readFile.data[6][1];
        this.signIn_MemberId.clear();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);*/
    }

    public void verifyAssociatedToMoreThanOneAccError() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String emailID = (String) this.readFile.data[2][11];
        String PIN = (String) this.readFile.data[0][1];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, emailID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
        DriverWait.staticWait();
        this.util.display(this.signIn_ErrorPopUpHeading_UnableToSignIn);
        this.util.display(this.signIn_ErrorPopUpMsg_MoreThanOneAccAssociated);
        this.util.display(this.signIn_ContactUsBtn);
        this.util.display(this.signIn_OKBtn);
    }

    public void verifyBlankFieldsErrors() {

        this.util.display(this.signIn_ErrorMsg_BlankId);
        this.util.display(this.signIn_ErrorMsg_BlankPin);
    }

    public void verifyIHGLogoSignIn() {

        Map<String, Object> params = new HashMap<>();
        params.put("content", "GROUP:Images/IHG_Logo_SignIn.png");
        String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
        if (logoResult.equalsIgnoreCase("true")) {
            logger.info("Pass: IHG logo is correctly displayed");
        } else {
            logger.error("Fail: IHG logo is not correctly displayed");
        }

    }

    public void verifyRetrievePinUrl() throws InterruptedException {

        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String expectedUrl = (String) readFile.data[17][17];
        // String actualUrl =
        // innerDriver.findElementByXPath("//*[@resource-id=\"org.mozilla.firefox:id/url_bar_title\"]").getAttribute("text");
        String actualUrl = innerDriver.findElementByXPath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]").getAttribute("text");
        Utility.match(actualUrl, expectedUrl);

    }

    public void verifySignOut() {

        actualUsername = this.signIn_User.getText();
        requiredInputUsername = "Sign In";
        Assert.assertEquals(actualUsername, requiredInputUsername);
    }

    public void verifyUser() {

        actualUsername = this.signIn_User.getText();
        requiredInputUsername = (String) this.readFile.data[0][2];
        this.util.assertEqual(actualUsername, requiredInputUsername);
    }

    public void verifyWrongCredentialsError() throws IOException, InterruptedException {

        // Reading data from excel
        this.readFile.readDataFromExcel();
        String memberID = (String) this.readFile.data[7][0];
        String PIN = (String) this.readFile.data[0][1];
        this.signIn_MemberId.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.signIn_MemberId, memberID);
        this.util.enterTextinField(this.signIn_Pin, PIN);
        this.util.click(this.signIn_SignInButton);
        DriverWait.staticWait();
        this.util.display(this.signIn_ErrorPopUpHeading_UnableToSignIn);
        this.util.display(this.signIn_ErrorPopUpMsg_WrongCredentials);
        this.util.display(this.signIn_ContactUsBtn);
        this.util.display(this.signIn_OKBtn);
    }

}
