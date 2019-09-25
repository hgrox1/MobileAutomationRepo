package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class PastStays extends DriverCapabilities {

	public PastStays(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Past Stays")
	// @iOSFindBy(name = "navigation_back_bttn")
	public MobileElement pastStays_title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
	// @iOSFindBy(name = "homescreen_find_hotel_bttn")
	public MobileElement pastStays_hotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_brand_icon")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelIcon;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/stays_item__date")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_tripDate;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_checkInDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_checkOutDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_details_hotel_info_button")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelInfoBlade;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stays__hotel_bill")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelBillBlade;

	@AndroidFindBy(name = "Write a Review")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_writeReviewBlade;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_detail_book_again_button")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bookAgnBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__banner_icon")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelDetailsBrandIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/contact_hotel_view")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelContactDetails;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__rate_type_tv")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bestAvailLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__rate_ic_arrow")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bestAvailIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__share_module_tv_hotel_name_address")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelAddress;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_detais_share_module__contact_btn")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_contactBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__share_module_ib_share")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_shareIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__location_banner_address")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bannerAddress;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__high_amenities_ic_expanded")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_expandIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__high_amenities_internet_member_only")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_freeInternetTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/complex_elipsize_expand_view__expanded")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_parkingTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/complex_elipsize_expand_view__expanded")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_petPolicyTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/separate_vertical__checkin_tv")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_checkInTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/separate_vertical__checkout_tv")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_checkOutTime;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__book_now_start_price_value_tv")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_startPrice;

	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_book_now_label")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bookNowLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__flow_header_second")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_rateAvailable;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_backBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_cancel")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_cancelBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelBillTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay__hotel_bill_hotel_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelBillName;

	@AndroidFindBy(name = "Confirmation Number:")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_confNumber;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay__hotel_bill_confirmation_number")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_confNumberValue;

	@AndroidFindBy(name = "Date / Description")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_billDateLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stays__hotel_bill__amount")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_billAmountLbl;

	@AndroidFindBy(name = "Terms and Conditions")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_termsCondLbl;

	@AndroidFindBy(name = "The electronic version of your final hotel bill will be available within 72 hours of your check-out time. The bill will reflect any changes made through 11 PM on your check-out date. Adjustments after that time may not be shown. The hotel retains official records of all charges and credits to your account and will only honor those records. Most hotels are independently owned and/or operated. Hotel bills will be available for up to 6 months following your stay. You will continue to receive a paper copy of your bill upon check-out.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_termsCondTxt;

	@AndroidFindBy(name = "Send Copy to Email")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_sendCopyTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay__hotel_bill__send_email_input")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_billEmail;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_hotel_bill_send_btn")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_sendBtn;
	
	@AndroidFindBy(name = "No Rooms Available")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_NoRoomAvailableBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_titled_title")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_popupTitle;

	@AndroidFindBy(name = "Your hotel bill has now been sent to your email address")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_popupMsg;

	@AndroidFindBy(name = "OK")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_popupOkBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__rooms")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_roomCriteria;

	@AndroidFindBy(name = "Error")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_emailErrorTitle;

	@AndroidFindBy(name = "Please enter your email address in a valid format (example@example.com).")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_emailErrorMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_titled_btn_ok")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_emailErrorOk;

	@AndroidFindBy(name = "Sign in to view your past stays.")
	@iOSFindBy(name = "Sign In to view your past stays.")
	public MobileElement pastStays_noPastStayTxt;
	
	@AndroidFindBy(name = "You have no past stays.")
	// @iOSFindBy(name = "")
	public MobileElement pastStays_noPastStayTxtlogin;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stays__login")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_loginTxt;

	@AndroidFindBy(name = "Join Now")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_joinNowTxt;

	@AndroidFindBy(name = "Find a Hotel")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_findHotelBtn;

	@AndroidFindBy(name = "Start planning a new trip now.  Find a Hotel to begin.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_startPlanningTxt;

	@AndroidFindBy(name = "Tap Find a Hotel to begin.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_findHotelTxt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_details_earnings_button")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_earnPts;

	@AndroidFindBy(name = "Languages")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_languageBlade;

	@AndroidFindBy(name = "Credit Cards")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_creditCardBlade;

	@AndroidFindBy(name = "Accessibility & Special Needs")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_accessibilityBlade;

	@AndroidFindBy(name = "The room type you stayed in last time was not available. We tried to find a similar room type for you.  If you wish to change the room type simply tap the room on this page.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_roomUnavailableText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_btn_ok")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_confirmationBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_hotelNameBooking;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_guest_room")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_guestInfo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_room_type")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_roomType;

	@AndroidFindBy(id = "com.ihg.apps.android:id/opco__hotel_information_rate_type")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_rateType;

	@AndroidFindBy(name = "Cancellation Policy  Non-Refundable. Canceling your reservation or failing to show will result in a charge for 1 night per room to your credit card. Taxes may apply. Failing to call or show before check-out time after the first night of a reservation will result in cancellation of the remainder of your reservation. ")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_cancelPolicy;

	@AndroidFindBy(name = "I am at least 18 years of age and that at least one guest in my party will be at least 18 years of age upon check in.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_term1;

	@AndroidFindBy(name = "I have read and understand the rate description and rate rules for my reservation.")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_term2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/reserve_bow__book_bow_btn")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_swipeBookBtn;

	@AndroidFindBy(name = "Congratulations!")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_congrtsText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/stay_pref__set_preferences_btn")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_msgBody;

	@AndroidFindBy(id = "com.ihg.apps.android:id/stay_pref__view_reservation_btn")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_viewReservation;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_earned_points__hotel_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_earnPtsHotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_earned_points__number_nights")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_nightsCount;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_earned_points__activity_points")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_activityPts;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_earned_points__base_points")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_basePts;

	@AndroidFindBy(id = "com.ihg.apps.android:id/past_stay_earned_points__bonus_points")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement pastStays_bonusPts;
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")	
	public MobileElement pastStays_btnHamburger;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")	
	public MobileElement pastStays_appLogo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")	
	public MobileElement pastStays_SignInLbl;

}