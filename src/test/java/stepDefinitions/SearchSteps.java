package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pageActions.SearchAction;
import pageElements.SearchElement;
import utilities.BaseDrivers;

public class SearchSteps {
	
	WebDriver driver;
	SearchElement se;
	BaseDrivers bd;

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		
		bd = new BaseDrivers();
		
		bd.setChromeDriver();
		bd.driver.get("https://www.macys.com");
		
	}
	
	@When("user enters item in searchbox")
	public void user_enters_item_in_searchbox() {
		
		se = new SearchElement(driver);
		se.getSearch().sendKeys("shirt");
		se.getTest().click();
	}

}
