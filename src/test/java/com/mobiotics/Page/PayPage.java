package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mobiotics.Constant.BaseTest;

public class PayPage extends BasePage{
	public PayPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1,this);	
	}
	
	@FindBy(xpath="//*[@id='arrow-design']")
	private WebElement backArrowIconFromPayPage;
	
	@FindBy(xpath="//*[@id='alt-loader']/div/div")
	private WebElement loader;
	
	
	 
	
	
	public void clickBackFromPayPage() throws InterruptedException
	{
		loaderHandling(loader,backArrowIconFromPayPage);
		backArrowIconFromPayPage.click();
	}

}
