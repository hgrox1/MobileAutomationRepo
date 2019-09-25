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

public class LoginGatePage extends DriverCapabilities {

	public LoginGatePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__signin_text")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_SignINText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__member_rate_info")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_Info;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__member_id")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_MemberID;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__pin_number")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_Pin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__forgot_pin")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_ForgotPin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__retrieve_pin")
	// @iOSFindBy(name="")
	public MobileElement loginGatePage_RetrievePin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__signin_button")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_SignInBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__join_now_text")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_JoinNowText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__join_now_button")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_JoinNowBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/login_gate__decline_button")
	// @iOSFindBy(name = "")
	public MobileElement loginGatePage_DeclineBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	// @iOSFindBy(name="")
	public MobileElement loginGatePage_Close;

	@AndroidFindBy(name = "Error: - Please enter member Id. - Please enter pin.")
	// @iOSFindBy(name="")
	public MobileElement loginGatePage_BlankErrorMessage;

	@AndroidFindBy(name = "We're sorry, the member #, email, or PIN you entered don't appear to work together. To retrieve your PIN, select “Retrieve PIN.” If you'd like help, please contact our Customer Care team and they'd be happy to assist.")
	// @iOSFindBy(name="")
	public MobileElement loginGatePage_InvalidUserErrorMessage;

	Utility util = new Utility();

	public void signIn() throws IOException, InterruptedException {

		// Reading data from excel

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String memberID = (String) readFile.data[0][0];
		String PIN = (String) readFile.data[0][1];
		// loginGatePage_MemberID.clear();
		DriverWait.waitById("com.ihg.apps.android:id/login_gate__member_id");
		util.enterTextinField(loginGatePage_MemberID, memberID);
		util.enterTextinField(loginGatePage_Pin, PIN);
		util.click(loginGatePage_SignInBtn);
	}

	public void signInByUserHavingSufficientPoints() throws IOException, InterruptedException {

		// Reading data from excel

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String memberID = (String) readFile.data[8][0];
		String PIN = (String) readFile.data[8][1];
		// loginGatePage_MemberID.clear();
		DriverWait.waitById("com.ihg.apps.android:id/login_gate__member_id");
		util.enterTextinField(loginGatePage_MemberID, memberID);
		util.enterTextinField(loginGatePage_Pin, PIN);
		util.click(loginGatePage_SignInBtn);
	}

	public void blankFieldErrorTest() {

		util.click(loginGatePage_SignInBtn);
		DriverWait.waitById("com.ihg.apps.android:id/login_gate__error_message");
		util.display(loginGatePage_BlankErrorMessage);
		loginGatePage_Close.click();
		DriverWait.waitById("com.ihg.apps.android:id/points_estimate_guest_info_sign_in_to_earn_bt");

	}

	public void invalidUserErrorTest() throws InterruptedException {

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String memberId = (String) readFile.data[1][0];
		String pin = (String) readFile.data[1][1];

		loginGatePage_MemberID.clear();
		util.enterTextinField(loginGatePage_MemberID, memberId);
		util.enterTextinField(loginGatePage_Pin, pin);
		util.click(loginGatePage_SignInBtn);
		DriverWait.waitById("com.ihg.apps.android:id/login_gate__error_message");

		// Verifying Error Pop Up
		util.display(loginGatePage_InvalidUserErrorMessage);
		loginGatePage_Close.click();
		DriverWait.waitById("com.ihg.apps.android:id/points_estimate_guest_info_sign_in_to_earn_bt");

	}

	public void signInWithNoSavedCardUser() throws InterruptedException {

		String memberId = null, pin = null;

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		memberId = (String) readFile.data[11][0];
		pin = (String) readFile.data[11][1];

		util.enterTextinField(loginGatePage_MemberID, memberId);
		util.enterTextinField(loginGatePage_Pin, pin);
		util.click(loginGatePage_SignInBtn);
	}

}
