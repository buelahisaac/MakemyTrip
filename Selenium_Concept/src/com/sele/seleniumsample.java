package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumsample {
	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver","C:\\Users\\ABISAAC\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		WebDriver mount = new ChromeDriver();
		mount.manage().window().maximize();
	}

}                                                   
