package com.ihg.nativeapp.CommonLib;

import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteExecuteMethod;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utility extends DriverCapabilities {

	static String object;
	static String type;
	private ResourceReader resourceReader;

	public void display(MobileElement element)

	{

		try {
			element.isDisplayed();
			logger.info("PASS:" + element + "is present");

		} catch (NoSuchElementException e) {
			logger.error("FAIL:"+ element +" element is not present");
		}

	}
	public boolean display_return(MobileElement element)
	{

		try {
			element.isDisplayed();
			logger.info("PASS:" + element + "is present");
			return true;

		} catch (NoSuchElementException e) {
			logger.error("FAIL: element is not present");
			return false;
		}

	}
	
	public void noDisplay(MobileElement element)

	{
		try {

			element.isDisplayed();
			logger.error("FAIL:" + element + "is present");

		} catch (NoSuchElementException e) {

			logger.info("PASS: element is not present");

		}
	}

	public void noDisplayWithException(MobileElement element) throws Exception

	{
		try {

			element.isDisplayed();
			logger.error("FAIL:" + element + "is present");
			throw new Exception();

		} catch (NoSuchElementException e) {

			logger.info("PASS: element is not present");

		}
			

		
	}

	public Date dateParse(String date)

	{

		DateFormat dateformatUser = new SimpleDateFormat("MMM dd, yyyy");

		try {
			Date s = dateformatUser.parse(date);
			logger.info("PASS: date parsed in utility");
			// return s;
		} catch (Exception e) {
			logger.error("FAIL:Datev String not converted to Date object");
		}
		return null;
		// return s;
	}

	public boolean notDisplayAirline(MobileElement element)

	{
		try {

			element.findElement(By.id("com.ihg.apps.android:id/airline_label"));
			return false;

		} catch (NoSuchElementException e) {
			return true;

		}
	}

	public void notPresent(String s) {
		try {
			innerDriver.findElementByName(s);
			logger.info("FAIL: \"" + s + "\" is present");
		} catch (NoSuchElementException e) {
			logger.error("PASS: \"" + s + "\" is not present");
		}
	}

	public void click(MobileElement element) {

		element.click();
	}

	public void enterTextinField(MobileElement element, String enterText) throws InterruptedException {
		try {
			// element.click();
			// Thread.sleep(5000);
			element.sendKeys(enterText);
			logger.info("PASS : Successfully entered the " + enterText);
		} catch (NoSuchElementException e) {
			logger.error("FAIL : Unable to enter the " + enterText);
		}

	}

	public void scroll() {

		Dimension size = innerDriver.manage().window().getSize();
		// for vertical swipe
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;

		// Swipe from Bottom to Top.
		innerDriver.swipe(startx, starty, startx, endy, 3000);
		innerDriver.swipe(startx, starty, startx, endy, 3000);
		innerDriver.swipe(startx, starty, startx, endy, 3000);

		// Swipe from Top to Bottom.
		// innerDriver.swipe(startx, endy, startx, starty, 3000);

		/*
		 * //for horizantal swipe int sx = (int) (size.width * 0.70); int ex =
		 * (int) (size.width * 0.30); int sy = size.height / 2;
		 * 
		 * // use below code for using swipe horizantally //Swipe from Left to
		 * Right. driver.swipe(ex, sy, sx, sy, 3000); //Swipe from Right to
		 * Left. driver.swipe(sx, sy, ex, sy, 3000);
		 */
	}

	public void singleScroll() {

		Dimension size = innerDriver.manage().window().getSize();

		// for vertical swipe
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;

		// Swipe from Bottom to Top.
		innerDriver.swipe(startx, starty, startx, endy, 3000);

	}

	public void doubleScroll() {

		Dimension size = innerDriver.manage().window().getSize();
		// for vertical swipe
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;

		// Swipe from Bottom to Top.
		innerDriver.swipe(startx, starty, startx, endy, 3000);
		innerDriver.swipe(startx, starty, startx, endy, 3000);

	}

	public void singleReverseScroll() {

		Dimension size = innerDriver.manage().window().getSize();
		// for vertical swipe
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;

		// Swipe from Top to Bottom.
		innerDriver.swipe(startx, endy, startx, starty, 3000);
	}

	public void reverseScroll() {

		Dimension size = innerDriver.manage().window().getSize();
		// for vertical swipe
		int starty = (int) (size.height * 0.80);
		int endy = (int) (size.height * 0.20);
		int startx = size.width / 2;

		// Swipe from Top to Bottom.
		innerDriver.swipe(startx, endy, startx, starty, 3000);
		innerDriver.swipe(startx, endy, startx, starty, 3000);
		innerDriver.swipe(startx, endy, startx, starty, 3000);

	}

	// To scroll the screen using visible text
	public void scrollTo(String text) {
		try {
			innerDriver.scrollTo(text);
		} catch (Exception e) {
			logger.error("Unable to scroll to the specified text");
		}
	}

	public void swipe(MobileElement element) {

		int hx = element.getLocation().getX();
		int hy = element.getLocation().getY();
		int hx1 = hx + 400;
		int hx2 = hx + 1000;
		int hy1 = hy + 93;

		// Swipe from Left to Right
		innerDriver.swipe(hx1, hy1, hx2, hy1, 3000);

	}

	public void displayList(List<MobileElement> element, int i) {
		try {
			element.get(i).isDisplayed();
			// logger.info(element.get(i).getText() + "is present");
			logger.info("PASS:" + element.get(i).getText() + "is present");
		} catch (NoSuchElementException e) {
			logger.error("FAIL:" + element + "is not present");
		}
	}

	public void clickList(List<MobileElement> element, int i) {
		try {
			element.get(i).click();
			// logger.info(element.get(i).getText() + "is clicked");
		} catch (NoSuchElementException e) {
			logger.error("FAIL:" + element + "is not clicked");
		}
	}

	public static void match(String str1, String str2) {
		try {
			str1.contains(str2);
			logger.info("PASS: " + str1 + " is having " + str2);
		} catch (Exception e) {
			logger.error("FAIL: " + str1 + " is not having valid " + str2);
		}
	}

	public void assertEqual(String str1, String str2) {
		try {
			Assert.assertEquals(str1, str2);
			logger.info("PASS: " + str1 + " and " + str2 + " are equal");
		} catch (AssertionError e) {
			logger.error("FAIL: " + str1 + " and " + str2 + " are not equal");
		}
	}

	public void assertEqual(int str1, int str2) {
		try {
			Assert.assertEquals(str1, str2);
			logger.info("PASS: " + str1 + " and " + str2 + " are equal");
		} catch (AssertionError e) {
			logger.error("FAIL: " + str1 + " and " + str2 + " are not equal");
		}
	}
	
	public boolean assertEqualReturnOrignal(String str1, String str2) {
		try {
			Assert.assertEquals(str1, str2);
			logger.info("PASS: " + str1 + " and " + str2 + " are equal");
		} catch (AssertionError e) {
			logger.error("FAIL: " + str1 + " and " + str2 + " are not equal");
		}
		
		return true;
	}

	public void assertNotEqual(String str1, String str2) {
		try {
			Assert.assertEquals(str1, str2);
			logger.error("FAIL: " + str1 + " and " + str2 + " are equal");
		}

		catch (AssertionError e) {

			logger.info("PASS: " + str1 + " and " + str2 + " are not equal");

		}
	}

	public final String parseResourceString(ResourceBundle bundle, String rawString) {
		this.resourceReader = new ResourceReader(bundle);
		return this.resourceReader.parse(rawString);
	}

	public void startApp(String appName, AppiumDriver<MobileElement> driver) throws InterruptedException {

		Map<String, String> params = new HashMap<String, String>();
		params.put("name", appName);
		driver.executeScript("mobile:application:open", params);
	}

	public void closeApp(String appName, AppiumDriver<MobileElement> driver) throws InterruptedException {

		Map<String, String> params = new HashMap<String, String>();
		params.put("name", appName);
		driver.executeScript("mobile:application:close", params);
	}

	public static void switchToContext(RemoteWebDriver driver, String context) {

		RemoteExecuteMethod executeMethod = new RemoteExecuteMethod(driver);
		Map<String, String> params = new HashMap<String, String>();
		params.put("name", context);
		executeMethod.execute(DriverCommand.SWITCH_TO_CONTEXT, params);
	}

	public void verifyIHGLogo() {

		Map<String, Object> params = new HashMap<>();
		params.put("content", "GROUP:Images/IHG_Logo.png");
		String logoResult = (String) innerDriver.executeScript("mobile:checkpoint:image", params);
		if (logoResult.equalsIgnoreCase("true"))
			logger.info("Pass: IHG logo is correctly displayed");
		else
			logger.error("Fail: IHG logo is not correctly displayed");

	}

	public static void iOSSwipe(String xPath) {
		do {
			try {
				innerDriver.findElement(By.xpath(xPath)).click();
				break;

			} catch (Exception NoSuchElementException) {
				Dimension dimensions = innerDriver.manage().window().getSize();
				Double screenHeightStart = dimensions.getHeight() * 0.5;
				int scrollStart = screenHeightStart.intValue();
				Double screenHeightEnd = dimensions.getHeight() * 0.2;
				int scrollEnd = screenHeightEnd.intValue();
				innerDriver.swipe(0, scrollStart, 0, scrollEnd, 2000);
			}
		} while (true);

	}
	
	public void launchDeeplink(String url) throws InterruptedException{
		DriverWait.waitById("org.mozilla.firefox:id/url_bar_entry");
		innerDriver.findElementById("org.mozilla.firefox:id/url_bar_entry").click();
		DriverWait.staticWait();
		innerDriver.getKeyboard().sendKeys(url);
		Map<String, Object> EnterKeyEvent  = new HashMap<>();
		EnterKeyEvent.put("key", "66");
		innerDriver.executeScript("mobile:key:event", EnterKeyEvent);
	}

	// To scroll the screen using visible text
		public void scrolltoElement(MobileElement element) {

			int i = 0;
			do {
				if (i <= 5 ) {
					try {
						element.isDisplayed();
						break;
					} catch (Exception NoSuchElementException) {
						Map<String, Object> params = new HashMap<>();
						params.put("start", "20%,90%");
						params.put("end", "20%,20%");

						params.put("duration", "3");
						innerDriver.executeScript("mobile:touch:swipe", params);
						i++;
					}
				} else {
					logger.error("FAIL: " + element + " is not present.");
				}
			} while (true);
		}
}
