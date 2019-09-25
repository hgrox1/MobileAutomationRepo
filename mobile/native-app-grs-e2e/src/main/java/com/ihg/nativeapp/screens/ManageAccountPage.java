package com.ihg.nativeapp.screens;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ManageAccountPage extends DriverCapabilities {

	public ManageAccountPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Navigate up")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_BackButton;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_Tilte;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__member_name")
	//@iOSFindBy(xpath = "//*[@label=\"Jake Isaac\"]")
	public MobileElement manageAccount_MemberName;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__email")
	////@iOSFindBy(xpath = "//*[@label=\"Address Type\"]")
	public MobileElement manageAccount_EmailLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__address_label")
	////@iOSFindBy(xpath = "//*[@label=\"Address Type\"]")
	public MobileElement manageAccount_AddressLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__address_residence")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_ResidenceRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__address_business")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_BusinessRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__first_street_address")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_Address1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__second_street_address")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_Address2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__third_street_address")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_Address3;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_text")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_Country;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__state_spinner")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_State;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__city")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_City;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__postal_code")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_PostalCode;

	@AndroidFindBy(id = "android:id/title")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_ErrorMsgTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/simple_alert_dialog__title")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_ErrorMsg_Message;

	@AndroidFindBy(name = "Cancel")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_ErrorMsg_CancelBtn;

	@AndroidFindBy(name = "OK")
	//@iOSFindBy(name = "")
	public MobileElement manageAccount_ErrorMsg_OkBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_manager__personal_information")
	//@iOSFindBy(name = "")
	public MobileElement ManageAccount_PersonalInfo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_manager__stay_preference")
	//@iOSFindBy(name = "")
	public MobileElement ManageAccount_StayPreference;

	@AndroidFindBy(name = "ACCEPT")
	// @iOSFindBy(name = "")
	public MobileElement cookies_Accept_Btn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/personal_information__save_changes")
	@iOSFindBy(xpath = "//*[@label=\"Save Button\"]")
	public MobileElement manageAccount_SaveChangesBtn;

	Utility util = new Utility();

	public void clearingPersonalInformation() {

		manageAccount_Address1.clear();
		manageAccount_Address2.clear();
		manageAccount_Address3.clear();
		innerDriver.hideKeyboard();
		util.singleScroll();
		manageAccount_City.clear();
		manageAccount_PostalCode.clear();
	}

	public void personalInformation(String address, String address1, String address2, String city, String zipCode)
			throws IOException, InterruptedException {
		ReadingFromFile readFile = new ReadingFromFile();

		// Reading data from excel
		readFile.readDataFromExcel();
		address = (String) readFile.data[0][6];
		address1 = (String) readFile.data[0][7];
		address2 = (String) readFile.data[0][8];
		city = (String) readFile.data[0][9];
		zipCode = (String) readFile.data[0][10];
		DriverWait.waitById("com.ihg.apps.android:id/personal_information__first_street_address");
		manageAccount_Address1.clear();
		util.enterTextinField(manageAccount_Address1, address);
		manageAccount_Address2.clear();
		util.enterTextinField(manageAccount_Address2, address1);
		manageAccount_Address3.clear();
		util.enterTextinField(manageAccount_Address3, address2);
		innerDriver.hideKeyboard();
		util.singleScroll();
		manageAccount_City.clear();
		util.enterTextinField(manageAccount_City, city);
		manageAccount_PostalCode.clear();
		util.enterTextinField(manageAccount_PostalCode, zipCode);
	}
	public void correctPage() {

		try {
			DriverWait.waitByName("Personal Information");
			logger.info("PASS: Manage Account Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Manage Account Page is not loaded properly");
		}
	}

}
