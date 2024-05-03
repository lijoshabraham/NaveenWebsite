package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class AccountRegisterPage extends TestBase{
	
	public AccountRegisterPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "#content h1")
	WebElement RegisterAccHeading;
	
	public String getAccountRegisterHeadingText() {
		return RegisterAccHeading.getText();
	}

}
