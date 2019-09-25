package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ModifyReservationPage extends DriverCapabilities{
	
	public ModifyReservationPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}


		//@AndroidFindBy(name = "Select to Modify")
	    @AndroidFindBy(xpath = "//*[@text=\"Select to Modify\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_Title;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_hotel_name")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_hotelName;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_confirmation_header")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_confLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_confirmation_number")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_confID;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_month")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkInMonth;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_month")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkOutMonth;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_month")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkInDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_month")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkOutDate;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_in_day_of_week")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkInDay;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/check_out_day_of_week")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_chkOutDay;
		
		@AndroidFindBy(name = "Rooms")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_roomLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_rooms")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_roomsCount;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_header_text_type")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_roomTypeLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_room_type")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_roomType;
		
		@AndroidFindBy(name = "Adults")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_adultsLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_adult")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_adultsCount;
		
		@AndroidFindBy(name = "Children")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_childrenLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_children")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_childrenCount;
		
		@AndroidFindBy(name = "Rate")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_rateLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_rate_type")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_rateType;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_view__guest_header")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_userNameLbl;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_view__guest_name")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_UserName;
		
		@AndroidFindBy(name = "For other changes or inquiries, please contact")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_otherChangesText;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_link")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_custCareLink;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/customer_care_close")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_closeIcon;
		
		@AndroidFindBy(id = "com.ihg.apps.android:id/modify_reservation_dates_modified")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_modifiedTag;
		
		//@AndroidFindBy(name = "Check Availability")
		@AndroidFindBy(xpath = "//*[@text=\"Check Availability\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_AvailabilityBtn;
		
		@AndroidFindBy(xpath = "//*[@text=\"Select to Modify\"]")
		// @iOSFindBy(name = "")
		public MobileElement modifyRes_SelecttoModify;
		
		public void correctPage() {

			try {
				DriverWait.waitByElementName(modifyRes_SelecttoModify);
				logger.info("PASS: Select to Modify Page is Opened");
			}

			catch (Exception e) {
				logger.error("FAIL: Select to Modify Page is not loaded properly");
			}

		}
}
