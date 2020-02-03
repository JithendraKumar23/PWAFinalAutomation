package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class HamburgerMenuPage extends BasePage{
	public HamburgerMenuPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}

	@FindBy(xpath="//div[@id='hamburger-signin-button']")
	private WebElement signInButton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[2]/nav/div/div[2]/div/button")
	private WebElement subscribeNowButton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[2]/nav/ul/li[1]/a")
	private WebElement homeButtonFromSidemenu;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[2]/nav/ul/li[8]/a")
	private WebElement settingsButtonFromSidemenu;
	
	
	public void clickOnSigninButton() throws InterruptedException
	{
		Thread.sleep(2500);
		waitTillElementIsClickable(signInButton);
		signInButton.click();
	}
	
	public void clickOnSubscribeNowButton()
	{
		waitTillElementIsClickable(subscribeNowButton);
		subscribeNowButton.click();
	}
	
	
	public void clickOnHomeButton()
	{
		waitTillElementIsClickable(homeButtonFromSidemenu);
		homeButtonFromSidemenu.click();
	}
	
	public void clickOnSettingsButton()
	{
		waitTillElementIsClickable(settingsButtonFromSidemenu);
		settingsButtonFromSidemenu.click();
	}
	
	

}
