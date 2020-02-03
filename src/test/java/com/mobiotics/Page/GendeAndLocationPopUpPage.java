package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.Constant.BaseTest;

public class GendeAndLocationPopUpPage extends BasePage{
	
	public GendeAndLocationPopUpPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1,this);	
	}
	
	@FindBy(xpath="(//*[@id='ch-state-slct']/div/div/div[1]/div/ul/li[2]/label)[1]")
	private WebElement selectFemaleOption;
	
	@FindBy(xpath="//*[@id='dropBtn']")
	private WebElement clickOnDropDownLocation;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[3]/div/div/button")
	private WebElement clickOnConfirmButton;
	
	public void FillGenAndLocationPoppu() throws InterruptedException
	{
		Thread.sleep(2500);
		//waitTillElementIsClickable(selectFemaleOption);
		selectFemaleOption.click();
		
		Thread.sleep(3500);
		//waitTillTheElementVisible(clickOnDropDownLocation);
		Select select=new Select(clickOnDropDownLocation);
		select.selectByVisibleText("Kerala");
		
		Thread.sleep(3500);
		//waitTillTheElementVisible(clickOnConfirmButton);
		clickOnConfirmButton.click();
		
	}


}
