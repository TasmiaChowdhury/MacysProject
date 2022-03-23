package pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

import pageElements.SearchElement;
import utilities.BaseDrivers;

public class SearchAction {
	
	SearchElement searchElement;
	
	public SearchAction(){
		
		searchElement = new SearchElement();
		PageFactory.initElements(BaseDrivers.driver, searchElement);
	}
	
	public void getMacysSearchHomePage(){
		
		BaseDrivers.setChromeDriver();
		BaseDrivers.driver.get("https://www.macys.com");
		BaseDrivers.driver.manage().window().maximize();
		System.out.println(BaseDrivers.driver);
		
	}
	
	public void searchItem(){                                           // used parameter here?
		
		System.out.println("Passing search Item: ");
		searchElement.searchBox.sendKeys("shirt");

	}
	
	public void getMacysLoginPage(){
		BaseDrivers.driver.get("https://www.macys.com/account/signin");
		BaseDrivers.driver.manage().window().maximize();
		
	}
	
	public void inputUserEmail(String InputEmail){                  // where is the parameter coming from??
		System.out.println("passing user email ");
		searchElement.InputEmail.sendKeys(InputEmail);              //??
	
	}
	public void clearUserID(){
		searchElement.InputEmail.clear();	
	}
	public void inputUserPassword(String password){
		System.out.println("passing user password");
		searchElement.InputPassword.sendKeys(password);
		
	}
	public void clearUserPassword(){
		searchElement.InputPassword.clear();
	}
	
	public void submit(){
		searchElement.SubmitKey.click();
		
	}

	

}
