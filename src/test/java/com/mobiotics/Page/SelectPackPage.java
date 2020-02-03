package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class SelectPackPage extends BasePage{
	
	public SelectPackPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1,this);	
	}
	
	@FindBy(xpath="//*[@id='alt-view']/div[2]/div[1]/div[2]/div[2]/div[1]")
	private WebElement selectPack;
	
	@FindBy(xpath="//*[@id='arrow-design']")
	private WebElement backArrowIconFromSelectPackPage;
	
	public void clickOnSelectPack() throws InterruptedException
	{
		Thread.sleep(3500);
		waitTillTheElementVisible(selectPack);
		selectPack.click();
	}
	
	public void clickBackFromSelectpackPage() throws InterruptedException
	{
		Thread.sleep(5000);
		waitTillTheElementVisible(backArrowIconFromSelectPackPage);
		backArrowIconFromSelectPackPage.click();
	}

	

}
