package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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
	
	@FindBy(xpath="//*[@id='searchInput']")
	private WebElement clickOnSearchbuttonOnList;
	
	@FindBy(xpath="//*[@id='dropdown_content']/ul/li")
	private WebElement SelectLocationFromSearchedList;
	
	@FindBy(xpath="//*[@id='ch-state-slct']/div/div/button")
	private WebElement clickOnConfirmButton;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	public void FillGenAndLocationPoppu() throws InterruptedException
	{
		Thread.sleep(2000);
		loaderHandling(loader,selectFemaleOption);
		selectFemaleOption.click();

		waitTillTheElementVisible(clickOnDropDownLocation);
		clickOnDropDownLocation.click();
		clickOnSearchbuttonOnList.click();
		clickOnSearchbuttonOnList.sendKeys("Kerala");
		SelectLocationFromSearchedList.click();
		
		//Thread.sleep(3500);
		waitTillTheElementVisible(clickOnConfirmButton);
		clickOnConfirmButton.click();	
	}
}