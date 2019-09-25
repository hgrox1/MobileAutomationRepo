package com.ihg.nativeapp.screens;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.CommonLib.DriverWait;
import com.ihg.nativeapp.CommonLib.Utility;
import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settings extends DriverCapabilities {

	public Settings(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	@AndroidFindBy(xpath = "//*[@text=\"Language and input\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput;

	@AndroidFindBy(xpath = "//*[@text=\"Language\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language;

	@AndroidFindBy(xpath = "//*[@text=\"Português (Portugal)\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_PT;

	@AndroidFindBy(xpath = "//*[@text=\"Français (France)\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_Fr;

	@AndroidFindBy(xpath = "//*[@text=\"Español (España)\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_Es;

	@AndroidFindBy(xpath = "//*[@text=\"Italiano\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_It;

	@AndroidFindBy(xpath = "//*[@text=\"中文 (简体)\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_Ch;

	@AndroidFindBy(xpath = "//*[@text=\"English (United States)\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_Eng;

	@AndroidFindBy(xpath = "//*[@text=\"Idioma e introdução\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_pt;

	@AndroidFindBy(xpath = "//*[@text=\"Langue et saisie\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_fr;

	@AndroidFindBy(xpath = "//*[@text=\"Idioma e introducción\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_es;

	@AndroidFindBy(xpath = "//*[@text=\"Lingua e inserimento\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_it;

	@AndroidFindBy(xpath = "//*[@text=\"语言和输入\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_ch;

	@AndroidFindBy(xpath = "//*[@text=\"Idioma\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_Pt;

	@AndroidFindBy(xpath = "//*[@text=\"Langue\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_fr;

	@AndroidFindBy(xpath = "//*[@text=\"Idioma\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_es;

	@AndroidFindBy(xpath = "//*[@text=\"Lingua e inserimento\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_it;

	@AndroidFindBy(xpath = "//*[@text=\"语言\"]")
	// @iOSFindBy(name = "")
	public MobileElement settings_LanguageAndInput_Language_ch;

	// Changing Language to Non-English
	// English to Portuguese

	public void languageChange_Pt() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Settings", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language);
		DriverWait.staticWait();
		util.scroll();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_PT);
		DriverWait.staticWait();
		util.startApp("IHG-Staging", innerDriver);
	}

	public void languageChangeToEnglish_Pt() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Definições", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_pt);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language_Pt);
		DriverWait.staticWait();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Eng);
		DriverWait.staticWait();
	}

	public void languageChange_Fr() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Settings", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language);
		DriverWait.staticWait();
		util.singleScroll();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Fr);
		DriverWait.staticWait();
		util.startApp("IHG-Staging", innerDriver);
	}

	public void languageChangeToEnglish_Fr() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Paramètres", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_fr);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language_fr);
		DriverWait.staticWait();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Eng);
		DriverWait.staticWait();
	}

	public void languageChange_Es() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Settings", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language);
		DriverWait.staticWait();
		util.singleScroll();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Es);
		DriverWait.staticWait();
		util.startApp("IHG-Staging", innerDriver);
	}

	public void languageChangeToEnglish_Es() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Ajustes", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_es);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language_es);
		DriverWait.staticWait();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Eng);
		DriverWait.staticWait();
	}

	public void languageChange_It() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Settings", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language);
		DriverWait.staticWait();
		util.singleScroll();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_It);
		DriverWait.staticWait();
		util.startApp("IHG-Staging", innerDriver);
	}

	public void languageChange_Ch() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Settings", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language);
		DriverWait.staticWait();
		util.scroll();
		util.scroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Ch);
		DriverWait.staticWait();
		util.startApp("IHG-Staging", innerDriver);
	}

	public void languageChangeToEnglish_It() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("Impostaz.", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_it);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language_it);
		DriverWait.staticWait();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Eng);
		DriverWait.staticWait();
	}

	public void languageChangeToEnglish_Ch() throws IOException, InterruptedException {

		Utility util = new Utility();

		Settings settingsUser = new Settings(innerDriver);
		util.startApp("设置", innerDriver);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_ch);
		DriverWait.staticWait();
		util.click(settingsUser.settings_LanguageAndInput_Language_ch);
		DriverWait.staticWait();
		util.singleScroll();
		util.click(settingsUser.settings_LanguageAndInput_Language_Eng);
		DriverWait.staticWait();
	}

}
