package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.mobiotics.Constant.BaseTest;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}

	@FindBy(xpath="//*[@id='showMenu']")
	private WebElement hambergerMenu;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void clickOnHambergermenu() throws InterruptedException
	{
		loaderHandling(loader, hambergerMenu);
		hambergerMenu.click();
	}	
	
}
