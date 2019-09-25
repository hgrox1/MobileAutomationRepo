package com.ihg.nativeapp.screens;

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

public class ReservationDetailsPage extends DriverCapabilities {

	public ReservationDetailsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	ReadingFromFile readFile = new ReadingFromFile();
	Utility util = new Utility();
	
	

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_brand_name")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_HotelBrandName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_HotelName;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_dark_gradient")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_HotelImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_light_gradient")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_ImageFirstHalf;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_image")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_ImageSecondHalf;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_confirmation_header")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ConfirmationLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_confirmation_number")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ConfirmationNumber;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_view_modify")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ConfirmationDetail;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_dates")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_BookingDates;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_in_date")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckInDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_estimated_points_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EstimationLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_estimated_points")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EstimationPoint;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__fragment_map")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ReservationMap;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__map_desc")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ReservationMapDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/icon")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_SetStayPrefIcon;

	@AndroidFindBy(name = "Set Stay Preferences")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_SetStayPrefText;
	
	@AndroidFindBy(name = "Get the Insider's Guide")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_GuideText;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/concierge_view_img")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_GuideImg;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/concierge_view_descr")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_GuideDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_HotelDetailIcon;

	@AndroidFindBy(name = "Hotel Details")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_HotelDetailName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/trans_options_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_TransIcon;

	@AndroidFindBy(name = "Transportation Options")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_TransName;
	

	@AndroidFindBy(id = "com.ihg.apps.android:id/things_to_do_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ThingstodoIcon;

	@AndroidFindBy(name = "Things to Do")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ThingstodoName;

	@AndroidFindBy(id= "com.ihg.apps.android:id/share_hotel_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_SharehotelIcon;

	@AndroidFindBy(name = "Share Hotel")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_SharehotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/email_hotel_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EmailHotelBtn;

	@AndroidFindBy(name = "Email Hotel")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EmailHotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/phone_hotel_button")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_PhoneHotelBtn;

	@AndroidFindBy(name = "Call Hotel")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_PhoneHotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_date")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherChckin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/current_weather_temperature")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherTemp;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_weather_img")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherImp;

	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_hi_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherHighLbl;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_hi")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherHighText;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_low_label")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherLowLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_low")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_WeatherLowText;	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/redeem_header")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RedeemHeader;
	
	@AndroidFindBy(name = "Dream Vacation")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_DreamVacation;
	
	@AndroidFindBy(name = "Enticing Gifts")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EnticingGift;
	
	@AndroidFindBy(name = "Digital Rewards")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_DigitalRewards;
	
	@AndroidFindBy(name = "Get a $50.00 Statement Credit after first purchase.* *Price of stay and statement credit may post on separate statements. Price For This Stay: 155.80 Statement Credit: - 50.00 Total After Statement Credit: 105.80 Plus earn Platinum Elite Points with every purchase. ")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_FirstPurchaseCreditText;
	
	@AndroidFindBy(name = "As exchange rates may fluctuate from the time a reservation is made until the actual stay, the confirmed rate is guaranteed in the hotel's base currency.  ‡ As taxes and service charges may fluctuate from the time a reservation is made until the actual stay and during the actual stay, the Total Price is an estimate. Estimated price includes Room rate, Extra person charges, Total tax and Total hotel charges. Other hotel-specific service charges may also apply. Check with hotel for details.")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_DisclaimerDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_cancel_reservation")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CancelReservationBtn;

	@AndroidFindBy(name = "Transportation")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Transportation;

	@AndroidFindBy(name = "Things To Do")
	@iOSFindBy(xpath = "//*[@name=\"Transportation\" and @class=\"UIATableCell\"]/button[3]")
	public MobileElement reservationDetailPage_ThingsToDo;

	@AndroidFindBy(name = "Transporte")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Transportation_pt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__hertz_logo")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Hertz_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__hertz_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Hertz_Label;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__hertz_sub_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Hertz_SubLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__empty_view")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_NoHertz_Empty;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_logo")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ihgLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_action__email")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_EmailIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_action__phone")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_PhoneIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_action__share")
	@iOSFindBy(name = "navigation_view")
	public MobileElement reservationDetailPage_ShareIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_opco_anonymous_earned_points_tv")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_pointsCountAnonymousText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_sign_in_to_earn_bt")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_signInBtn;

	@AndroidFindBy(name = "Not a Member?")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_notMemberTitle;

	@AndroidFindBy(name = "Sign up using information from this reservation.")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_notMemberText1;

	@AndroidFindBy(name = "Why you should join")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_notMemberText2;

	@AndroidFindBy(name = "• Free Internet worldwide • Earn and redeem points at over 5,000 hotels worldwide • Combine points and cash for faster rewards")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_notMemberText3;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate__join_now__join")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_joinNowBtn;

	@AndroidFindBy(name = "Estimated Miles:")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_milesLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/miles_estimate_earned_points")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_milesValue;

	@AndroidFindBy(id = "com.ihg.apps.android:id/airline_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_airlinesName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_label")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_pointsLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_estimate_earned_points")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_pointsValue;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_view_res")
	@iOSFindBy(xpath = "//*[@label=\"View Reservation\"]")
	public MobileElement reservationDetailPage_viewReservation;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_confirmation_number_label")	
	//*[@resourceid="com.ihg.apps.android:id/dialog_reservation_confirmation_confirmation_number"]
	@iOSFindBy(name = "na_reservationdetails_confirmation_cell")
	public MobileElement reservationDetailPage_confId;
	
	/*@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_confirmation_number")	
	public MobileElement reservationDetailPage_confId;*/

	@AndroidFindBy(name = "Reservation Details")
	@iOSFindBy(xpath = "//*[@label=\"Reservation Details\"]")
	public MobileElement reservationDetailPage_title;
	

	@AndroidFindBy(id="com.ihg.apps.android:id/disclaimers_title")
	@iOSFindBy(name="")
	public MobileElement reservationDetailPage_DisclaimerHeader;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/disclaimers_content")
	@iOSFindBy(name="")
	public MobileElement reservationDetailPage_DisclaimerMsg;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/reservation_details_modify_reservation")
	@iOSFindBy(name="")
	public MobileElement reservationDetailPage_ModifyResveration;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/check_in_day_of_month")
	@iOSFindBy(name="")
	public MobileElement reservationDetailPage_CheckInDayOfMonth;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/modify_reservation_check_availability")
	@iOSFindBy(name="")
	public MobileElement reservationDetailPage_CheckAvailabilty;
	        

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_modify_reservation")
	//@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_view_modify")
	@iOSFindBy(xpath = "")
	public MobileElement reservationDetailPage_modifyReservationBtn;
	
	//com.ihg.apps.android:id/reservation_info_view_modify

	@AndroidFindBy(name = "Navigate up")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Title;



	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_date_arrow")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_Arrow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_out_date")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckOutDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_in_time_header")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckInTimeLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_in_time")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckInTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_out_time_header")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckOutTimeLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_check_out_time")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CheckOutTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_rooms_and_guests")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RoomsAndGuests;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_guest_names_header")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_GuestNameLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_guest_names")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_GuestName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_room_name")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RoomName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_rate_name")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RateName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_refundable_tag")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RefundableTag;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_rate_separator")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RateSeparatorLine;

	@AndroidFindBy(name = "Room Charges")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_RoomChargesHeading;

	@AndroidFindBy(name = "Average Nightly Rate")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_AverageNightlyRateTitle;

	@AndroidFindBy(name = "Number of Nights")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_NumberOfNightsTitle;

	@AndroidFindBy(name = "Estimated Service Charges")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EstimatedServiceChargesTitle;

	@AndroidFindBy(name = "Estimated Taxes")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EstimatedTaxesTitle;

	@AndroidFindBy(name = "Estimated Total Price")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_EstimatedTotalPriceTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_confirmation_guest_names")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_UserName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/room_charges__card")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_UserCard;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_information_details__cancellation_policy_tv")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_CancellationPolicy;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_cancellation_policy_header")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ModifyCancellationPolicy;
	
	@AndroidFindBy(name = "Refundable. Canceling your reservation before 6:00 PM (local hotel time) on Monday, 18 September, 2017 will result in no charge. Canceling your reservation or failing to show will result in a charge for 1 night per room to your credit card. Taxes may apply. Failing to call or show before check-out time after the first night of a reservation will result in cancellation of the remainder of your reservation. ")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_ModifyCancellationPolicyDesc;

	/*@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_additional_charges_header")*/
	@AndroidFindBy(id = "	com.ihg.apps.android:id/additional_charges_title")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_AdditionalChargesMayApplyText;

	/*@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_additional_charges_body")*/
	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_charges_content")
	// @iOSFindBy(name = "")
	public MobileElement reservationDetailPage_AdditionalChargesMayApplyDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/disclaimers_title")
	//@iOSFindBy(name = "")
	public MobileElement reservationDetailPage_DisclaimerText;



	public void correctPage() {

		try {
			DriverWait.waitById("com.ihg.apps.android:id/set_stay_prefs");
			logger.info("PASS: Res Details Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Res Details Page is not loaded properly");
		}
	}
	
	public void verifyAuDisclaimerReservationPage() {
		// Reading data from excel
		readFile.readDataFromExcel();
		String expecteddiscText = (String) readFile.data[23][21];
		logger.info(expecteddiscText);
		util.scrollTo("Disclaimers");
		util.click(reservationDetailPage_DisclaimerHeader);
		DriverWait.waitById("com.ihg.apps.android:id/disclaimers_content");
		util.singleScroll();
		String disclaimerContent = reservationDetailPage_DisclaimerMsg.getAttribute("text");
		logger.info(disclaimerContent);
		String[] contentSplit = disclaimerContent.split("Check with hotel for details.");
		String actualDiscText = contentSplit[1].trim();
		logger.info(actualDiscText);
		Assert.assertEquals(expecteddiscText, actualDiscText);
	}
	
	public void verifyNzDisclaimerReservationPage() {
		// Reading data from excel
		readFile.readDataFromExcel();
		String expecteddiscText = (String) readFile.data[24][21];
		logger.info(expecteddiscText);
		util.scrollTo("Disclaimers");
		util.click(reservationDetailPage_DisclaimerHeader);
		DriverWait.waitById("com.ihg.apps.android:id/disclaimers_content");
		util.singleScroll();
		String disclaimerContent = reservationDetailPage_DisclaimerMsg.getAttribute("text");
		logger.info(disclaimerContent);
		String[] contentSplit = disclaimerContent.split("Check with hotel for details.");
		String actualDiscText = contentSplit[1].trim();
		logger.info(actualDiscText);
		Assert.assertEquals(expecteddiscText, actualDiscText);
	}

	
}
