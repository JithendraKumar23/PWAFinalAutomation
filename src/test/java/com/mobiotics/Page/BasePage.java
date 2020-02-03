package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobiotics.Constant.BaseTest;

public class BasePage extends BaseTest{
	
	public long timeout;
	public String configFile;
	public WebDriver driver1;

	public BasePage(WebDriver driver1)
	{
		this.driver1=driver1;
		PageFactory.initElements(driver1,this);
		//configFile=AutomationConstant.CONFIG_PATH+AutomationConstant.CONFIG_FILE;
		//timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
	}
	
	public void waitTillTheElementVisible(WebElement element) 
	{
	WebDriverWait wait=new WebDriverWait(driver1, timeout);
	wait.until(ExpectedConditions.visibilityOf(element));
	}	

	 public void waitTillElementIsClickable(WebElement element)
	{
    WebDriverWait wait=new WebDriverWait(driver1, timeout);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
}