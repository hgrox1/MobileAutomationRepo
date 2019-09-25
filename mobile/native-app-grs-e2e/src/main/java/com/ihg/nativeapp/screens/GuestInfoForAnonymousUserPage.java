package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

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

public class GuestInfoForAnonymousUserPage extends DriverCapabilities {

    // Database Information
    public static final String dbName = "Tosca_Analytics";

    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";

    public static final String serverport = "1433";

    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";

    public String guestlastName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/booking__top_bar")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_TopBar;

    @AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
    @iOSFindBy(xpath = "//*[@name=\"NA_GUESTPAYMENTVIEWCONTROLLER\"]/UIAButton[1]")
    public MobileElement guestInfo_TopBar_BackBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
    @iOSFindBy(xpath = "//*[@label=\"Guest Information\"]")
    public MobileElement guestInfo_TopBar_Title;

    @AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__points_estimate")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PointsEstimate_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_anonymous_earned_points_tv")
    @iOSFindBy(name = " You could earn 370 points ")
    public MobileElement guestInfo_PointsEstimate_EarnPointsText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_anonymous_earned_points_arrow")
    @iOSFindBy(xpath = "//*[@name=\"guest_info_page_table_view\"]/UIATableCell[1]/UIAButton[1]")
    public MobileElement guestInfo_PointsEstimate_EarnPointsArrowBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_breakdown_list")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PointsEstimate_BreakdownList;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_anonymous_earned_points_details")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PointsEstimate_EarnedPointsDetails;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_breakdown_help_section")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PointsEstimate_HelpSection;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_opco_anonymous_earned_points_tv")
    @iOSFindBy(xpath = "//*[@label=\"SignInCell_ActionButton\"]")
    public MobileElement guestInfo_PointsEstimate_SignInToEarnPointsBtn;

    @AndroidFindBy(xpath = "//*[text()=\"Not a Member?\"]")
    @iOSFindBy(xpath = "//*[@label=\"Not a member?\"]")
    public MobileElement guestInfo_PointsEstimate_NotAMemberHeading;

    @AndroidFindBy(xpath = "//*[text()=\"Join today and start earning points with this reservation. It's easy and free.\"]")
    @iOSFindBy(xpath = "//*[@label=\"Join today and start earning points with this reservation. It's easy and free.\"]")
    public MobileElement guestInfo_PointsEstimate_NotAMemberDesc;

    @AndroidFindBy(xpath = "//*[text()=\"Why you should join\"]")
    @iOSFindBy(xpath = "//*[@label=\"Why you should join\"]")
    public MobileElement guestInfo_PointsEstimate_WhyYouShouldJoinHeading;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_join_now_benefits")
    @iOSFindBy(xpath = "//*[@label=\"• Free Internet worldwide • Earn and redeem points at over 5,000 hotels worldwide • Combine points and cash for faster rewards\"]")
    public MobileElement guestInfo_PointsEstimate_BenefitsBulletPoints;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_enroll_checkbox")
    @iOSFindBy(xpath = "//*[@label=\"TermsAndConditionsCell_CheckBoxButton\"]")
    public MobileElement guestInfo_PointsEstimate_EnrollCheckbox;

    // @AndroidFindBy(id = "")
    @iOSFindBy(xpath = "//*[@label=\" Yes, I'd like to opt in for IHG® Rewards Club. \"]")
    public MobileElement guestInfo_PointsEstimate_EnrollCheckboxText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate__guest_info_pin_et")
    @iOSFindBy(xpath = "//*[@label=\"TermsAndConditionsCell_PinField\"]")
    public MobileElement guestInfo_PointsEstimate_Pin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate__guest_info_verify_pin_et")
    @iOSFindBy(xpath = "//*[@label=\"TermsAndConditionsCell_VerifyPinField\"]")
    public MobileElement guestInfo_PointsEstimate_VerifyPin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_terms_tv")
    @iOSFindBy(xpath = "//*[@label=\"TermsAndConditionsCell_TermsAndConditionsButton\"]")
    public MobileElement guestInfo_PointsEstimate_TCBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/gi_summary_header_tv")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_Header;

    //@AndroidFindBy(name = "First Name")
    @AndroidFindBy(id = "com.ihg.apps.android:id/user_info_first_name")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_FirstNameTextField']")
    public MobileElement guestInfo_PersonalInfo_FirstName;

   // @AndroidFindBy(name = "Last Name")
    @AndroidFindBy(id = "com.ihg.apps.android:id/user_info_last_name")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_LastNameTextField']")
    public MobileElement guestInfo_PersonalInfo_LastName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__address_label_tv")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_AddressTypeLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__residence_radio_button")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_ResidenceRadioBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__business_radio_button")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_BusinessRadioBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/address_street")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_FirstAdressTextField']")
    public MobileElement guestInfo_PersonalInfo_FirstAddress;

    @AndroidFindBy(name = "Business")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_Business;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__second_address")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_SecondAddress;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__third_address")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_ThirdAddress;

    //@AndroidFindBy(name = "Country")
    //@AndroidFindBy(name = "Country") 
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='Country / Region']") 
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_CountryArrowButton']")
    public MobileElement guestInfo_PersonalInfo_Country;

   // @AndroidFindBy(name = "United States")
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='United States']")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PersonalInfo_Country_Select;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__guest_city")
    @AndroidFindBy(id = "com.ihg.apps.android:id/address_city")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_CityTextField']")
    public MobileElement guestInfo_PersonalInfo_City;

   // @AndroidFindBy(name = "State")
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='State']")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_StateArrowButton']")
    public MobileElement guestInfo_PersonalInfo_State;

   // @AndroidFindBy(name = "CALIFORNIA")
    @AndroidFindBy(xpath= "//android.widget.TextView[@text='CALIFORNIA']")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PersonalInfo_State_Select;

 //   @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__postal")
    @AndroidFindBy(id = "com.ihg.apps.android:id/address_postal_code")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_ZipTextField']")
    public MobileElement guestInfo_PersonalInfo_PostalCode;

  //  @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__email_address_et")
    @AndroidFindBy(id ="com.ihg.apps.android:id/user_info_email")
    @iOSFindBy(id = "//*[@label='ExpandedGuestInfoCell_EmailTextField']")
    public MobileElement guestInfo_PersonalInfo_EmailAddress;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__mobile_number_et")
    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_phone_number") 
    @iOSFindBy(name = "//*[@label='ExpandedGuestInfoCell_PhoneTextField']")
    public MobileElement guestInfo_PersonalInfo_MobileNumber;
    
    @AndroidFindBy(id="com.ihg.apps.android:id/view_guest_information_continue")
    public MobileElement guest_continue;
    
    @AndroidFindBy(id="com.ihg.apps.android:id/add_edit_card_link")
    public MobileElement Click_add_card;

    @AndroidFindBy(name = "+1")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_MobileCode;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__preferred_contact_msg_tv")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_ReservationText;

    @AndroidFindBy(name = "We will not use your information for marketing purposes.")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_Information;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__email_toggle")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_EmailToggle;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__sms_toggle")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PersonalInfo_SmsToggle;

    @AndroidFindBy(id = "com.ihg.apps.android:id/pymt_summary_header")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_Header;

    @AndroidFindBy(name = "Please enter your credit card information below to reserve a room.")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_CcInfo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__camera_image_view")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_CameraIcon;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__scan_button")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_ScanBtn;

    //@AndroidFindBy(xpath = "//*[@resource-id=\"android:id/text1\" and @text=\"Payment Card Type\"]")
    //@AndroidFindBy(xpath = "//*[@text='Payment Card Type']")
    @AndroidFindBy(id = "com.ihg.apps.android:id/card_type_spinner")
    @iOSFindBy(id = "//*[@label='ccType']")
    public MobileElement guestInfo_PaymentInfo_CcType;

