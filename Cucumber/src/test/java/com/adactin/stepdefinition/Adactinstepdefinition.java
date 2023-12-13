package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.AdactinRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactinstepdefinition {
	


public static WebDriver driver=AdactinRunner.driver;
@Given("^User Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
    driver.get("https://adactinhotelapp.com/");
	}

	@When("^User Enter the Username in Username Field$")
	public void user_Enter_the_Username_in_Username_Field() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		user.sendKeys("shalom123");
	    
	}

	@When("^User Enter the Password in Password Field$")
	public void user_Enter_the_Password_in_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("Buelah@12");
	   }

	@Then("^User Click the Login Button$")
	public void user_Click_the_Login_Button() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		login.click();
		}

	@When("^user Select the Location in Location field$")
	public void user_Select_the_Location_in_Location_field() throws Throwable {
		WebElement drop = driver.findElement(By.xpath("//select[@name='location']"));
		Select select= new Select(drop);
		select.selectByIndex(5);
	    }

	@When("^user Select the Hotels in Hotels Field$")
	public void user_Select_the_Hotels_in_Hotels_Field() throws Throwable {
		WebElement down = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select dropdown=new Select(down);
		dropdown.selectByIndex(1);
	    }

	@When("^user Select the Room_Type in Room_Type Field$")
	public void user_Select_the_Room_Type_in_Room_Type_Field() throws Throwable {
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select a=new Select(drop1);
		a.selectByValue("Double");
	    
	}

	@When("^user Select the Number of Rooms in Number of Rooms Field$")
	public void user_Select_the_Number_of_Rooms_in_Number_of_Rooms_Field() throws Throwable {
		WebElement drop3=driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select c=new Select(drop3);
		c.selectByVisibleText("6 - Six");
	    
	}

	@When("^user Select the Check In Date in Check In Date Field$")
	public void user_Select_the_Check_In_Date_in_Check_In_Date_Field() throws Throwable {
		WebElement down4 =
				  driver.findElement(By.xpath("//input[@name='datepick_in']")); down4.clear();
				  down4.sendKeys("18-09-2022");
	    
	}

	@When("^user Select the Check Out Date in Check Out Date Field$")
	public void user_Select_the_Check_Out_Date_in_Check_Out_Date_Field() throws Throwable {
		WebElement down5 =
				  driver.findElement(By.xpath("//input[@name='datepick_out']")); down5.clear();
				  down5.sendKeys("24-09-2022");
				 
	    
	}

	@When("^user Select the Adults per room in Adults per Room Field$")
	public void user_Select_the_Adults_per_room_in_Adults_per_Room_Field() throws Throwable {
		WebElement drop6=driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select e=new Select(drop6);
		e.selectByVisibleText("2 - Two");
	    
	}

	@When("^user Select the Children's per Room in Children's Room Field$")
	public void user_Select_the_Children_s_per_Room_in_Children_s_Room_Field() throws Throwable {
		WebElement down6 = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select f=new Select(down6);
		f.selectByIndex(1);
	    
	}

	@Then("^user Click the Search Button$")
	public void user_Click_the_Search_Button() throws Throwable {
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
	    
	}

	@When("^user Select the Hotel$")
	public void user_Select_the_Hotel() throws Throwable {
	    
	}

	@Then("^user Click the Continue Button$")
	public void user_Click_the_Continue_Button() throws Throwable {
		WebElement cont= driver.findElement(By.xpath("//input[@name='continue']"));
		cont.click();
	    
	}

	@When("^user Fill the Firstname in Firstname Field$")
	public void user_Fill_the_Firstname_in_Firstname_Field() throws Throwable {
		WebElement first = driver.findElement(By.xpath("//input[@name='first_name']"));
		first.sendKeys("sureya");
	    
	}

	@When("^user Fill the Lastname in Billing Field$")
	public void user_Fill_the_Lastname_in_Billing_Field() throws Throwable {
		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
	last.sendKeys("kumaran");
	    
	}

	@When("^user Fill the Credit Card Number in Credit Card Number Field$")
	public void user_Fill_the_Credit_Card_Number_in_Credit_Card_Number_Field() throws Throwable {
		WebElement card = driver.findElement(By.xpath("//input[@name='cc_num']"));
		card.sendKeys("6678678945637895");
	    
	}

	@When("^user Select the Credit Card Type in Credit card type Field$")
	public void user_Select_the_Credit_Card_Type_in_Credit_card_type_Field() throws Throwable {
		WebElement credit = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select num=new Select(credit);
		num.selectByIndex(1);
	    
	}

	@When("^user Select the Expire Month in Select Month Field$")
	public void user_Select_the_Expire_Month_in_Select_Month_Field() throws Throwable {
		WebElement exp = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select expiry=new Select(exp);
		expiry.selectByIndex(3);
	    
	}

	@When("^user Select the Expire Year in Select Year Field$")
	public void user_Select_the_Expire_Year_in_Select_Year_Field() throws Throwable {
		WebElement expi = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select year=new Select(expi);
		year.selectByIndex(5);
	    
	}

	@When("^user Fill the CVV Number in CVV Number Field$")
	public void user_Fill_the_CVV_Number_in_CVV_Number_Field() throws Throwable {
		WebElement number = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		number.sendKeys("678");
	    
	}

	@Then("^user Click the Book Now Button$")
	public void user_Click_the_Book_Now_Button() throws Throwable {
		WebElement book= driver.findElement(By.xpath("//input[@id='book_now']"));
	book.click();
	    
	}

	@Then("^user Click the Logout Button$")
	public void user_Click_the_Logout_Button() throws Throwable {
		WebElement logout= driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		logout.click();
	    
	}



}
