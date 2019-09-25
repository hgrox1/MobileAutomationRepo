package com.ihg.nativeapp.CommonLib;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;


import com.ihg.nativeapp.drivers.DriverCapabilities;

/*This class is created to handle all types of alert boxes in the application.
 * To call this method use:
 * DriverAlert.alertAccept();
 * DriverAlert.alertDismiss();*/

public class DriverAlert extends DriverCapabilities {
	

	// Method to accept alert pop-up in both Android and iOS
	public static void alertAccept() {
		if (Platform1.equalsIgnoreCase("IOS"))
			innerDriver.switchTo().alert().accept();
		else {
			innerDriver.switchTo().alert().accept();
		}
		// andAccept().click();
	}

	// Method to dismiss alert pop-up in both Android and iOS
	public static void alertDismiss() {
		if (Platform1.equalsIgnoreCase("IOS"))
			innerDriver.switchTo().alert().dismiss();
		else
			;
		// andDismiss().click();
	}

	// Method specific to Android
	/*
	 * public static WebElement andDismiss() { for(WebElement e :
	 * innerDriver.findElementsByClassName("android.widget.Button")) {
	 * if(e.getAttribute("text").equals("No") ||
	 * e.getAttribute("text").equals("Cancel")) { return e; } } return null; }
	 * 
	 * //Method specific to Android public static WebElement andAccept() {
	 * for(WebElement e :
	 * innerDriver.findElementsByClassName("android.widget.Button")) {
	 * if(e.getAttribute("text").equals("OK") ||
	 * e.getAttribute("text").equals("Yes") ||
	 * e.getAttribute("text").equals("Ok") ||
	 * e.getAttribute("text").equals("Continue") ||
	 * e.getAttribute("text").equals("Submit")) { return e; } } return null; }
	 */
	

}
