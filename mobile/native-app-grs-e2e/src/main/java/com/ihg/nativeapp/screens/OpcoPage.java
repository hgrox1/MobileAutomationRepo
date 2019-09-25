package com.ihg.nativeapp.screens;

import org.openqa.selenium.By;
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
//import junit.framework.Assert;

public class OpcoPage extends DriverCapabilities {

	public OpcoPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	Utility util = new Utility();
	ReadingFromFile readFile = new ReadingFromFile();
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/button[1]")
	public MobileElement opco_BackBtn;

	@AndroidFindBy(xpath = "//*[@contentDesc=\"Navigate up\"]")
	@iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/button[1]")
	public MobileElement opco_TermBackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__logo")
	@iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/image[1]")
	public MobileElement opco_HotelBrandLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_image")
	@iOSFindBy(xpath = "//*[@label=\"OPCOWelcomeImageCell_WelcomeImageView\"]")
	public MobileElement opco_HotelImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelCheckIn\"]")
	public MobileElement opco_CheckIn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/arrow")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_ImageViewArrow\"]")
	public MobileElement opco_ArrowBetweenCheckInAndCheckOutTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelCheckOut\"]")
	public MobileElement opco_CheckOut;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__cancellation_policy_tv")
	@iOSFindBy(xpath = "//*[@label=\"Cancellation Policy:\"]")
	public MobileElement opco_CancellationPolicy;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"Non Refundable. Canceling your reservation or failing to show will result in a charge for 1 night per room to your credit card. Taxes may apply. Failing to call or show before check-out time after the first night of a reservation will result in cancellation of the remainder of your reservation.  \"]")
	public MobileElement opco_CancellationPolicyDetail;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_name")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelTitle\"]")
	public MobileElement opco_HotelInfoName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_guest_room")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelDetail\"]")
	public MobileElement opco_Guest_Room;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_room_type")
	@iOSFindBy(xpath = "//*[@label=\"OPCORoomInformationCell_RoomInformationLabel\"]")
	public MobileElement opco_Room;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_rate_type")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelRateCell_LabelRateTitle\"]")
	public MobileElement opco_RateType;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_logo")
	@iOSFindBy(xpath = "//*[@label=\"OPCOPointsEstimateCell\"]")
	public MobileElement opco_PointsEstimate_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_opco_anonymous_earned_points_tv")
	// @iOSFindBy(xpath = "")
	public MobileElement opco_PointsEstimate_Anonymous_EarnPointsText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_opco_explicit_earned_points_tv")
	@iOSFindBy(xpath = "//device/view/window[1]/view[2]/table[1]/cell[6]/text[1]")
	public MobileElement opco_PointsEstimate_Explicit_EarnPointsText;


	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__continue_as_guest")
	@iOSFindBy(id = "//*[@label='Sign In or Continue as a Guest']")
	public MobileElement opco_SignInOrAsGuest;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_name_card")
	@iOSFindBy(xpath = "//*[@label=\"OPCONameCell_NameLabel\"]")
	public MobileElement opco_GuestLastName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_card")
	@iOSFindBy(xpath = "//*[@label=\"OPCONameCell_CreditCardLabel\"]")
	public MobileElement opco_Card;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_name_card_container")
	@iOSFindBy(xpath = "//*[@label=\"OPCONameCell_NameLabel\"]")
	public MobileElement opco_GuestInformation;

	@AndroidFindBy(id = "com.ihg.apps.android:id/title")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelPriceCell_LabelDescription\"]")
	public MobileElement opco_EstimatedPrice;

	@AndroidFindBy(id = "com.ihg.apps.android:id/currency__value_tv")
	@iOSFindBy(xpath = "//*[@label=\"OPCOHotelPriceCell_TotalView\"]")
	public MobileElement opco_CurrencyValue;

	@AndroidFindBy(id = "com.ihg.apps.android:id/currency__type_tv")
	// @iOSFindBy(name = "")
	public MobileElement opco_CurrencyType;

	@AndroidFindBy(id = "com.ihg.apps.android:id/separate_vertical__checkin_tv")
	@iOSFindBy(xpath = "//*[@label=\"Check In Time\"]")
	public MobileElement opco_CheckInTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/separate_vertical__checkout_tv")
	@iOSFindBy(xpath = "//*[@label=\"Check Out Time\"]")
	public MobileElement opco_CheckOutTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__terms_and_conditions_label")
	@iOSFindBy(xpath = "//*[@name=\"na_terms_and_conditions_view\"]")
	public MobileElement opco_TnCLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__bullets")
	// @iOSFindBy(name = "")
	public MobileElement opco_TnCBullets;

	@AndroidFindBy(name = "Terms of Use")
	@iOSFindBy(name = "OPCOTermsAndConditionsCell_TermsListView")
	public MobileElement opco_TnC_Msg1;

	@AndroidFindBy(name = "Privacy Statement")
	// @iOSFindBy(name = "")
	public MobileElement opco_TnC_Msg2;

	@AndroidFindBy(name = "J’ai lu et compris la description des tarifs et règles de tarification pour ma réservation.")
	// @iOSFindBy(name = "")
	public MobileElement opco_TnC_Msg2_fr;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__disclaimer_expandable_header")
	@iOSFindBy(xpath = "//*[@label=\"OPCODisclaimerCell_BorderView\"]")
	public MobileElement opco_DisclaimerHeader;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__disclaimer_expandable_hidden")
	@iOSFindBy(name = "na_disclaimer_Cell")
	public MobileElement opco_DisclaimerMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reserve_bow__book_bow_btn")
	@iOSFindBy(xpath = "//*[@label=\"Book Now\"]")
	public MobileElement opco_BookBtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_guest__book_bow_btn")
	@iOSFindBy(name = "na_disclaimer_Cell")
	public MobileElement opco_BookBtnGuestUser;

	@AndroidFindBy(name = "Please note that the rate shown in this currency is for reference only. At check-out you will be billed in the local currency using the DICOM exchange rate.")
	// @iOSFindBy(name = "")
	public MobileElement opco_VenezuelaDisclaimer;
	
	@AndroidFindBy(name = "No weapons allowed on property")
	// @iOSFindBy(name = "")
	public MobileElement opco_GunLawDisclaimer;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco_alipay_button")
	// @iOSFindBy(name = "")
	public MobileElement opco_AlipayBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_restrictions_details_header")
	// @iOSFindBy(name = "")
	public MobileElement opco_IvaniAdditionalRestrictionsHeader;

	@AndroidFindBy(name = "For your account security, the following restrictions apply: In order to add an additional guest, the original booking member must either call the IHG® Worldwide Reservation office to provide the additional guest information no less than 7 days prior to the check-in date, or be present at the time of check-in at the hotel to provide identification. To change any provided information, the member must follow the same procedure mentioned above. Please refer to member terms and conditions for more details.")
	// @iOSFindBy(name = "")
	public MobileElement opco_IvaniAdditionalRestrictionsDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_restrictions_customer_service_link")
	// @iOSFindBy(name = "")
	public MobileElement opco_CustomerServiceLink;

	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_restrictions_terms_link")
	// @iOSFindBy(name = "")
	public MobileElement opco_TandCLink;

	@AndroidFindBy(name = "I certify that:")
	@iOSFindBy(id = "//*[@label='TRAcceptSwitchAccessibilityLabel']")
	public MobileElement guestInfo_TnC;

	@AndroidFindBy(name = "How would you prefer to reserve your room?")
	@iOSFindBy(id = "")
	public MobileElement opco_NonGuaranteeBooking_Heading;

	@AndroidFindBy(id = "com.ihg.apps.android:id/non_guarantee_booking_reserve_with_payment_button")
	@iOSFindBy(id = "")
	public MobileElement opco_NonGuaranteeBooking_ReserveWithCardRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/non_guarantee_booking_reserve_with_payment_message")
	@iOSFindBy(id = "")
	public MobileElement opco_NonGuaranteeBooking_ReserveWithCardMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/non_guarantee_booking_reserve_without_payment_button")
	@iOSFindBy(id = "")
	public MobileElement opco_NonGuaranteeBooking_ReserveWithoutCardRadioBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/non_guarantee_booking_reserve_without_payment_message")
	@iOSFindBy(id = "")
	public MobileElement opco_NonGuaranteeBooking_ReserveWithoutCardMsg;
	

	public void correctPage() {

		try {
			DriverWait.waitByName("Estimated Total Price");
			logger.info("PASS: Opco Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Opco Page is not loaded properly");
		}
	}

	public void acceptTnC() {

		if ((Platform1.equalsIgnoreCase("Android"))) {
			util.scrollTo("I certify that:");
			util.click(guestInfo_TnC);
		} else {
			util.iOSSwipe("//*[@label='TRAcceptSwitchAccessibilityLabel'and @visible='true']");
			util.click(guestInfo_TnC);
		}

	}

	public void clickBookNow() {
		if ((Platform1.equalsIgnoreCase("Android"))) {
			util.scrollTo("Book Now");
			util.click(opco_BookBtn);
		} else {
			util.iOSSwipe("//*[@label='Book Now'and @visible='true']");
			util.click(opco_BookBtn);
		}

	}
	
	public void verifyAuDisclaimerOpcoPage() {
		// Reading data from excel
		readFile.readDataFromExcel();
		String expecteddiscText = (String) readFile.data[23][20];
		logger.info(expecteddiscText);
		util.scrollTo("Disclaimers");
		util.click(opco_DisclaimerHeader);
		DriverWait.waitById("com.ihg.apps.android:id/opco__disclaimer_expandable_hidden");
		util.singleScroll();
		String disclaimerContent = opco_DisclaimerMsg.getAttribute("text");
		logger.info(disclaimerContent);
		String[] contentSplit = disclaimerContent.split("Check with hotel for details.");
		String actualDiscText = contentSplit[1].trim();
		logger.info(actualDiscText);
		Assert.assertEquals(expecteddiscText, actualDiscText);
	}
    
	public void verifyNzDisclaimerOpcoPage() {
		// Reading data from excel
		readFile.readDataFromExcel();
		String expecteddiscText = (String) readFile.data[24][20];
		logger.info(expecteddiscText);
		util.scrollTo("Disclaimers");
		util.click(opco_DisclaimerHeader);
		DriverWait.waitById("com.ihg.apps.android:id/opco__disclaimer_expandable_hidden");
		util.singleScroll();
		String disclaimerContent = opco_DisclaimerMsg.getAttribute("text");
		logger.info(disclaimerContent);
		String[] contentSplit = disclaimerContent.split("Check with hotel for details.");
		String actualDiscText = contentSplit[1].trim();
		logger.info(actualDiscText);
		Assert.assertEquals(expecteddiscText, actualDiscText);
	}
	
	public void verifynonAuNzDisclaimerOpcoPage() {
		// Reading data from excel
		readFile.readDataFromExcel();
		String expecteddiscText = (String) readFile.data[24][20];
		logger.info(expecteddiscText);
		util.scrollTo("Disclaimers");
		util.click(opco_DisclaimerHeader);
		DriverWait.waitById("com.ihg.apps.android:id/opco__disclaimer_expandable_hidden");
		util.singleScroll();
		String disclaimerContent = opco_DisclaimerMsg.getAttribute("text");
		logger.info(disclaimerContent);
        String[] contentSplit = disclaimerContent.split("Check with hotel for details.");
		String actualDiscText = contentSplit[1].trim();
		logger.info(actualDiscText);
		Assert.assertNotSame(expecteddiscText, actualDiscText);

	}
}