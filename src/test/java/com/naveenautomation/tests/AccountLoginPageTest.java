package com.naveenautomation.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.AccountRegisterPage;

public class AccountLoginPageTest extends TestBase {
	
	AccountLoginPage page;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}

	@Test
	public void validateLogin() {

		page = new AccountLoginPage();
		page.submitLogin("lijosh@gmail.com", "password");
	}
	
	@Test
	public void validateContinueBtn() {
		page.clickContinue();
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}