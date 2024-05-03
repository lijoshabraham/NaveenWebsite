package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.ChangePwdPage;
import com.naveenautomation.pages.MyAccountPage;

public class MyAccountPageTest extends TestBase {

	AccountLoginPage page;
	MyAccountPage myAccountPage;
	ChangePwdPage changePwdPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}
	
	@Test
	public void validateLogin() {
		AccountLoginPage page = new AccountLoginPage();
		myAccountPage = page.submitLogin("lijosh@gmail.com", "password");
		
		String accountPageText = myAccountPage.getMyAccountText();
		Assert.assertEquals("My Account", accountPageText, "Expected and actual result doesn't match");
	}

	@Test
	public void validatePasswordUpdate() {


		myAccountPage=page.submitLogin("lijosh@gmail.com", "password");

		changePwdPage=myAccountPage.clickChangePasswordBtn();

		myAccountPage=changePwdPage.updatePassword("Password2", "Password2");

		String pwdAlertMessage = myAccountPage.getPasswordUpdateAlertText();

		Assert.assertEquals("Success: Your password has been successfully updated.", pwdAlertMessage);

	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}