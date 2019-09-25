package com.ihg.nativeapp.screens;

import java.util.List;

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

public class SelectARatePage extends DriverCapabilities {

	public SelectARatePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	@iOSFindBy(xpath = "//*[@label=\"Select a Rate\"]")
	public MobileElement selectARate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@iOSFindBy(xpath = "//*[@label=\"IHGRatesController\"]//*[@class=\"UIAButton\"]")
	public MobileElement selectRate_BackButton;
	
	@AndroidFindBy(xpath="//*[@resource-id=\"com.ihg.apps.android:id/rate_name\" and contains(@text, \"1,000 Bonus Point\")]")
	//@AndroidFindBy(xpath = "//*[text()='1,000 Bonus Point Package: 1,000 Bonus Points for Every Night']")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_1000Bonus;
	
	
	@AndroidFindBy(name = "PARKING PACKAGE")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_parking;
	
	 @AndroidFindBy(id = "com.ihg.apps.android:id/standard_rate_container")
	    public List<MobileElement> selectRate_Container;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/rateFlagText")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardClub;

	@AndroidFindBy(id = "com.ihg.apps.android:id/rate_additional_restrictions_Label")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_AdditionalGuestText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__rates_rooms_button")
	@iOSFindBy(xpath = "//*[@label=\"IHGRatesController_ViewHeader\"]")
	public MobileElement selectRate_RoomName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/noUpsellButton")
	@iOSFindBy(xpath = "//*[@label=\"Continue with Current Selection\"]")
	public MobileElement selectRate_CurrentSelection;

	@AndroidFindBy(id = "com.ihg.apps.android:id/noUpsellButton")
	@iOSFindBy(xpath = "//*[@label=\"Continue with Current Selection\"]")
	public List<MobileElement> selectRate_CurrentSelection_List;

	@AndroidFindBy(id = "com.ihg.apps.android:id/infoButton")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_InfoButton;

