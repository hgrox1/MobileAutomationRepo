package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Email extends DriverCapabilities {

	public Email(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(xpath = "//*[@resource-id=\"android:id/list\"]/android.widget.FrameLayout[1]")
	// @iOSFindBy(name = "")
	public MobileElement email_DeeplinksMail;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihghome://?\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_Home;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihgenroll://?\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_Enroll;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihgpandc://?\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_PointsAndCash;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihghd://?hotelCode=atlfx&NumberOfRooms=2&checkInMonthYear=092017&rateCode=6CBARC&checkOutDay=17&numberOfAdults=2&numberOfChildren=3&checkInDay=14&checkOutMonthYear=092017\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_HotelDetail;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihgrewardscatalog://?\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_IhgRewardsCatalog;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihgresdetails:///?lastName=alex%20&confNumber=60625124\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_ResDetails;

	@AndroidFindBy(xpath = "//*[@content-desc=\"ihgresstaypref:///?lastName=alex&confNumber=60625482\"]")
	// @iOSFindBy(name = "")
	public MobileElement email_Deeplink_ResStayPref;

	Utility util = new Utility();

	public void clickDeeplink(MobileElement e) throws InterruptedException {

		util.click(email_DeeplinksMail);
		DriverWait.staticWait();
		util.click(e);

	}
}
