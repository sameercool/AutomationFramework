package StepDefinitions;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   
	    System.out.println("user goes to login page");
	}

	@When("user enters login and password")
	public void user_enters_login_and_password() {
	    System.out.println("user enters email and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	   System.out.println("user clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	   System.out.println("user is logged in to home page");
	   
	}
}
