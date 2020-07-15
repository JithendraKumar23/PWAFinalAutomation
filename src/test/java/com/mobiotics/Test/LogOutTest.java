package com.mobiotics.Test;

import org.testng.annotations.Test;

import com.mobiotics.Constant.BaseTest;
import com.mobiotics.Page.HamburgerMenuPage;
import com.mobiotics.Page.SettingsPage;


public class LogOutTest extends BaseTest{
	
	@Test(enabled = true)
	public void logout() throws InterruptedException
	{
		
		HamburgerMenuPage hamburgermenu = new HamburgerMenuPage(driver1);
		SettingsPage settingspage = new SettingsPage(driver1);
		
		settingspage.clickOnHambergermenu();
		hamburgermenu.clickOnSettingsButton();
		settingspage.accountPage();
		settingspage.logOutButton();
	}
}