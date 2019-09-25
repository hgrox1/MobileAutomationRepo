package com.ihg.nativeapp.screens;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class IhgBrandsPage extends DriverCapabilities {

	public IhgBrandsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// Capturing elements on IHG Brands Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_ic_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_InterContinental;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_ihg_button")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_close_button")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_ki_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Kimpton;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_indigo_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Indigo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_even_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Even;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_hux_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Hualuxe;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_cp_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Crowne;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_hi_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HolidayInn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_hix_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HolidayExpress;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_hicv_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HolidayClub;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_hir_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HolidayResort;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_sb_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_StayBridge;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_cw_bttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Candlewood;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_rewards_button")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_Rewards;

	@AndroidFindBy(name = "*IHG Rewards Club not applicable to Kimpton Hotels and Restaurants; to be included at a future date.")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_RewardsText;

	@AndroidFindBy(name = "*IHG Rewards Club not applicable to Kimpton Hotels and Restaurants; to be included at a future date.")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_KimptonSpecificDesclaimer;

	// Capturing elements on InterContinental Hotel Screen

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ICImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ICLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__title_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ICTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ICDescription;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_page_indicator")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ICSlider;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_IcCrossIcon;

	// Capturing elements on KP Hotel Screen

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__title_tv")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPDescription;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_page_indicator")
	// @iOSFindBy(name = "")
	public MobileElement ihgBrands_KPSlider;

	// Capturing elements on click of IHG Logo on IHG Brands Details Screen
	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoIhgText;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__title_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoGreatHotels;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoDescription;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_page_indicator")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_LogoSlider;

	// Capturing elements on click of Indigo Hotels on IHG Brands Details Screen
	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__title_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INTitle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INDescription;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_slider_page_indicator")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_INSlider;

	// Capturing elements on click of Even Hotels on IHG Brands Details Screen
	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/even_brand_card__logo")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENLogo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/even_brand_card__rockville_img")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENImg1;

	@AndroidFindBy(id = "com.ihg.apps.android:id/even_brand_card__new_york_img")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENImg2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/even_brand_card__rockville_txt")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENImg1Txt;

	@AndroidFindBy(id = "com.ihg.apps.android:id/even_brand_card__new_york_txt")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_ENImg2Txt;

	// Capturing elements on click of Hualuxe Hotels on IHG Brands Details
	// Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HXLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HXCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HXImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HXDescription;

	// Capturing elements on click of Crowne Hotels on IHG Brands Details Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CRLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CRCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CRImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CRDescription;

	// Capturing elements on click of Holiday Inn Hotels on IHG Brands Details
	// Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HInnLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HInnCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HInnImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HInnDescription;

	// Capturing elements on click of Holiday Inn Express Hotels on IHG Brands
	// Details Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HExpLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HExpCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HExpImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HExpDescription;

	// Capturing elements on click of Holiday Inn Club Hotels on IHG Brands
	// Details Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HClubLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HClubIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HClubImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HClubDescription;

	// Capturing elements on click of Holiday Inn Resort Hotels on IHG Brands
	// Details Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HResLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HResCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HResImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_HResDescription;

	// Capturing elements on click of Stay Bridge Hotel on IHG Brands Details
	// Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_StayBridgeLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_StayBridgeCrossIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_StayBridgeImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_StayBridgeDescription;

	// Capturing elements on click of CandleWood Hotels on IHG Brands Details
	// Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CandleWoodLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CandleWoodIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CandleWoodImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_CandleWoodDescription;

	// Capturing elements on click of CandleWood Hotels on IHG Brands Details
	// Screen
	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_logo_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_RewardsLogo;

	@AndroidFindBy(id = "brand_card_closeBttn")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_RewardsIcon;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card_image_view")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_RewardsImage;

	@AndroidFindBy(id = "com.ihg.apps.android:id/brand_card__description_tv")
	// @iOSFindBy(name = "na_pcrsignin_member_identity")
	public MobileElement ihgBrands_RewardsDescription;

	public void correctPage() {

		try {
			DriverWait.waitById("com.ihg.apps.android:id/brand_slider_indigo_bttn");
			logger.info("PASS: IHG Brand Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: IHG Brand Page is not loaded properly");
		}
	}

	public void verifyIHGLogoBrands() {

		Map<String, Object> params = new HashMap<>();
		params.put("content", "GROUP:Images/IHG_Logo_Brands.png");
		String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
		if (logoResult.equalsIgnoreCase("true"))
			logger.info("Pass: IHG logo is correctly displayed");
		else
			logger.error("Fail: IHG logo is not correctly displayed");

	}

	public void verifyIHGLogoBrandsAtBottom() {

		Map<String, Object> params = new HashMap<>();
		params.put("content", "GROUP:Images/IHG_Logo_Brands_2nd.png");
		String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
		if (logoResult.equalsIgnoreCase("true"))
			logger.info("Pass: IHG logo is correctly displayed");
		else
			logger.error("Fail: IHG logo is not correctly displayed");

	}

}