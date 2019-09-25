package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class GuestConnect extends DriverCapabilities  {

	public GuestConnect(AppiumDriver<MobileElement> innerDriver){
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/hotel_details_guest_connect_offer")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_HotelDetail;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/reservation_details_guest_connect_offer")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_ReservationDetail;
	
	@AndroidFindBy(name = "Special Offer! Show this voucher, save 10%")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_HotelDetail_text; 
	
	@AndroidFindBy(name = "Take 10% off anything in our gift shop with this special offer voucher.*")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_Title;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_alert__message")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_Description;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_message")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_ResDetail_Description;
	
	@AndroidFindBy(name = "Must be presented at check-in.")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_Description2;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_simple_alert__btn_ok")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_Ok_btn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_btn_left")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_Close_btn;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_scrollable_confirmation_btn_right")
	@iOSFindBy(name = "")
	public MobileElement GuestConnect_Offer_PopUp_RedeemNow_btn;
	
}	
