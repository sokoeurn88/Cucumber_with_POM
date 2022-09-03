package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factor
	@FindBy(xpath = "//input[@name='username']") WebElement username;
	@FindBy(xpath = "//input[@name='password']") WebElement password;
	@FindBy(xpath = "//button[text()='Sign in']") WebElement signin_button;
	@FindBy(xpath = "//img[@class ='logo']") WebElement techfios_logo;

	
	
	public HomePage loginCredential(String un, String pw) {
		username.sendKeys(un);
		password.sendKeys(pw);
		return new HomePage();
	}
	
	public boolean validate_Techfios_Logo() {
		return techfios_logo.isDisplayed();
	}
	
	
	
	
	
	
	// initialization page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}
