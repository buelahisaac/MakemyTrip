package com.myntra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_Kids {
	
	public static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABISAAC\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		driver.manage().window().maximize();

		Actions c = new Actions(driver);

		List<WebElement> allProduct = driver.findElements(By.xpath("//li[@class='product-base']"));

		System.out.println(allProduct.size());

		for (WebElement name : allProduct) {
			System.out.println(name.getText());
		}
		
		
		System.out.println("minium price= ");
		
		List <WebElement>all_products=driver.findElements(By.xpath("//span[@class='product-discountedPrice']"));
		List<Integer>li=new ArrayList<Integer>();
		for(WebElement webElement:all_products) {
			String all_price = webElement.getText();
			String price_no=all_price.replace("Rs. ", "");
			
			li.add(Integer.parseInt(price_no));
			
			}
		Integer min=Collections.min(li);
		System.out.println(min);
		
	}
	
	
}
	
	

	
