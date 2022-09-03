package com.qa.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		//this import have to add manually

@RunWith(Cucumber.class)
@CucumberOptions( 
		features = "C:\\Users\\sokoeurn chhay\\Selenium_Java_Review\\CucumberWithPOM\\src\\main\\java\\com\\qa\\feature\\techfios.feature", 
//		features = "classpath:features", 
		glue={"com/qa/stepdefinition"},							//the path of the step definition files
		format= {"pretty","html:test-outout", "json:json-output/cucumber.json", "junit:junit-xml/cucumber.xml"},//to generate different types of reporting
		monochrome = true, 									//display the console output in a proper readable format, generate readable format console  output.
		strict = true, 										//it will check if any step is not defined in step definition file
		dryRun = false										//to check the mapping is proper between feature file and step def file
//		tags = {"~@SmokeTest"}			
		)

public class TestRunner {

}
