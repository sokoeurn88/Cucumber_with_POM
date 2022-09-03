package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fileinputstream = new FileInputStream("C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\CucumberWithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fileinputstream);
		} catch(IOException e) {
			e.getMessage();
		}
	}

	public void initialization() {
		String browserName = prop.getProperty("chrome");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}	
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
}

