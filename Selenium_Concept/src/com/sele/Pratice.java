package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.openqa.selenium.support.ui.Select;

public class Pratice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABISAAC\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().window().maximize();
			
			WebElement box = driver.findElement(By.xpath("//input [@name='download']"));
			Select a =new Select(box);
			a.selectByIndex(0);
			a.selectByIndex(1);
			
			List<web>
 
	}
}
