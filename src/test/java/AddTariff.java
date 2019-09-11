
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

public class AddTariff {
	static WebDriver w;
	@Given("user should be in the Telecome homepage")
	public void user_should_be_in_the_Telecome_homepage()  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Cucumber\\driver\\chromedriver.exe");
		 w=new ChromeDriver();
		 w.get("https://demo.guru99.com/telecom/");
	}
	@Given("user should be click on Add Tariff")
	public void user_should_be_click_on_Add_Tariff() {
	    w.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}
	@When("User should be fill all the field with valid data")
	public void user_should_be_fill_all_the_field_with_valid_data() {
	    w.findElement(By.id("rental1")).sendKeys("100");
	    w.findElement(By.id("local_minutes")).sendKeys("100");
	    w.findElement(By.id("inter_minutes")).sendKeys("100");
	    w.findElement(By.id("sms_pack")).sendKeys("100");
	    w.findElement(By.id("minutes_charges")).sendKeys("100");
	    w.findElement(By.id("inter_charges")).sendKeys("100");
	    w.findElement(By.id("sms_charges")).sendKeys("1");
	    
	}
	@When("User should be fill all the field with valid datas")
	public void user_should_be_fill_all_the_field_with_valid_datas(DataTable TariffPlan) {
		List<String> plan = TariffPlan.asList(String.class);
		w.findElement(By.id("rental1")).sendKeys(plan.get(0));
	    w.findElement(By.id("local_minutes")).sendKeys(plan.get(1));
	    w.findElement(By.id("inter_minutes")).sendKeys(plan.get(2));
	    w.findElement(By.id("sms_pack")).sendKeys(plan.get(3));
	    w.findElement(By.id("minutes_charges")).sendKeys(plan.get(4));
	    w.findElement(By.id("inter_charges")).sendKeys(plan.get(5));
	    w.findElement(By.id("sms_charges")).sendKeys(plan.get(6));
	}
	@When("User should be fill all the field with valid datas.")
	public void user_should_be_fill_all_the_field_with_valid_data(DataTable TariffPlan) {
		Map<String, String> plan = TariffPlan.asMap(String.class, String.class);
		w.findElement(By.id("rental1")).sendKeys(plan.get("a"));
	    w.findElement(By.id("local_minutes")).sendKeys(plan.get("b"));
	    w.findElement(By.id("inter_minutes")).sendKeys(plan.get("c"));
	    w.findElement(By.id("sms_pack")).sendKeys(plan.get("d"));
	    w.findElement(By.id("minutes_charges")).sendKeys(plan.get("e"));
	    w.findElement(By.id("inter_charges")).sendKeys(plan.get("f"));
	    w.findElement(By.id("sms_charges")).sendKeys(plan.get("g"));
	}
	@When("user should be click on submit button")
	public void user_should_be_click_on_submit_button() {
	  w.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("Add Tariff should be displayed")
	public void add_Tariff_should_be_displayed() {
	    WebElement Tariff = w.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(Tariff.isDisplayed());
	}

}
