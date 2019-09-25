package com.ihg.nativeapp.screens;

import org.openqa.selenium.support.PageFactory;

import com.ihg.nativeapp.drivers.DriverCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PermissionsGrantingModelPage  extends DriverCapabilities{
	
	public PermissionsGrantingModelPage(AppiumDriver<MobileElement> innerDriver) {
		PageFactory.initElements(new AppiumFieldDecorator(innerDriver), this);
	}

	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_icon")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_permissionIcon;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_message")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_permissionMsg;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_permissionDeny;
	
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_permissionAllow;
	
	/*@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;
	
	@AndroidFindBy(id = "")
	// @iOSFindBy(name = "")
	public MobileElement PermissionsGrantingModelPage_;*/
}
