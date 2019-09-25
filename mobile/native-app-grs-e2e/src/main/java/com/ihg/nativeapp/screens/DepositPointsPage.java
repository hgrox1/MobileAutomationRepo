package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class DepositPointsPage extends DriverCapabilities {

	public DepositPointsPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/app_bar_title")	
	public MobileElement depositPointsPage_Title;

	@AndroidFindBy(name = "Navigate up")	
	public MobileElement depositPointsPage_MenuBtn;
	
	@AndroidFindBy(name = "Deposit Points")	
	public MobileElement depositPointsPage_DepositPoints;
	
	@AndroidFindBy(name = "Use vouchers to add points to your account. Have your voucher number ready.")	
	public MobileElement depositPointsPage_DepositPointTxt;
	
	@AndroidFindBy(name = "Purchase Points")	
	public MobileElement depositPointsPage_PurchasePoint;
	
	@AndroidFindBy(name = "Buy points and reach rewards sooner. Spend a little, earn a lot.")	
	public MobileElement depositPointsPage_PurchasePointTxt;

	@AndroidFindBy(xpath = "//*[@resourceid=\"voucherNumber\"]")
	@iOSFindBy(xpath = "//*[@resourceid=\"submitBtn\"]")
	public MobileElement depositPointsPage_Voucher;
	
	@AndroidFindBy(xpath = "//*[@resourceid=\"voucherForm\"]")
	@iOSFindBy(xpath = "//*[@resourceid=\"submitBtn\"]")
	public MobileElement depositPointsPage_VoucherHelp;
	
	@AndroidFindBy(name = "Where is the Voucher Number?")
	@iOSFindBy(name = "")
	public MobileElement depositPointsPage_Dialogtitle;
	
	@AndroidFindBy(name = "The voucher number is located on the lower right-side of the voucher paper, beneath the IHG® Rewards Club Member number boxes.")
	@iOSFindBy(name = "")
	public MobileElement depositPointsPage_DialogContent;
	
	@AndroidFindBy(name = "OK")
	@iOSFindBy(name = "")
	public MobileElement depositPointsPage_DialogOkBtn;

	@AndroidFindBy(xpath = "//*[@resourceid=\"submitBtn\"]")
	@iOSFindBy(xpath = "//*[@label=\"Deposit Points\" and @class=\"DOMUIAStaticText\"]")
	public MobileElement depositPointsPage_Btn;
	
	@AndroidFindBy(name = "You have entered an invalid voucher number. Please verify the number and try again.")
	@iOSFindBy(name = "")
	public MobileElement depositPointsPage_InvalidVoucherMsg;
   
	@AndroidFindBy(name = "How to Earn Miles Instead of Points")
	//@iOSFindBy(name = "")
	public MobileElement depositPointsPage_EarnPt;
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Deposit Points");
			logger.info("PASS: Deposit Points Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Deposit Points Page is not loaded properly");
		}
	}

}
