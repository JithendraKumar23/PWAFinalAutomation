package com.mobiotics.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.Constant.BaseTest;

public class ShowDetailPage extends BasePage {

	public ShowDetailPage(WebDriver driver1)
	{
		super(driver1);
		PageFactory.initElements(BaseTest.driver1, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/img")
	private WebElement favouriteIconFromDetail;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/div[1]")
	private WebElement clickContentFromList;
	
	public void clickOnfavIconInDetailPage()
	{
		waitTillElementIsClickable(favouriteIconFromDetail);
		favouriteIconFromDetail.click();
	}
	
	public void clickOnContentFromListInDetailPage()
	{
		waitTillElementIsClickable(clickContentFromList);
		clickContentFromList.click();
	}

}
