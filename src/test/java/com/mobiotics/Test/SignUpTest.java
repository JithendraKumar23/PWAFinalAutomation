package com.mobiotics.Test;

import org.testng.annotations.Test;

import com.mobiotics.Constant.BaseTest;
import com.mobiotics.Page.EnterDetailPage;
import com.mobiotics.Page.GendeAndLocationPopUpPage;
import com.mobiotics.Page.HamburgerMenuPage;
import com.mobiotics.Page.HomePage;
import com.mobiotics.Page.LookupPage;
import com.mobiotics.Page.PayPage;
import com.mobiotics.Page.PlayerPage;
import com.mobiotics.Page.SelectPackPage;
import com.mobiotics.Page.ShowDetailPage;

public class SignUpTest extends BaseTest{
	@Test(enabled = true)
	public void lookuppage_signUp() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver1);
		HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
		LookupPage lookuppage = new LookupPage(driver1);
		SelectPackPage selectpackpage = new SelectPackPage(driver1);
		EnterDetailPage enterdetailpage = new EnterDetailPage(driver1);
		PayPage paypage = new PayPage(driver1);
		GendeAndLocationPopUpPage genandloc = new GendeAndLocationPopUpPage(driver1);
		//ShowDetailPage showdetailpage = new ShowDetailPage(driver1);
		//PlayerPage playerpage = new PlayerPage(driver1);
		
		
	//homepage.blockNotification();
	homepage.clickOnHambergermenu();
	hamburgermenu.clickOnSigninButton();
	lookuppage.setUserName(UN);
	lookuppage.clickToProceed();
	selectpackpage.clickOnSelectPack();
	enterdetailpage.setNewPassword(PW);
	enterdetailpage.selectAgeRange();
	paypage.clickBackFromPayPage();
	selectpackpage.clickBackFromSelectpackPage();
	genandloc.FillGenAndLocationPoppu();
	
	}
	
	/*
	@Test(priority=3 , enabled=false)
	public void subscribenowbutton_signUp() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver1);
		HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
		LookupPage lookuppage = new LookupPage(driver1);
		SelectPackPage selectpackpage = new SelectPackPage(driver1);
		EnterDetailPage enterdetailpage = new EnterDetailPage(driver1);
		PayPage paypage = new PayPage(driver1);
		GendeAndLocationPopUpPage genandloc = new GendeAndLocationPopUpPage(driver1);
		//ShowDetailPage showdetailpage = new ShowDetailPage(driver1);
		//PlayerPage playerpage = new PlayerPage(driver1);
		
		
	homepage.clickOnHambergermenu();
	hamburgermenu.clickOnSubscribeNowButton();
	selectpackpage.clickOnSelectPack();
	lookuppage.setUserName(UN);
	lookuppage.clickToProceed();
	enterdetailpage.setNewPassword(PW);
	enterdetailpage.selectAgeRange();
	paypage.clickBackFromPayPage();
	selectpackpage.clickBackFromSelectpackPage();
	genandloc.FillGenAndLocationPoppu();
	
	}

	@Test(priority=5 , enabled=false)
	public void fromFavouriteIcon_signUp() throws InterruptedException
	{
		HomePage homepage = new HomePage(driver1);
		HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
		LookupPage lookuppage = new LookupPage(driver1);
		SelectPackPage selectpackpage = new SelectPackPage(driver1);
		EnterDetailPage enterdetailpage = new EnterDetailPage(driver1);
		//PayPage paypage = new PayPage(driver1);
		GendeAndLocationPopUpPage genandloc = new GendeAndLocationPopUpPage(driver1);
		ShowDetailPage showdetailpage = new ShowDetailPage(driver1);
		//PlayerPage playerpage = new PlayerPage(driver1);
		
	showdetailpage.clickOnfavIconInDetailPage();
	lookuppage.setUserName(UN);
	lookuppage.clickToProceed();
	selectpackpage.clickOnSelectPack();
	enterdetailpage.setNewPassword(PW);
	enterdetailpage.selectAgeRange();
	homepage.clickOnHambergermenu();
	hamburgermenu.clickOnHomeButton();	
	//Some pop up is displaying need to check
	genandloc.FillGenAndLocationPoppu();	
	}

	@Test(priority=7 , enabled=false)
	public void fromContetDetailpage_signUp() throws InterruptedException
	{
		//HomePage homepage = new HomePage(driver1);
		//HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
		LookupPage lookuppage = new LookupPage(driver1);
		SelectPackPage selectpackpage = new SelectPackPage(driver1);
		EnterDetailPage enterdetailpage = new EnterDetailPage(driver1);
		PayPage paypage = new PayPage(driver1);
		GendeAndLocationPopUpPage genandloc = new GendeAndLocationPopUpPage(driver1);
		ShowDetailPage showdetailpage = new ShowDetailPage(driver1);
		PlayerPage playerpage = new PlayerPage(driver1);
		
	showdetailpage.clickOnContentFromListInDetailPage();
	playerpage.clickOnPlayButtononPlayerPage();
	selectpackpage.clickOnSelectPack();
	lookuppage.setUserName(UN);
	lookuppage.clickToProceed();
	enterdetailpage.setNewPassword(PW);
	enterdetailpage.selectAgeRange();
	paypage.clickBackFromPayPage();
	selectpackpage.clickBackFromSelectpackPage();
	genandloc.FillGenAndLocationPoppu();
		
	}*/
}