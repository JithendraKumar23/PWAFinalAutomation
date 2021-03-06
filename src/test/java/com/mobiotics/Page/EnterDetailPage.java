package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobiotics.Constant.BaseTest;


public class EnterDetailPage extends BasePage{
	public EnterDetailPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement enterPassword;
	
	@FindBy(xpath="//*[@id='alt-view']/div[2]/div[1]/div[1]/div[3]/div/div[1]")
	private WebElement clickAgerangeDropDown;
	
	@FindBy(xpath="//*[@id='alt-view']/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[3]")
	private WebElement selectAgefromdropdown;
	
	@FindBy(xpath="//*[@id='new-journey-email-signup-button']")
	private WebElement clickContinueButtonForSignUp;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void setNewPassword(String password) throws InterruptedException
	{
		loaderHandling(loader,enterPassword);
		enterPassword.sendKeys(password);
	}
	
	public void selectAgeRange()
	{
		waitTillElementIsClickable(clickAgerangeDropDown);
		clickAgerangeDropDown.click();
		selectAgefromdropdown.click();
		clickContinueButtonForSignUp.click();
	}

}
