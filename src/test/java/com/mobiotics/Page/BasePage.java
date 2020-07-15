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
	 
	 public void invisibleOfElementForLoader(WebElement element)
	{
	    WebDriverWait wait=new WebDriverWait(driver1, timeout);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}
	 
	 //Loader Handling
	 public boolean isElementDisplayed(WebElement element) {
		    try {
		        WebDriverWait wait = new WebDriverWait(driver1, timeout);
		        wait.until(ExpectedConditions.visibilityOf(element));
		        return element.isDisplayed();
		    } catch (org.openqa.selenium.TimeoutException e) {
		        return false;
		    }
		}
	 
	 public void loaderHandling(WebElement ele1, WebElement ele2)
	 {
		 if (isElementDisplayed(ele1)) 
			{
		        new WebDriverWait(driver1, 60).until(ExpectedConditions.not(ExpectedConditions.visibilityOf(ele1)));
		    }
			else
			{
				waitTillTheElementVisible(ele2);
			}
	 }
	 
	
}