package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.util.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//h2[@style='color: #2F4050; font-size: 16px; font-weight: 400; margin-top: 18px']") WebElement seedashaboard;
	
	public void verifyDashboard() {
		seedashaboard.isDisplayed();
	}

}
