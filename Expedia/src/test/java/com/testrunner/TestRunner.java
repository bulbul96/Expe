package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="Features",//copy the feature folder
		glue="com.stepdef"//copy stepdef package
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	

}
