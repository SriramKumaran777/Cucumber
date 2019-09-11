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

public class AddTariffPlan {
	static WebDriver w;
	@Given("user should be in the Telecome homepages")
	public void user_should_be_in_the_Telecome_homepages() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vnameit\\Cucumber\\driver\\chromedriver.exe");
		 w=new ChromeDriver();
		 w.get("https://demo.guru99.com/telecom/");  
	}

	@Given("user should be click on Add Tariffs")
	public void user_should_be_click_on_Add_Tariffs() {
		w.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	}

	@When("User should be fill all the field with valid dataa")
	public void user_should_be_fill_all_the_field_with_valid_dataa() {
		w.findElement(By.id("rental1")).sendKeys("100");
	    w.findElement(By.id("local_minutes")).sendKeys("100");
	    w.findElement(By.id("inter_minutes")).sendKeys("100");
	    w.findElement(By.id("sms_pack")).sendKeys("100");
	    w.findElement(By.id("minutes_charges")).sendKeys("100");
	    w.findElement(By.id("inter_charges")).sendKeys("100");
	    w.findElement(By.id("sms_charges")).sendKeys("1"); 
	}
	@When("User should be fill all the field with valid dataas")
	public void user_should_be_fill_all_the_field_with_valid_dataas(DataTable tplan) {
		List<List<String>> plan = tplan.asLists(String.class);
		w.findElement(By.id("rental1")).sendKeys(plan.get(1).get(0));
	    w.findElement(By.id("local_minutes")).sendKeys(plan.get(1).get(1));
	    w.findElement(By.id("inter_minutes")).sendKeys(plan.get(0).get(3));
	    w.findElement(By.id("sms_pack")).sendKeys(plan.get(3).get(3));
	    w.findElement(By.id("minutes_charges")).sendKeys(plan.get(4).get(2));
	    w.findElement(By.id("inter_charges")).sendKeys(plan.get(3).get(5));
	    w.findElement(By.id("sms_charges")).sendKeys(plan.get(2).get(6));
	}
	@When("User should be fill all the field with valid dataas.")
	public void user_should_be_fill_all_the_field_with_valid_datas1(DataTable tplan) {
       List<Map<String, String>> plan = tplan.asMaps(String.class, String.class);
        w.findElement(By.id("rental1")).sendKeys(plan.get(1).get("a"));
	    w.findElement(By.id("local_minutes")).sendKeys(plan.get(4).get("b"));
	    w.findElement(By.id("inter_minutes")).sendKeys(plan.get(3).get("c"));
	    w.findElement(By.id("sms_pack")).sendKeys(plan.get(2).get("e"));
	    w.findElement(By.id("minutes_charges")).sendKeys(plan.get(3).get("d"));
	    w.findElement(By.id("inter_charges")).sendKeys(plan.get(0).get("g"));
	    w.findElement(By.id("sms_charges")).sendKeys(plan.get(2).get("f"));	    
	}
	@When("user should be click on submit buttons")
	public void user_should_be_click_on_submit_buttons() {
		w.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("Add Tariff should be displayedd")
	public void add_Tariff_should_be_displayedd() {
		WebElement Tariff = w.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']"));
	    Assert.assertTrue(Tariff.isDisplayed());
	}

}
