package com.ihg.nativeapp.screens;


import java.io.IOException;

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
public class ReviewReservationPage extends DriverCapabilities {

    Utility util = new Utility();

    ReadingFromFile readFile = new ReadingFromFile();
    @AndroidFindBy(id = "//*[@contentDesc='Navigate up']")
    @iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/button[1]")
    public MobileElement opco_BackBtn;

    @AndroidFindBy(xpath = "//*[@contentDesc=\"Navigate up\"]")
    @iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/button[1]")
    public MobileElement opco_TermBackBtn;

    @AndroidFindBy(xpath = "//*[@resourceid='com.ihg.apps.android:id/app_bar']//*[@class='android.widget.ImageView']")
    @iOSFindBy(xpath = "//*[@label=\"OPCOViewController\"]/image[1]")
    public MobileElement opco_HotelBrandLogo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_image")
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

    @AndroidFindBy(id = "//*[text()='Modification and Cancellation Policy']")
    @iOSFindBy(xpath = "//*[@label=\"Cancellation Policy:\"]")
    public MobileElement opco_CancellationPolicy;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancellation_policy")
    @iOSFindBy(xpath = "//*[@label=\"Non Refundable. Canceling your reservation or failing to show will result in a charge for 1 night per room to your credit card. Taxes may apply. Failing to call or show before check-out time after the first night of a reservation will result in cancellation of the remainder of your reservation.  \"]")
    public MobileElement opco_CancellationPolicyDetail;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_hotel_name")
    @iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelTitle\"]")
    public MobileElement opco_HotelInfoName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_room_information")
    @iOSFindBy(xpath = "//*[@label=\"OPCOHotelInformationCell_LabelDetail\"]")
    public MobileElement opco_Guest_Room;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_room_type")
    @iOSFindBy(xpath = "//*[@label=\"OPCORoomInformationCell_RoomInformationLabel\"]")
    public MobileElement opco_Room;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_rate_type")
    @iOSFindBy(xpath = "//*[@label=\"OPCOHotelRateCell_LabelRateTitle\"]")
    public MobileElement opco_RateType;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_rate_refundable_tag")
    // @iOSFindBy(xpath = "")
    public MobileElement opco_RateRefundableTag;

    @AndroidFindBy(xpath = "//*[@resource-id='com.ihg.apps.android:id/points_estimator_header']/android.widget.ImageView[1]")
    @iOSFindBy(xpath = "//*[@label=\"OPCOPointsEstimateCell\"]")
    public MobileElement opco_PointsEstimate_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_opco_anonymous_earned_points_tv")
    // @iOSFindBy(xpath = "")
    public MobileElement opco_PointsEstimate_Anonymous_EarnPointsText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/guest_info_points_estimate_header")
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

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_charge_estimated_total")
    @iOSFindBy(xpath = "//*[@label=\"OPCOHotelPriceCell_LabelDescription\"]")
    public MobileElement opco_EstimatedPrice;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_charge_cost")
    @iOSFindBy(xpath = "//*[@label=\"OPCOHotelPriceCell_TotalView\"]")
    public MobileElement opco_CurrencyValue;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_summary_charge_currency_code")
    // @iOSFindBy(name = "")
    public MobileElement opco_CurrencyType;

    @AndroidFindBy(id = "com.ihg.apps.android:id/payment_option_name")
    public MobileElement reviewReservation_PaymentOption;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancellation_checkin_label")
    public MobileElement opco_CheckInTimeLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancellation_checkin_time")
    @iOSFindBy(xpath = "//*[@label=\"Check In Time\"]")
    public MobileElement opco_CheckInTime;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancellation_checkout_label")
    public MobileElement opco_CheckOutTimeLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancellation_checkout_time")
    @iOSFindBy(xpath = "//*[@label=\"Check Out Time\"]")
    public MobileElement opco_CheckOutTime;

    @AndroidFindBy(id = "com.ihg.apps.android:id/terms_and_conditions_label")
    @iOSFindBy(xpath = "//*[@name=\"na_terms_and_conditions_view\"]")
    public MobileElement opco_TnCLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/bullet")
    // @iOSFindBy(name = "")
    public MobileElement opco_TnCBullets;

    @AndroidFindBy(id = "com.ihg.apps.android:id/terms_description")
    public MobileElement opco_TnCDesc;

    @AndroidFindBy(xpath = "//*[text()='Terms of Use']")
    @iOSFindBy(name = "OPCOTermsAndConditionsCell_TermsListView")
    public MobileElement opco_TnC_Msg1;

    @AndroidFindBy(xpath = "//*[text()='Privacy Statement']")
    public MobileElement opco_TnC_Msg2;

    @AndroidFindBy(xpath = "//*[text()='Rate Description and Rate Rules']")
    public MobileElement reviewRes_RateRulesLink;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_additionl_charges_header")
    public MobileElement reviewRes_AdditionalChargesLink;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_additional_charges_body")
    public MobileElement reviewRes_AdditionalChargesMsg;

    @AndroidFindBy(name = "J’ai lu et compris la description des tarifs et règles de tarification pour ma réservation.")
    // @iOSFindBy(name = "")
    public MobileElement opco_TnC_Msg2_fr;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_disclaimer_header")
    @iOSFindBy(xpath = "//*[@label=\"OPCODisclaimerCell_BorderView\"]")
    public MobileElement opco_DisclaimerHeader;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_disclaimer_body")
    @iOSFindBy(name = "na_disclaimer_Cell")
    public MobileElement opco_DisclaimerMsg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_book_now")
    @iOSFindBy(xpath = "//*[@label=\"Book Now\"]")
    public MobileElement opco_BookBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_book_now")
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

    @AndroidFindBy(id = "com.ihg.apps.android:id/terms_and_conditions_checkbox")
    @iOSFindBy(id = "//*[@label='TRAcceptSwitchAccessibilityLabel']")
    public MobileElement guestInfo_TnC;

    @AndroidFindBy(name = "How would you prefer to reserve your room?")
    @iOSFindBy(id = "")
    public MobileElement opco_NonGuaranteeBooking_Heading;

    @AndroidFindBy(xpath = "//*[@resource-id='com.ihg.apps.android:id/review_reservation_payment_options']/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RadioButton[1]")
    public MobileElement opco_NonGuaranteeBooking_ReserveWithCardRadioBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/non_guarantee_booking_reserve_with_payment_message")
    @iOSFindBy(id = "")
    public MobileElement opco_NonGuaranteeBooking_ReserveWithCardMsg;

    @AndroidFindBy(id = "//*[@resource-id='com.ihg.apps.android:id/option_view']//*[@resource-id='com.ihg.apps.android:id/payment_option_radio_btn']")
    public MobileElement opco_NonGuaranteeBooking_ReserveWithoutCardRadioBtn;

    @AndroidFindBy(xpath = "//*[@resource-id='com.ihg.apps.android:id/descriptive_text']")
    @iOSFindBy(id = "")
    public MobileElement opco_NonGuaranteeBooking_ReserveWithoutCardMsg;
   
  //*[@resourceid="android:id/text1" and text()="Payment Card Type"]
    //As review reservation page is updated
    @AndroidFindBy(xpath = "//*[@resourceid=\"android:id/text1\" and @text=\"Payment Card Type\"]")
    @iOSFindBy(id = "//*[@label='ccType']")
    public MobileElement guestInfo_PaymentInfo_CcType;

    @AndroidFindBy(name = "AMERICAN EXPRESS")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PaymentInfo_CcSelect;

    @AndroidFindBy(id = "com.ihg.apps.android:id/card__number")
    @iOSFindBy(name = "//*[@label='ExpandedPaymentCell_CreditCardNumberField']")
    public MobileElement guestInfo_PaymentInfo_CcInput;

    @AndroidFindBy(name = "MM")
    @iOSFindBy(name = "//*[@label='ccMonth']")
    public MobileElement guestInfo_PaymentInfo_Month;

    @AndroidFindBy(name = "Jun")
    @iOSFindBy(id = "//*[@label='Done']")
    public MobileElement guestInfo_PaymentInfo_Month_Select;

    @AndroidFindBy(name = "YY")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_Year;

    @AndroidFindBy(name = "2020")
    // @iOSFindBy(name = "")
    public MobileElement guestInfo_PaymentInfo_Year_Select;
    

    @AndroidFindBy(id = "com.ihg.apps.android:id/view_guest_information_continue")
    public MobileElement ContinueOnGuestInfo;
    
   
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/add_edit_card_link")
    public MobileElement AddCard;
    
    public ReviewReservationPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void acceptTnC() {

        if ((Platform1.equalsIgnoreCase("Android"))) {
            util.scrollTo("I certify that:");
            util.click(guestInfo_TnC);
        } else {
            //util.iOSSwipe("//*[@label='TRAcceptSwitchAccessibilityLabel'and @visible='true']");
            //util.click(guestInfo_TnC);
        }

    }

    public void OPCOentercc(String month) throws IOException, InterruptedException {
    	
    	String cCNo = "4111111111111111";
    	
    	this.util.scrollTo("Debit/Credit Card");
        //Click on Add Card
		try {
			this.AddCard.click();
		} catch (Exception e) {
			logger.info("Add card option already clicked/not available");
			
		}
        //util.singleScroll();
        DriverWait.staticWait();
        this.util.scrollTo("MM");
        this.util.scrolltoElement(this.guestInfo_PaymentInfo_CcType);
        this.guestInfo_PaymentInfo_CcType.click();
        this.guestInfo_PaymentInfo_CcSelect.click();
        this.util.enterTextinField(this.guestInfo_PaymentInfo_CcInput, cCNo);
        DriverWait.staticWait();
        util.scrolltoElement( this.guestInfo_PaymentInfo_Month);
        this.guestInfo_PaymentInfo_Month.click();
        this.guestInfo_PaymentInfo_Month_Select.click();
        DriverWait.staticWait();
        this.guestInfo_PaymentInfo_Year.click();
        this.guestInfo_PaymentInfo_Year_Select.click();

      }
    
    
    
    
    public void clickBookNow() {
        if ((Platform1.equalsIgnoreCase("Android"))) {
            util.scrollTo("Book Now");
            util.click(opco_BookBtn);
        } else {
            //util.iOSSwipe("//*[@label='Book Now'and @visible='true']");
            //util.click(opco_BookBtn);
        }

    }

    public void correctPage() {

        try {
            DriverWait.waitByName("Estimated Total");
            logger.info("PASS: Opco Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Opco Page is not loaded properly");
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
}