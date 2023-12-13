package com.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABISAAC\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	}
}
