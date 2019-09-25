package com.ihg.nativeapp.screens;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class HotelDetailsPage extends DriverCapabilities {

	public HotelDetailsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	@iOSFindBy(xpath = "//*[@name=\"NA_IHGHOTELDETAILSCONTROLLER\"]/button[1]")
	public MobileElement hotelDetail_BackBtn;

	// @AndroidFindBy(id = "")
	@AndroidFindBy(id= "com.ihg.apps.android:id/app_bar_logo")
	@iOSFindBy(xpath = "//*[@name=\"ihg-logo-header\"]")
	public MobileElement hotelDetail_IhgLogo;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/app_bar_sign_in_label")
	public MobileElement hotelDetail_SignInLabel;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"home_screen_navbar_account_button\"]")
	public MobileElement hotelDetail_AccBtn;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"BrandBannerCell_HotelPhoneButton\"]")
	public MobileElement hotelDetail_PhoneNoBtn;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"BrandBannerCell_BrandLogoImage\"]")
	public MobileElement hotelDetail_BrandLogo;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"ImageGridCell_GalleryView\"]")
	public MobileElement hotelDetail_HotelImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_name_view")
	@iOSFindBy(xpath = "//*[@label=\"IdentificationHotelCell_IdentificationName\"]")
	public MobileElement hotelDetail_Name;

	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__share_module_tv_hotel_name_address")
	// @iOSFindBy(name = "")
	public MobileElement hotelDetail_NameID;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_guest_connect_offer")	
	public MobileElement hotelDetail_GuestConnectSlot;
	
	@AndroidFindBy(id = "//*[@resource-id=\"com.ihg.apps.android:id/dialog_simple_alert__title\"]")	
	public MobileElement hotelDetail_GuestConnectPopupHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_alert__message")	
	public MobileElement hotelDetail_GuestConnectPopupText;
	
	@AndroidFindBy(name = "* Holiday Inn Ocala Conference Center is responsible for the advertised offer as well as fulfillment.  Present offer at check-in to redeem.  For alcoholic beverages, must be legal drinking age in country where hotel is located. Offer valid only at hotel operated bar(s).  Complimentary drink must be of equal or lesser value.  Offer must be redeemed within 14 days of check-in date or prior to check-out, whichever comes first.  Limit one per stay. This offer can't be combined with other offers, promotions, or discounts.  Gratuity not included.  Void where prohibited.  Contact hotel for additional details.")	
	public MobileElement hotelDetail_GuestConnectPopupTextmsg;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_alert__btn_ok")	
	public MobileElement hotelDetail_GuestConnectSlotPopupOkbtn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_alert__fixed_message")	
	public MobileElement hotelDetail_GuestConnectSlotPopupCkIn;

	// @AndroidFindBy(id =
	// "com.ihg.apps.android:id/hotel_detais_share_module__contact_btn")
	@AndroidFindBy(id = "com.ihg.apps.android:id/contact_hotel_view")
	@iOSFindBy(xpath = "//*[@label=\"SocialFeaturesCell_ContactHotelButton\"]")
	public MobileElement hotelDetail_ContactHotel;

	// @AndroidFindBy(id =
	// "com.ihg.apps.android:id/hotel_details__share_module_ib_share")
	@AndroidFindBy(id = "com.ihg.apps.android:id/share_hotel_icon")
	@iOSFindBy(xpath = "//*[@label=\"SocialFeaturesCell_ShareButton\"]")
	public MobileElement hotelDetail_Contact_Search;

	@AndroidFindBy(name = "Rooms  From")
	// @iOSFindBy(name = "")
	public MobileElement hotelDetail_RoomFrom;

	@AndroidFindBy(id = "com.ihg.apps.android:id/review_count_text")
	@iOSFindBy(xpath = "//*[@label=\"SocialFeaturesCell_ReviewLabel\"]")
	public MobileElement hotelDetail_Review;

	// @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__rating_bar")
	@AndroidFindBy(id = "com.ihg.apps.android:id/rating_bar")
	@iOSFindBy(xpath = "//*[@label=\"SocialFeaturesCell_RatingView\"]")
	public MobileElement hotelDetail_Rating;

	//@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_book_now_label")
	// @iOSFindBy(xpath = "//*[@label='BookButtonView_BookNowLabel']")
	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_select_room")
	@iOSFindBy(xpath = "//*[@label='BookButtonView_BookButton']")
	public MobileElement hotelDetail_BookNow;
	
	
	
