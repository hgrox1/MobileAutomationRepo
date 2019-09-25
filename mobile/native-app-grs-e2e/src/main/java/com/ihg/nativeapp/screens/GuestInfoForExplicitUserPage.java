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

public class GuestInfoForExplicitUserPage extends DriverCapabilities {

	public GuestInfoForExplicitUserPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__top_bar")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_TopBar;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_TopBar_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_TopBar_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__points_estimate")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_explicit_earned_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_EarnedPoints;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_anonymous_earned_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_AnonymousEarnedPoints;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_explicit_earned_points_arrow")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_EarnedPointsArrowBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_anonymous_earned_points_arrow")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_AnonymousEarnedPointsArrowBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_sign_in_to_earn_bt")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_SignInBtn;
	
	

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_breakdown_list")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_BreakdownList;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_explicit_earned_points_details")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_EarnedPointsDetails;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_breakdown_help_section")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PointsEstimate_HelpSection;

	@AndroidFindBy(id = "com.ihg.apps.android:id/gi_summary_header_tv")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PersonalInfo_Header;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_label_text")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PersonalInfo_TravelProfileLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_text")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PersonalInfo_TravelProfileName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/spinner_item__arrow_icon")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PersonalInfo_TravelProfileArrowBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/gi_summary")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PersonalInfo_Summary;

	@AndroidFindBy(id = "com.ihg.apps.android:id/pymt_summary_header")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Header;

	@AndroidFindBy(id = "com.ihg.apps.android:id/pymt_summary_edit")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_EditBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/pymt_summary")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Summary;

	@AndroidFindBy(name = "Please enter your credit card information below to reserve a room.")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CcInfo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__camera_image_view")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CameraIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__scan_button")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_ScanBtn;
	
	@AndroidFindBy(name = "MASTERCARD")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CcSelection;

	@AndroidFindBy(name = "Credit Card Type")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CcType;

	@AndroidFindBy(name = "AMERICAN EXPRESS")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CcSelect;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__number_value_input")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CcInput;



	//@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/guest_info_credit_card__expiration_month_spinner\"]//*[@resourceid=\"com.ihg.apps.android:id/spinner_item__arrow_icon\"]")
	@AndroidFindBy(name = "MM")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Month;

	@AndroidFindBy(name = "Sep")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Month_Select;
    
	@AndroidFindBy(name="XX")
	//iOSFindBy(name="")
	public MobileElement guestInfo_PaymentInfo_Month_Saved;


	//@AndroidFindBy(xpath= "//*[@resourceid=\"com.ihg.apps.android:id/guest_info_credit_card__expiration_year_spinner\"]//*[@resourceid=\"com.ihg.apps.android:id/spinner_item__arrow_icon\"]")
   // @AndroidFindBy(xpath= "com.ihg.apps.android:id/guest_info_credit_card__expiration_year_spinner")	
	@AndroidFindBy(name= "YY")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Year;

	@AndroidFindBy(name = "2020")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Year_Select;
	
	@AndroidFindBy(name = "XX")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_Year_Saved;

	@AndroidFindBy(name = "* The credit card MUST be presented upon check-in at the hotel")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_CCardInfo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_credit_card__save_cc_to_profile_checkbox")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PaymentInfo_SaveToProfile;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__book_bow_btn")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_SwipeToBookBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__confirm_reservation_button")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_SwipeToBookBtn1;

	@AndroidFindBy(name = "Leisure")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_Leisure;

	@AndroidFindBy(name = "Concur Connect Suppliers-26 IHG")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_ConcureConnect;

	@AndroidFindBy(name = "MASTERCARD ending in 5100")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_ConcureConnectInfo;

	@AndroidFindBy(name = "VISA ending in 1111")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_LeisurecardInfo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/alipay_button_text")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_AlipayOption;
	
	@AndroidFindBy(name = "You must have the Alipay app installed on your device in order to complete the reservation via Alipay.")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PopUpText;
	
	@AndroidFindBy(name = "OK")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PopUpOkBtn;
	
	@AndroidFindBy(name = "Alipay")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PopUpHeader;
	
	@AndroidFindBy(name = "You will be redirected to Alipay to complete your payment, please do so within 30 minutes.")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PopUpMsg;
	
	@AndroidFindBy(name = "Choose a different payment method.")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_PopUpChangePayment;
	
	@AndroidFindBy(id= "com.ihg.apps.android:id/check_accept_terms_conditions")
	//@iOSFindBy(name="")
	public MobileElement guestInfo_TnC;
	
	@AndroidFindBy(name = "Base Earnings")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_BaseEarning;
	
	@AndroidFindBy(name = "Elite Bonus")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_EliteBonus;
	
	@AndroidFindBy(name = "Total")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_Total;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_guest_info_breakdown_help_section")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_HelpIcon;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_breakdown_total_column_2")
	// @iOSFindBy(name = "")
	public MobileElement guestInfo_TotalValue;
	

	Utility util = new Utility();

	public void enterValidPaymentDetails(String month) throws InterruptedException{

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String cCNo = (String) readFile.data[3][13];

		util.click(guestInfo_PaymentInfo_CcType);
		util.click(guestInfo_PaymentInfo_CcSelect);
		guestInfo_PaymentInfo_CcInput.clear();
		util.enterTextinField(guestInfo_PaymentInfo_CcInput, cCNo);
		innerDriver.hideKeyboard();
		//util.singleScroll();
		if (month == "MM") {
			util.click(guestInfo_PaymentInfo_Month);
			util.click(guestInfo_PaymentInfo_Month_Select);
			util.click(guestInfo_PaymentInfo_Year);
			util.click(guestInfo_PaymentInfo_Year_Select);
		}else{
			util.display(guestInfo_PaymentInfo_Month_Select);
			util.display(guestInfo_PaymentInfo_Year_Select);
		}
		DriverWait.staticWait();

	}
	

	public void blankDetailsErrorTest() {

		ErrorPopUp errorUser = new ErrorPopUp(innerDriver);
        
		// Swipe to book without entering payment details
		util.scrollTo("Book Now");
		util.click(guestInfo_SwipeToBookBtn);
		DriverWait.waitById("com.ihg.apps.android:id/simple_alert_dialog__title");

		// Verifying Error Pop Up
		util.display(errorUser.errorPopUp_Msg);
		util.display(errorUser.errorPopUp_OkBtn);
		util.click(errorUser.errorPopUp_OkBtn);
		DriverWait.waitByName("Guest Information");

	}

	public void invalidDetailsErrorTest() throws InterruptedException {

		ErrorPopUp errorUser = new ErrorPopUp(innerDriver);

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String invalidCCNo = (String) readFile.data[3][15];

		util.click(guestInfo_PaymentInfo_CcType);
		util.click(guestInfo_PaymentInfo_CcSelect);
		util.enterTextinField(guestInfo_PaymentInfo_CcInput, invalidCCNo);
		innerDriver.hideKeyboard();
		util.singleScroll();
		util.click(guestInfo_PaymentInfo_Month);
		util.click(guestInfo_PaymentInfo_Month_Select);
		util.click(guestInfo_PaymentInfo_Year);
		util.click(guestInfo_PaymentInfo_Year_Select);
		// util.click(paymentInfoPage_SaveToProfileChkbox);
		DriverWait.staticWait();
		util.scrollTo("Book Now");
		util.click(guestInfo_SwipeToBookBtn);
		DriverWait.staticWait();

		// Verifying Error Pop Up
		util.display(errorUser.errorPopUp_Msg);
		util.display(errorUser.errorPopUp_OkBtn);
		util.click(errorUser.errorPopUp_OkBtn);
		DriverWait.waitByName("Guest Information");

	}

	public void cardNumber() throws InterruptedException {

		Utility util = new Utility();

		// Reading data from excel
		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();

		String cardNumber = (String) readFile.data[0][13];
		guestInfo_PaymentInfo_CcInput.clear();
		util.enterTextinField(guestInfo_PaymentInfo_CcInput, cardNumber);
		innerDriver.hideKeyboard();

	}
	
	public void acceptTnC(){
		util.scrollTo("I certify that:");
		guestInfo_TnC.click();
		
	}
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Guest Information");
			logger.info("PASS: Guest Information Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Guest Information Page is not loaded properly");
		}
	}


}