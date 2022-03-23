package stepDefinitions;

import io.cucumber.java.en.Given;
import pageActions.SearchAction;

public class SearchSteps {
	
	SearchAction searchAction = new SearchAction();
	

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		
		searchAction.getMacysSearchHomePage();
		//searchAction.searchItem();
		
	}

}
