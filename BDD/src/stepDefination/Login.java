package stepDefination;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
  //WebDriver driver;
	@Given("^User is on facebook  login page$")
	public void user_is_on_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  // WebDriver driver =new ChromeDriver();
	   
	}

	@When("^I entered the valid credntionals$")
	public void i_entered_the_valid_credntionals() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^I was able to see the facebook login page$")
	public void i_was_able_to_see_the_facebook_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}

}
