package com.ihg.nativeapp.languages;

import java.io.UnsupportedEncodingException;
import java.util.ResourceBundle;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;
import com.ihg.nativeapp.screens.AccountLandingPage;
import com.ihg.nativeapp.screens.HomePage;
import com.ihg.nativeapp.screens.HotelDetailsPage;
import com.ihg.nativeapp.screens.LocationSearchPage;
import com.ihg.nativeapp.screens.OpcoPage;
import com.ihg.nativeapp.screens.ReservationConfirmationPopUp;
import com.ihg.nativeapp.screens.SearchForm;
import com.ihg.nativeapp.screens.SearchResultListView;
import com.ihg.nativeapp.screens.SelectARatePage;
import com.ihg.nativeapp.screens.SelectARoomPage;
import com.ihg.nativeapp.screens.SignInPage;

public class Localisation extends DriverCapabilities {

    SignInPage userSignIn = new SignInPage(innerDriver);
    Utility util = new Utility();
    String memberId, pin, location, hotelName, checkOutDate;

    public void locale_findHotel() throws Exception {
        HomePage lang_homeUser = new HomePage(innerDriver);
        SignInPage lang_signUser = new SignInPage(innerDriver);
        SearchForm lang_searchFormUser = new SearchForm(innerDriver);
        LocationSearchPage locationSearchUser = new LocationSearchPage(innerDriver);
        SearchResultListView searchResultListViewUser = new SearchResultListView(innerDriver);
        HotelDetailsPage lang_hotelDetailUser = new HotelDetailsPage(innerDriver);
        SelectARoomPage lang_selectRoomUser = new SelectARoomPage(innerDriver);
        SelectARatePage lang_selectRateUser = new SelectARatePage(innerDriver);
        OpcoPage lang_opcoUser = new OpcoPage(innerDriver);
        ReservationConfirmationPopUp lang_confirmationUser = new ReservationConfirmationPopUp(innerDriver);

        /*
         * String lang = "zh"; String country = "CN";
         * 
         * Locale l = new Locale(lang, country); ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
         */

        ResourceBundle r = ResourceBundle.getBundle("Bundle", Lang.getNativeappLocale(Lang.FRENCH));

        DriverWait.waitById("com.ihg.apps.android:id/app_bar_sign_in_label");

        // Clicking on Sign In button
        this.util.click(lang_signUser.RightRail_SigninLbl);

        // User SignIn
        this.userSignIn.signIn();

        // Handling Confirmation Page
        lang_signUser.handleConfirmationPageAndReachingHome();
        ;

        // Clicking on Find A Hotel Button in Home Page
        this.util.click(lang_homeUser.home_FindHotelBtn);
        DriverWait.waitById("com.ihg.apps.android:id/destination");

        // Enter Location
        locationSearchUser.inputLocationSingleWord(this.location);
        DriverWait.waitById("com.ihg.apps.android:id/loclistTitleValue");
        this.util.click(locationSearchUser.locationSearchPage_LocList);
        DriverWait.waitById("com.ihg.apps.android:id/destination_preview");

        /*
         * String adult_children = r.getString("Adult_Children"); String adult_children_screen = lang_searchFormUser.findAndBookPage_Adult_Children.getText();
         * util.assertEqual(adult_children_screen, adult_children);
         */
        /*
         * String rate = r.getString("Rate_Key"); String rate_screen = lang_searchFormUser.findAndBookPage_RateText.getText(); util.assertEqual(rate_screen, rate);
         */

        /*
         * String corporateId = r.getString("Corporate_ID"); String convertedCorpId = util.parseResourceString(r,corporateId); String corporateId_screen =
         * fr_findHotelUser.findHotel_CorporateId.getText(); String corpEncode=util.parseResourceString(r,corporateId_screen); Assert.assertEquals(corpEncode, convertedCorpId);
         */

        /*
         * // Selecting Check-in/Check-out date util.click(lang_searchFormUser.findAndBookPage_CheckOut); DriverWait.waitById(
         * "com.ihg.apps.android:id/calendar_layout__calendar_checkout_label"); util.click(lang_searchFormUser.findAndBookPage_CalendarCheckOut); util.singleScroll();
         * 
         * util.click(lang_searchFormUser.findAndBookPage_CheckOut_Date); checkOutDate = lang_searchFormUser.findAndBookPage_CheckOut_Date_Selected.getText() ;
         * util.click(lang_searchFormUser.findAndBookPage_CalendarDone);
         */

        String selectDestination = r.getString("Select_Destination");
        String convertedSelectDestn = this.util.parseResourceString(r, selectDestination);
        String selectDestination_screen = lang_searchFormUser.searchForm_Destination.getText();
        String selectDestnEncode = this.util.parseResourceString(r, selectDestination_screen);
        String trimSelectDestination = selectDestnEncode.replaceAll("\n", "");
        this.util.assertEqual(trimSelectDestination, convertedSelectDestn);

        // Click on Search Button
        this.util.click(lang_searchFormUser.searchForm_SearchBtn);
        DriverWait.waitById("com.ihg.apps.android:id/search_result_hotel_distance");

        String filter = r.getString("Filter");
        String filter_screen = searchResultListViewUser.searchResultListView_Result_Filter.getText();
        this.util.assertEqual(filter_screen, filter);

        String map = r.getString("Map");
        String map_screen = searchResultListViewUser.searchResultListView_Result_Map.getText();
        this.util.assertEqual(map_screen, map);

        String hotels = r.getString("Hotels");
        String hotels_screen = searchResultListViewUser.searchResultListView_Result_HotelNo.getText();

        // Validating Hotel text
        Utility.match(hotels_screen, hotels);

        // Selecting Hotel
        this.hotelName = searchResultListViewUser.searchResultListView_Select_Hotel.getText();
        this.util.click(searchResultListViewUser.searchResultListView_Select_Hotel);
        DriverWait.waitById("com.ihg.apps.android:id/book_now_book_now_label");

        String contactHotel = r.getString("Contact_Hotel");
        String convertedcontactHotel = this.util.parseResourceString(r, contactHotel);
        String contactHotel_screen = lang_hotelDetailUser.hotelDetail_ContactHotel.getText();
        String contactHotelEncode = this.util.parseResourceString(r, contactHotel_screen);
        this.util.assertEqual(contactHotelEncode, convertedcontactHotel);

        /*
         * String reviews = r.getString("Reviews"); String convertedReviews = util.parseResourceString(r, reviews); String reviews_screen =
         * lang_hotelDetailUser.hotelDetail_Review.getText(); String reviewsEncode = util.parseResourceString(r, reviews_screen); util.match(reviewsEncode, convertedReviews);
         */

        String bookNow = r.getString("Book_now");
        String convertedBookNow = this.util.parseResourceString(r, bookNow);
        String bookNow_screen = lang_hotelDetailUser.hotelDetail_BookNow.getText();
        String bookNowEncode = this.util.parseResourceString(r, bookNow_screen);
        this.util.assertEqual(bookNowEncode, convertedBookNow);

        /*
         * * String from = r.getString("From_key"); String convertedFrom =util.parseResourceString(r,from); String from_screen=fr_findHotelUser..getText(); String fromEncode
         * =util.parseResourceString(r,from_screen); util.assertEqual(fromEncode, convertedFrom);
         */

        // Book Hotel
        this.util.click(lang_hotelDetailUser.hotelDetail_BookNow);
        DriverWait.waitById("com.ihg.apps.android:id/top_bar__title");

        // Selecting Room
        lang_selectRoomUser.selectRoom();
        DriverWait.waitById("com.ihg.apps.android:id/booking__flow_header_second");

        /*
         * String joinNow = r.getString("Not_a_member?_Join_now"); String convertedJoinNow = util.parseResourceString(r, joinNow); String joinNow_screen =
         * fr_findHotelUser.findHotel_SelectRate_JoinNow.getText(); String joinNowEncode = util.parseResourceString(r, joinNow_screen); util.assertEqual(joinNowEncode,
         * convertedJoinNow);
         */

        // Selecting an Option on Select Rate Page
        // util.singleScroll();
        this.util.click(lang_selectRateUser.selectRate_BestFlexible_fr); // language
        // specific
        lang_selectRateUser.handleUpgradePage();

        /*
         * String continueGuest = r.getString("Continues_as_guest_key"); String convertedContinueGuest = util.parseResourceString(r, continueGuest); String continueGuest_screen =
         * lang_selectRateUpgrade.upgradePage_ContinueWithCurrentSelection. getText(); //doesnt match the properties file String continueGuestEncode = util.parseResourceString(r,
         * continueGuest_screen); util.assertEqual(continueGuestEncode, convertedContinueGuest);
         */

        /*
         * String upgrade = r.getString("Upgrade"); // Upgrade page is not coming String convertedupgrade = util.parseResourceString(r, upgrade); String upgrade_screen =
         * lang_selectRateUpgrade.upgrade.getText(); String upgradeEncode = util.parseResourceString(r, upgrade_screen); util.assertEqual(upgradeEncode, convertedupgrade);
         * 
         * String perNight = r.getString("Per_night"); String convertedperNight = util.parseResourceString(r, perNight); String perNight_screen =
         * lang_selectRateUpgrade.upgradePage_PerNight.getText(); String perNightEncode = util.parseResourceString(r, perNight_screen); util.assertEqual(perNightEncode,
         * convertedperNight);
         */

        /*
         * String bonusPoints = r.getString("bonus_points_per_night"); String convertedBonusPoints = util.parseResourceString(r, bonusPoints); //doesnt match the properties file
         * String bonusPoints_screen = lang_selectRateUpgrade.upgradePage_BonusPoints.getText(); String bonusPointsEncode = util.parseResourceString(r, bonusPoints_screen);
         * util.match(bonusPointsEncode, convertedBonusPoints);
         */

        /*
         * // Clicking on Continue With Current Selection button lang_selectRateUpgrade.upgradePage_ContinueWithCurrentSelection.click ();
         */

        // Verifying elements on OPCO page
        String Guest = r.getString("Guest");
        String convertedGuest = this.util.parseResourceString(r, Guest);
        String Guest_screen = lang_opcoUser.opco_Guest_Room.getText();
        String GuestEncode = this.util.parseResourceString(r, Guest_screen);
        Utility.match(GuestEncode, convertedGuest);

        /*
         * String room = r.getString("Rooms_key"); String convertedRoom = util.parseResourceString(r, room); // Doesnt work for Italian // comment for it String Room_screen =
         * lang_opcoUser.opco_Guest_Room.getText(); String RoomEncode = util.parseResourceString(r, Room_screen); util.match(RoomEncode, convertedRoom);
         */

        this.util.scroll();
        DriverWait.waitById("com.ihg.apps.android:id/opco__disclaimer_expandable_header");

        String disclaimer = r.getString("Disclaimer");
        String convertedDisclaimer = this.util.parseResourceString(r, disclaimer);
        String Disclaimer_screen = lang_opcoUser.opco_DisclaimerHeader.getText();
        String DisclaimerEncode = this.util.parseResourceString(r, Disclaimer_screen);
        this.util.assertEqual(DisclaimerEncode, convertedDisclaimer);

        String tandC = r.getString("Terms_And_Conditions_Key");
        String convertedTandC = this.util.parseResourceString(r, tandC);
        String TandC_screen = lang_opcoUser.opco_TnCLabel.getText();
        String TandCEncode = this.util.parseResourceString(r, TandC_screen);
        this.util.assertEqual(TandCEncode, convertedTandC);

        /*
         * String readTermsAndCond = r.getString( "I_have_read_and_understand_the_rate_description_and_rate_rules_stated_on_the_\"Select_a_Rate\"_page_for_this_reservation." );
         * String convertedreadTermsAndCond = util.parseResourceString(r,readTermsAndCond); String readTermsAndCond_screen =lang_opcoUser.opco_TnC_Msg2_fr.getText(); // Language
         * specific // comment for it String readTermsAndCondEncode =util.parseResourceString(r, readTermsAndCond_screen); util.match(readTermsAndCondEncode,
         * convertedreadTermsAndCond);
         */

        String swipeToBook = r.getString("Swipe_to_Book");
        String convertedSwipeToBook = this.util.parseResourceString(r, swipeToBook);
        String SwipeToBook_screen = lang_opcoUser.opco_BookBtn.getText();
        String SwipeToBook_Encode = this.util.parseResourceString(r, SwipeToBook_screen);
        Utility.match(SwipeToBook_Encode, convertedSwipeToBook);

        this.util.swipe(lang_opcoUser.opco_BookBtn);

        DriverWait.waitById("com.ihg.apps.android:id/stay_pref_message_body");

        String congratulations = r.getString("Congratulations");
        String convertedCongratulations = this.util.parseResourceString(r, congratulations);
        String Congratulations_screen = lang_confirmationUser.reservationConfirmation_Congratulations_fr.getText(); // Language
        // specific
        String CongratulationsEncode = this.util.parseResourceString(r, Congratulations_screen);
        this.util.assertEqual(CongratulationsEncode, convertedCongratulations);

        /*
         * String confirmedBooking = r.getString("Your_booking_is_confirmed."); String convertedConfirmedBooking = util.parseResourceString(r, confirmedBooking); String
         * ConfirmedBooking_screen = lang_confirmationUser.confirmation_Msg.getText(); // no string for french and italian String ConfirmedBookingEncode =
         * util.parseResourceString(r, ConfirmedBooking_screen); util.match(ConfirmedBookingEncode, convertedConfirmedBooking);
         * 
         * String confirmationNumber = r.getString("Confirmation_number"); String convertedConfirmationNumber = util.parseResourceString(r, confirmationNumber); // no string for
         * french and italian String ConfirmationNumber_screen = lang_confirmationUser.confirmation_Msg.getText(); String ConfirmationNumberEncode = util.parseResourceString(r,
         * ConfirmationNumber_screen); util.match(ConfirmationNumberEncode, convertedConfirmationNumber);
         */

    }

