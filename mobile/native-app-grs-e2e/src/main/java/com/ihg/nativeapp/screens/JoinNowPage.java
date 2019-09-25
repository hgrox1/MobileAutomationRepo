package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class JoinNowPage extends DriverCapabilities {

	public JoinNowPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// Capturing elements on Join Now Screen
	@AndroidFindBy(name = "A World of Rewards at  Your Fingertips")
	@iOSFindBy(name = "")
	public MobileElement join_RewardsTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar_back")
	@iOSFindBy(name = "")
	public MobileElement join_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_first_name")
	@iOSFindBy(name = "")
	public MobileElement join_FirstName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_last_name")
	@iOSFindBy(name = "")
	public MobileElement join_LastName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_info_address_label_tv")
	@iOSFindBy(name = "")
	public MobileElement join_AddressLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_residential")
	@iOSFindBy(name = "")
	public MobileElement join_Residence;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_business")
	@iOSFindBy(name = "")
	public MobileElement join_Business;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_street")
	@iOSFindBy(name = "")
	public MobileElement join_BusinessAddress;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_street")
	@iOSFindBy(name = "")
	public MobileElement join_Address1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_street_second")
	@iOSFindBy(name = "")
	public MobileElement join_Address2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/one_more_txt_plus")
	@iOSFindBy(name = "")
	public MobileElement join_Plus;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_street_third")
	@iOSFindBy(name = "")
	public MobileElement join_Address3;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_text")
	@iOSFindBy(name = "")
	public MobileElement join_CountryLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_text")
	@iOSFindBy(name = "")
	public MobileElement join_CountryDropdown;

	/*
	 * @AndroidFindBy(id = "com.ihg.apps.android:id/spinner_item_arrow_icon")
	 * 
	 * @iOSFindBy(name = "") public MobileElement join_Arrow;
	 */

	@AndroidFindBy(name = "India")
	@iOSFindBy(name = "")
	public MobileElement join_CountryIndia;

	@AndroidFindBy(name = "United States")
	@iOSFindBy(name = "")
	public MobileElement join_CountryUnitedStates;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_state_spinner")
	@iOSFindBy(name = "")
	public MobileElement join_StateLbl;

	@AndroidFindBy(name = "CALIFORNIA")
	@iOSFindBy(name = "")
	public MobileElement join_StateCalifornia;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_postal_code")
	@iOSFindBy(name = "")
	public MobileElement join_PostalCode;

	@AndroidFindBy(id = "com.ihg.apps.android:id/address_city")
	@iOSFindBy(name = "")
	public MobileElement join_City;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_email")
	@iOSFindBy(name = "")
	public MobileElement join_Email;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_pin")
	@iOSFindBy(name = "")
	public MobileElement join_Pin;

	@AndroidFindBy(name = "Your PIN is not strong enough. You must change your PIN. ")
	@iOSFindBy(name = "")
	public MobileElement join_WeakPin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_verify_pin")
	@iOSFindBy(name = "")
	public MobileElement join_VerifyPin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/join_now_terms_conditions")
	@iOSFindBy(name = "")
	public MobileElement join_CheckBox;

	@AndroidFindBy(name= "Join Now")
	@iOSFindBy(name = "")
	public MobileElement join_JoinBtn;

	// Capturing elements for error scenarios
	@AndroidFindBy(id = "android:id/title")
	@iOSFindBy(name = "")
	public MobileElement join_ErrorTitle;

	@AndroidFindBy(name = "- Please enter first name. - Please enter last name. - Please enter Street Address. - Please select Country. - Please enter City. - Please select State. - Please enter ZIP Code. - Please enter Email Address. - PIN entered must be 4 digits. - Verify PIN entered must be 4 digits. - Please enter valid email format for Address.")
	@iOSFindBy(name = "")
	public MobileElement join_ErrorAllFieldsEmpty;

	@AndroidFindBy(name = "OK")
	@iOSFindBy(name = "")
	public MobileElement join_OkBtn;

	@AndroidFindBy(name = "Remember Me")
	@iOSFindBy(name = "")
	public MobileElement join_RememberMe;

	@AndroidFindBy(name = "Remember your account information for auto login next time?")
	@iOSFindBy(name = "")
	public MobileElement join_RememberAlert;

	@AndroidFindBy(name = "Yes")
	@iOSFindBy(name = "")
	public MobileElement join_RememberAlertOption1;

	@AndroidFindBy(name = "No")
	@iOSFindBy(name = "")
	public MobileElement join_RememberAlertOption2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_membership_user_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement signIn_User;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	// @iOSFindBy(xpath = "//*[@label='nav back arrow']")
	public MobileElement join_CloseIcon;

	@AndroidFindBy(name = "Please enter first name.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorFirstNmae;

	@AndroidFindBy(name = "Please enter Email Address.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorEmail;

	@AndroidFindBy(name = "Please enter pin.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorPin;

	@AndroidFindBy(name = "Please enter pin.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorVerifyPin;

	@AndroidFindBy(name = "Please select Country.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorCountrySelect;

	@AndroidFindBy(name = "Please enter Street Address.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorAddress1;

	@AndroidFindBy(name = "Please select Country.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorCountry;

	@AndroidFindBy(name = "Please enter City.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorCity;

	@AndroidFindBy(name = "Please enter ZIP Code.")
	//// @iOSFindBy(name = "")
	public MobileElement join_errorPostalCode;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__join_now_button")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestJoinBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__first_name_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestFirstName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__last_name_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestLastName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__residence_radio_button")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestResidenceRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__business_radio_button")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestBusinessRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__first_address")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestAddress1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__second_address")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestAddress2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__third_address")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestAddress3;

	// Capturing elements on join now for guest user
	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__guest_pin_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestPin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest_verify_pin_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestVerifyPin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__guest_city_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestCity;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__postal_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestPostalCode;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__mobile_number_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestMobile;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_information__email_address_et")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestEmail;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__scan_button")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestScanCard;

	@AndroidFindBy(name = "Select")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestCreditCardType;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__number_value_input")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestCreditCardNumber;

	@AndroidFindBy(name = "MM")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestMonthSelector;

	@AndroidFindBy(name = "YY")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestYearSelector;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__confirm_reservation_button")
	//// @iOSFindBy(name = "")
	public MobileElement join_swipeToBookBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_item__arrow_icon")
	//// @iOSFindBy(name = "")
	public MobileElement join_guestCountryDropdown;

	@AndroidFindBy(name = "UNITED STATES")
	//// @iOSFindBy(name = "")
	public MobileElement join_countryUS;

	@AndroidFindBy(name = "CALIFORNIA")
	//// @iOSFindBy(name = "")
	public MobileElement join_stateCalifornia;

	@AndroidFindBy(name = "VISA")
	//// @iOSFindBy(name = "")
	public MobileElement join_cardVisa;

	@AndroidFindBy(name = "Jan")
	//// @iOSFindBy(name = "")
	public MobileElement join_cardDate;

	@AndroidFindBy(name = "2020")
	//// @iOSFindBy(name = "")
	public MobileElement join_cardYear;

	static String actualUsername, requiredInputUsername;

	public void userDetails(String firstName, String lastName, String address, String address2, 
			String city, String postalCode, String email, String pin, String re_enter_pin)
			throws IOException, InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		firstName = (String) readFile.data[3][4];
		lastName = (String) readFile.data[3][5];
		address = (String) readFile.data[3][6];
		address2 = (String) readFile.data[3][7];
		//address3 = (String) readFile.data[3][8];
		city = (String) readFile.data[3][9];
		postalCode = (String) readFile.data[3][10];
		email = (String) readFile.data[3][11];
		pin = (String) readFile.data[1][1];
		re_enter_pin = (String) readFile.data[1][1];

		Utility util = new Utility();

		util.enterTextinField(join_FirstName, firstName);
		innerDriver.hideKeyboard();
		util.enterTextinField(join_LastName, lastName);
		innerDriver.hideKeyboard();
		util.singleScroll();
		util.enterTextinField(join_Email, email);
		innerDriver.hideKeyboard();
		util.enterTextinField(join_Pin, pin);
		//innerDriver.hideKeyboard();
		
		util.enterTextinField(join_VerifyPin, re_enter_pin);
		//innerDriver.hideKeyboard();
		DriverWait.staticWait();
		util.click(join_CountryLbl);
		/*DriverWait.staticWait();
		util.singleScroll();
		util.singleScroll();
		util.singleScroll();
		util.singleScroll();
		util.singleScroll();
		util.singleScroll();*/
		util.display(join_CountryUnitedStates);
		
		util.click(join_CountryUnitedStates);
		util.click(join_Business);
		util.display(join_BusinessAddress);
		util.singleScroll();
		util.enterTextinField(join_BusinessAddress, address);
		innerDriver.hideKeyboard();
		util.enterTextinField(join_Address2, address2);
		innerDriver.hideKeyboard();
		/*util.click(join_Plus);
		util.display(join_Address3);
		util.enterTextinField(join_Address3, address3);
		innerDriver.hideKeyboard();*/
		util.enterTextinField(join_City, city);
		innerDriver.hideKeyboard();
		util.enterTextinField(join_PostalCode, postalCode);
		innerDriver.hideKeyboard();
		
		util.singleScroll();
		
		join_CheckBox.click();

	}

	public void correctUserDetails(String firstName, String lastName, String address, String address2, String address3,
			String city, String postalCode, String email, String pin, String re_enter_pin)
			throws IOException, InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		firstName = (String) readFile.data[3][4];
		lastName = (String) readFile.data[4][5];
		address = (String) readFile.data[3][6];
		address2 = (String) readFile.data[3][7];
		address3 = (String) readFile.data[3][8];
		city = (String) readFile.data[3][9];
		postalCode = (String) readFile.data[3][10];
		//email = (String) readFile.data[3][11];
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(10000); 
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char randomChar = abc.charAt(randomGenerator.nextInt(abc.length()));
		email = "testemail"+randomChar+ randomInt +"@gmail.com";
		pin = (String) readFile.data[3][1];
		re_enter_pin = (String) readFile.data[3][1];

		Utility util = new Utility();

		join_FirstName.clear();
		util.enterTextinField(join_FirstName, firstName);
		innerDriver.hideKeyboard();
		join_LastName.clear();
		util.enterTextinField(join_LastName, lastName);
		innerDriver.hideKeyboard();
		join_Email.clear();
		util.enterTextinField(join_Email, email);
		innerDriver.hideKeyboard();
		join_Pin.clear();
		util.enterTextinField(join_Pin, pin);
		innerDriver.hideKeyboard();
		join_VerifyPin.clear();
		util.enterTextinField(join_VerifyPin, re_enter_pin);
		innerDriver.hideKeyboard();
		util.click(join_CountryLbl);
		util.click(join_CountryUnitedStates);
		util.singleScroll();
		DriverWait.staticWait();
		util.enterTextinField(join_Address1, address);
		innerDriver.hideKeyboard();
		/*
		 * util.enterTextinField(join_Address2, address2);
		 * innerDriver.hideKeyboard()
		 */;
		util.enterTextinField(join_City, city);
		innerDriver.hideKeyboard();
		util.click(join_StateLbl);
		DriverWait.staticWait();
		util.click(join_StateCalifornia);
		join_PostalCode.clear();
		util.enterTextinField(join_PostalCode, postalCode);
		innerDriver.hideKeyboard();
		util.singleScroll();
		DriverWait.staticWait();
		join_CheckBox.click();
	}

	public void correctPin(String newPin) throws InterruptedException {

		Utility util = new Utility();

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		util.display(join_Pin);
		// logger.info("pin field present");

		join_Pin.clear();
		newPin = (String) readFile.data[3][1];
		util.enterTextinField(join_Pin, newPin);

		innerDriver.hideKeyboard();
		util.display(join_VerifyPin);
		// logger.info("verify pin field present");
		join_VerifyPin.clear();
		util.enterTextinField(join_VerifyPin, newPin);
		innerDriver.hideKeyboard();

	}

	public void verifyUser(String username) {
		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		username = (String) readFile.data[3][2];
		actualUsername = signIn_User.getText();
		// System.out.println(actualUsername);

		Assert.assertEquals(actualUsername, username);
	}

	public void enterPin(String pin, String re_enter_pin) throws InterruptedException {
		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		Utility util = new Utility();

		readFile.readDataFromExcel();
		pin = (String) readFile.data[2][1];
		re_enter_pin = (String) readFile.data[2][1];
		util.enterTextinField(join_guestPin, pin);
		util.enterTextinField(join_guestVerifyPin, re_enter_pin);

		innerDriver.hideKeyboard();

	}

	public void guestDetails(String firstName, String lastName, String address, String address1, String address2,
			String city, String postalCode, String email, String pin, String re_enter_pin, String mobile)
			throws IOException, InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		firstName = (String) readFile.data[3][4];
		lastName = (String) readFile.data[3][5];
		address = (String) readFile.data[3][6];
		address1 = (String) readFile.data[3][7];
		address2 = (String) readFile.data[3][8];
		city = (String) readFile.data[3][9];
		postalCode = (String) readFile.data[3][10];
		email = (String) readFile.data[3][11];
		pin = (String) readFile.data[1][1];
		re_enter_pin = (String) readFile.data[1][1];
		mobile = (String) readFile.data[3][12];

		Utility util = new Utility();

		util.enterTextinField(join_guestFirstName, firstName);
		innerDriver.hideKeyboard();
		DriverWait.staticWait();
		util.enterTextinField(join_guestLastName, lastName);
		innerDriver.hideKeyboard();
		DriverWait.staticWait();
		DriverWait.staticWait();
		util.enterTextinField(join_guestAddress1, address1);
		innerDriver.hideKeyboard();
		util.singleScroll();
		util.enterTextinField(join_guestAddress2, address2);
		innerDriver.hideKeyboard();

		util.click(join_guestCountryDropdown);
		util.click(join_countryUS);
		util.singleScroll();
		util.enterTextinField(join_guestCity, city);
		innerDriver.hideKeyboard();
		DriverWait.staticWait();
		DriverWait.staticWait();
		util.click(join_guestCountryDropdown);
		util.click(join_stateCalifornia);
		DriverWait.staticWait();
		DriverWait.staticWait();
		util.enterTextinField(join_guestPostalCode, postalCode);
		innerDriver.hideKeyboard();
		DriverWait.staticWait();
		DriverWait.staticWait();
		util.enterTextinField(join_guestEmail, email);
		innerDriver.hideKeyboard();
		DriverWait.staticWait();
		DriverWait.staticWait();
		util.enterTextinField(join_guestMobile, mobile);
		util.scroll();

	}

	public void guestPaymentDetails(String cardType, String cardNumber, String cardMonth, String cardYear)
			throws IOException, InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		cardNumber = (String) readFile.data[3][13];

		Utility util = new Utility();
		util.click(join_guestCountryDropdown);
		util.click(join_cardVisa);
		util.enterTextinField(join_guestCreditCardNumber, cardNumber);
		innerDriver.hideKeyboard();

		util.click(join_guestMonthSelector);
		util.click(join_cardDate);

		util.click(join_guestYearSelector);
		util.click(join_cardYear);

		util.swipe(join_swipeToBookBtn);

	}

}