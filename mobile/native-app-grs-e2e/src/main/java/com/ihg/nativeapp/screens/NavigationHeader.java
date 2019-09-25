package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NavigationHeader extends DriverCapabilities{
	
	Utility util = new Utility();
	public NavigationHeader(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
	
	@AndroidFindBy(id= "com.ihg.apps.android:id/app_bar_logo")
	public MobileElement HeaderIhgLogo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in")
	public MobileElement HeaderSignInBar;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/app_bar_sign_in_label")
	public MobileElement HeaderSignInLabel;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton' and @index='0']")
	public MobileElement HeaderHamBgr;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	public MobileElement HeaderCloseButton;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageButton' and @index='0']")
	public MobileElement HeaderBack;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_cancel")
	public MobileElement HeaderCancelModify;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	public MobileElement HeaderTitle;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_update")
	public MobileElement HeaderUpdateModify;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/top_bar__back")
	public MobileElement HeaderBackUpCell;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/top_bar__title")
	public MobileElement HeaderTitleUpCell;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/brand_slider_ihg_button")
	public MobileElement HeaderLogoSlider;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/brand_slider_close_button")
	public MobileElement HeaderCloseSlider;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/brand_card_closeBttn")
	public MobileElement HeaderCloseOurBrandCard;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/app_bar_user")
	public MobileElement HeaderSignedInBar;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/app_bar_user_name")
	public MobileElement HeaderUserName;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/app_bar_user_points")
	public MobileElement HeaderUserPoints;
	
	@AndroidFindBy(xpath = "//*[@class='android.widget.ImageView' and @index='1']")
	public MobileElement HeaderHotelBrand;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/top_bar__close")
	public MobileElement HeaderClosePref;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/check_in_day_of_month")
	public MobileElement SearchDateModifier;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/hotel_address_view")
	public MobileElement HotelDetailMap;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/things_to_do_banner")
	public MobileElement HotelDetailThingsToDo;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/bed_type")
	public MobileElement UpCellRoom;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/room_room_type")
	public MobileElement UpCellRoomType;
	
	@AndroidFindBy (id="com.ihg.apps.android:id/item_rate_booking__logo_poins_and_cash")
	public MobileElement UpCellPointCash;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/memberRateHeader")
	public MobileElement SelectRate;
	
	@AndroidFindBy (xpath = "//*[@class='android.widget.LinearLayout' and @index='2']")
	public MobileElement BestFlexRate;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/upsell_decline")
	public MobileElement NoThanks;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/currency__value_tv")
	public MobileElement EstimatedTotalPrice;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/points_estimate_opco_anonymous_earned_points_tv")
	public MobileElement EstimatedTotalPoints;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/opco__continue_as_guest")
	public MobileElement SigninOrGuestButton;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/points_estimate_guest_info_terms_tv")
	public MobileElement TncOpco;
	
	@AndroidFindBy (xpath = "//*[@id = 'com.ihg.apps.android:id/term_action_item_title' and @index='0']")
	public MobileElement TermsOfUse;
	
	@AndroidFindBy (xpath = "//*[@id = 'com.ihg.apps.android:id/term_action_item_title' and @index='1']")
	public MobileElement PrivacyStatment;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/nav_item_account")
	public MobileElement LeftRailAccount;
	
	@AndroidFindBy (id = "com.ihg.apps.android:id/nav_item_specific_upcoming_stay")
	public MobileElement LeftRailUpcomingStay;
	
	//points account landing
	@AndroidFindBy (id = "com.ihg.apps.android:id/account_management_landing_member_points_amount")
	public MobileElement AccountLandingPointsAvailable;
	
	
	
	public void HeaderMenuLogoSignIn(){
		if(
				HeaderHamBgr.isDisplayed()&&
				HeaderIhgLogo.isDisplayed()&&	
				HeaderSignInBar.isDisplayed()&&
				HeaderSignInLabel.isDisplayed()
				
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBackLogoSignIn(){
		if(
				HeaderBack.isDisplayed()&&
				HeaderIhgLogo.isDisplayed()&&	
				HeaderSignInBar.isDisplayed()&&
				HeaderSignInLabel.isDisplayed()
				
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}

	public void HeaderCancelTitleUpdate(){
		if(
				HeaderCancelModify.isDisplayed()&&	
				HeaderTitle.isDisplayed()&&
				HeaderUpdateModify.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBackTitle(){
		if(
				HeaderBack.isDisplayed()&&	
				HeaderTitle.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}	

	public void HeaderBackTitleUpCell(){
		if(
				HeaderBackUpCell.isDisplayed()&&	
				HeaderTitleUpCell.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderLogoClose(){
		if(
				HeaderIhgLogo.isDisplayed()&&	
				HeaderCloseButton.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}	
	
	public void HeaderMenuTitle(){
		if(
				HeaderHamBgr.isDisplayed()&&	
				HeaderTitle.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderLogoCloseSlider(){
		if(
				HeaderLogoSlider.isDisplayed()&&	
				HeaderCloseSlider.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderCloseOurBrandCard(){
		if(
				HeaderCloseOurBrandCard.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderMenuLogoName(){
		if(
				HeaderHamBgr.isDisplayed()&&	
				HeaderIhgLogo.isDisplayed()&&
				HeaderSignedInBar.isDisplayed()&&
				HeaderUserName.isDisplayed()&&
				HeaderUserPoints.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBackHotel(){
		if(
				HeaderBack.isDisplayed()&&	
				HeaderHotelBrand.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBackTitleClose(){
		if(
				HeaderBack.isDisplayed()&&	
				HeaderTitle.isDisplayed()&&
				HeaderCloseButton.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBackClose(){
		if(
				HeaderBackUpCell.isDisplayed()&&	
				HeaderCloseButton.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
	public void HeaderBack(){
		if(
				HeaderBackUpCell.isDisplayed()
				
			)
		{
			
			logger.info("PASS: Correct Header Is Displayed");
			
		}

		else {
			logger.error("FAIL: Correct Header Is NOT Displayed");
		}
	}
	
}
	