//	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_message")
	@AndroidFindBy(xpath = "//*[@text=\"Free Night Available\"]")
	@iOSFindBy(xpath = "//*[@label='BookButtonView_BookButton']")
	public MobileElement hotelDetail_BookNow_Freenights;
	
	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_select_room")
	// @iOSFindBy(xpath = "//*[@label='BookButtonView_BookNowLabel']")
	@iOSFindBy(xpath = "//*[@label='BookButtonView_BookButton']")
	public MobileElement hotelDetail_SelectRoom_BookNow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
	@iOSFindBy(xpath = "//*[@label=\"ReservationModuleCell_CheckInLabel\"]")
	public MobileElement hotelDetail_CheckInDate;

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@label=\"ReservationModuleCell_SeparatorArrow\"]")
	public MobileElement hotelDetail_DatesSeparatorArrow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
	@iOSFindBy(xpath = "//*[@label=\"ReservationModuleCell_CheckOutLabel\"]")
	public MobileElement hotelDetail_CheckOutDate;

	// @AndroidFindBy(id =
	// "com.ihg.apps.android:id/hotel_details__rate_type_tv")
	@AndroidFindBy(id = "com.ihg.apps.android:id/rate_name_view")
	@iOSFindBy(xpath = "//*[@label=\"ReservationModuleCell_RateLabel\"]")
	public MobileElement hotelDetail_RateType;

	@AndroidFindBy(id = "com.ihg.apps.android:id/arrow_icon")
	@iOSFindBy(xpath = "//*[@label=\"ReservationModuleCell_Arrow\"]")
	public MobileElement hotelDetail_RateArrow;

	// @AndroidFindBy(id = "com.ihg.apps.android:id/book_now_start_price")
	@AndroidFindBy(id = "com.ihg.apps.android:id/book_now_price")
	// @iOSFindBy(name = "")
	public MobileElement hotelDetail_PriceValue;

	@AndroidFindBy(name = "Things To Do")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_ThingsToDo;

	@AndroidFindBy(name = "Transportation")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_Transportation;

	@AndroidFindBy(name = "Languages")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_Languages;

	@AndroidFindBy(name = "Credit Cards")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_Cc;

	@AndroidFindBy(name = "Accessibility & Special Needs")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_Accessibility;

	@AndroidFindBy(id = "com.ihg.apps.android:id/banner_icon")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_SPHotel_BannerIcon;
	
	@AndroidFindBy(name = "Notices")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_Notices;
	
	@AndroidFindBy(name = "• Please note that the rate shown in this currency is for reference only. At check-out you will be billed in the local currency using the DICOM exchange rate.")
	// @iOSFindBy(name = "")
	public MobileElement hotelDetail_VenezuelaDisclaimer;
	
	@AndroidFindBy(name = "• No weapons allowed on property")
	// @iOSFindBy(xpath = "")
	public MobileElement hotelDetail_NoticesUsGunLaw;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details__fragment_map")	
	public MobileElement hotelDetail_MapLayout;
	
	//com.ihg.apps.android:id/search_results_navigation_button
	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_stay_details_view")	
	public MobileElement hotel_stay_details_view;
	
	Utility util = new Utility();
	
	PushNotificationPopUp pushNotificationUser = new PushNotificationPopUp(innerDriver);
	
	public void handleIHGLovePushNotification() throws InterruptedException {
		// reportiumClient.stepStart("Handling Push Notification PopUp");
		try {
			DriverWait.staticWait();
			//Do you Love IHG App Pop up is displayed
			pushNotificationUser.pushNotificationPopUp_IHGBranded.isDisplayed();
			util.click(pushNotificationUser.pushNotificationPopUp_IHGBranded_Yes);
			
			//Share the love pop is displayed
			pushNotificationUser.pushNotificationPopUp_ShareTheLove.isDisplayed();
			util.click(pushNotificationUser.pushNotificationPopUp_ShareTheLove_Never);
			
		} catch (NoSuchElementException e) {

		}
		// reportiumClient.stepEnd("Handling Push Notification PopUp");
	}
	

	public void correctPage() {

		try {
			DriverWait.waitByElementName(this.hotel_stay_details_view);
			logger.info("PASS: Hotel Details Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Hotel Details Page is not loaded properly");
		}
	}
	
	public void correctPageFreeNights() {

		try {
			DriverWait.waitByName("Free Nights");
			logger.info("PASS: Free Nights on Hotel Details Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Free Nights Page is not loaded properly");
		}
}
}