	@AndroidFindBy(id = "com.ihg.apps.android:id/infoButton")
	// @iOSFindBy(name = "")
	public List<MobileElement> selectRate_InfoIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/member_popup_info_button")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_PopUpInfo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/rates_list_member_sign_up")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_JoinNow;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tableRateBullets")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RoomDetails;

	@AndroidFindBy(id = "com.ihg.apps.android:id/memberRateHeader")
	@iOSFindBy(xpath = "//*[@label=\"rate1\"]//*[@label=\"IHGRateExclusiveViewCell_ViewDetails\"]")
	public MobileElement selectRate_MemberRate;

	@AndroidFindBy(xpath = "//*[@content-desc=\"Your Preferred Rate\"]")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_YourPreferredRate;

	@AndroidFindBy(name = "IHG® Rewards Club Member Exclusive –Flexible")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardClubMember;

	//@AndroidFindBy(name = "Best Flexible Rate")
	//@AndroidFindBy(id = "com.ihg.apps.android:id/standard_rate_price")
	//@AndroidFindBy(id = "com.ihg.apps.android:id/rate_name")
	@AndroidFindBy(xpath = "//*[@text=\"BEST FLEXIBLE RATE\"]")
	@iOSFindBy(name = "Best Flexible Rate")
	public MobileElement selectRate_BestFlexible;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/rate_name")
	@iOSFindBy(name = "Best Flexible Rate")
	public List <MobileElement> selectRate_BestFlexible1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/standard_rate_free")
	@iOSFindBy(name = "Best Flexible Rate")
	public MobileElement chase_free_night;
	
	
	// @AndroidFindBy(id = "")
	@iOSFindBy(name = "RateDetailDescription_Accessibility_3")
	public MobileElement selectRate_FourthRate;

	@AndroidFindBy(name = "Best Flexible Rate")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_AdvancePurchase;

	@AndroidFindBy(name = "Candlewood Weekends")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_Candlewood;

	@AndroidFindBy(name = "最优弹性房价 ")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_Cn;

	@AndroidFindBy(name = "Наилучший гибкий тариф")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_Ru;

	// arabic
	@AndroidFindBy(name = "• قابل للاسترداد • الإفطار التي شملت • ليس من المطلوب تقديم مبلغ إيداع")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_ae;

	@AndroidFindBy(name = "Meilleur tarif flexible")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_fr;

	@AndroidFindBy(name = "Tariffa Best Flexible")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_it;

	@AndroidFindBy(name = "Bester flexibler Tarif")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_De;

	@AndroidFindBy(name = "Tarifa flexible con desayuno")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_es;

	@AndroidFindBy(name = "朝食付きベスト フレックス料金")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_ja;

	@AndroidFindBy(name = "Reward Nights")
	// @AndroidFindBy(name =
	// "com.ihg.apps.android:id/item_rate_booking__logo_poins_and_cash")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardNights;

	@AndroidFindBy(id = "com.ihg.apps.android:id/item_rate_booking__logo_poins_and_cash")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_PointsAndCashLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ratesListRateLabel")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RateValue;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ratesListRateCodeLabel")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RateUnit;

	@AndroidFindBy(id = "com.ihg.apps.android:id/item_rate_booking__or_less")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_OrLess;

	@AndroidFindBy(name = "4000 POINTS PER STAY")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardClubMember_cn;

	@AndroidFindBy(name = "INTERCONTINENTAL HOTELS GROUP GOLD")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_IHGCorpRate;

	@AndroidFindBy(name = "우대 요금")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_Kr;

	@AndroidFindBy(name = "Melhor Diária Flexível")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_Pt;

	@AndroidFindBy(name = "En İyi Esnek")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_BestFlexible_Tr;

	@AndroidFindBy(id = "com.ihg.apps.android:id/rate_name")
	public List<MobileElement> selectRate_RateTypeList;

	@AndroidFindBy(name = "Use IHG Rewards Club Points to pay for your stay.  Points will automatically be deducted at the time of booking. ")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardNightDescText;

	@AndroidFindBy(name = "For your account security, the following restrictions apply: In order to add an additional guest, the original booking member must either call the IHG® Worldwide Reservation office to provide the additional guest information no less than 7 days prior to the check-in date, or be present at the time of check-in at the hotel to provide identification. To change any provided information, the member must follow the same procedure mentioned above. Please refer to member terms and conditions for more details.")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_RewardNightAdditionalText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_restrictions_customer_service_link")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_CustomerServiceLink;

	@AndroidFindBy(id = "com.ihg.apps.android:id/additional_restrictions_terms_link")
	// @iOSFindBy(name = "")
	public MobileElement selectRate_TandCLink;

	@AndroidFindBy(id = "com.ihg.apps.android:id/tableRateBullets")
	// @iOSFindBy(name="")
	public MobileElement selectRate_Info;

	 @AndroidFindBy( xpath = "//*[@text='Government/Military Rate']")
	    // @iOSFindBy(name = "")
	    public MobileElement selectRate_GovernmentRate;
	    
	    @AndroidFindBy( xpath = "//*[@text='Senior Discount']")
	    // @iOSFindBy(name = "")
	    public MobileElement selectRate_SeniorDiscount;
	    
	    @AndroidFindBy( xpath = "//*[@text='State Government-US']")
	    // @iOSFindBy(name = "")
	    public MobileElement selectRate_StateGovernmentUS;
	    
	    @AndroidFindBy( xpath = "//*[text()=\"AAA/CAA Rate\"]")
	    // @iOSFindBy(name = "")
	    public MobileElement selectRate_AAACAA;
	    
	    @AndroidFindBy( xpath = "//android.widget.TextView[@text='Select a Rate']")
	    // @iOSFindBy(name = "")
	    public MobileElement selectRate;
	    
    Utility util = new Utility();
	SelectARateUpgradePage upgradeUser = new SelectARateUpgradePage(innerDriver);

	public void handleUpgradePage() throws InterruptedException {

		try {

			DriverWait.staticWait();
			upgradeUser.upgradePage_ContinueWithCurrentSelection.isDisplayed();
			DriverWait.staticWait();
			upgradeUser.upgradePage_ContinueWithCurrentSelection.click();
			DriverWait.staticWait();
			if (upgradeUser.upgradePage_ContinueWithCurrentSelection.isDisplayed()) {
				upgradeUser.upgradePage_ContinueWithCurrentSelection.click();
				DriverWait.staticWait();
			} else {
				DriverWait.staticWait();
			}
		}

		catch (NoSuchElementException e) {

			DriverWait.staticWait();

		}

	}

	public void verifyCorpRateAvailability() {

		try {
			selectRate_IHGCorpRate.isDisplayed();
			logger.info("PASS: Corporate Rate is present");
		}

		catch (NoSuchElementException e) {
			logger.error("FAIL: Corporate Rate is not present");
		}

	}

	public void verifyCorpRateUnavailability() {

		try {
			selectRate_IHGCorpRate.isDisplayed();
			logger.error("FAIL: Corporate Rate is present");
		}

		catch (NoSuchElementException e) {
			logger.info("PASS: Corporate Rate is not present");
		}

	}

	public void correctPage() {

		try {
			DriverWait.waitByElementName(this.selectRate);
			logger.info("PASS: Select A Rate Page is Opened");
			DriverWait.staticWait();
		}

		catch (Exception e) {
			logger.error("FAIL: Select A Rate Page is not loaded properly");
		}
	}

	public void selectRewardNightInfoIcon() throws InterruptedException {
		try {
			for (int i = 0; i < selectRate_InfoIcon.size(); i++) {
				selectRate_InfoIcon.get(0).click();
			}
		} catch (NoSuchElementException e) {
			logger.error("FAIL: Rewards night info icon not clicked");
		}
	}

	public void selectRate() {

		// util.scrollTo("Best Flexible Rate");
		util.click(selectRate_BestFlexible);

	}

	

	public void selectRateAlternative() {

	}

	
	public void selectRefundableRate() {
		if ((Platform1.equalsIgnoreCase("Android"))) {
			util.singleScroll();
			//innerDriver.scrollToExact("• Refundable");
			Boolean flag= false;
			while(flag!=true){
				if (selectRate_Info.getText().contains("• Refundable")&& selectRate_BestFlexible.getText().equalsIgnoreCase("Best Flexible Rate") ) {
					logger.info(selectRate_Info.getText());
					logger.info(selectRate_BestFlexible.getText());
					util.click(selectRate_BestFlexible);
					flag=true;
				} else {
					logger.info(selectRate_Info.getText());
					util.singleScroll();
				}
			}
		} else {
			// util.scrollTo("RateDetailDescription_Accessibility_3");
			util.click(selectRate_FourthRate);
		}
	}

	public void selectRateAlt() {
		try {
			for (int i = 0; i < selectRate_RateTypeList.size(); i++) {
				selectRate_RateTypeList.get(2).click();
			}
		} catch (NoSuchElementException e) {
			logger.error("FAIL:Best flexible breakfast rate not clicked");
		}

	}


	public void CurrentSelection() {
		if (selectRate_CurrentSelection_List.size() != 0) {
			selectRate_CurrentSelection.click();
		}
	}

}