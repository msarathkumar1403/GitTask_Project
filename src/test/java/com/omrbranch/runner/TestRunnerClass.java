package com.omrbranch.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.omrbranch.runner.report.Reporting;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(stepNotifications = true,snippets =SnippetType.CAMELCASE ,dryRun = false,publish = true  ,monochrome = false,plugin = {"pretty","json:target\\output.json"},name = {"Verifying Valid Credentials"},glue= "com.omrbranch.stepdefinition",features = "src\\test\\resources\\Features")
public class TestRunnerClass {
	
	@AfterClass
	public static void afterClass() {		
		Reporting.generateJvmReport("target\\output.json");
		

	}

}
