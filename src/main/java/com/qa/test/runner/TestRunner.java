package com.qa.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="S:\\Personal\\MyWorkspace\\Cucumber_POM\\src\\main\\java\\com\\qa\\features\\appium.feature",
		glue= {"com/qa/stepDefinition"},
		format= {"pretty","html:test-output"},
		dryRun=false,
		monochrome=true,
		strict=true
	//	tags= {"~@smoke","@Regression"}
		
		)

public class TestRunner {

}
