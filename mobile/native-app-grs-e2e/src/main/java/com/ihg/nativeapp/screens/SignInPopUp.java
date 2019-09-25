package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignInPopUp extends DriverCapabilities {

	public SignInPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "android:id/title")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/edit_text_field_top")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_MemberIDTxtBox;

	@AndroidFindBy(id = "com.ihg.apps.android:id/edit_text_field_bottom")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_PinTextBox;

	@AndroidFindBy(name = "Cancel")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_CancelBtn;

	@AndroidFindBy(name = "Sign In")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_SignInBtn;

	@AndroidFindBy(id = "android:id/message")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_ErrorPopUpMsg;

	@AndroidFindBy(id = "android:id/button1")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_ErrorPopUpOKBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/alert_buttonLayout")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_InvalidUser_ErrorPopUpOKBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/simple_alert_dialog__title")
	// @iOSFindBy(name = "")
	public MobileElement signInPopUp_InvalidUser_ErrorPopUpMsg;

	public int row;
	Utility util = new Utility();

	public void blankFieldErrorTest() {

		util.click(signInPopUp_SignInBtn);
		DriverWait.waitById("android:id/message");

		// Verifying Error Pop Up
		util.display(signInPopUp_ErrorPopUpMsg);
		util.display(signInPopUp_ErrorPopUpOKBtn);
		util.click(signInPopUp_ErrorPopUpOKBtn);
		DriverWait.waitById("com.ihg.apps.android:id/edit_text_field_top");

	}

	public void invalidUserErrorTest() throws InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String memberId = (String) readFile.data[1][0];
		String pin = (String) readFile.data[1][1];

		signInPopUp_MemberIDTxtBox.clear();
		util.enterTextinField(signInPopUp_MemberIDTxtBox, memberId);
		util.enterTextinField(signInPopUp_PinTextBox, pin);
		util.click(signInPopUp_SignInBtn);
		DriverWait.waitById("com.ihg.apps.android:id/simple_alert_dialog__title");

		// Verifying Error Pop Up
		util.display(signInPopUp_InvalidUser_ErrorPopUpMsg);
		util.display(signInPopUp_InvalidUser_ErrorPopUpOKBtn);
		util.click(signInPopUp_InvalidUser_ErrorPopUpOKBtn);
		DriverWait.waitById("com.ihg.apps.android:id/points_estimate_guest_info_sign_in_to_earn_bt");

	}

	public void signIn() throws InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String memberId = (String) readFile.data[0][0];
		String pin = (String) readFile.data[0][1];

		signInPopUp_MemberIDTxtBox.clear();
		util.enterTextinField(signInPopUp_MemberIDTxtBox, memberId);
		util.enterTextinField(signInPopUp_PinTextBox, pin);
		util.click(signInPopUp_SignInBtn);
	}

	public void signInWithNoSavedCardUser() throws InterruptedException {

		String memberId = null, pin = null;

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		memberId = (String) readFile.data[11][0];
		pin = (String) readFile.data[11][1];

		util.enterTextinField(signInPopUp_MemberIDTxtBox, memberId);
		util.enterTextinField(signInPopUp_PinTextBox, pin);
		util.click(signInPopUp_SignInBtn);
	}

}
