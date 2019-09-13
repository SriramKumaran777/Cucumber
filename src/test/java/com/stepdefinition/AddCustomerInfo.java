package com.stepdefinition;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;




public class AddCustomerInfo {
static WebDriver w;
	@Given("User in the Telecome homepage")
	public void user_in_the_Telecome_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Cucumber\\driver\\chromedriver.exe");
		 w=new ChromeDriver();
		 w.get("https://demo.guru99.com/telecom/");
	}

	@Given("user should click on Add Customer")
	public void user_should_click_on_Add_Customer() {
		WebElement a = w.findElement(By.xpath("//a[text()='Add Customer']"));
	    a.click();
	}

	@When("User should fill all the field with valid data")
	public void user_should_fill_all_the_field_with_valid_data() {
	    WebElement b = w.findElement(By.xpath("//label[text()='Done']"));
	    b.click();
	    WebElement c = w.findElement(By.id("fname"));
	    c.sendKeys("Sriram");
	    WebElement d = w.findElement(By.id("lname"));
	    d.sendKeys("Kumaran");
	    WebElement e = w.findElement(By.id("email"));
	    e.sendKeys("Sriram.k5@cognizant.com");
	    WebElement f = w.findElement(By.name("addr"));
	    f.sendKeys("Kumbakonam");
	    WebElement g = w.findElement(By.id("telephoneno"));
	    g.sendKeys("8883080622");
	    
	}
	@When("User should fill all the field with valid datas")
	public void user_should_fill_all_the_field_with_valid_datas(DataTable UserData) {
		WebElement b = w.findElement(By.xpath("//label[text()='Done']"));
	    b.click();
	    List<String> data = UserData.asList(String.class);
	    WebElement c = w.findElement(By.id("fname"));
	    c.sendKeys(data.get(0));
	    WebElement d = w.findElement(By.id("lname"));
	    d.sendKeys(data.get(1));
	    WebElement e = w.findElement(By.id("email"));
	    e.sendKeys(data.get(2));
	    WebElement f = w.findElement(By.name("addr"));
	    f.sendKeys(data.get(3));
	    WebElement g = w.findElement(By.id("telephoneno"));
	    g.sendKeys(data.get(4));
	      
	}
	@When("User should fill all the field with valid datas.")
	public void user_should_fill_all_the_field_with_valid_data(DataTable UserData) {
		WebElement b = w.findElement(By.xpath("//label[text()='Done']"));
	    b.click();
	    Map<String, String> data = UserData.asMap(String.class, String.class);
	    WebElement c = w.findElement(By.id("fname"));
	    c.sendKeys(data.get("fname"));
	    WebElement d = w.findElement(By.id("lname"));
	    d.sendKeys(data.get("lname"));
	    WebElement e = w.findElement(By.id("email"));
	    e.sendKeys(data.get("email"));
	    WebElement f = w.findElement(By.name("addr"));
	    f.sendKeys(data.get("address"));
	    WebElement g = w.findElement(By.id("telephoneno"));
	    g.sendKeys(data.get("mobno"));
	}
	@When("user should click on submit button")
	public void user_should_click_on_submit_button() {
	    WebElement h = w.findElement(By.xpath("//input[@type='submit']"));
	    h.click();
	}

	@Then("Customer ID should be displayed")
	public void customer_ID_should_be_displayed() {
WebElement i = w.findElement(By.xpath("//td[@align='center']"));
Assert.assertTrue(i.isDisplayed());
	}
}
