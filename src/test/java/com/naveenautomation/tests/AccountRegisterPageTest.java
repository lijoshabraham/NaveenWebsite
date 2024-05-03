package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountRegisterPage;

public class AccountRegisterPageTest extends TestBase{
	
	AccountRegisterPage registerPage;
	
	@BeforeMethod
	public void launchBrowser() {
		intialisation();
	}
	
	@Test
	public void validateRegisterAccountHeaderText() {

		String headerText = registerPage.getAccountRegisterHeadingText();

		Assert.assertEquals("Register Account", headerText);

	}
}
