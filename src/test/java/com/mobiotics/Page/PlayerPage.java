package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class PlayerPage extends BasePage {

	public PlayerPage(WebDriver driver1) 
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}

	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div[5]/div[1]/img[2]")
	private WebElement clickOnPlaybutton;
	
	public void clickOnPlayButtononPlayerPage()
	{
		waitTillElementIsClickable(clickOnPlaybutton);
		clickOnPlaybutton.click();
	}
	 	
	
}
