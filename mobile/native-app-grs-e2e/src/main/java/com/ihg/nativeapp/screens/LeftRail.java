package com.ihg.nativeapp.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadingFromFile;

public class LeftRail extends DriverCapabilities {

	public LeftRail(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_ihg_logo")
	@iOSFindBy(xpath = "//*[@label=\"ihg main\"]")
	public MobileElement leftRail_IhgLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_anon_user_sign_in")
	@iOSFindBy(name = "Sign In")
	public MobileElement leftRail_SignInText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_join_now")
	@iOSFindBy(xpath = "//*[@label=\"Not a member? Join Now.\"]")
	public MobileElement leftRail_JoinNow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_find_hotel")
	@iOSFindBy(xpath = "//*[@label=\"Find a Hotel\"]")
	public MobileElement leftRail_FindHotel;

	@AndroidFindBy(id = "android:id/home")
	@iOSFindBy(xpath = "//*[@label='left_menu_find_hotel_bttn']")
	public MobileElement leftRail_FindHotelHamburger;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_upcoming_stays_title")
	@iOSFindBy(xpath = "//*[@label='Upcoming Stays']")
	public MobileElement leftRail_UpcomingStayText;

	@AndroidFindBy(name = "Past Stays")
	@iOSFindBy(xpath = "//*[@label=\"Past Stays\"]")
	public MobileElement leftRail_PastStays;

	@AndroidFindBy(xpath = "//*[@text=\"Stays\"]")
	//@AndroidFindBy(id = "com.ihg.apps.android:id/menu_item_stays_title")
	@iOSFindBy(name = "Stays")
	public MobileElement leftRail_Stays;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_item_stays_count")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_UpComingHotelCount;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_upcoming_stay_hotel_name")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_UpComingHotelName;
	

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_upcoming_stay_checkin_date")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_UpComingHotelCheckinDate;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_user_name")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_MemberName;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_member_level")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_MemberLevel;
    
	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_member_number")
	//@iOSFindBy(xpath = "//*[@label=\"Stays (6 upcoming)\"]")
	public MobileElement leftRail_MemberNumber;
	
	@AndroidFindBy(name = "Encontrar reserva")
	@iOSFindBy(xpath = "//*[@label='Find Reservation']")
	public MobileElement leftRail_FindReservation_Pt;

	@AndroidFindBy(name = "预订")
	// @iOSFindBy(name = "navigation_back_bttn")
	public MobileElement leftRail_FindReservation_ch;

	// @AndroidFindBy(xpath = "//*[text()='']")
	// @iOSFindBy(name = "homescreen_find_hotel_bttn")
	// public MobileElement leftRail_MessagesIcon;

	@AndroidFindBy(name = "MESSAGES")
	@iOSFindBy(xpath = "//*[@label='MESSAGES']")
	public MobileElement leftRail_MessagesText;

	@AndroidFindBy(name = "消息")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_MessagesText_ch;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_messages_title")
	@iOSFindBy(xpath = "//*[@label='Messages and Alerts']")
	public MobileElement leftRail_MessagesAndAlerts;

	// @AndroidFindBy(xpath = "")
	// @iOSFindBy(name = "navigation_view")
	// public MobileElement leftRail_ExploreIcon;

	@AndroidFindBy(name = "EXPLORE")
	@iOSFindBy(xpath = "//*[@label='EXPLORE']")
	public MobileElement leftRail_ExploreText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_offers")
	@iOSFindBy(xpath = "//*[@label=\"Offers\"]")
	public MobileElement leftRail_Offers;

	@AndroidFindBy(name = "优惠")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_Offers_ch;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	@iOSFindBy(xpath = "//*[@label='navigation_back_bttn']")
	public MobileElement leftRail_BackArrowCustService;

	@AndroidFindBy(id = "android:id/home")
	@iOSFindBy(xpath = "//*[@label='navigation_back_bttn']")
	public MobileElement leftRail_BackArrow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_our_brands")
	@iOSFindBy(xpath = "//*[@label=\"Our Brands\"]")
	public MobileElement leftRail_OurBrands;

	@AndroidFindBy(name = "我们的品牌")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_OurBrands_ch;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_close_button")
	@iOSFindBy(xpath = "//*[@label=\"BrandSlider_CrossButton\"]")
	public MobileElement leftRail_CloseIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_travel_tools")
	@iOSFindBy(xpath = "//*[@label=\"Travel Tools\"]")
	public MobileElement leftRail_TravelTools;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_item__image")
	@iOSFindBy(xpath = "//*[@label='A Different Way to Stay']")
	public MobileElement leftRail_KimptonImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_confirmation_btn_left")
	@iOSFindBy(xpath = "//*[@label='Go Back']")
	public MobileElement leftRail_Kimpton_GoBack_btn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_item__title")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_KimptonSubTitle;

	// @AndroidFindBy(xpath = "//*[text()='']")
	// @iOSFindBy(name = "navigation_view")
	// public MobileElement leftRail_SupportIcon;

	@AndroidFindBy(name = "SUPPORT")
	@iOSFindBy(xpath = "//*[@label='SUPPORT']")
	public MobileElement leftRail_SupportText;

	@AndroidFindBy(name = "支持")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_SupportText_ch;

	@AndroidFindBy(name = "Feedback")
	@iOSFindBy(xpath = "//*[@label='Feedback']")
	public MobileElement leftRail_Feedback;

	@AndroidFindBy(name = "反馈")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_Feedback_ch;

	@AndroidFindBy(id = "com.ihg.apps.android:id/feedbackDismissBtn")
	@iOSFindBy(xpath = "//*[@label='FeedbackView_DismissButton']")
	public MobileElement leftRail_FeedbackDismiss;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_customer_care")
	@iOSFindBy(name = "Customer Care")
	public MobileElement leftRail_CustomerService;

	@AndroidFindBy(name = "服务中心")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_CustomerService_ch;

	@AndroidFindBy(name = "AdChoices")
	@iOSFindBy(xpath = "//*[@label='AdChoices']")
	public MobileElement leftRail_AdChoicesText;

	@AndroidFindBy(name = "AdChoices")
	@iOSFindBy(name = "AdChoices")
	public MobileElement leftRail_AdChoices;

	@AndroidFindBy(className = "android.widget.ImageButton")
	@iOSFindBy(xpath = "//*[@label='Return to 4.0.0']")
	public MobileElement leftRail_AdChoicesIcon_BackBtn;

	@AndroidFindBy(name = "Ask Your IHG® Virtual Assistant")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_VirtualAssistant;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tutorial__txt_dismiss")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_TutorialDismiss;

	@AndroidFindBy(name = "Terms and Conditions")
	@iOSFindBy(xpath = "//*[@label='Terms and Conditions']")
	public MobileElement leftRail_TermsAndConditions;

	@AndroidFindBy(name = "条款与附则")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_TermsAndConditions_ch;

	@AndroidFindBy(name = "Privacy Policy")
	@iOSFindBy(xpath = "//*[@label='Privacy Policy']")
	public MobileElement leftRail_PrivacyPolicy;

	@AndroidFindBy(name = "隐私政策")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_PrivacyPolicy_ch;

	@AndroidFindBy(id = "com.ihg.apps.android:id/nav_item_about")
	@iOSFindBy(xpath = "//*[@label=\"About and Legal\"]")
	public MobileElement leftRail_AboutAndLegal;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_title")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_LegalNoticesOkBtn;

	@AndroidFindBy(name = "Version: 3.28.0-v3.28.0")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_VersionNumber;

	@AndroidFindBy(name = "STAGING")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_VersionEnvironment;

	// Extra elements for signed in user

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_reservation_details_hotel_name")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_HotelName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_reservation_details_date")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_DateDetails;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_reservation_details_nights")
	// @iOSFindBy(name = "navigation_view")
	public MobileElement leftRail_NightDetails;

	@AndroidFindBy(name = "Home")
	@iOSFindBy(xpath = "//*[@label=\"Home\"]")
	public MobileElement leftRail_Home;

	public void verifyUrl() throws InterruptedException {

		ReadingFromFile readFile = new ReadingFromFile();
		readFile.readDataFromExcel();
		String expectedUrl = (String) readFile.data[19][17];
		// String actualUrl =
		// innerDriver.findElementByXPath("//*[@resource-id=\"org.mozilla.firefox:id/url_bar_title\"]").getAttribute("text");
		String actualUrl = innerDriver.findElementByXPath("//*[@resource-id=\"com.android.chrome:id/url_bar\"]")
				.getAttribute("text");
		System.out.println(actualUrl);
		System.out.println(expectedUrl);
		Utility.match(actualUrl, expectedUrl);

	}

	public void verifyIHGLogoLeftRail() {

		Map<String, Object> params = new HashMap<>();
		params.put("content", "GROUP:Images/IHG_Logo_LeftRail.png");
		String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
		if (logoResult.equalsIgnoreCase("true"))
			logger.info("Pass: IHG logo is correctly displayed");
		else
			logger.error("Fail: IHG logo is not correctly displayed");

	}

	public void correctPage() {

		try {
			//DriverWait.waitByName("Stays");
			DriverWait.waitByElementName(leftRail_Stays);;
			logger.info("PASS: Left Rail is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Left Rail is not loaded properly");
		}
	}

}
