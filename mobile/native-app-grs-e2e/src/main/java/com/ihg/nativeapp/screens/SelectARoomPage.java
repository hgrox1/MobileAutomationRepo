package com.ihg.nativeapp.screens;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SelectARoomPage extends DriverCapabilities {

	public SelectARoomPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	public String roomName_SelectARoom;

	Utility util = new Utility();

	SelectARatePage selectRateUser = new SelectARatePage(innerDriver);

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__title")
	@iOSFindBy(name = "Select a Room")
	public MobileElement selectARoom;

	@AndroidFindBy(id = "com.ihg.apps.android:id/top_bar__back")
	@iOSFindBy(xpath = "//*[@label=\"IHGRoomsController\"]//*[@class=\"UIAButton\"]")
	public MobileElement selectRoom_BackBtn;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__flow_header_second")
	@iOSFindBy(xpath = "//*[@label=\"IHGRoomsController_ViewHeader\"]")
	public MobileElement selectRoom_RateAvailable;

	@AndroidFindBy(name = "One Bed")
	@iOSFindBy(name = "//*[@label=\"BedType_Accessibility_0\"]")
	public MobileElement selectRoom_OneBed;

	@AndroidFindBy(name = "Two Beds")
	@iOSFindBy(name = "//*[@label=\"BedType_Accessibility_1\"]")
	public MobileElement selectRoom_TwoBeds;

	@AndroidFindBy(name = "Suite")
	@iOSFindBy(name = "bed2")
	public MobileElement selectRoom_Suite;

	@AndroidFindBy(name = "Standard Room")
	@iOSFindBy(name = "IHGRoomViewCell_ViewDetails")
	public MobileElement selectRoom_StandardRoom;

	@AndroidFindBy(name = "STANDARD ROOM")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom2;

	@AndroidFindBy(name = "STANDARD SUITE")
	@iOSFindBy(name = "IHGRoomViewCell_ViewDetails")
	public MobileElement selectRoom_StandardSuite;

	@AndroidFindBy(name = "Chambre standard")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_fr;

	@AndroidFindBy(name = "Camera standard")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_it;

	@AndroidFindBy(name = "Habitación estándar")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_es;

	@AndroidFindBy(name = "スタンダードルーム")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_ja;

	@AndroidFindBy(xpath = "//*[@text=\"One Bed\"]")
	// @iOSFindBy(name = "room0")
	@iOSFindBy(xpath = "//*[@name='room0']")
	public MobileElement selectRoom_FirstRoom;
	/*
	 * 
	 */
	
@AndroidFindBy(id = "com.ihg.apps.android:id/booking_flow__bed_list")
	// @iOSFindBy(name = "room0")
	public MobileElement selectRoom;

	@AndroidFindBy(id = "com.ihg.apps.android:id/bedsListRateFromLabel")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_From;

	@AndroidFindBy(id = "com.ihg.apps.android:id/bedsListRateLabel")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_Rate;

	@AndroidFindBy(id = "com.ihg.apps.android:id/infoButton")
	// @iOSFindBy(name = "")
	public MobileElement selectedRoom_Info;

	@AndroidFindBy(id = "com.ihg.apps.android:id/maxpeopleimage")
	// @iOSFindBy(name = "")
	public MobileElement selectedRoom_People;

	@AndroidFindBy(id = "com.ihg.apps.android:id/roomsListRoomTypeLabel")
	// @iOSFindBy(name = "")
	public MobileElement selectedRoom_RoomLabel;

	@AndroidFindBy(name = "標準房")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_cnTw;

	@AndroidFindBy(name = "标准房间")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_cn;

	@AndroidFindBy(name = "СТАНДАРТНЫЙ НОМЕР")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_ru;

	// for arabic
	@AndroidFindBy(name = "غرفة نموذجية")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_ae;

	@AndroidFindBy(name = "Standard Zimmer")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_de;

	@AndroidFindBy(name = "Quarto standard")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_Pt;

	@AndroidFindBy(name = "Standart Oda")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_Tr;

	@AndroidFindBy(name = "스탠더드 룸")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_StandardRoom_Kr;

	@AndroidFindBy(id = "com.ihg.apps.android:id/room_room_type")
	@iOSFindBy(xpath = "//*[@label='RoomTitle_Accessibility_0']")
	public MobileElement selectRoom_RoomType;
	
	//..................................
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/standard_rate_container")
	@iOSFindBy(xpath = "//*[@label='RoomTitle_Accessibility_0']")
	public MobileElement selectRm_RoomType;
	
	@AndroidFindBy(id="com.ihg.apps.android:id/room_room_type")
	@iOSFindBy(name="")
	public List <MobileElement> selectRoom_FirstRoom_2;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__flow_accessibility_filter_iv")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_AccessibilityFilter;

	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/room_smoking")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_SmokingIcon;
	
	
	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__flow_smoking_filter_iv")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_NonSmokingFilter;

	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__flow_number_of_rooms")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_NumberOfRooms;

//	@AndroidFindBy(id = "com.ihg.apps.android:id/booking__non_smoking_hotel_message")
	@AndroidFindBy(xpath = "//*[@text=\"This is a non-smoking hotel.\"]")                     
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_NonSmokingHotelMsg;

	@AndroidFindBy(id = "com.ihg.apps.android:id/room_info")
	// @iOSFindBy(name = "")
	public List<MobileElement> selectRoom_RoomInfo;
	
	@AndroidFindBy(name = "PTS")
	// @iOSFindBy(name = "")
	public MobileElement selectRoom_PointsCashLbl;

	public void selectRoom() throws InterruptedException {

		try {
			Utility util = new Utility();
			util.singleScroll();
			DriverWait.staticWait();
			//selectRoom_StandardSuite.isDisplayed();
			//selectRoom_FirstRoom.click();
			selectRoom.click();
		} catch (NoSuchElementException e) {
			// util.singleReverseScroll();
			DriverWait.staticWait();
			util.click(selectRoom_FirstRoom);
		}
	}
	public void correctPage_Roomtype() {

		try {
			DriverWait.waitById("com.ihg.apps.android:id/app_bar_title");
			logger.info("PASS: Select a Room Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Select a Room Page is not loaded properly");
		}
	}
	public void selectRoomPointsCash() throws InterruptedException {

		try {
			Utility util = new Utility();
			util.singleScroll();
			DriverWait.staticWait();
			selectRoom_PointsCashLbl.isDisplayed();
			selectRoom_PointsCashLbl.click();

		} catch (NoSuchElementException e) {
			logger.info("Fail: No room available to redeem points");
		}
	}

	
	public void selectRoomType() throws InterruptedException {
		try {
			selectRoom_RoomType.click();
			selectRm_RoomType.click();

		} catch (NoSuchElementException e) {

		}
	}
	
	
	public void selectRoomType19() throws InterruptedException {
		try {
			selectRoom_RoomType.click();
			//selectRm_RoomType.click();

		} catch (NoSuchElementException e) {

		}
	}

	public void selectStandardRoom() throws InterruptedException {

		try {
			Utility util = new Utility();
			DriverWait.staticWait();
			selectRoom_StandardRoom2.isDisplayed();
			roomName_SelectARoom = selectRoom_StandardRoom2.getText();
			util.click(selectRoom_StandardRoom2);

		}catch (NoSuchElementException e) {
			util.singleReverseScroll();
			DriverWait.staticWait();
			logger.info(selectRoom_FirstRoom_2.size());
			roomName_SelectARoom = selectRoom_FirstRoom_2.get(0).getText();
			util.click(selectRoom_FirstRoom_2.get(0));

		}

	}

	public void selectRoomAlternative() {

		Map<String, Object> roomUser = new HashMap<>();
		roomUser.put("location", "343,376");
		Object room = innerDriver.executeScript("mobile:touch:tap", roomUser);

	}

	public void correctPage() {

		try {
			DriverWait.waitById("com.ihg.apps.android:id/app_bar_title");
			logger.info("PASS: Select A Room Page is Opened");
		}

		catch (Exception e) {
			logger.error("FAIL: Select A Room Page is not loaded properly");
		}
	}

}
