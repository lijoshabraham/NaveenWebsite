package com.naveenautomation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naveenautomation.TestBase.TestBase;
import com.naveenautomation.pages.AccountLoginPage;
import com.naveenautomation.pages.EditrAffiliateInfoPage;
import com.naveenautomation.pages.MyAccountPage;
import com.naveenautomation.utility.Utility;

public class EditrAffiliateInfoPageTest extends TestBase {
	AccountLoginPage page;
	MyAccountPage myAccountPage;
	EditrAffiliateInfoPage editrAffiliateInfoPage;

	@BeforeMethod
	public void launchBrowser() {
		intialisation();
		page = new AccountLoginPage();
	}

	@Test()
	public void validateUserCanEditAffiliateInformation() {
		myAccountPage = page.submitLogin("lijosh@gmail.com", "password");
		editrAffiliateInfoPage = myAccountPage.clickEditAffiliateInfoBtn();
		myAccountPage =  editrAffiliateInfoPage.submitAffiliateInformation(Utility.generateRandomString(4),
				Utility.generateRandomString(4), Utility.generateRandomString(4), Utility.generateRandomString(4));
		String bannerText = myAccountPage.getaffiliateAccountUpdateAlertText();
		Assert.assertEquals(bannerText, " Success: Your account has been successfully updated.");
	}

	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}

}
