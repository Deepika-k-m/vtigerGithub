package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingNewContactPage {
	//step 1 :locating web element
@FindBy(xpath="//input[@name='lastname']")
private WebElement lastNameTextField;

@FindBy(xpath="//input[@id='title']")
private WebElement titleTextField;

@FindBy(xpath="//input[@id='department']")
private WebElement departmentTextField;

@FindBy(xpath="//input[@id='email']")
private WebElement emailTextField;

@FindBy(xpath="//input[@id='mobile']")
private WebElement mobileTextField;

@FindBy(xpath="//input[@id='mailingstate']")
private WebElement mailingStateTextField;

@FindBy(xpath="//input[@id='mailingcity']")
private WebElement mailingcityTextField;

@FindBy(xpath="//input[@id='mailingcountry']")
private WebElement mailingcountryTextField;

//Initialization
public CreatingNewContactPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getLastNameTextField() {
	return lastNameTextField;
}

public WebElement getTitleTextField() {
	return titleTextField;
}

public WebElement getDepartmentTextField() {
	return departmentTextField;
}

public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getMobileTextField() {
	return mobileTextField;
}

public WebElement getMailingStateTextField() {
	return mailingStateTextField;
}

public WebElement getMailingcityTextField() {
	return mailingcityTextField;
}

public WebElement getMailingcountryTextField() {
	return mailingcountryTextField;
}

public WebElement getSaveButton() {
	return saveButton;
}

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveButton;

/**
 * This is a business library to  create a new Contact
 * @param lastname
 * @param title
 * @param dept
 */

	public void createNewConatct(String lastName,String title,String dept) {
		getLastNameTextField().sendKeys(lastName);
		getTitleTextField().sendKeys(title);
		getDepartmentTextField().sendKeys(dept);
		getSaveButton().click();
	}
	
	/**
	 * This is a business library to create new contact
	 * @param lastname
	 * @param email
	 * @param mobile
	 * @param mailing city
	 */
	//utilization of the elements
	public void createNewContact(String lastName,String email,String mobile,String mailingCity) {
		getLastNameTextField().sendKeys(lastName);
		getEmailTextField().sendKeys(email);
		getMobileTextField().sendKeys(mobile);
		getMailingcityTextField().sendKeys(mailingCity);
		getSaveButton().click();
	}
	/**
	 * This is a business library to create to new contact
	 * @param lastName
	 * @param mobile
	 * @param email
	 * @param mailingCity
	 * @param mailingState
	 * @param mailingCountry
	 */
	public void createNewContact(String lastName, String email, String mobile, String mailingCity, String mailingState, String mailingCountry)
	{
		getLastNameTextField().sendKeys(lastName);
		getMobileTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getMailingcityTextField().sendKeys(mailingCity);
		getMailingStateTextField().sendKeys(mailingState);
		getMailingcountryTextField().sendKeys(mailingCountry);
		getSaveButton().click();
	}
}


//locating
//initializing
//utilizing
