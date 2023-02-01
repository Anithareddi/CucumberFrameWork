package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("user navigates an application")
	public void user_navigates_an_application() {
	    
	}

	@When("User enter valid product  {string} into search field")
	public void user_enter_valid_product_into_search_field(String string) {
	    
	}

	@When("User click on search button")
	public void user_click_on_search_button() {
	    
	}

	@Then("User should get valid product displayed in search results")
	public void user_should_get_valid_product_displayed_in_search_results() {
	    
	}

	@When("User enter invalid product  {string} into search field")
	public void user_enter_invalid_product_into_search_field(String string) {
	    
	}

	@Then("User should get a message about no product matching")
	public void user_should_get_a_message_about_no_product_matching() {
	    
	}

	@When("User dont enter product name into search field")
	public void user_dont_enter_product_name_into_search_field() {
	    
	}

}