//    @AndroidFindBy(name = "AMERICAN EXPRESS")
    //@AndroidFindBy(name = "VISA")
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='VISA']")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PaymentInfo_CcSelect;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__number_value_input")
    @AndroidFindBy(id = "com.ihg.apps.android:id/card__number")
    @iOSFindBy(name = "//*[@label='ExpandedPaymentCell_CreditCardNumberField']")
    public MobileElement guestInfo_PaymentInfo_CcInput;

    //@AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/guest_info_credit_card__expiration_month_spinner\"]//*[@resource-id=\"com.ihg.apps.android:id/spinner_label_contaner\"]//*[@resource-id=\"com.ihg.apps.android:id/spinner_text\"]")
//    @AndroidFindBy(name="MM")
    @AndroidFindBy(xpath="//android.widget.TextView[@text='MM']")
    @iOSFindBy(name = "//*[@label='ccMonth']")
    public MobileElement guestInfo_PaymentInfo_Month;

    //@AndroidFindBy(name = "Sep")
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='Jul']")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PaymentInfo_Month_Select;

   // @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/guest_info_credit_card__expiration_year_spinner\"]//*[@resource-id=\"com.ihg.apps.android:id/spinner_label_contaner\"]")
    //@AndroidFindBy(name="YY")
    @AndroidFindBy(xpath="//android.widget.TextView[@text='YY']")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_Year;

  //  @AndroidFindBy(name = "2020")
    @AndroidFindBy(xpath="//android.widget.CheckedTextView[@text='2020']")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_Year_Select;

    @AndroidFindBy(name = "* The payment card MUST be presented upon check-in at the hotel")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_CCardInfo;

    //@AndroidFindBy(name = "Book Now")
    @AndroidFindBy(xpath="//android.widget.Button[@text='Book Now']")
    @iOSFindBy(id = "//*[@label='Book Now']")
    public MobileElement guestInfo_SwipeToBook;

    //@AndroidFindBy(name = "I certify that:")
    @AndroidFindBy(xpath="//android.widget.CheckBox[@text='I certify that:']")
    @iOSFindBy(id = "//*[@label='TRAcceptSwitchAccessibilityLabel']")
    public MobileElement guestInfo_TnC;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_sign_in_to_earn_bt")
    // @iOSFindBy(name="")
    public MobileElement guestInfo_SignInToEarn;

    @AndroidFindBy(name = "Navigate up")
    // @iOSFindBy(name="")
    public MobileElement guestInfo_navigateback;
    
    //com.ihg.apps.android:id/guest_info_sign_in_button
    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_sign_in_button")
    // @iOSFindBy(name="")
    public MobileElement guest_info_sign_in_button;

    Utility util = new Utility();

    public GuestInfoForAnonymousUserPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void bookNow() {
        this.util.click(this.guestInfo_SwipeToBook);
        RememberMePopUp popup = new RememberMePopUp(innerDriver);
        DriverWait.waitById("com.ihg.apps.android:id/simple_alert_dialog__title");
        this.util.display(popup.rememberMe_Text);
        this.util.display(popup.rememberMe_YesBtn);
        this.util.display(popup.rememberMe_NoBtn);
        this.util.click(popup.rememberMe_NoBtn);

    }

    public void clickBookNow() {
        if ((Platform1.equalsIgnoreCase("Android"))) {
            this.util.scrollTo("Book Now");
            this.util.click(this.guestInfo_SwipeToBook);
        } else {
      //      this.util.iOSSwipe("//*[@label='Book Now'and @visible='true']");
            this.util.click(this.guestInfo_SwipeToBook);
        }

    }

    public void GuestInfostatic() throws IOException, InterruptedException {

        String firstName = "Him";
        String lastName = "IHG";
        String address2 = "Atlanta";
        String city = "Atlanta";
        String postalCode = "30303";
       
        String email = "testemail123423rwe@gmail.com";
        String mobileNo = "987654123";
        
        this.util.scrollTo("Country / Region");
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_FirstName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstName, firstName);
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_LastName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_LastName, lastName);
        DriverWait.staticWait();
        //innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_EmailAddress.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_EmailAddress, email);
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_Country.click(); //Select country
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_Country_Select.click();
        // util.singleScroll();
        this.guestInfo_PersonalInfo_FirstAddress.clear();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstAddress, address2);
        DriverWait.staticWait();
      //  innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_City, city);
     //   innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_State.click(); //Select state
        this.guestInfo_PersonalInfo_State_Select.click();
        
        this.util.scrollTo("Zip Code");
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_PostalCode.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_PostalCode, postalCode);
       // innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        
        this.guestInfo_PersonalInfo_MobileNumber.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_MobileNumber, mobileNo);
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        
        this.util.scrollTo("Continue");
        this.guestInfo_SwipeToBook.click();
        DriverWait.staticWait();
        
        
    }
    
    public void correctPage() {

        try {
            DriverWait.waitByElementName(this.guest_info_sign_in_button);
            logger.info("PASS: Guest Info Page for anonymous user is Opened");
            DriverWait.staticWait();
        }

        catch (Exception e) {
            logger.error("FAIL: Guest Info Page for anonymous user is not loaded properly");
        }
    }

    public void GuestInfo() throws IOException, InterruptedException {

        // Reading data from excel
       // ReadingFromFile readFile = new ReadingFromFile();
      //  readFile.readDataFromExcel();
        String firstName ="FIRST";
        String lastName = "lAST";
        String address2 = "LAST";
        String city = "ATLANTA";
        String postalCode = "10009";
        // String email = (String) readFile.data[2][11];
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar = abc.charAt(randomGenerator.nextInt(abc.length()));
        String email = "testemail" + randomChar + randomInt + "@ihg.com";
        String mobileNo = "778888888";
        String cCNo = "4111111111111111";
       /* String firstName = (String) readFile.data[2][4];
        String lastName = (String) readFile.data[4][5];
        String address2 = (String) readFile.data[2][7];
        String city = (String) readFile.data[2][9];
        String postalCode = (String) readFile.data[2][10];
        // String email = (String) readFile.data[2][11];
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar = abc.charAt(randomGenerator.nextInt(abc.length()));
        String email = "testemail" + randomChar + randomInt + "@gmail.com";
        String mobileNo = (String) readFile.data[2][12];
        String cCNo = (String) readFile.data[2][13];*/
        this.util.scrollTo("Country / Region");
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_FirstName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstName, firstName);
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_LastName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_LastName, lastName);
        DriverWait.staticWait();
        //innerDriver.hideKeyboard();
       // this.util.singleScroll();
       // DriverWait.staticWait();
        this.guestInfo_PersonalInfo_EmailAddress.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_EmailAddress, email);
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_Country.click();
        this.guestInfo_PersonalInfo_Country_Select.click();
        util.singleScroll();
        this.guestInfo_PersonalInfo_FirstAddress.clear();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstAddress, address2);
       // DriverWait.staticWait();
       // innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_City, city);
       // innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_State.click();
        this.guestInfo_PersonalInfo_State_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_PostalCode, postalCode);
      //  innerDriver.hideKeyboard();
        DriverWait.staticWait();
       // util.singleScroll();  
        this.guestInfo_PersonalInfo_MobileNumber.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_MobileNumber, mobileNo);
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        //Click continue
        util.click(this.guest_continue);
        DriverWait.staticWait();
        
        util.singleScroll(); 
        util.click(this.Click_add_card);
        DriverWait.staticWait();
       // util.singleScroll();
       // System.out.println("pass till add card");
        
       // this.util.scrollTo("Payment Card Number");
       // DriverWait.staticWait();
        //////////////////////
       
        //DriverWait.staticWait();
        //if (guestInfo_PaymentInfo_CcType.isDisplayed()==true)
        this.guestInfo_PaymentInfo_CcType.click();
        DriverWait.staticWait();
        //this.util.scrollTo("VISA");
        util.scrollTo("VISA");
       // util.singleScroll();util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PaymentInfo_CcSelect.click();
        this.util.enterTextinField(this.guestInfo_PaymentInfo_CcInput, cCNo);
        DriverWait.staticWait();
        util.singleScroll();
        //this.util.scrollTo("MM");
        //DriverWait.staticWait();
        this.guestInfo_PaymentInfo_Month.click();
        this.guestInfo_PaymentInfo_Month_Select.click();
        DriverWait.staticWait();
        if ((Platform1.equalsIgnoreCase("Android"))) {
            this.guestInfo_PaymentInfo_Year.click();
            this.guestInfo_PaymentInfo_Year_Select.click();
            this.util.scrollTo("I certify that:");
        } else {
       //     this.util.iOSSwipe("//*[@label='TRAcceptSwitchAccessibilityLabel'and @visible='true']");
        }
        this.util.click(this.guestInfo_TnC);

    }

    public void GuestInfoFree() throws IOException, InterruptedException {

       
        DriverWait.staticWait();
        this.util.scrollTo("I certify that:");
        DriverWait.staticWait();
        this.util.click(this.guestInfo_TnC);

    }
    public void GuestInfoDB(String screenPlayName) throws Exception {

        // Reading data from Database
        String Query = "SELECT FirstName, LastName, AddressLine1, City, Zipcode, EmailAddress, PhoneNumber, CardNumber FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = '"
                + screenPlayName + "'";
        ;
        ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String firstName = resultSet.get(0);
        String lastName = resultSet.get(1);
        String address = resultSet.get(2);
        String city = resultSet.get(3);
        String postalCode = resultSet.get(4);
        String email = resultSet.get(5);
        String mobileNo = resultSet.get(6);
        String cCNo = resultSet.get(7);
        this.util.scrollTo("Country");
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_FirstName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstName, firstName);
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_LastName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_LastName, lastName);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_Country.click();
        this.guestInfo_PersonalInfo_Country_Select.click();
        // util.singleScroll();
        this.guestInfo_PersonalInfo_FirstAddress.clear();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstAddress, address);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_City, city);
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_State.click();
        this.guestInfo_PersonalInfo_State_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_PostalCode, postalCode);
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_EmailAddress.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_EmailAddress, email);
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_MobileNumber.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_MobileNumber, mobileNo);
        innerDriver.hideKeyboard();
        DriverWait.staticWait();
        this.util.scrollTo("Credit Card Number");
        DriverWait.staticWait();
        this.guestInfo_PaymentInfo_CcType.click();
        this.guestInfo_PaymentInfo_CcSelect.click();
        this.util.enterTextinField(this.guestInfo_PaymentInfo_CcInput, cCNo);
        DriverWait.staticWait();
        this.util.scrollTo("MM");
        DriverWait.staticWait();
        this.guestInfo_PaymentInfo_Month.click();
        this.guestInfo_PaymentInfo_Month_Select.click();
        DriverWait.staticWait();
        if ((Platform1.equalsIgnoreCase("Android"))) {
            this.guestInfo_PaymentInfo_Year.click();
            this.guestInfo_PaymentInfo_Year_Select.click();
            this.util.scrollTo("I certify that:");
        } else {
           // this.util.iOSSwipe("//*[@label='TRAcceptSwitchAccessibilityLabel'and @visible='true']");
        }
        this.util.click(this.guestInfo_TnC);

    }

    public void GuestInfoForNonGuaranteeBookingWithCard() throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();

        String firstName = (String) readFile.data[2][4];
        String lastName = (String) readFile.data[4][5];
        String address2 = (String) readFile.data[2][7];
        String city = (String) readFile.data[2][9];
        String postalCode = (String) readFile.data[2][10];
        // String email = (String) readFile.data[2][11];
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar = abc.charAt(randomGenerator.nextInt(abc.length()));
        String email = "testemail" + randomChar + randomInt + "@gmail.com";
        String mobileNo = (String) readFile.data[2][12];
        String cCNo = (String) readFile.data[2][13];
        this.util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_FirstName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstName, firstName);
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_LastName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_LastName, lastName);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_FirstAddress.clear();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstAddress, address2);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_Country.click();
        this.guestInfo_PersonalInfo_Country_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_City, city);
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_State.click();
        this.guestInfo_PersonalInfo_State_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_PostalCode, postalCode);
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_EmailAddress, email);
        this.util.enterTextinField(this.guestInfo_PersonalInfo_MobileNumber, mobileNo);
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        OpcoPage opcoUser = new OpcoPage(innerDriver);
        this.util.display(opcoUser.opco_NonGuaranteeBooking_ReserveWithCardMsg);
        this.guestInfo_PaymentInfo_CcType.click();
        this.guestInfo_PaymentInfo_CcSelect.click();
        this.util.enterTextinField(this.guestInfo_PaymentInfo_CcInput, cCNo);
        DriverWait.staticWait();
        this.guestInfo_PaymentInfo_Month.click();
        this.guestInfo_PaymentInfo_Month_Select.click();
        DriverWait.staticWait();
        if ((Platform1.equalsIgnoreCase("Android"))) {
            this.guestInfo_PaymentInfo_Year.click();
            this.guestInfo_PaymentInfo_Year_Select.click();
            this.util.scrollTo("I certify that:");
        } else {
           // this.util.iOSSwipe("//*[@label='TRAcceptSwitchAccessibilityLabel'and @visible='true']");
        }

    }

    public void GuestInfoForNonGuaranteeBookingWithoutCard() throws IOException, InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();

        String firstName = (String) readFile.data[2][4];
        String lastName = (String) readFile.data[4][5];
        String address2 = (String) readFile.data[2][7];
        String city = (String) readFile.data[2][9];
        String postalCode = (String) readFile.data[2][10];
        // String email = (String) readFile.data[2][11];
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar = abc.charAt(randomGenerator.nextInt(abc.length()));
        String email = "testemail" + randomChar + randomInt + "@gmail.com";
        String mobileNo = (String) readFile.data[2][12];
        this.util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_FirstName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstName, firstName);
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_LastName.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_LastName, lastName);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_FirstAddress.clear();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_FirstAddress, address2);
        DriverWait.staticWait();
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        this.guestInfo_PersonalInfo_Country.click();
        this.guestInfo_PersonalInfo_Country_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_City, city);
        innerDriver.hideKeyboard();
        this.guestInfo_PersonalInfo_State.click();
        this.guestInfo_PersonalInfo_State_Select.click();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_PostalCode, postalCode);
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        this.util.enterTextinField(this.guestInfo_PersonalInfo_EmailAddress, email);
        this.util.enterTextinField(this.guestInfo_PersonalInfo_MobileNumber, mobileNo);
        innerDriver.hideKeyboard();
        this.util.singleScroll();
        DriverWait.staticWait();
        OpcoPage opcoUser = new OpcoPage(innerDriver);
        this.util.display(opcoUser.opco_NonGuaranteeBooking_Heading);
        this.util.display(opcoUser.opco_NonGuaranteeBooking_ReserveWithCardRadioBtn);
        this.util.display(opcoUser.opco_NonGuaranteeBooking_ReserveWithoutCardRadioBtn);
        this.util.display(opcoUser.opco_NonGuaranteeBooking_ReserveWithoutCardMsg);

    }

    public void joinMembership() throws InterruptedException {

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String pin = (String) readFile.data[1][1];
        String re_enter_pin = (String) readFile.data[1][1];

        this.util.click(this.guestInfo_PointsEstimate_EnrollCheckbox);
        // util.singleScroll();
        DriverWait.staticWait();
        // innerDriver.tap(fingers, element, duration);
        this.guestInfo_PointsEstimate_Pin.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PointsEstimate_Pin, pin);
        // guestInfo_PointsEstimate_Pin.clear();
        // util.enterTextinField(guestInfo_PointsEstimate_Pin, pin);
        innerDriver.hideKeyboard();
        this.guestInfo_PointsEstimate_VerifyPin.clear();
        DriverWait.staticWait();
        this.util.enterTextinField(this.guestInfo_PointsEstimate_VerifyPin, re_enter_pin);
        innerDriver.hideKeyboard();
    }

}
