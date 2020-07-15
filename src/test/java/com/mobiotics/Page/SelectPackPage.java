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
	
	@FindBy(xpath="(//div[@class='new-plan'])[1]")
	private WebElement selectPack;
	
	@FindBy(xpath="//*[@id='arrow-design']")
	private WebElement backArrowIconFromSelectPackPage;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	
	public void clickOnSelectPack() 
	{
		loaderHandling(loader,selectPack);
		selectPack.click();
	}
	
	public void clickBackFromSelectpackPage() throws InterruptedException
	{
		loaderHandling(loader,backArrowIconFromSelectPackPage);
		backArrowIconFromSelectPackPage.click();
	}

	

}
