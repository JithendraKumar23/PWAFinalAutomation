package com.mobiotics.Page;

import java.awt.AWTException;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class LookupPage extends BasePage{
	public LookupPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	
	@FindBy(id="journey-email-lookup")
	private WebElement userName;
	
	@FindBy(id="moble-email-lookup")
	private WebElement btnLogin;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void setUserName(String UserName) throws InterruptedException, AWTException
	{
	
		Thread.sleep(5000);
		if(!loader.isDisplayed())
		{
			waitTillTheElementVisible(userName);
		}
		else
		{
			invisibleOfElementForLoader(loader);
		}
		userName.sendKeys(UserName);
	}
	
	
	public void lookupPageClearingtheField(String UserName) throws InterruptedException
	{
		Thread.sleep(5000);
		if(!loader.isDisplayed())
		{
			waitTillTheElementVisible(userName);
		}
		else
		{
			invisibleOfElementForLoader(loader);
		}
		userName.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		userName.sendKeys(UserName);
		
		//Function will work to clear the text filed
		//userName.clear();
		
	}
	
	
	public void clickToProceed() 
	{
		waitTillElementIsClickable(btnLogin);
		btnLogin.click();
	}
	
	
	
	
	
}