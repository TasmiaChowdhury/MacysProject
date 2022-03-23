package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchElement {

	@FindBy(id="globalSearchInputField")
	public WebElement searchBox;

	@FindBy (xpath="//*[text()='Sign Up']")
	public WebElement SignInButton;
	
	@FindBy (xpath="//input[@id='email']")
	public WebElement InputEmail;                  // Should we use this  later as the parameter of action or steps def??
	
	@FindBy (xpath="//input[@id='pw-input']")
	public WebElement InputPassword;
	
	@FindBy(xpath="//input[@id='sign-in']")
	public WebElement SubmitKey;
}
