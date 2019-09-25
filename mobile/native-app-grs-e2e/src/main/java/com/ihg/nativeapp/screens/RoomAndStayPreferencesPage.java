package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RoomAndStayPreferencesPage extends DriverCapabilities {

	public RoomAndStayPreferencesPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(name = "Navigate up")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__logo")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_CloseBtn;

	@AndroidFindBy(name = "Room and Stay Preferences")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_Heading;

	@AndroidFindBy(name = "Help us personalize your upcoming visit. Share your preferences, and we'll do our best to customize your stay.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_Msg;

	@AndroidFindBy(name = "Arrival and Departure")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ArrivalAndDepartureHeading;

	@AndroidFindBy(name = "Early/Late Arrival")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_EarlyOrLateArrivalLabel;

	@AndroidFindBy(id = "prefsForm")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_Preference;

	@AndroidFindBy(name = "Early Arrival (before 3pm)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_EarlyOrLateArrivalOption2;

	@AndroidFindBy(name = "Please let us know if you'll be arriving before 3:00 PM or after 10:00 PM. Early/Late Arrival requests will be accommodated based upon room availability and may be subject to additional fees.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ArrivalNote;

	@AndroidFindBy(name = "Approximate Hour of Arrival")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ApproximateHourOfArrivalLabel;

	@AndroidFindBy(id = "android:id/text1")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ApproxArrivalTime;

	@AndroidFindBy(name = "Reason for Stay")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ReasonForStayLabel;

	@AndroidFindBy(name = "Not Specified")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_NotSpecified;

	@AndroidFindBy(name = "Business Travel")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ReasonForStayOption2;

	@AndroidFindBy(name = "Room and Bed Preferences")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_RoomAndBedPreferencesHeading;

	@AndroidFindBy(name = "Elevator Proximity (*)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_ElevatorProximityLabel;

	@AndroidFindBy(name = "Floor Location (*)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_FloorLocationLabel;

	@AndroidFindBy(name = "In-Room Extras")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_InRoomExtrasHeading;

	@AndroidFindBy(name = "Request Crib")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_RequestCribLabel;

	@AndroidFindBy(name = "Request Extra Pillows")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_RequestExtraPillowsLabel;

	@AndroidFindBy(name = "Additional charges may apply for in-room extras. Please contact the hotel for details.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_InRoomExtrasNote1;

	@AndroidFindBy(name = "Some rooms may not accommodate a crib and/or rollaway bed.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_InRoomExtrasNote2;

	@AndroidFindBy(name = "Traveling with Pet")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_TravelingWithPetHeading;

	@AndroidFindBy(name = "I will be traveling with a pet")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_TravelingWithPetOption;

	@AndroidFindBy(name = "Pet Name (*)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_PetNameTxtBox;

	@AndroidFindBy(name = "Pet Type (*)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_PetTypeTxtBox;

	@AndroidFindBy(name = "Please contact the hotel directly to confirm if any pet fees apply.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_PetNote;

	@AndroidFindBy(name = "Preferences cannot be guaranteed and are based on availability. Preferences are currently only offered at select IHG hotels.")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_PreferenceNote;

	@AndroidFindBy(name = "You can save many preferences to your IHG Rewards Club profile to ensure that you do not have to reselect them for each stay. These preferences are indicated with an asterisks (*)")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_PreferenceNote2;

	//@AndroidFindBy(xpath = ".//*[@id='prefsForm']/div[5]/div/div")
	@AndroidFindBy(xpath = ".//*[@resource-id='prefsForm']/android.view.View[9]")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_SaveToProfile;

	@AndroidFindBy(id = "savePreferencesLink")
	//@AndroidFindBy(xpath = "//*[@resourceid=\"savePreferencesLink\])")
	@iOSFindBy(name = "")
	public MobileElement roomAndStayPreferences_SavePreferencesBtn;

}
