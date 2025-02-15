package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefinition"},monochrome=true,
plugin= {"pretty","json:rep\\reports.json","html:rep\\ht.html","junit:rep\\cucumber.xml"},
tags={"not @sanity and not @smoke"})

public class TestRunner {
	@AfterClass
	public static void reportGeneration() {
		
		//JvmReport.generateJvmReport("Reports\\reports.json");

	}
	

}	
