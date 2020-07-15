package com.mobiotics.Constant;

import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;

import generic.ExcelUserData;
import generic.Property;
import generic.Screenshot;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

@Listeners(generic.Listeners.class)
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
	
	/*ExtendReport Related*/
    public static ExtentReports report;
    public static ExtentTest test;
	
	//ExcelUserData package, To read the data from the config
	public static String ExcelFileName = "User_Information_Automation.xlsx";
    public static String ExcelFilePath = System.getProperty("user.dir") + "\\ExcelData\\";
    public static String Excelsheetname = "User_Data";
    public static int row = 0;
    public static int col = 0;

	public void initFrameWork() throws IOException {
		URL = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "URL");
		//To get the data from the Config 
		UN = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "UN");
		//PW = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "PW");
		
		//To get the Data form the ExcelSheet
		//UN=ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,0,0);
		PW=ExcelUserData.dataFromExcelSheet(ExcelFilePath,ExcelFileName,Excelsheetname,0,1);

		//timeout = Long.parseLong(Property.getPropertyValue(CONFIG_PATH + CONFI "IMPLICIT"));
		timeout = Long.parseLong(Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "EXPLICIT"));

		deviceName = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "deviceName");
		udid = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "udid");
		platformname = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "platformname");
		platFormVersion = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "platFormVersion");
		browserName = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "browsername");
		
		appPackage = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "appPackage");
		appActivity = Property.getPropertyValue(CONFIG_PATH + CONFIG_FILE, "appActivity");
	}

	//@BeforeTest
	@BeforeSuite
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
	
	
	@AfterSuite(alwaysRun=true)
	public void CloseFramework()
	{
		driver1.close();
	}
	
	
	@BeforeTest
	public void Extent()
	{
        report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReports\\" +"Extend_Reports.html",true,DisplayOrder.NEWEST_FIRST, NetworkMode.OFFLINE);
	}
	
	
	@AfterTest
	public void GenerareReport()
	{
		//To Generate the Extent Report 
		report.flush();
	}
	
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshot shot = new Screenshot();
			String path = shot.getScreenshot(result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(path));
		}
	}
}