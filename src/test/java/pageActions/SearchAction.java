package pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import pageElements.SearchElement;
import utilities.BaseDrivers;

public class SearchAction {
	
	WebDriver driver;
	SearchElement searchElement;
	
	public SearchAction(){
		
		searchElement = new SearchElement(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void getMacysSearchHomePage(){
		
		BaseDrivers.setChromeDriver();
		BaseDrivers.driver.get("https://www.macys.com");
		BaseDrivers.driver.manage().window().maximize();
		System.out.println(BaseDrivers.driver);
		//searchElement.searchBox.sendKeys("shirt");
		
	}
	
	public void searchItem(){                                           // used parameter here?
		
		System.out.println("Passing search Item: ");
		//searchElement.searchBox.sendKeys("shirt");

	}

	

}
