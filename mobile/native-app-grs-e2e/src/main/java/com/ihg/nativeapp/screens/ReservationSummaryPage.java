package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReservationSummaryPage extends DriverCapabilities {

    @AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
    public MobileElement reservationSummaryPage_HamburgerBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/custom_nav_membership_level")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_MembershipLevel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    public MobileElement reservationSummaryPage_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")
    public MobileElement reservationSummaryPage_UserName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_points")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_PointsNumber;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_image")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_UserNameImage;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_dark_gradient")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_HotelImg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_hotel_name")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_hotelName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_header_brand_name")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_hotelBrandName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_confirmation_number_label")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ConfirmationLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_confirmation_number")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ConfirmationNumber;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_view_modify")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ConfirmationModify;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_dates")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_BookingDates;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_estimated_points_label")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_EstimationLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_estimated_points")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_EstimationPoint;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__fragment_map")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ReservationMap;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__map_desc")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ReservationMapDesc;

    @AndroidFindBy(id = "com.ihg.apps.android:id/icon")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_SetStayPrefIcon;

    @AndroidFindBy(name = "Set Stay Preferences")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_SetStayPrefText;

    @AndroidFindBy(xpath = "//*[@resourceid='com.ihg.apps.android:id/set_stay_prefs']")
    public MobileElement reservationSummaryPage_SetStayPref;

    @AndroidFindBy(name = "Get the Insider's Guide")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_GuideText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/concierge_view_img")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_GuideImg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/concierge_view_descr")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_GuideDesc;

    @AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_HotelDetailIcon;

    //@AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/hotel_details_button\"]//android.widget.LinearLayout//android.widget.TextView[@text='HotelDetails']")
    // @iOSFindBy(name = "")
    @AndroidFindBy(xpath = "//*[text()=\"Hotel Details\"]")
    public MobileElement reservationSummaryPage_HotelDetailName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/trans_options_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_TransIcon;

  //  @AndroidFindBy(name = "Transportation Options")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TransportationOptions']")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_TransName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/things_to_do_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ThingstodoIcon;

   // @AndroidFindBy(name = "Things to Do")
    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Thingsto Do\"]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_ThingstodoName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/share_hotel_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_SharehotelIcon;

   // @AndroidFindBy(name = "Share Hotel")
    @AndroidFindBy(xpath = "//*[@text=\"ShareHotel\"]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_SharehotelName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/email_hotel_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_EmailHotelBtn;

  //  @AndroidFindBy(name = "Email Hotel")
    @AndroidFindBy(xpath = "//*[@text=\"EmailHotel\"]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_EmailHotelName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/phone_hotel_button")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_PhoneHotelBtn;

    //@AndroidFindBy(name = "Call Hotel")
    @AndroidFindBy(xpath = "//*[@text=\"CallHotel\"]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_PhoneHotelName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_current_month")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherMonth;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_month_hi_temp")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherHiTemp;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_month_low_temp")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherLowTemp;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_hi_label")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherHighLbl;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_hi")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherHighText;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_low_label")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherLowLbl;

    @AndroidFindBy(id = "com.ihg.apps.android:id/weather_checkin_low")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_WeatherLowText;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/reservation_details__do_the_math_interact_offer_framelayout\"]/android.webkit.WebView[1]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_InteractOffer;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/pager\"]/android.webkit.WebView[1]/android.webkit.WebView[1]")
    // @iOSFindBy(name = "")
    public MobileElement reservationSummaryPage_InteractPager;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_info_confirmation_number")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_ConfirmationNo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/confirmation_number_module__number")
    // @iOSFindBy(id="")
    public MobileElement reservationConfirmationPage_Confirmation_ModuleNo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_in")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_CheckInDate;

    @AndroidFindBy(id = "com.ihg.apps.android:id/arrow")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_Arrow;

    @AndroidFindBy(id = "com.ihg.apps.android:id/tv__check_out")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_CheckOutDate;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details__weather_container")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_Weather;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_module__current_charges")
    // @iOSFindBy(name = "")
    public MobileElement reservationConfirmationPage_CurrentCharges;

    @AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_guest_connect_offer")
    public MobileElement reservationSummaryPage_GuestConnectSlot;

    @AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_title")
    public MobileElement reservationSummaryPage_GuestConnectPopupHeader;

    @AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_message")
    public MobileElement reservationSummaryPage_GuestConnectPopuptext;

    @AndroidFindBy(name = "* Staybridge Suites Atlanta Airport is responsible for the advertised offer as well as fulfillment.  Guests must present offer at check-in to redeem.  Offer valid only at hotel operated gift shop(s).  Offer must be redeemed within 14 days of check-in date or prior to check-out, whichever comes first.  Only 1 offer per stay can be redeemed. This offer cannot be used in conjunction with other offers, promotions, or discounts.  Gratuity not included.  Void where prohibited.  Contact hotel for additional details.")
    public MobileElement reservationSummaryPage_GuestConnectpopuptextmsg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_fixed_message")
    public MobileElement reservationSummaryPage_GuestConnectCkin;

    @AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_btn_right")
    public MobileElement reservationSummaryPage_GuestConnectRedeemBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_btn_left")
    public MobileElement reservationSummaryPage_GuestConnectCloseBtn;

    public ReservationSummaryPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void correctPage() {

        try {
            DriverWait.waitByName("Set Stay Preferences");
            logger.info("PASS: Reservation Summary Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Reservation Summary Page is not loaded properly");
        }
    }

}
