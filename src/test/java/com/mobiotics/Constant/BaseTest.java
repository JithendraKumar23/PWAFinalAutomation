package com.mobiotics.Constant;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import generic.Property;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest implements AutomationConstant {

	public static AppiumDriver< MobileElement> driver1;	
	public static String URL;
	public static String UN;
	public static String PW;

	public static long IMPLICIT;
	public static long EXPLICIT;

	public static long timeout;
	public static String deviceName;
	public static String udid;
	public static String platformname;
	public static String platFormVersion;
	public static String browserName; 
	
	public static String appPackage;
	public static String appActivity;

	public void initFrameWork() {
		URL = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "URL");
		UN = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "UN");
		PW = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "PW");

		//timeout = Long.parseLong(Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "IMPLICIT"));
		timeout = Long.parseLong(Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "EXPLICIT"));

		deviceName = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "deviceName");
		udid = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "udid");
		platformname = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "platformname");
		platFormVersion = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "platFormVersion");
		browserName = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "browsername");
		
		appPackage = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "appPackage");
		appActivity = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "appActivity");
	}

	@BeforeTest
	public void initApplication() throws Exception {
		initFrameWork();

		DesiredCapabilities capabilities = new DesiredCapabilities(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, platformname);
		capabilities.setCapability(MobileCapabilityType.VERSION, platFormVersion);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//		capabilities.setCapability(MobileCapabilityType.UDID, udid);
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, browserName);
		
//		capabilities.setCapability("appPackage", "com.android.chrome"); 
//		capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
		
		driver1=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		driver1.get(URL);
	}
}