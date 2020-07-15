package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class SignInAuthPage extends BasePage{

	public SignInAuthPage(WebDriver driver1) 
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	
	@FindBy(id="input-password")
	private WebElement passwordinsigninauthpage;
	
	@FindBy(id="login-button")
	private WebElement signinbuttoninsigninauthpage;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void setRegUserPassword(String password)
	{
		loaderHandling(loader,passwordinsigninauthpage);
		passwordinsigninauthpage.sendKeys(password);
	}
	public void clickToLogin()
	{
		waitTillElementIsClickable(signinbuttoninsigninauthpage);
		signinbuttoninsigninauthpage.click();
	}

}
