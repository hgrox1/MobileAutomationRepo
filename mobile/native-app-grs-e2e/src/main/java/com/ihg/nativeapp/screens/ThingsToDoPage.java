package com.ihg.nativeapp.screens;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ThingsToDoPage extends DriverCapabilities {


	public ThingsToDoPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}
	Utility util = new Utility();

	//@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@AndroidFindBy(name = "Navigate up")
	@iOSFindBy(xpath = "//*[@label=\"Back\"]")
	public MobileElement thingsToDo_backBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	@iOSFindBy(name = "//*[@label=\"Things To Do\"]")
	public MobileElement thingsToDo_title;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__title")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustSee;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__background")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustSeeImage;
	
	@AndroidFindBy(name = "If you're looking to entertain clients or colleagues, take them downtown to historic Buckhead, where high-end shopping, fine dining, great nightlife and incredible history combine for a memorable time. Catch a musical act at the famous Fox Theatre, or book a ghost tour of the building (if you dare). The options in the heart of Atlanta are endless, with something for every person in your party.")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustSeeDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__stay_img")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_stayImg;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__title")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustDo;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__background")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustDoImg;
	
	@AndroidFindBy(name = "If you are a nature lover, then spend one of your work breaks at the Brook Run Park in Dunwoody. Paved trails make walking and hiking easy, and the park is home to Treetop Quest; be sure to explore the recently added trail. If shopping's your passion, Perimeter Mall is located across from the Ravinia Office Park hotel. It offers dozens of name-brand stores and more than a few fun boutiques.")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_mustDoDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__dine_btn__label")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_diningLbl;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__dine_background_img")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_diningImg;
	
	@AndroidFindBy(name = "Earn IHG® Rewards Club points for dining. No coupons or certificates.")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_diningDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__title")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_whatNewTitle;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__background")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_whatNewImg;
	
	@AndroidFindBy(name = "There's always something new to do and experience in Atlanta and the Perimeter Center area. Visit the popular, expansive Georgia Aquarium downtown, and say hello its newly rescued sea turtle. If you're more in the mood for adventure and a new challenge, take the crew to Treetop Quest Dunwoody for a fun combination of elevated obstacle course and ziplining.")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_whatNewDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__nearby_attractions_header")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_attractionHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__nearby_attractions_content")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_attractionContent;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__nearby_restaurants_header")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_restaurantHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__dont_go_home_without_header")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_dontGoHomeHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__dont_go_home_without_content")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_dontGoHomeDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__tips_header")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_tipsHeader;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/what_to_do__tips_content")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_tipsDesc;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/view_information_card__description")
	//@iOSFindBy(name = "")
	public MobileElement thingsToDo_cardDesc;
	public void correctPage() {

		try {
			DriverWait.waitByName("Things To Do");
			logger.info("PASS: Things To Do Page is Opened");
			
		}

		catch (Exception e) {
			logger.error("FAIL: Transportation Page is not loaded properly");
		}
	}
	
	public void correctTitle() {
	
	// Capturing title of "Must See", "Must Do" and "What's New" title
	List<MobileElement> title = innerDriver
			.findElementsById("com.ihg.apps.android:id/view_information_card__title");
	for (int i = 0; i < title.size(); i++) {
		util.displayList(title, i);
	}

	// Capturing title of "Must See", "Must Do" and "What's New" image
	List<MobileElement> image = innerDriver
			.findElementsById("com.ihg.apps.android:id/view_information_card__background");
	for (int i = 0; i < image.size(); i++) {
		util.displayList(image, i);
	}

	// Capturing title of "Must See", "Must Do" and "What's New" image
	List<MobileElement> cardDesc = innerDriver
			.findElementsById("com.ihg.apps.android:id/view_information_card__description");
	for (int i = 0; i < cardDesc.size(); i++) {
		util.displayList(cardDesc, i);
	}
}
}