    public void locale_home() throws UnsupportedEncodingException {
        HomePage lang_homeUser = new HomePage(innerDriver);
        /*
         * String lang = "zh"; String country = "CN";
         * 
         * Locale l = new Locale(lang, country); ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
         */

        ResourceBundle r = ResourceBundle.getBundle("Bundle", Lang.getNativeappLocale(Lang.FRENCH));

        String signin = r.getString("Sign_in");
        String convertedSignIn = this.util.parseResourceString(r, signin);
        DriverWait.waitById("com.ihg.apps.android:id/home__find_hotel_btn");
        String signIn_screen = lang_homeUser.home_btnSignIn.getText();
        this.util.assertEqual(convertedSignIn, signIn_screen);

        String findHotel = r.getString("Home_View_Find_Button_Key");
        String convertedfindHotel = this.util.parseResourceString(r, findHotel);
        String findHotel_screen = lang_homeUser.home_FindHotelBtn.getText();
        String FindHotelEncode = this.util.parseResourceString(r, findHotel_screen);
        this.util.assertEqual(FindHotelEncode, convertedfindHotel);

    }

    public void locale_signIn() throws Exception {
        HomePage lang_homeUser = new HomePage(innerDriver);
        SignInPage lang_signUser = new SignInPage(innerDriver);
        AccountLandingPage accLandingUser = new AccountLandingPage(innerDriver);

        /*
         * String lang = "zh"; String country = "CN";
         * 
         * Locale l = new Locale(lang, country); ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
         */

        ResourceBundle r = ResourceBundle.getBundle("Bundle", Lang.getNativeappLocale(Lang.FRENCH));

        DriverWait.waitById("com.ihg.apps.android:id/app_bar_sign_in_label");

        // Clicking on Sign In button
        this.util.click(lang_signUser.RightRail_SigninLbl);

        String joinNow = r.getString("Join_Now");
        String joinNow_screen = lang_signUser.signIn_JoinNowButton.getText();
        this.util.assertEqual(joinNow_screen, joinNow);

        String signInLabel = r.getString("SignIn_Label");
        String signInLabel_screen = lang_signUser.signIn_label.getText();
        this.util.assertEqual(signInLabel_screen, signInLabel);

        // User SignIn
        this.userSignIn.signIn();

        // Handling Confirmation Page
        lang_signUser.handleConfirmationPageAndReachingHome();

        // Clicking on Sign Out button on Account Landing Page
        this.util.click(lang_signUser.signIn_User);
        this.util.singleScroll();
        this.util.click(accLandingUser.accountLandingPage_SignOutBtn);
        DriverWait.waitById("com.ihg.apps.android:id/sign_in_member_id");
        innerDriver.navigate().back();

    }

}
