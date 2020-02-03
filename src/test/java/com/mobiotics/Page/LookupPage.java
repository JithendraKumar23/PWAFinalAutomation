package com.mobiotics.Page;

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
	
	public void setUserName(String UserName) throws InterruptedException
	{
		Thread.sleep(5000);
		waitTillTheElementVisible(userName);
		userName.sendKeys(UserName);
	}
	public void clickToProceed() 
	{
		waitTillElementIsClickable(btnLogin);
		btnLogin.click();
	}
}