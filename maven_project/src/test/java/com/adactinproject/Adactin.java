package com.adactinproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABISAAC\\eclipse-workspace\\Selenium_Concept\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
	user.sendKeys("shalom123");
	WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("Buelah@12");
	WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
	login.click();
	
	WebElement drop = driver.findElement(By.xpath("//select[@name='location']"));
	Select select= new Select(drop);
	select.selectByIndex(5);
	
	WebElement down = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select dropdown=new Select(down);
	dropdown.selectByIndex(1);
	
	WebElement drop1 = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select a=new Select(drop1);
	a.selectByValue("Double");
	
	WebElement drop3=driver.findElement(By.xpath("//select[@id='room_nos']"));
	Select c=new Select(drop3);
	c.selectByVisibleText("6 - Six");
	
	/*
	 * WebElement down4 =
	 * driver.findElement(By.xpath("//input[@name='datepick_in']")); down4.clear();
	 * down4.sendKeys("18-09-2022");
	 */
	
	/*
	 * WebElement down5 =
	 * driver.findElement(By.xpath("//input[@name='datepick_out']")); down5.clear();
	 * down5.sendKeys("24-09-2022");
	 */
	
	WebElement drop6=driver.findElement(By.xpath("//select[@name='adult_room']"));
	Select e=new Select(drop6);
	e.selectByVisibleText("2 - Two");
	
	WebElement down6 = driver.findElement(By.xpath("//select[@name='child_room']"));
	Select f=new Select(down6);
	f.selectByIndex(1);
	
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	search.click();
	
	WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	radio.click();
	
	WebElement cont= driver.findElement(By.xpath("//input[@name='continue']"));
	cont.click();
	
	WebElement first = driver.findElement(By.xpath("//input[@name='first_name']"));
	first.sendKeys("sureya");
	
	WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
	last.sendKeys("kumaran");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	address.sendKeys("21 abcd");
	
	WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
	card.sendKeys("6678678945637895");
	
	WebElement credit = driver.findElement(By.xpath("//select[@name='cc_type']"));
	Select num=new Select(credit);
	num.selectByIndex(1);
	
	WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	Select expiry=new Select(exp);
	expiry.selectByIndex(3);
	
	WebElement expi = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	Select year=new Select(expi);
	year.selectByIndex(5);
	
	WebElement number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	number.sendKeys("678");
	
	WebElement book= driver.findElement(By.xpath("//input[@id='book_now']"));
	book.click();
	Thread.sleep(5000);
	
	WebElement radio1 =driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	  radio1.click();
	 
	WebElement cont1= driver.findElement(By.xpath("//input[@id='continue']"));
	  cont1.click();
	 
	
	WebElement logout= driver.findElement(By.xpath("//input[@id='logout']"));
	logout.click();
	
	}



	
}





