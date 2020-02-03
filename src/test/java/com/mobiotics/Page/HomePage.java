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
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]")
	private WebElement selectingContentFromFirstSection;
	
	//@FindBy(put loader element here)
	//private We......................................
    
	
	public void clickOnHambergermenu() throws InterruptedException
	{
		//Thread.sleep(10000);
		waitTillTheElementVisible(hambergerMenu);
		hambergerMenu.click();
	}
	
	public void clickOnFirstContent() throws InterruptedException
	{
		Thread.sleep(2500);
		waitTillElementIsClickable(selectingContentFromFirstSection);
		selectingContentFromFirstSection.click();
	}
	
	
}
