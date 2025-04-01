package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Locating WebElment
	
	@FindBy(name = "user_name")
	private WebElement usernameTextField;
	
	@FindBy(name = "user_password")
	private WebElement passwordTextField;
	
	@FindBy(id = "submitButton")
	private WebElement loginButton;
	
	//Initializing WebElements
	 public LoginPage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
	 }
	 // getter

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	/**
	 * this is a business library to perform login operation to application
	 * @param username
	 * @param password
	 */
	
     public  void LoginToApplication(String username, String password) {
    	 getUsernameTextField().sendKeys(username);
    	 getPasswordTextField().sendKeys(password);
    	 getLoginButton().click();
    	 
     }
	 
	 

}
