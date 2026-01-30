package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundEx {
	
	@Given("Url for home Page")
	public void url_for_home_page() {
	    System.out.println("HomePage");
	}

	@When("Correct username and password")
	public void correct_username_and_password() {
	    System.out.println("Correct Credentials");
	}

	@Then("Login Successful")
	public void login_successful() {
	   System.out.println("Login Successfull");
	}

	@When("blank username")
	public void blank_username() {
	   System.out.println("Blank username");
	}

	@Then("Login Failed")
	public void login_failed() {
	   System.out.println("Login failed");
	}


}
