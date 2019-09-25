package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TravelTools extends DriverCapabilities {

    @AndroidFindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
    public MobileElement travelToolsPage_MenuBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_logo")
    @iOSFindBy(xpath = "//*[@name=\"ihgrc-color\"]")
    public MobileElement travelToolsPage_Logo;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_sign_in_label")
    @iOSFindBy(xpath = "//*[@label=\"Sign In\"]")
    public MobileElement travelToolsPage_SignIn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/view_bar")
    // @iOSFindBy(xpath = "")
    public MobileElement travelToolsPage_ViewBar;

    @AndroidFindBy(xpath = "//*[@text=\"Travel Tools\"]")
    // @iOSFindBy(xpath = "")
    public MobileElement travelToolsPage_Title;

    public TravelTools(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

}
