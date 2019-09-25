package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class ModifySearchPage extends DriverCapabilities {

	public ModifySearchPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}


		@AndroidFindBy(name = "Modify Search")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_Title;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_update")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_Update;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__toolbar_cancel")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_Cancel;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_month")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckinMonth;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_month")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckoutMonth;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_month")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckinDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_month")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckoutDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_week")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckinDay;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_week")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CheckoutDay;

		@AndroidFindBy(id = "com.ihg.apps.android:id/arrow")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_Arrow;

		@AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__rooms")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_SearchRoomLbl;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__rooms\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_minus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_RoomsMinus;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__rooms\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_plus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_RoomsPlus;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__rooms\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_current_value\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_RoomsCurrentValue;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/search_criteria__adults")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_SearchAdultsLbl;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_minus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_AdultsMinus;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_plus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_AdultsPlus;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__adults\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_current_value\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_AdultsCurrentValue;
		
		@AndroidFindBy(name = "Children")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_SearchChildrenLbl;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__children\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_minus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_ChildrenMinus;
		
		@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/search_form_view__children\"]//*[@resourceid=\"com.ihg.apps.android:id/stepper_plus\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_ChildrenPlus;
		
		@AndroidFindBy(name = "Rate")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_RateLbl;
		
		@AndroidFindBy(name = "Best Available")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_BestAvailableRate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__corporate_id_label")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CorpIdLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__corporate_id")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_CorpIdField;
		
		@AndroidFindBy(name = "Reward Nights")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_RewardNightsLbl;
		
		@AndroidFindBy(name = "AAA/CAA Membership Rate")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_MembershipRate;
		
		@AndroidFindBy(name = "Entertainment Card")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_EntertainmentRate;
		
		@AndroidFindBy(name = "Government Canada")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_GovernmentCanadaRate;
		
		@AndroidFindBy(name = "Government Rate")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_GovernmentRate;
		
		@AndroidFindBy(name = "Senior Discount")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_SeniorDiscountRate;
		
		@AndroidFindBy(name = "State Government-US")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_StateGovernmentUSRate;
		
		@AndroidFindBy(name = "Best-4-Breakfast")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_BestBreakfastRate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/stepper_alert_right")
		// @iOSFindBy(name = "")
		public MobileElement modifySearch_AlertIcon;
		
		public void correctPage() {

			try {
				DriverWait.waitByName("Modify Search");
				logger.info("PASS: Modify Search Page is Opened");
			}

			catch (Exception e) {
				logger.error("FAIL: Modify Search Page is not loaded properly");
			}
		}

	

}
