package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	@Before
	public void setup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("http://tutorialsninja.com/demo/");
	}
		@After
		public void tearDown() {
			driver.close();
		}
	
	@Given("User  navigate to  Register Account Page")
	public void user_navigate_to_register_account_page() {
	WebElement element =driver.findElement(By.xpath("//span[normalize-space()='My Account']"));
	Actions Action = new Actions(driver) ;
	Action.moveToElement(element).perform();
	WebElement element1=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	Action.moveToElement(element1).click();
	   
	}

	@When("User  enters the  details into below fields")
	public void user_enters_the_details_into_below_fields(DataTable dataTable) {
	}

	@When("User  selects Privacy Policy")
	public void user_selects_privacy_policy() {
	    
	}

	@When("User  clicks on contionu button")
	public void user_clicks_on_contionu_button() {
	    
	}

	@Then("User account should get created  successfully")
	public void user_account_should_get_created_successfully() {
	    
	}

	@When("User selects Yes for Newsletter")
	public void user_selects_yes_for_newsletter() {
	    
	}

	@Then("User should get a warning message about duplicate emil")
	public void user_should_get_a_warning_message_about_duplicate_emil() {
	    
	}

	@Given("User navigates to Register Account Page")
	public void user_navigates_to_register_account_page() {
	    
	}

	@When("user dont enter any details into fields")
	public void user_dont_enter_any_details_into_fields() {
	    
	}

	@When("User click on  continue button")
	public void user_click_on_continue_button() {
	    
	}

	@Then("User should get a warning message for every manadatory field")
	public void user_should_get_a_warning_message_for_every_manadatory_field() {
	    
	}


}
