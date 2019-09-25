package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ReservationConfirmationPopUp extends DriverCapabilities {

	public ReservationConfirmationPopUp(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_header_image")
	@iOSFindBy(xpath = "//*[@name=\"na_brand_alert\"]//UIAImage")
	public MobileElement reservationConfirmation_Img;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_header")
	@iOSFindBy(xpath = "//*[@label=\"Congratulations! \"]")
	public MobileElement reservationConfirmation_Congratulations;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_body")
	@iOSFindBy(xpath = "//*[@label=\"Your booking is confirmed.  A confirmation email has been sent to your email address.   Confirmation Number 60938856 \"]")
	public MobileElement reservationConfirmation_Msg;
	
	@AndroidFindBy(xpath = "//*[@text=\"Your booking has been modified. A confirmation email has been sent to your email address.\"]")
	//@AndroidFindBy(name = "Your booking has been modified. A confirmation email has been sent to your email address.")
	@iOSFindBy(xpath = "//*[@label=\"Your booking is confirmed.  A confirmation email has been sent to your email address.   Confirmation Number 60938856 \"]")
	public MobileElement reservationConfirmation_modificationMsg;

	@AndroidFindBy(xpath = "//*[@text=\"Confirmation Number\"]")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_ConfirmationNumberHeading;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_confirmation_number")
	 
	@iOSFindBy(xpath = "//*[@label='Congratulations_Message_Accessibility']")
	public MobileElement reservationConfirmation_ConfirmationNumber;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_stay_pref")
	@iOSFindBy(xpath = "//*[@label=\"Set Your Stay Preferences\"]")
	public MobileElement reservationConfirmation_SetYourStayPreferencesBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/dialog_reservation_confirmation_view_res")
	@iOSFindBy(id = "//*[@label='View Reservation']")
	public MobileElement reservationConfirmation_ViewReservationBtn;

	@AndroidFindBy(name = "Félicitations !")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_fr;

	@AndroidFindBy(name = "Congratulazioni!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_it;

	@AndroidFindBy(name = "恭喜！")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_chTw;

	@AndroidFindBy(name = "恭喜您！")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_ch;

	@AndroidFindBy(name = "Поздравляем!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_ru;

	@AndroidFindBy(name = "تهانينا!‬‬‬")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_ae;

	@AndroidFindBy(name = "Herzlichen Glückwunsch!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_de;

	@AndroidFindBy(name = "¡Felicidades!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_es;

	@AndroidFindBy(name = "ありがとうございます！")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_ja;

	@AndroidFindBy(name = "축하드립니다!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_Kr;

	@AndroidFindBy(name = "Parabéns!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_Pt;

	@AndroidFindBy(name = "Tebrikler!")
	// @iOSFindBy(name = "")
	public MobileElement reservationConfirmation_Congratulations_Tr;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Confirmation Number']")
	// @iOSFindBy(name = "")
	public MobileElement Res_popUp;

	public void correctPage() {

		try {
			DriverWait.waitByElementName(Res_popUp);
			logger.info("PASS: Reservation Confirmation Pop Up is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Reservation Confirmation Pop Up is not loaded properly");
		}
	}

}
