package com.naveenautomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.TestBase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(css = "#logo img")
	WebElement naveenLogo;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateNaveenLogo() {
		return naveenLogo.isDisplayed();
	}

}
