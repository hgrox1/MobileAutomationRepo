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

public class StayPreferencesPage extends DriverCapabilities {

    Utility util = new Utility();
    ManageAccountPage manageuser = new ManageAccountPage(innerDriver);

    @AndroidFindBy(name = "Navigate up")
    @iOSFindBy(xpath = "//*[@name=\"NA_IHGNAVIGATIONCONTROLLER\"]/button[1]")
    public MobileElement stayPreferences_BackButton;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Title;

    @AndroidFindBy(name = "Stay Preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SubTitle1;

    @AndroidFindBy(name = "Set preferences like floor location, number of beds and pillow type before you arrive.")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SubTitle1_Desc;

    @AndroidFindBy(id = "com.ihg.apps.android:id/edit_stay_preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_EditStaypref;

    @AndroidFindBy(name = "Rate, Communication and Earnings Preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SubTitle2;

    @AndroidFindBy(name = "Customize your experience, from rate and earning preferences to the way and how often we communicate with you.")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SubTitle2_Desc;

    @AndroidFindBy(id = "com.ihg.apps.android:id/edit_rate_preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_EditRatepref;

    @AndroidFindBy(name = "Elevator Proximity")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD1_label;

    @AndroidFindBy(name = "No Preference")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD1;

    @AndroidFindBy(name = "Near Elevator")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD1_NearElevator;

    @AndroidFindBy(name = "Away from Elevator")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD1_AwayFromElevator;

    @AndroidFindBy(name = "Floor Location")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD2_label;

    @AndroidFindBy(name = "No Preference")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD2_NoPreference;

    @AndroidFindBy(name = "Low Floor")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD2_LowFloor;

    @AndroidFindBy(name = "Ground Floor (if available)")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD2_GroundFloor;

    @AndroidFindBy(name = "Smoking Preference")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD3_label;

    @AndroidFindBy(name = "Smoking")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD3_Smoking;

    @AndroidFindBy(name = "Non-smoking")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DD3_NonSmoking;

    @AndroidFindBy(name = "Room and Bed Preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RoomBedPref;

    @AndroidFindBy(name = "Special Interests")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SpecialInterests;

    @AndroidFindBy(name = "Favorite Destination")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType;

    @AndroidFindBy(name = "Traveling with Pet")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_TravelingWithPet;

    @AndroidFindBy(name = "What are some of your interests?")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests;

    @AndroidFindBy(name = "Dietary Preferences")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences;

    @AndroidFindBy(name = "How do you like to stay active when traveling?")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling;

    @AndroidFindBy(name = "What helps you relax while traveling?")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling;

    @AndroidFindBy(name = "Saving preferences will automatically apply selections to future reservations at participating hotels. You can update preference selections when booking a reservation. Preferences cannot be guaranteed and are based on availability.")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SavingPreference;

    @AndroidFindBy(name = "If I Wasn't Working I'd Be...")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SpecialInterest_TextBx1;

    @AndroidFindBy(name = "Anything Else We Should Know?")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_SpecialInterest_TextBx2;

    @AndroidFindBy(name = "Beach")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Beach;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Beach\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Beach_Btn;

    @AndroidFindBy(id = "prefsForm")
    // @iOSFindBy(name = "")
    public List<MobileElement> stayPreferences_FavoriteDestinationType_RadioBtn;

    @AndroidFindBy(name = "Mountain")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Mountain;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Mountain\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Mountain_Btn;

    @AndroidFindBy(name = "City")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_City;

    @AndroidFindBy(xpath = "//*[@content-desc=\"City\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_City_Btn;

    @AndroidFindBy(name = "Resort")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Resort;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Resort\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Resort_Btn;

    @AndroidFindBy(name = "Attractions")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Attractions;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Attractions\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Attractions_Btn;

    @AndroidFindBy(name = "Park")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Park;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Park\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_FavoriteDestinationType_Park_Btn;

    @AndroidFindBy(name = "Pet Name")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_TravlWithPet_TextBx1;

    @AndroidFindBy(name = "Pet Type")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_TravlWithPet_TextBx2;

    @AndroidFindBy(name = "Arts and Culture")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_ArtsCulture;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Arts and Culture\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_ArtsCulture_Btn;

    @AndroidFindBy(name = "Cooking")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Cooking;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Cooking\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Cooking_Btn;

    @AndroidFindBy(name = "Health and Fitness")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_HealthFitness;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Health and Fitness\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_HealthFitness_Btn;

    @AndroidFindBy(name = "Music and Concerts")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_MusicConcerts;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Music and Concerts\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_MusicConcerts_Btn;

    @AndroidFindBy(name = "Outdoors")
    // (name = "")
    public MobileElement stayPreferences_Interests_Outdoors;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Outdoors\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Outdoors_Btn;

    @AndroidFindBy(name = "Theater")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Theater;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Theater\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Theater_Btn;

    @AndroidFindBy(name = "Travel")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Travel;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Travel\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Travel_Btn;

    @AndroidFindBy(name = "Food and Wine")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_FoodWine;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Food and Wine\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_FoodWine_Btn;

    @AndroidFindBy(name = "Volunteering")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Volunteering;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Volunteering\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Volunteering_Btn;

    @AndroidFindBy(name = "Sports")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Sports;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Sports\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Sports_Btn;

    @AndroidFindBy(name = "Shopping")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Shopping;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Shopping\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Interests_Shopping_Btn;

    @AndroidFindBy(name = "Do you have any dietary preferences?")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_label;

    @AndroidFindBy(name = "Vegetarian")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown;

    @AndroidFindBy(name = "No Preference")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown1;

    @AndroidFindBy(name = "Gluten free")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown2;

    @AndroidFindBy(name = "Low carb")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown3;

    @AndroidFindBy(name = "Low fat")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown4;

    @AndroidFindBy(name = "Vegan")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown5;

    @AndroidFindBy(name = "Anything tasty")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_DietaryPreferences_DropDown6;

    @AndroidFindBy(name = "Focus on my core muscles")
    //// @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_muscle;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Focus on my core muscles\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_muscle_btn;

    @AndroidFindBy(name = "Gym for cardio and strength")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_gym;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Gym for cardio and strength\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_gym_Btn;

    @AndroidFindBy(name = "Group fitness")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_fitness;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Group fitness\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_fitness_Btn;

    @AndroidFindBy(name = "Outdoor activities")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_outdoor;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Outdoor activities\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_outdoor_Btn;

    @AndroidFindBy(name = "Swimming")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Swimming;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Swimming\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Swimming_Btn;

    @AndroidFindBy(name = "Yoga")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Yoga;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Yoga\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Yoga_Btn;

    @AndroidFindBy(name = "A great workout on my own")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_workout;

    @AndroidFindBy(xpath = "//*[@content-desc=\"A great workout on my own\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_workout_Btn;

    @AndroidFindBy(name = "Running")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Running;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Running\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_ActiveTravelling_Running_Btn;

    @AndroidFindBy(name = "A comfortable bed, pillow, and adjustable lighting")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_comfort;

    @AndroidFindBy(xpath = "//*[@content-desc=\"A comfortable bed, pillow, and adjustable lighting\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RelaxTravelling_comfort_Btn;

    @AndroidFindBy(name = "Beer, glass of wine, or cocktail")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_cocktail;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Beer, glass of wine, or cocktail\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RelaxTravelling_cocktail_Btn;

    @AndroidFindBy(name = "Hot tea or coffee to unwind")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_tea;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Hot tea or coffee to unwind\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_tea_Btn;

    @AndroidFindBy(name = "A good book")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_book;

    @AndroidFindBy(xpath = "//*[@content-desc=\"A good book\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RelaxTravelling_book_Btn;

    @AndroidFindBy(name = "Meditation")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_Meditation;

    @AndroidFindBy(xpath = "//*[@content-desc=\"Meditation\"]/following::*[1]")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_Meditation_Btn;

    @AndroidFindBy(name = "Saving preferences will automatically apply selections to future reservations at participating hotels. You can update preference selections when booking a reservation. Preferences cannot be guaranteed and are based on availability.")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_RealxTravelling_SavingPrefText;

    @AndroidFindBy(id = "savePreferencesLink")
    @iOSFindBy(name = "")
    public MobileElement stayPreferences_SavePreferences_Link;

    /*
     * @AndroidFindBy(name = "Stay Preferences") // @iOSFindBy(name = "") public MobileElement stayPreferences_SavePreferences_Link;
     */

    @AndroidFindBy(name = "Thank you. Your preferences have been saved.")
    // @iOSFindBy(name = "")
    public MobileElement stayPreferences_Thankyou;

    @AndroidFindBy(name = "Room and Stay Preferences")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_SubTitle;

    @AndroidFindBy(name = "Let us know what makes you happy, and we’ll do our best to personalize your stay. As an IHG® Rewards Club member you can save frequent preferences that will apply to future reservations. When booking a reservation at a participating IHG® hotel, you can always update your preferences to personalize individual stays.")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_SubTitleDesc;

    @AndroidFindBy(name = "Have a hard time remembering your IHG Rewards Club number when you book?")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_RemRewardText;

    @AndroidFindBy(name = "Yes, use my my profile email address.")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_UseEmailText;

    @AndroidFindBy(xpath = ".//*[@resource-id='prefsForm']/android.view.View[3]")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_UseEmailBtn;

    @AndroidFindBy(name = "By selecting this preference, we will use your profile email address to automatically apply your membership information to your bookings. This ensures you never miss out on your IHG Rewards Club points and benefits!")
    // @iOSFindBy(name = "")
    public MobileElement editSstayPreferences_UseEmailDesc;

    @AndroidFindBy(name = "Navigate up")
    @iOSFindBy(xpath = "//*[@name=\"NA_IHGNAVIGATIONCONTROLLER\"]/button[1]")
    public MobileElement editPreferences_BackButton;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_Title;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_close")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_CloseBtn;

    @AndroidFindBy(id = "pageTitle")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_pageTitle;

    @AndroidFindBy(name = "Please select your preferences so that we may take care of you just the way you like. Choose from the options to customize your experience.")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_pageTitleDesc;

    @AndroidFindBy(name = "Rate Preferences")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_RatePreferences;

    @AndroidFindBy(name = "Communication Preferences")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_CommunicationPreferences;

    @AndroidFindBy(name = "Earning Preferences")
    // @iOSFindBy(name = "")
    public MobileElement editPreferences_EarningPreferences;

    @AndroidFindBy(xpath = "//*[@contentDesc='No Preference']")
    // @iOSFindBy(name = "")
    public MobileElement stayPref_Early_LatePickerBtn;

    @AndroidFindBy(xpath = "//*[text()='Early Arrival (before 3pm)']")
    // @iOSFindBy(name = "")
    public MobileElement stayPref_EarlyRadioBtn;

    @AndroidFindBy(xpath = "//*[@contentDesc='Not Specified']")
    // @iOSFindBy(name = "")
    public MobileElement stayPref_ReasonForStayPickerBtn;

    @AndroidFindBy(xpath = "//*[text()='Business Travel']")
    // @iOSFindBy(name = "")
    public MobileElement stayPref_BusinessTravelRadioBtn;

    boolean cookieHandle;

    public StayPreferencesPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void clickFavoriteRadioBtn() {
        for (int i = 0; i < stayPreferences_FavoriteDestinationType_RadioBtn.size(); i++) {
            util.clickList(stayPreferences_FavoriteDestinationType_RadioBtn, i);

        }
    }

    public void correctPage() {

        try {
            DriverWait.waitById("savePreferencesLink");
            logger.info("PASS: Stay Preference Page is Opened");
        }

        catch (Exception e) {
            logger.error("FAIL: Stay Preference Page is not loaded properly");
        }
    }

    public void displayFavoriteRadioBtn() {
        for (int i = 0; i < stayPreferences_FavoriteDestinationType_RadioBtn.size(); i++) {
            System.out.println("entered display list");
            util.displayList(stayPreferences_FavoriteDestinationType_RadioBtn, i);

        }
    }

    public void handleCokies() throws InterruptedException {
        try {
            cookieHandle = manageuser.cookies_Accept_Btn.isDisplayed();
            if (cookieHandle == true) {
                util.click(manageuser.cookies_Accept_Btn);
                DriverWait.staticWait();
            }
        } catch (NoSuchElementException e) {
            DriverWait.staticWait();
        }
    }
}
