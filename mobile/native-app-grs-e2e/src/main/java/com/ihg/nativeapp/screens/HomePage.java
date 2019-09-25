package com.ihg.nativeapp.screens;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class HomePage extends DriverCapabilities {

    TransportationPage trans = new TransportationPage(innerDriver);
    AboutAndLegalPage aboutlegal = new AboutAndLegalPage(innerDriver);

   @AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
  //  @AndroidFindBy(name = "Navigate up")
    @iOSFindBy(xpath = "//*[@label=\"Menu\"]")
    public MobileElement home_btnHamburger;

    // hanburger opened
  //  @AndroidFindBy(name = "navigation opened")
   @AndroidFindBy(xpath = "//*[@content-desc=\"navigation opened\"]")
    public MobileElement home_btnHanburgerOpened;

    // @AndroidFindBy(id = "")
    @iOSFindBy(xpath = "//*[@name=\"RewardsClubStacked\"]")
    public MobileElement home_Logo;

    //@AndroidFindBy(name = "navigation opened")
  // @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"navigation opened\"]")
    @AndroidFindBy(xpath = "//*[@text='navigation up']")
   // @AndroidFindBy(xpath = "*[@content-desc='navigation opened\"]")
    @iOSFindBy(xpath = "//device/view/window[1]/button[2]")
    public MobileElement hamburgerBtn;

    @AndroidFindBy(name = "Navigate up")
    @iOSFindBy(xpath = "//device/view/window[1]/button[2]")
    public MobileElement hamburgerBtnLocPage;

   @AndroidFindBy(id = "com.ihg.apps.android:id/find_hotel_btn")
   //@AndroidFindBy(name = "Find a Hotel")
    @iOSFindBy(xpath = "//*[@label='homescreen_find_hotel_bttn']")
    public MobileElement home_FindHotelBtn;

    // @AndroidFindBy(id = "")
    @iOSFindBy(xpath = "//*[@name=\"magnifying\"]")
    public MobileElement home_FindHotelBtnImg;

    @AndroidFindBy(id = "com.ihg.apps.android:id/find_hotel_btn")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel;

    @AndroidFindBy(name = "Chercher un hôtel")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_fr;

    @AndroidFindBy(name = "Trova un hotel")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_it;

    @AndroidFindBy(name = "搜索酒店")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_cn;
  
    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")
    @iOSFindBy(xpath = "//*[@label='Sign In']")
    public MobileElement home_btnSignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    public MobileElement home_ihgLogo;

    // @AndroidFindBy(id = "")
    @iOSFindBy(xpath = "//*[@name=\"home_background_image\"]")
    public MobileElement home_BackgroundImage;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")
    // @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_image")
    @iOSFindBy(xpath = "//*[@label=\"home_screen_navbar_account_button\"]")
    public MobileElement homePage_UserName;

    @AndroidFindBy(name = "Hotel suchen")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_Nl;

    @AndroidFindBy(name = "Procurar hotel")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_Pt;

    @AndroidFindBy(name = "Otel Bul")
    @iOSFindBy(name = "homescreen_find_hotel_bttn")
    public MobileElement home_btnFindHotel_Tr;

    @AndroidFindBy(id = "android:id/home")
    @iOSFindBy(xpath = "//*[@label='navigation_back_bttn']")
    public MobileElement findHotel_btnHamburger;

    @AndroidFindBy(xpath = "//*[@resource-id=\"com.ihg.apps.android:id/content_frame_main_container\"]/android.widget.RelativeLayout[1]/android.webkit.WebView[1]/android.webkit.WebView[1]")
    // @iOSFindBy(id = "")
    public MobileElement home_InteractSlot;

    @AndroidFindBy(id = "com.ihg.apps.android:id/tabDots")
    // @iOSFindBy(id="")
    public MobileElement home_carousel;

    @AndroidFindBy(id = "pcrLogin")
    // @iOSFindBy(id="")
    public MobileElement home_ad_page_anonymous;

    @AndroidFindBy(id = "com.ihg.apps.android:id/pager")
    // @iOSFindBy(id="")
    public MobileElement home_interactad;

    @AndroidFindBy(name = "IHG Rewards Club")
    // @iOSFindBy(id="")
    public MobileElement home_ad_page;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
    // @iOSFindBy(id="")
    public MobileElement home_ad_close;

    @AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/viewpager[1]\"]/android.webkit.WebView")
    // @iOSFindBy(id="")
    public List<MobileElement> home_interactad_count;

    @AndroidFindBy(id = "com.ihg.apps.android:id/upcoming_stay_brand_icon")
    public MobileElement home_contextscreen_brandIcon;

    @AndroidFindBy(id = "com.ihg.apps.android:id/upcoming_stay_hotel_name")
    public MobileElement home_contextscreen_brandName;

    @AndroidFindBy(id = "com.ihg.apps.android:id/upcoming_stay_confirmation_number")
    public MobileElement home_contextscreen_ConfNumber;

    @AndroidFindBy(id = "com.ihg.apps.android:id/upcoming_stay_checkin_checkout")
    public MobileElement home_contextscreen_checkincheckout;

    @AndroidFindBy(id = "com.ihg.apps.android:id/primary_title")
    public MobileElement home_contextscreen_SetYour;

    @AndroidFindBy(id = "com.ihg.apps.android:id/primary_description")
    public MobileElement home_contextscreen_setYourStay;

    @AndroidFindBy(id = "com.ihg.apps.android:id/secondary_title")
    public MobileElement home_contextscreen_getYour;

    @AndroidFindBy(id = "com.ihg.apps.android:id/secondary_description")
    public MobileElement home_contextscreen_HotelDirections;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    public MobileElement home_Permission_allow_btn;
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/location_prompt_title")
    public List<MobileElement> home_Locator_Prompt;

    @AndroidFindBy(id = "com.ihg.apps.android:id/location_prompt_not_now")
    public MobileElement home_Location_Now;
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/location_prompt_continue")
    public MobileElement home_Location_Continue;
    
    
    
    Utility util = new Utility();

    PushNotificationPopUp pushNotificationUser = new PushNotificationPopUp(innerDriver);

    public HomePage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void allowAppPermission() {
        if (this.home_Locator_Prompt.size() > 0) {
            this.util.display(this.home_Location_Now);
            this.util.display(this.home_Location_Continue);
            this.home_Location_Continue.click();
            this.home_Permission_allow_btn.click();

        } else {
            this.home_Permission_allow_btn.click();
        }
    } 

    public void contextGetDirection() throws InterruptedException {
        try {

            this.util.display(this.home_contextscreen_getYour);
            this.util.display(this.home_contextscreen_HotelDirections);
            this.util.click(this.home_contextscreen_HotelDirections);
            this.trans.correctPage();
            innerDriver.navigate().back();

        } catch (Exception e) {
            logger.error("FAIL: Get direction is not available");

        }
    }

    public void contextSetStayPref() throws InterruptedException {
        try {

            this.util.display(this.home_contextscreen_SetYour);
            this.util.display(this.home_contextscreen_setYourStay);
            this.util.click(this.home_contextscreen_setYourStay);
            innerDriver.navigate().back();

        } catch (Exception e) {
            logger.error("FAIL: Set your Stay Pref is not available");

        }
    }

    public void correctPage() {

        try {
            DriverWait.waitByElementName(this.home_btnFindHotel);
            logger.info("PASS: Home Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Home Page is not loaded properly");
        }
    }

    public void handlePushNotificationPopUp() throws InterruptedException {
        // reportiumClient.stepStart("Handling Push Notification PopUp");
        try {
            DriverWait.staticWait();
            this.pushNotificationUser.pushNotificationPopUp_Msg.isDisplayed();
            this.util.click(this.pushNotificationUser.pushNotificationPopUp_NotNowBtn);
        } catch (NoSuchElementException e) {

        }
        // reportiumClient.stepEnd("Handling Push Notification PopUp");
    }

    public void ihgLovePopUp() throws InterruptedException {
        try {

            DriverWait.waitById("com.ihg.apps.android:id/title");
            innerDriver.navigate().back();

        } catch (Exception e) {
        }
    }

    public void verifyCarousel() {
        int count = this.home_interactad_count.size();
        logger.info(+count);

    }

    public void verifyIHGLogoHome() {

        Map<String, Object> params = new HashMap<>();
        params.put("content", "GROUP:Images/IHG_Logo_Home.png");
        String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
        innerDriver.executeScript("mobile:checkpoint:image", params);
        if (logoResult.equalsIgnoreCase("true")) {
            logger.info("Pass: IHG logo is correctly displayed");
        } else {
            logger.error("Fail: IHG logo is not correctly displayed");
        }

    }

    public void verifyinteractad() {

        this.util.display(this.home_interactad);
        this.util.display(this.home_carousel);
        this.home_interactad.tap(1, 1);
        DriverWait.waitByName("IHG Rewards Club");
        this.util.display(this.home_ad_page);
        this.util.display(this.home_btnHamburger);
        this.util.display(this.home_ad_close);
        this.util.click(this.home_ad_close);

    }

    public void verifyinteractadAnonymousUser() {
        this.util.display(this.home_interactad);
        this.util.display(this.home_carousel);
        this.home_interactad.tap(1, 1);
        // DriverWait.waitByName("IHG Rewards Club");
        this.util.display(this.home_ad_page_anonymous);
        this.util.display(this.home_btnHamburger);
        this.util.display(this.home_ad_close);
        this.util.click(this.home_ad_close);
    }

    public void verifyinteractadMember() {
        this.util.display(this.home_interactad);
        this.util.display(this.home_carousel);
        this.home_interactad.tap(1, 1);
        this.util.display(this.home_btnHamburger);
        innerDriver.navigate().back();
    }
    
    public void changetoINT() throws InterruptedException
    {
    	// Configuring
    	util.click(this.home_btnHamburger);
    	DriverWait.staticWait();
    	util.click(aboutlegal.legalNotice_Title);
    	DriverWait.staticWait();
    	if(aboutlegal.grsEndPoint.isDisplayed()==false)
    	util.click(aboutlegal.grsEndPoint);
    	DriverWait.staticWait();
    	util.click(aboutlegal.switchEnv);
    	DriverWait.staticWait();
    	util.click(aboutlegal.selectINT);
    	DriverWait.staticWait();
    }

}