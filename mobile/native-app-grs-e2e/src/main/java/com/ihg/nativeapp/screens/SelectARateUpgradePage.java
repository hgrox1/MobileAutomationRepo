package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SelectARateUpgradePage extends DriverCapabilities {

	public SelectARateUpgradePage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// @AndroidFindBy(id = "")
	@iOSFindBy(xpath = "//*[@name=\"NA_IHGRATEUPSELLVIEWCONTROLLER\"]/button[1]")
	public MobileElement upgradePage_BackBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Select an Upgrade']")
	@iOSFindBy(xpath = "//*[@label=\"Select an upgrade\"]")
	public MobileElement upgradePage_Heading;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__upsell_roms_button")
	@iOSFindBy(xpath = "//*[@name=\"NA_IHGRATEUPSELLVIEWCONTROLLER\"]/button[2]")
	public MobileElement upgradePage_RoomName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__upsell_rate_type")
	@iOSFindBy(xpath = "//*[@name=\"NA_IHGRATEUPSELLVIEWCONTROLLER\"]/button[3]")
	public MobileElement upgradePage_Rate;

	//@AndroidFindBy(id = "com.ihg.apps.android:id/noUpsellButton")
	@AndroidFindBy(id = "com.ihg.apps.android:id/upsell_decline")
	@iOSFindBy(xpath = "//*[@label=\"ContinueUpsellButton\"]")
	public MobileElement upgradePage_ContinueWithCurrentSelection;

	@AndroidFindBy(id = "com.ihg.apps.android:id/upsellListRateUpgradeLabel")
	// @iOSFindBy(name = "")
	public MobileElement upgrade;

	@AndroidFindBy(id = "com.ihg.apps.android:id/upsellListUpsellTypeLabel")
	// @iOSFindBy(name = "")
	public MobileElement upgradePage_BonusPoints;

	@AndroidFindBy(id = "com.ihg.apps.android:id/upsellListUpsellDescrLabel")
	@iOSFindBy(xpath = "//*[@label=\"PER NIGHT\"]")
	public MobileElement upgradePage_PerNight;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='No, thanks.']")
	public MobileElement No_Thanks;

}
