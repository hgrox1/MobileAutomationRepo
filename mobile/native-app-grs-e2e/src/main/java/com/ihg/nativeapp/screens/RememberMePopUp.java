package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RememberMePopUp extends DriverCapabilities {

    @AndroidFindBy(id = "android:id/title")
    // @iOSFindBy(name = "")
    public MobileElement rememberMe_Title;

    @AndroidFindBy(id = "com.ihg.apps.android:id/simple_alert_dialog__title")
    // @iOSFindBy(name = "")
    public MobileElement rememberMe_Text;

    @AndroidFindBy(xpath = "//*[@text=\"No\"]")
    // @iOSFindBy(name = "")
    public MobileElement rememberMe_NoBtn;

    @AndroidFindBy(name = "Yes")
    // @iOSFindBy(name = "")
    public MobileElement rememberMe_YesBtn;

    public RememberMePopUp(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

}
