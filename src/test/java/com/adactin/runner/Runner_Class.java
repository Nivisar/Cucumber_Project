package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Cucumber_Base.Adactin_Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature",
glue = "com.adactin.stepdefinition",
monochrome = true,
dryRun = false,
strict = true,
tags = ("@smoketest"),
plugin = {"html:Report/HtmlReport",
		"pretty",
		"json:Report/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html"
})

public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver = Adactin_Base.browser("chrome");
	}
	@AfterClass
	public static void tearDown() {
		driver = Adactin_Base.close();
		

	}
}
