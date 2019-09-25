package com.ihg.nativeapp.screens;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class TransportationPage extends DriverCapabilities {

	public TransportationPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	// Capturing elements on Transportation Screen
	@AndroidFindBy(name = "Navigate up")
	@iOSFindBy(name = "")
	public MobileElement transportation_backArrow;

	@AndroidFindBy(name = "Transportation")
	@iOSFindBy(name = "")
	public MobileElement transportation_title;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__car_rental_logo")
	@iOSFindBy(name = "")
	public MobileElement transportation_CarRental_Logo;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__car_rental_label")
	@iOSFindBy(name = "")
	public MobileElement transportation_CarRental_LogoLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/ancillary_buttons__car_rental_sub_label")
	@iOSFindBy(name = "")
	public MobileElement transportation_CarRental_LogoSubLbl;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__by_sea_header_view")
	@iOSFindBy(name = "")
	public MobileElement transportation_sea;

	@AndroidFindBy(xpath = "//*[@resourceid=\"com.ihg.apps.android:id/tranportation_reservation_map_container\"]/group[1]/group[1]/group[2]")
	//@AndroidFindBy(id = "com.ihg.apps.android:id/tranportation_reservation_map_container")
	@iOSFindBy(name = "")
	public MobileElement transportation_map;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__parking_header_view")
	@iOSFindBy(name = "")
	public MobileElement transportation_parking;
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__airport_shuttle_header_view")
	@iOSFindBy(name = "")
	public MobileElement transportation_localShutle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__by_air_header_view")
	@iOSFindBy(name = "")
	public MobileElement transportation_airTransport;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__airport_shuttle_header_view")
	@iOSFindBy(name = "")
	public MobileElement transportation_airportShuttle;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__train_header")
	@iOSFindBy(name = "")
	public MobileElement transportation_trainTransport;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__subway_header")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayTransport;

	// capturing elements under local shuttle blade

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__local_area_shuttle_name")
	@iOSFindBy(name = "")
	public MobileElement transportation_shuttleName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__local_area_shuttle_hours")
	@iOSFindBy(name = "")
	public MobileElement transportation_shuttleHours;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__local_area_shuttle_radius")
	@iOSFindBy(name = "")
	public MobileElement transportation_shuttleRadius;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__local_area_shuttle_description")
	@iOSFindBy(name = "")
	public MobileElement transportation_shuttleDesc;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__local_area_shuttle_phone")
	@iOSFindBy(name = "")
	public MobileElement transportation_shuttlePhone;

	// capturing elements under transport by air blade

	/*
	 * @AndroidFindBy(id =
	 * "com.ihg.apps.android:id/transportation_by_air__name")
	 * 
	 * @iOSFindBy(name = "") public MobileElement transportation_airName;
	 * 
	 * @AndroidFindBy(id =
	 * "com.ihg.apps.android:id/transportation_by_air__distance")
	 * 
	 * @iOSFindBy(name = "") public MobileElement transportation_airDistance;
	 */

	@AndroidFindBy(name = "Take I-85 NORTH through downtown Atlanta, take GA 400 NORTH (exit 87, toll road - .50 cents), go NORTH to I-285 EAST (Exit 4A) Proceed to Exit 29, turn LEFT on Ashford-Dunwoody Rd and cross the bridge.  The Crowne Plaza Ravinia will be on your right.")
	@iOSFindBy(name = "")
	public MobileElement transportation_airDirection;

	@AndroidFindBy(name = "Take I-85 South Take I-65 South Exit #167")
	@iOSFindBy(name = "")
	public MobileElement transportation_montgomeryDirection;

	// Capturing elements under transport by train blade

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__train_name")
	@iOSFindBy(name = "")
	public MobileElement transportation_trainName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__train_distance")
	@iOSFindBy(name = "")
	public MobileElement transportation_trainDistance;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__train_complimentary_description")
	@iOSFindBy(name = "")
	public MobileElement transportation_complimentaryDesc;

	@AndroidFindBy(name = "Taxi charge (one way): 7.00 USD")
	@iOSFindBy(name = "")
	public MobileElement transportation_taxiCharge;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation__train_directions")
	@iOSFindBy(name = "")
	public MobileElement transportation_trainDirections;

	// Capturing elements under transport by subway blade

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation_by_subway__name")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayName;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation_by_subway__distance")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayDistance;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation_by_subway__complementary_service_description")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayCompDesc;

	@AndroidFindBy(name = "Subway Costs: 2.50")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayCost;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation_by_subway__services")
	@iOSFindBy(name = "")
	public MobileElement transportation_compTaxiCharge;

	@AndroidFindBy(id = "com.ihg.apps.android:id/transportation_by_subway__driving_directions")
	@iOSFindBy(name = "")
	public MobileElement transportation_subwayDirections;

	public void displayCheck(MobileElement element) {
		if (element.isDisplayed()) {
			element.click();
			System.out.println(element + "clciked");
		} else {
			return;
		}
	}

	public void display(MobileElement element) {

		if (element.isDisplayed()) {
			System.out.println(element + "present");
			return;
		} else {
			System.out.println("else case");
			return;

		}

	}
	
	public void correctPage() {

		try {
			DriverWait.waitByName("Transportation");
			logger.info("PASS: Transportation Page is Opened");
			
		}

		catch (Exception e) {
			logger.error("FAIL: Transportation Page is not loaded properly");
		}
	}
	public void TransportByAir() throws IOException, InterruptedException {
		Utility util = new Utility();
		TransportationPage transUser = new TransportationPage(innerDriver);

		// Clicking and expanding first blade Transportation By air
		util.click(transUser.transportation_airTransport);

		// Fetching all air transport names under Transportation By air blade
		List<MobileElement> airName = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation_by_air__name");
		for (int i = 0; i < airName.size(); i++) {
			util.displayList(airName, i);
		}

		// Fetching all air distance under Transportation By air blade
		List<MobileElement> airDistance = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation_by_air__distance");
		for (int i = 0; i < airDistance.size(); i++) {
			util.displayList(airDistance, i);
		}

		// Fetching all air description under Transportation By air blade
		List<MobileElement> airDesc = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation_by_air__description");
		for (int i = 0; i < airDesc.size(); i++) {
			util.displayList(airDesc, i);
		}
		util.singleScroll();


	}

	public void TransportByShuttle() throws IOException, InterruptedException {
		Utility util = new Utility();
		TransportationPage transUser = new TransportationPage(innerDriver);

		// Clicking and expanding second blade Airport Shuttle
		util.click(transUser.transportation_airportShuttle);

		// Fetching all shuttle names under Transportation By shuttle blade
		List<MobileElement> airportShuttleName = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation__airport_shuttle_name");
		for (int i = 0; i < airportShuttleName.size(); i++) {
			util.displayList(airportShuttleName, i);
		}

		// Fetching all shuttle distance under Transportation By shuttle blade
		List<MobileElement> airportShuttleDistance = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation__airport_shuttle_distance");
		for (int i = 0; i < airportShuttleDistance.size(); i++) {
			util.displayList(airportShuttleDistance, i);
		}

		// Fetching all shuttle pick up instructions under Transportation By
		// shuttle blade
		List<MobileElement> airportShuttleStatus = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation__airport_shuttle_pickup_instructions");
		for (int i = 0; i < airportShuttleStatus.size(); i++) {
			util.displayList(airportShuttleStatus, i);
		}

		util.singleScroll();

	}

	public void TransportBySea() throws IOException, InterruptedException {
		Utility util = new Utility();
		TransportationPage transUser = new TransportationPage(innerDriver);

		// Clicking and expanding transport by sea blade
		util.click(transUser.transportation_sea);

		// Fetching all sea transport names under Transportation By sea blade
		List<MobileElement> seaName = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation__by_sea_name");
		for (int i = 0; i < seaName.size(); i++) {
			util.displayList(seaName, i);
		}

		// Fetching all sea transport distance under Transportation By sea blade
		List<MobileElement> seaDistance = innerDriver
				.findElementsById("com.ihg.apps.android:id/transportation_by_sea__distance");
		for (int i = 0; i < seaDistance.size(); i++) {
			util.displayList(seaDistance, i);
		}

		util.singleScroll();

	}

	public void TransportByTrain() throws IOException, InterruptedException {
		Utility util = new Utility();
		TransportationPage transUser = new TransportationPage(innerDriver);

		// Clicking and expanding transport by train blade
		util.click(transUser.transportation_trainTransport);
		util.singleScroll();

		// Verifying presence of all elements under Transportation By train
		// blade
		util.display(transUser.transportation_trainName);
		util.display(transUser.transportation_trainDistance);
		util.display(transUser.transportation_trainDirections);

		util.singleScroll();

	}

	public void TransportBySubway() throws IOException, InterruptedException {
		Utility util = new Utility();
		TransportationPage transUser = new TransportationPage(innerDriver);

		// Clicking and expanding transport by subway blade
		util.click(transUser.transportation_subwayTransport);
		util.scroll();

		// Verifying presence of all elements under transport by subway blade
		util.display(transUser.transportation_subwayName);
		util.display(transUser.transportation_subwayDistance);
		util.display(transUser.transportation_compTaxiCharge);
		util.singleScroll();

	}

}