package com.stepdefinition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Background {
	static WebDriver w;
	@Given("User in the Telecome homepagess")
	public void user_in_the_Telecome_homepagess() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Cucumber\\driver\\chromedriver.exe");
		 w=new ChromeDriver();
		 w.get("https://demo.guru99.com/telecom/");
	}

	@Given("user should click on Add Customerss")
	public void user_should_click_on_Add_Customerss() {
		WebElement a = w.findElement(By.xpath("//a[text()='Add Customer']"));
	    a.click();
	}

	@When("User should be fill all the field with valid datass{string},{string},{string},{string},{string}")
	public void user_should_be_fill_all_the_field_with_valid_datass(String fname, String lname, String email, String address, String mobno) {
		WebElement b = w.findElement(By.xpath("//label[text()='Done']"));
	    b.click();
	    WebElement c = w.findElement(By.id("fname"));
	    c.sendKeys(fname);
	    WebElement d = w.findElement(By.id("lname"));
	    d.sendKeys(lname);
	    WebElement e = w.findElement(By.id("email"));
	    e.sendKeys(email);
	    WebElement f = w.findElement(By.name("addr"));
	    f.sendKeys(address);
	    WebElement g = w.findElement(By.id("telephoneno"));
	    g.sendKeys(mobno);
	}

	@When("user should click on submit buttonss")
	public void user_should_click_on_submit_buttonss() {
		WebElement h = w.findElement(By.xpath("//input[@type='submit']"));
	    h.click();
	}

	@Then("Customer ID should be displayedss")
	public void customer_ID_should_be_displayedss() {
		WebElement i = w.findElement(By.xpath("//td[@align='center']"));
		Assert.assertTrue(i.isDisplayed()); 
	}
}
