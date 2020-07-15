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
	
	@FindBy(xpath="//a[@class='nav-menu' and text()='Account']")
	private WebElement clickOnAccountPagemenu;
	
	@FindBy(xpath="//*[@class='btn grad-btn logout-setting']")
	private WebElement clickOnLogOutButton;
	
	@FindBy(xpath="//button[@class='btn grad-btn btn-lg' and text()='YES']")
	private WebElement clickOnYESButtonInLogOutPopup;
	
	@FindBy(xpath="//*[@id='showMenu']")
	private WebElement hambergurMenu;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void clickOnHambergermenu()
	{
		loaderHandling(loader, hambergurMenu);
		hambergurMenu.click();
	}
	
	public void accountPage() throws InterruptedException
	{
		Thread.sleep(2500);
		clickOnAccountPagemenu.click();
	}
	
	public void logOutButton() throws InterruptedException
	{
		Thread.sleep(1500);
		loaderHandling(loader,clickOnLogOutButton);
		JavascriptExecutor js=(JavascriptExecutor)driver1;
		js.executeScript("window.scrollBy(0,3000)");
		//waitTillElementIsClickable(clickOnLogOutButton);
		clickOnLogOutButton.click();
		
		clickOnYESButtonInLogOutPopup.click();
		
		loaderHandling(loader,hambergurMenu);
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
