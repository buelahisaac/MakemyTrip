package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ABISAAC\\eclipse-workspace\\Cucumber\\src\\test\\java\\Adactin\\feature\\adc.feature",
glue="com.adactin.stepdefinition")

 class AdactinRunner {
	public static WebDriver driver;
	@BeforeClass
	
	
	public static void browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABISAAC\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void close() {
		driver.close();
	}
	
		

	public static void main(String[] args) {
		
		
	}

}
