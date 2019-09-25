package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ReviewChangesPage extends DriverCapabilities{
	
	public ReviewChangesPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

		@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_Title;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_check_in_old")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_oldChkInDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_check_out_old")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_oldChkOutDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_check_in")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_newChkInDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_check_out")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_newChkOutDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_rooms_and_guests")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_roomDetails;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_room_name")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_roomType;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_rate_name")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_rateName;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_header_refundable_tag")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_rateType;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_change_screem_charge_header_text")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_changeChargesText;
		
		@AndroidFindBy(name = "These changes will increase your Estimated Total.")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_changeChargesIncText;
		
		@AndroidFindBy(name = "These changes will decrease your Estimated Total.")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_changeChargesDrcText;
		
		@AndroidFindBy(name = "These changes will not affect your Estimated Total.")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_changeChargesNoChangeText;
		
		@AndroidFindBy(name = "Average Nightly Rate")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_nightRateLbl;
		
		@AndroidFindBy(name = "Number of Nights")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_nightsLbl;
		
		@AndroidFindBy(name = "Estimated Taxes")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_taxesLbl;
		
		@AndroidFindBy(name = "Estimated Total")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_totalPriceLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/charge_item_old_price")
		//@AndroidFindBy(id = "com.ihg.apps.android:id/price_old_total")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_oldTotal;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/disclaimers_title")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_disclaimer;
		
		@AndroidFindBy(name = "As exchange rates may fluctuate from the time a reservation is made until the actual stay, the confirmed rate is guaranteed in the hotel's base currency.  ‡ As taxes and service charges may fluctuate from the time a reservation is made until the actual stay and during the actual stay, the Total Price is an estimate. Estimated price includes Room rate, Extra person charges, Total tax and Total hotel charges. Other hotel-specific service charges may also apply. Check with hotel for details.")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_disclaimerDesc;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_confirm_changes")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_confirmChangesBtn;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/review_reservation_cancel_changes")
		// @iOSFindBy(name = "")
		public MobileElement reviewChanges_cancelChangesBtn;
		
		public void correctPage() {

			try {
				DriverWait.waitByName("Review Changes");
				logger.info("PASS: Review Changes Page is Opened");
			}

			catch (Exception e) {
				logger.error("FAIL: Review Changes Page is not loaded properly");
			}

		}
		
		

}
