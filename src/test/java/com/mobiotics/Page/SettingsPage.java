package com.mobiotics.Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class SettingsPage extends BasePage {
	
	public SettingsPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/nav/a[2]")
	private WebElement clickOnAccountPagemenu;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/input")
	private WebElement clickOnLogOutButton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div[2]/button")
	private WebElement clickOnYESButtonInLogOutPopup;
	
	@FindBy(xpath="//*[@id='showMenu']")
	private WebElement hambergurMenu;
	
	public void clickOnHambergermenu() throws InterruptedException
	{
		Thread.sleep(2500);
		waitTillTheElementVisible(hambergurMenu);
		hambergurMenu.click();
	}
	
	public void accountPage()
	{
		waitTillElementIsClickable(clickOnAccountPagemenu);
		clickOnAccountPagemenu.click();
	}
	
	public void logOutButton()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,3000)");
		waitTillElementIsClickable(clickOnLogOutButton);
		clickOnLogOutButton.click();
		
		clickOnYESButtonInLogOutPopup.click();
		
		try
		{
			if(hambergurMenu.isDisplayed())
			{
				System.out.println("LogOut Is success");
			}
		}
		catch(Exception e)
		{
			System.out.println("LogOut Failed...");
		}
	}
	

}
