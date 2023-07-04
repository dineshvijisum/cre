package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^user is entering google$")
	public void user_is_entering_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Dinesh");
	}

	@When("^user is typing \"([^\"]*)\"$")
	public void user_is_typing(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^enters return Key$")
	public void enters_return_Key() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^the user should see search results$")
	public void the_user_should_see_search_results() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
