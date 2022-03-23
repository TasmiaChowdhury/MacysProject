package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDrivers {

	public static WebDriver driver;

	public static void setChromeDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void setFirefoxDriver() {}
	
	public static void setIeDriver() {}
	
	public static WebDriver getDriver(){
		return driver;
	}
	
	public static void quitDriver(){
		driver.quit();
	}
	
}
