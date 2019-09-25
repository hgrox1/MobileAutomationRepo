package com.ihg.nativeapp.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SelectDatesPage extends DriverCapabilities {

    @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_layout__calendar_cancel_btn")
    @iOSFindBy(xpath = "//*[@label=\"calendar_cancel_button\"]")
    public MobileElement selectDatesPage_CancelBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_layout__calendar_header")
    @iOSFindBy(xpath = "//*[@label=\"Select Dates\"]")
    public MobileElement selectDatesPage_Heading;

    @AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")
    @iOSFindBy(xpath = "//*[@label=\"Select Dates\"]")
    public MobileElement selectDatesPage_appbar;
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_update")
    @iOSFindBy(xpath = "//*[@label=\"calendar_done_button\"]")
    public MobileElement selectDatesPage_DoneBtn;

    @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_layout__calendar_checkin_label")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_CheckInLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_checkin_text")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_CheckInDateSelected;

    // @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_layout__calendar_checkout_label")
    @AndroidFindBy(name = "Check Out")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_CheckOutLabel;

    @AndroidFindBy(id = "com.ihg.apps.android:id/calendar_layout__calendar_checkout_text")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_CheckOutDateSelected;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='15']")
    @iOSFindBy(name = "10")
    public MobileElement selectDatesPage_CheckInDateValue;
    
    /*@AndroidFindBy(name = "15")
    @iOSFindBy(name = "10")
    public MobileElement selectDatesPage_CheckInDateValue;*/

    @AndroidFindBy(xpath="//android.widget.TextView[@text='18']")
    @iOSFindBy(xpath = "//*[@label=\"7-12\"]//*[@label=\"12\"]")
    public MobileElement selectDatesPage_CheckOutDateValue;
    
    /*@AndroidFindBy(name = "18")
    @iOSFindBy(xpath = "//*[@label=\"7-12\"]//*[@label=\"12\"]")
    public MobileElement selectDatesPage_CheckOutDateValue;*/

    @AndroidFindBy(id = "com.ihg.apps.android:id/toolbar_update")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_UpdateBtn;

    @AndroidFindBy(name = "16")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_AlipayCheckOut_Date;

    @AndroidFindBy(name = "14")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_AlipayCheckIn_Date;
    
 
    
    
    
   
    
    @AndroidFindBy(name = "27")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_SpecialReqCheckOut_Date;

    @AndroidFindBy(name = "26")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_SpecialReqCheckIn_Date;
    
    
    @AndroidFindBy(name = "28")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_SpecialCheckOut_Date;

    @AndroidFindBy(name = "25")
    // @iOSFindBy(name = "")
    public MobileElement selectDatesPage_SpecialCheckIn_Date;
    
    
    
    
    @AndroidFindBy(name = "21")
    // @iOSFindBy(name = "")
    public MobileElement ModifyselectDatesPage_AlipayCheckOut_Date;

    @AndroidFindBy(name = "20")
    // @iOSFindBy(name = "")
    public MobileElement ModifyselectDatesPage_AlipayCheckIn_Date;
    
    @AndroidFindBy(id = "com.ihg.apps.android:id/search_form_view__corporate_id")
    // @iOSFindBy(name = "")
    public MobileElement CorpID;
   

    @AndroidFindBy(id = "com.ihg.apps.android:id/stepper_plus")
    // @iOSFindBy(name = "")
    public MobileElement stepper_plus;
    

    public SelectDatesPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }

    public void correctPage() {

        try {
            DriverWait.waitByElementName(this.selectDatesPage_appbar);
            logger.info("PASS: Select Dates Page is Opened");
            DriverWait.staticWait();
        }

        catch (Exception e) {
            logger.error("FAIL: Select Dates Page is not loaded properly");
        }
    }

}