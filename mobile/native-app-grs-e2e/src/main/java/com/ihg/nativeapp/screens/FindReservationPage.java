package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.resources.ReadFromDatabase;
import com.ihg.nativeapp.resources.ReadingFromFile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class FindReservationPage extends DriverCapabilities {

    public static final String dbName = "Tosca_Analytics";
    public static final String server_name = "iadd1swtcoap030\\ToscaAnalytics";
    public static final String serverport = "1433";
    public static final String SQL_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final String SQL_URL = "jdbc:sqlserver://" + server_name + "\\SQLEXPRESS:" + serverport + ";databaseName=" + dbName + "";;

    @AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__header")
    @iOSFindBy(name = "navigation_back_bttn")
    public MobileElement findReservation_Header;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__confirmation_number")
    @AndroidFindBy(xpath = "//*[@text=\"Confirmation Number\"]")
    @iOSFindBy(xpath = "//*[@name=\"Find a Reservation\" and @class=\"UIATableCell\"]/textfield[1]")
    public MobileElement findReservation_ConfNumber;

    //@AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__last_name")
    @AndroidFindBy(xpath = "//*[@text=\"Last Name\"]")
    @iOSFindBy(xpath = "//*[@name=\"Find a Reservation\" and @class=\"UIATableCell\"]/textfield[2]")
    public MobileElement findReservation_LastName;

   // @AndroidFindBy(id = "com.ihg.apps.android:id/find_reservation__find_reservation_button")
    @AndroidFindBy(xpath = "//*[@text=\"Find Reservation\"]")
    @iOSFindBy(xpath = "//*[@label=\"Find Reservation\"]")
    public MobileElement findReservation_Btn;

    @AndroidFindBy(name = "Looking for a Kimpton Hotel Reservation?")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_KimptonText;

    // Capturing error message when no input is given in fields
    @AndroidFindBy(name = "Please enter Confirmation Number.")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_ErrorMsgEmptyConf;

    @AndroidFindBy(name = "Please enter last name.")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_ErrorMsgEmptyLastName;

    // @AndroidFindBy(name = "OK")
    @AndroidFindBy(id = "android:id/button1")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_okBtn;

    // any invalid confirmation number and last name and tap on Search button
    @AndroidFindBy(name = "The Last Name provided does not match the last name on the reservation. If your name contains special characters such as apostrophes, try again without typing in the special characters. Contact your nearest reservation office for assistance.")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_ErrorMsgInvalid;

    // any invalid confirmation number and correct last name and tap on Search
    // button
    @AndroidFindBy(name = "The confirmation number provided is invalid. Please check the number and try again. Contact your nearest reservation office for assistance. ")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_ErrorMsgInvalidconf;

    // Enter only last name and tap on Search button
    @AndroidFindBy(name = "Please enter Confirmation Number.")
    @iOSFindBy(name = "navigation_view")
    public MobileElement findReservation_ErrorMsgValidLastName;

    public FindReservationPage(AppiumDriver<MobileElement> innerDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
    }
    public String findReservationHappyScenarioStaticDb(int SNo) throws Exception {

        Utility util = new Utility();
     // Read data from Database
   	/* String Query = "SELECT ConfirmationNo, LastName FROM [Tosca_GRS_TDM].[dbo].[Mobile_Scenes] WHERE SNo = '"+SNo+"' "; 
   	 ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
       ArrayList<String> resultSet = readData.readData();
       String confNumber = resultSet.get(0);
       String lastName = resultSet.get(1);*/
        String confNumber = "48463460";
        String lastName = "Donotupdate";
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);
        DriverWait.staticWait();
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        //innerDriver.hideKeyboard();
       // DriverWait.waitByName("Find Reservation");
        DriverWait.waitByElementName(findReservation_Btn);
        util.click(this.findReservation_Btn);
        DriverWait.staticWait();
        return confNumber;

    }
    public String findReservationHappyScenarioStatic() throws Exception {

        Utility util = new Utility();

        
        String confNumber = "45328651";
        String lastName = "Ten";
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);
        DriverWait.staticWait();
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        //innerDriver.hideKeyboard();
       // DriverWait.waitByName("Find Reservation");
        DriverWait.waitByElementName(findReservation_Btn);
        util.click(this.findReservation_Btn);
        DriverWait.staticWait();
        return confNumber;

    }
    public void blankConfNumber() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();

        String lastName = (String) readFile.data[6][5];
        this.findReservation_ConfNumber.clear();
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public String findReservationDB(String screenPlayName) throws Exception {

        Utility util = new Utility();
        String Query = "SELECT ConfNumber, LastName FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = '" + screenPlayName + "'";
        ;
        ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String confNumber = resultSet.get(0);
        String lastName = resultSet.get(1);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        // String lastName = (String) readFile.data[1][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);
        return confNumber;

    }

    public String findReservationHappyScenario() throws Exception {

        Utility util = new Utility();
        String Query = "SELECT ConfNumber, LastName FROM [Tosca_GRS_TDM].[dbo].[GRS_POC_InputTable] WHERE ScenarioName = 'SP05Stage'";
        ;
        ReadFromDatabase readData = new ReadFromDatabase(SQL_DRIVER, SQL_URL, Query);
        ArrayList<String> resultSet = readData.readData();
        String confNumber = resultSet.get(0);
        String lastName = resultSet.get(1);

        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        // String lastName = (String) readFile.data[1][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);
        return confNumber;

    }

    public void findReservationMilesPointsScenario() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[10][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[22][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void findReservationOnlyMilesScenario() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[8][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[21][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void findReservationOnlyPointsScenario() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[9][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[21][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void findReservationTransportationScenario() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[1][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[0][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void happyscenariouber() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[3][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[4][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void invalidConfValidLastname() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[5][14];
        this.findReservation_ConfNumber.clear();
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[4][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);

    }

    public void reservation_RentalCar(String confNo, String lastName) throws IOException, InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        confNo = (String) readFile.data[20][14];
        lastName = (String) readFile.data[20][5];
        util.enterTextinField(this.findReservation_ConfNumber, confNo);
        util.enterTextinField(this.findReservation_LastName, lastName);
        util.click(this.findReservation_Btn);

    }

    public void validationInputs(String confNumber, String lastName) throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        confNumber = (String) readFile.data[4][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);
        innerDriver.hideKeyboard();
        lastName = (String) readFile.data[4][5];
        // System.out.println(lastName);
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        this.findReservation_Btn.click();

        DriverWait.waitByName(
                "The Last Name provided does not match the last name on the reservation. If your name contains special characters such as apostrophes, try again without typing in the special characters. Contact your nearest reservation office for assistance. ");

    }

    public void validInputDetailsOnFindReservation() throws InterruptedException {

        Utility util = new Utility();

        // Reading data from excel
        ReadingFromFile readFile = new ReadingFromFile();
        readFile.readDataFromExcel();
        String confNumber = (String) readFile.data[0][14];
        // System.out.println(confNumber);
        util.enterTextinField(this.findReservation_ConfNumber, confNumber);

        String lastName = (String) readFile.data[0][5];
        this.findReservation_LastName.clear();
        util.enterTextinField(this.findReservation_LastName, lastName);
        innerDriver.hideKeyboard();
        DriverWait.waitByName("Find Reservation");
        util.click(this.findReservation_Btn);
        DriverWait.waitById("com.ihg.apps.android:id/confirmation_number_module__label");

    }

}