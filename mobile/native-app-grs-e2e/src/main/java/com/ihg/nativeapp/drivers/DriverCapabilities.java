package com.ihg.nativeapp.drivers;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;
import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.resources.WritingToFile;
//import com.ihg.nativeapp.screens.AccountManagementPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.SignInPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class DriverCapabilities {
	public static String Platform1;
    private static WebElement element;
    public  MobileElement element1;
    public static AppiumDriver innerDriver;
    public static DriverCapabilities instance;
    public static final Logger testLog = Logger.getLogger("debugLogger");
    public static Logger logger = Logger.getLogger(DriverCapabilities.class);
    URL url;
    DesiredCapabilities caps = new DesiredCapabilities();

    // To capture screenshot of the screen and place it in Screenshots folder
  /*  public void captureScreenshot(String name) throws IOException {
        String date = this.currentDate();
        File scrFile = ((TakesScreenshot) innerDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir") + "\\src\\Screenshots\\" + name + "_" + date + ".png"));
    }*/

   /* @AfterClass
    public void close() throws IOException {
        innerDriver.quit();
        instance = null;
    }*/
    @AfterTest(alwaysRun = true)
    public void close() throws IOException, InterruptedException {
        Thread.sleep(5000);
        innerDriver.closeApp();
        // innerDriver.close();

       // reportiumClient.testStop(TestResultFactory.createSuccess());

        // stopping the test - failure
        // reportiumClient.testStop(TestResultFactory.createFailure(t.getMessage(),
        // t));

        // String reportURL = reportiumClient.getReportUrl();
        // System.out.println("Report URL - " + reportURL);

      /*  try {
            PerfectoLabUtils.downloadReport(innerDriver, "pdf", "C:\\test\\report");
            PerfectoLabUtils.downloadAttachment(innerDriver, "video", "C:\\test\\report", "flv");

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/

        innerDriver.quit();
        instance = null;

    }

    public void closeKeyboard() {
        innerDriver.hideKeyboard();
    }

    // TO capture the current date of the system
    public String currentDate() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        DateFormat sd = new SimpleDateFormat("MMM. dd, yyyy");
        String s = sd.format(dt);

        return s;
    }

    public String currentDateMMDDYYYY() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        DateFormat sd = new SimpleDateFormat("MM/dd/yyyy");
        String s = sd.format(dt);
        return s;
    }

    public String currentDateMMMdd() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        DateFormat sd = new SimpleDateFormat("MMM dd");
        String s = sd.format(dt);
        return s;
    }

    @BeforeTest(alwaysRun = true)
    
    public void DriverCapabilities() {

        try {

            this.caps.setCapability("newCommandTimeout", "90");
            this.caps.setCapability("browserName", "");

            // Capabilities setting for Android
            if (Config.os.contains("Android")) {
                this.caps.setCapability("appActivity", Config.appActivity);
                this.caps.setCapability("appPackage", Config.appPackage);
                this.caps.setCapability("platformName", "Android");
                this.caps.setCapability("platformVersion", "6.0.1");
                //this.caps.setCapability("deviceId", "ZY22364BRP");
                
               this.caps.setCapability("deviceId", "3208a422e6c351c1"); //comment on emulator
                //this.caps.setCapability("deviceName", "Android");
                this.caps.setCapability("deviceName", "Galaxy S5");
                this.caps.setCapability("automationName", "UiAutomator2");//not req 
                DriverCapabilities.Platform1 = "Android";//
            }

            // Capabilities specific to IOS
            /*
             * else { this.caps.setCapability("bundleid", Config.bundleid); this.caps.setCapability("platformVersion", "7.1"); if (Config.path.endsWith(".ipa")) { // Settings
             * specific to iOS Device builds this.caps.setCapability("udid", Config.udid);
             *
             * this.caps.setCapability(CapabilityType.BROWSER_NAME, "iOS"); this.caps.setCapability(CapabilityType.VERSION, "6.1"); this.caps.setCapability(CapabilityType.PLATFORM,
             * "Mac"); } else { // Settings specific to iOS Simulator builds if (Config.device.equals("phone")) { this.caps.setCapability("device", "iPhone Simulator");
             * this.caps.setCapability("deviceName", "iPhone Retina (4-inch 64-bit)"); } else { this.caps.setCapability("device", "iPad Simulator");
             * this.caps.setCapability("deviceName", "iPad Retina (64-bit)"); }
             *
             * } }
             */

            this.caps.setCapability("appium-version", "1.8.2");
            // System.out.println("url is" + Config.url);
            this.url = new URL("http://127.0.0.1:4723/wd/hub");
            //this.url = new URL("http://0.0.0.0:4723/wd/hub");
            innerDriver = Config.os.equalsIgnoreCase("ANDROID") ? new AndroidDriver(this.url, this.caps) : new IOSDriver(this.url, this.caps);

        }

        catch (Exception e) {
            throw new ExceptionInInitializerError(e);}
        }


    public String nextDayDateMMMdd() {
        Date dt = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(dt);
        c.add(Calendar.DATE, 1);
        dt = c.getTime();
        DateFormat sd = new SimpleDateFormat("MMM dd");
        String s = sd.format(dt);
        return s;

    }

    // Block of code to be executed after running every Test method
    // Also added call to dataEntry() to write run-time result of execution in ExecutionSheet.xlsx
    
    @BeforeMethod(alwaysRun = true)
    public void clearApp() {

      //  if (Platform1.equalsIgnoreCase("Android")) {
            innerDriver.resetApp();
       /* } else {

            innerDriver.closeApp();
            launch();
            HomePage homeuser = new HomePage(innerDriver);
            Utility util = new Utility();
            AccountManagementPage accountLandingUser = new AccountManagementPage(innerDriver);
            SignInPage signInPageUser = new SignInPage(innerDriver);
            try {
                DriverWait.staticWait();
                homeuser.homePage_UserName.isDisplayed();
                util.click(homeuser.homePage_UserName);
                DriverWait.staticWait();
                util.singleScroll();
                util.singleScroll();
                innerDriver.context("NATIVE_APP");
                innerDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
                innerDriver.findElementByXPath("//*[@label='LandingPageSignOutButton']").click();
                DriverWait.staticWait();
                util.click(signInPageUser.signIn_CloseBtn);
                DriverWait.waitByName("Find a Hotel");
            } catch (Exception e) {

            }

        }*/
    }
    @AfterMethod(alwaysRun = true)
    public void quit(final ITestResult res, Method method) throws IOException, InterruptedException {
        String className = res.getTestClass().getRealClass().getSimpleName();
        String testName = res.getMethod().getMethodName();
        if (res.isSuccess()) {
            System.out.println("Success");
            //WritingToFile.dataEntry(className, testName, "Pass", "Test passed sucessfully");
        } else {

           // this.captureScreenshot(testName);
            String message = "Error in " + res.getName();
            System.out.println(message);
            Reporter.log(message); // To embed error logs into TestNG emailable report
            //WritingToFile.dataEntry(className, testName, "Fail", "Failed at " + this.getClass().getSimpleName());
        }
        Thread.sleep(5000);
       // innerDriver.closeApp();
        //innerDriver.close();
        
    }

    /*
     *
     * public void pullUp(){ Point center = getCenter(); innerDriver.swipe(center.x, center.y + 100, center.x, center.y - 200, 400); }
     *
     * public void pullDown() { Point center = getCenter(); innerDriver.swipe(center.x, center.y, center.x, center.y + 500, 400); }
     *
     * public void pullRight() throws JsonParseException{ Point center = getCenter(); if(Config.os.equals("Android")) innerDriver.swipe(center.x, center.y, center.x + 280,
     * center.y, 400); else{ JavascriptExecutor js =(JavascriptExecutor)(innerDriver); HashMap<String,Integer> swipeObject = new HashMap<String,Integer>();
     * swipeObject.put("startX", center.x); swipeObject.put("StartY", center.y); swipeObject.put("endX", center.x+157); swipeObject.put("endY", center.y);
     * swipeObject.put("duration", 4); js.executeScript("mobile: swipe", swipeObject);
     *
     * } }
     *
     * public void pullLeft(){ Point center = getCenter(); innerDriver.swipe(center.x + 200, center.y, center.x - 200, center.y, 400); }
     *
     * public static Point getCenter() { Point loc = element.getLocation(); Dimension dim = element.getSize(); return new Point(loc.x + dim.width / 2, loc.y + dim.height / 2); }
     */
    @Test
    public void launch() {
        innerDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        innerDriver.launchApp();
        logger.debug("Application Launched");
    }

    // To work with log4j.properties
    public void logger() {
        try {
            InputStream reader = this.getClass().getClassLoader().getResourceAsStream("log4j.properties");
            System.getProperties().load(reader);
            reader.close();
            logger.info("Log4j Configuration file loaded");
        } catch (IOException e) {
            System.err.println("failed to load Config");
            e.printStackTrace();
        }

    }
}