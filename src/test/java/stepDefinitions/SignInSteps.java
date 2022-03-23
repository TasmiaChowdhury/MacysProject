package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageActions.SearchAction;

public class SignInSteps {
	
	SearchAction SignInactions =new SearchAction();
	
	@Given("user is on sign in page")
	public void user_is_on_sign_in_page() {
	    SignInactions.getMacysLoginPage();
	}

	@When("user enters user email{String}")                     // passed parameter from where ?? 
	public void user_enters_user_email(String Anemail) {
		SignInactions.clearUserID();
		SignInactions.inputUserEmail(Anemail);
	    
	}

	@When("user enter user passward{String}")
	public void user_enter_user_passward(String Apassword) {
		SignInactions.clearUserID();
		SignInactions.inputUserPassword(Apassword);                    // parameter from where??
	    
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		SignInactions.submit();
	    
	}

	@Then("user is navigated to Macys home page")
	public void user_is_navigated_to_macys_home_page() {
		Assert.assertEquals("getCurrentUrl", "https://www.macys.com/myaccount/home");
	    
	}

}
