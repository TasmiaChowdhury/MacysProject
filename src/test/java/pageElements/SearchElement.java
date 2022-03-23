package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseDrivers;

public class SearchElement {

	WebDriver driver;

	public SearchElement(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	By searchbox = By.id("globalSearchInputField");
	By test = By.id("registry-link");
	
	public WebElement getTest(){
		return driver.findElement(test);
	}
	
	public WebElement getSearch(){
		
		return driver.findElement(searchbox);
	}

//	@FindBy(id="globalSearchInputField")
//	public WebElement searchBox;
//
//	public void getMacysSearchHomePage(){
//
//		BaseDrivers.setChromeDriver();
//		BaseDrivers.driver.get("https://www.macys.com");
//		BaseDrivers.driver.manage().window().maximize();
//		searchBox.sendKeys("shirt");
//	}
}
