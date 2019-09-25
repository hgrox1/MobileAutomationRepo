package com.ihg.nativeapp.screens;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountLandingPage extends DriverCapabilities {

	public AccountLandingPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	IhgBusinessRewardsPage businessRewardsUser = new IhgBusinessRewardsPage(innerDriver);
	
	@AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
	public MobileElement accountLanding_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@iOSFindBy(xpath = "//*[@label='nav back arrow']")
	public MobileElement accountLanding_JoinBackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_membership_user_name")
	// @iOSFindBy(name = "")
	public MobileElement accountLanding_UserFullName;

	@AndroidFindBy(name = "Bonus Points Package")
	@iOSFindBy(xpath = "//*[@label='Bonus Points Package']")
	public MobileElement accountLanding_BonusPointsPackage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_image")	
	public MobileElement accountLanding_Userimage;
    
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_name")	
	public MobileElement accountLanding_UserName;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")	
	public MobileElement accountLanding_AppLogo;
		
	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_user_points")	
	public MobileElement accountLanding_UserPoints;
	
	// Menu under Redeem

	@AndroidFindBy(name = "Reward Nights")
	@iOSFindBy(xpath = "//*[@label='Reward Nights']")
	public MobileElement accountLanding_RewardNights;

	@AndroidFindBy(name = "Points & Cash")
	@iOSFindBy(xpath = "//*[@label='Points & Cash']")
	public MobileElement accountLanding_PointsNCash;

	@AndroidFindBy(name = "IHG® Rewards Club Catalog")
	@iOSFindBy(xpath = "//*[@label='Points & Cash']")
	public MobileElement accountLanding_IHGRewardsClubCatalog;

	@AndroidFindBy(name = "Digital Rewards")
	@iOSFindBy(xpath = "//*[@label='Digital Rewards']")
	public MobileElement accountLanding_DigitalRewardsS;

	@AndroidFindBy(name = "IHG® Rewards Club Auctions")
	@iOSFindBy(xpath = "//*[@label='IHG® Rewards Club Auctions']")
	public MobileElement accountLanding_IHGRewardsClubAuctions;

	@AndroidFindBy(id = "com.ihg.apps.android:id/menu_recent_activity_title")
	// @iOSFindBy(name = "")
	public MobileElement accountLanding_RecentActivityTitle;

	@AndroidFindBy(name = "Manage Account")
	// @iOSFindBy(name = "")
	public MobileElement accountLanding_ManageAccount;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_name")
	@iOSFindBy(xpath = "//*[@label=\"Jake Isaac\"]")
	public MobileElement accountLanding_memberName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_level")
	@iOSFindBy(xpath = "//*[@label=\"Spire Elite 380007218\"]")
	public MobileElement accountLanding_memberLevel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_id")
	// @iOSFindBy(xpath = "")
	public MobileElement accountLanding_memberId;

	@AndroidFindBy(name = "Qualifying Points and Nights")
	@iOSFindBy(xpath = "//*[@label=\"Qualifying Points and Nights\"]")
	public MobileElement accountLanding_qualifyingPtsLabel;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_current_status")
	@iOSFindBy(xpath = "//*[@label=\"You have 2,278,213 points and 273 nights.\"]")
	public MobileElement accountLanding_pointsStatus;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_trackbar")
	// @iOSFindBy(xpath = "")
	public MobileElement accountLanding_statusTrackbar;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_club")
	@iOSFindBy(xpath = "//*[@label=\"CLUB\"]")
	public MobileElement accountLanding_club;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_gold")
	@iOSFindBy(xpath = "//*[@label=\"GOLD ELITE\"]")
	public MobileElement accountLanding_gold;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_platinum")
	@iOSFindBy(xpath = "//*[@label=\"PLATINUM ELITE\"]")
	public MobileElement accountLanding_platinum;

	@AndroidFindBy(id = "com.ihg.apps.android:id/points_and_nights_status_spire")
	@iOSFindBy(xpath = "//*[@label=\"SPIRE ELITE\"]")
	public MobileElement accountLanding_spire;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_points_title")
	@iOSFindBy(xpath = "//*[@label=\"Available to Redeem\"]")
	public MobileElement accountLanding_availableRedeemLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_free_nights_amount")
	@iOSFindBy(xpath = "//*[@label=\"2,060,750 points\"]")
	public MobileElement accountLanding_memberFreeNtPointsAmount;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_free_nights_label")
	@iOSFindBy(xpath = "//*[@label=\"2,060,750 points\"]")
	public MobileElement accountLanding_memberFreeNtPointsLbl;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_points_amount")
	@iOSFindBy(xpath = "//*[@label=\"2,060,750 points\"]")
	public MobileElement accountLanding_memberPointsAmount;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_points_label")
	@iOSFindBy(xpath = "//*[@label=\"2,060,750 points\"]")
	public MobileElement accountLanding_memberPointsLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_points_expiration")
	// @iOSFindBy(xpath = "")
	public MobileElement accountLanding_ponitsExpiration;

	@AndroidFindBy(name = "Messages")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_messages_button_id\"]")
	public MobileElement accountLanding_messages;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_stay_preferences")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_staypreference_button_id\"]")
	public MobileElement accountLanding_StayPreferences;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_deposit_points")
	//@AndroidFindBy(name = "Deposit / Purchase")
	public MobileElement accountLanding_depositPoints;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_manage_account")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_manageaccount_button_id\"]")
	public MobileElement accountLanding_manageAccount;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_benefits")
	@iOSFindBy(xpath = "//*[@label=\"Member Benefits\"]")
	public MobileElement accountLanding_memberBenefits;

	@AndroidFindBy(id = "com.ihg.apps.android:id/kindle_singles_button_row")
	@iOSFindBy(xpath = "//*[@label=\"Your Extra Benefits: Kindle eBooks\"]")
	public MobileElement accountLanding_extraBenefits;

	@AndroidFindBy(id = "com.ihg.apps.android:id/kindle_singles_count")
	// @iOSFindBy(xpath = "")
	public MobileElement accountLanding_benefitsCount;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_member_card")
	@iOSFindBy(xpath = "//*[@label=\"Member Card\"]")
	public MobileElement accountLanding_memberCard;

	@AndroidFindBy(name = "//*[@content-desc=\"Memberships\"]")
	@iOSFindBy(xpath = "//*[@label=\"Memberships\"]")
	public MobileElement accountLanding_membershipText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_business_rewards")
	@iOSFindBy(xpath = "//*[@label=\"IHG® BUSINESS REWARDS\"]")
	public MobileElement accountLanding_businessRewards;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_recent_activity")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_recentactivity_button_id\"]")
	public MobileElement accountLandingPage_RecentActivity;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_earn_rewards")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_earnrewards_button_id\"]")
	public MobileElement accountLandingPage_EarnRewards;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_sign_out")
	@iOSFindBy(xpath = "//*[@label=\"LandingPageSignOutButton\"]")
	public MobileElement accountLandingPage_SignOutBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_landing_redeem_rewards")
	@iOSFindBy(xpath = "//*[@label=\"account_landing_reedem_button_id\"]")
	public MobileElement accountLandingPage_RedeemPoints;

	@AndroidFindBy(xpath = "//*[@contentDesc=\"Navigate up\"]")
	@iOSFindBy(xpath = "//*[@name=\"NA_IHGNAVIGATIONCONTROLLER\"]/button[1]")
	public MobileElement accountLandingPage__BackButton;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/account_management_do_the_math_interact_offer_framelayout")	
	public MobileElement accountLandingPage__InteractOffer;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/pager")	
	public MobileElement accountLandingPage__Pager;

	Utility util = new Utility();

	public void signOut() throws InterruptedException {

		Utility util = new Utility();
		SignInPage signInUser = new SignInPage(innerDriver);
		util.click(signInUser.signIn_User);
		DriverWait.staticWait();
		util.doubleScroll();
		util.click(accountLandingPage_SignOutBtn);
		DriverWait.waitById("com.ihg.apps.android:id/app_bar_close");
	}

	public void correctPage() {

		try {
			DriverWait.waitByName("Recent Activity");
			logger.info("PASS: Account Landing Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Account Landing Page is not loaded properly");
		}
	}

	public void verifyIHGLogoAccount() {

		Map<String, Object> params = new HashMap<>();
		params.put("content", "GROUP:Images/IHG_Logo_Account.png");
		String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
		if (logoResult.equalsIgnoreCase("true"))
			logger.info("Pass: IHG logo is correctly displayed");
		else
			logger.error("Fail: IHG logo is not correctly displayed");

	}
	
	public void businessRewards() {

		try {
			util.display(accountLanding_businessRewards);
			util.display(businessRewardsUser.IhgBusinessRewardsPage_title);
			
			innerDriver.navigate().back();
			
		}

		catch (Exception e) {
			logger.error("FAIL: Business Reward is not displayed");
		}
	}
}