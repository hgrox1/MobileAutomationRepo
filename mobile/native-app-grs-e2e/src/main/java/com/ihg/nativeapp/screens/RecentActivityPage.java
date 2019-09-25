package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RecentActivityPage extends DriverCapabilities {

	public RecentActivityPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_navigation_btn")
	// @iOSFindBy(name = "")
	public MobileElement recentActivityPage_HamburgerBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
	// @iOSFindBy(name = "")
	public MobileElement recentActivityPage_Title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/recent_activity_my_travel_map")
	@iOSFindBy(name = "//*[@label=\"My Travel Map\"]")
	public MobileElement recentActivityPage_MyTravelMap;

	@AndroidFindBy(id = "com.ihg.apps.android:id/recent_activity_date")
	// @iOSFindBy(name = "")
	public MobileElement recentActivityPage_EecentActivityDate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/recent_activity_description")
	// @iOSFindBy(name = "")
	public MobileElement recentActivityDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/recent_activity_status")
	// @iOSFindBy(name = "")
	public List<MobileElement> recentActivityStatus;

	@AndroidFindBy(id = "com.ihg.apps.android:id/recent_activity_banner_past_stays")
	// @iOSFindBy(xpath = "")
	public MobileElement recentPastStayBanner;

	Utility util = new Utility();

	public void verifyActivityCountAfterOneBooking(int activityCountBeforeBooking, int activityCountAfterBooking) {

		logger.info("Recent Activity Count Before Booking = " + activityCountBeforeBooking);
		logger.info("Recent Activity Count After Booking = " + activityCountAfterBooking);
		int difference = (activityCountAfterBooking) - (activityCountBeforeBooking);
		if (difference == 1)
			logger.info("PASS: Recent Activity Count is incremented by " + difference + " after booking");
		else
			logger.error("FAIL: Recent Activity Count is incremented by " + difference + " after booking");
	}

	public void verifyRecentActivityDate() {

		String presentDate = currentDateMMDDYYYY();
		logger.info("Today's Date = " + presentDate);
		String recentDateOfBookingOnRightRail = recentActivityPage_EecentActivityDate.getText();
		logger.info("Last Activity Date = " + recentDateOfBookingOnRightRail);
		util.assertEqual(presentDate, recentDateOfBookingOnRightRail);
	}

	public void verifyEnrollmentActivity(int activityCountAfterEnrollment) {

		String expectedActivityDescription = "Enrollment";

		if (activityCountAfterEnrollment == 1)
			logger.info("PASS: Recent Activity Count is incremented by " + activityCountAfterEnrollment
					+ " after enrollment");
		else
			logger.error("FAIL: Recent Activity Count is incremented by " + activityCountAfterEnrollment
					+ " after enrollment");
		String actualActivityDescription = recentActivityDesc.getText();
		util.assertEqual(expectedActivityDescription, actualActivityDescription);
	}

	public void verifyPendingStay() {

		String expectedActivityDescription = "Pending Stay";
		String actualActivityDescription = recentActivityDesc.getText();
		util.assertEqual(expectedActivityDescription, actualActivityDescription);

	}

}
