package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatingNewLeadPage {

	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstNameTextField;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastNameTextField;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement companyTextField;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement titleOfTheEmployee;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadSourceOptionDropDown;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOfEmployeesTextField;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobileNumnerTextField;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement emailTextField;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement cityTextField;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement stateTextField;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement countryTextField;
	
	@FindBy(xpath="//input[@accesskey='S']")
	private WebElement saveButton;
	
	//initialization
	public CreatingNewLeadPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Generating getters
	/*
	 * This is generic method is used to pass the firstName of Employee
	 */

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	/**
	 * This is  method i used to pass the lastName
	 * @return
	 */
	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}
	/**
	 * This is a generic method is used to pass the company name 
	 * @return
	 */

	public WebElement getCompanyTextField() {
		return companyTextField;
	}
	/**
	 * This is a generic method is used to pass the designation of the Employee
	 * @return
	 */

	public WebElement getTitleOfTheEmployee() {
		return titleOfTheEmployee;
	}
	/**
	 * This is a generic method is used to select the lead source of employee
	 * @return
	 */

	public WebElement getLeadSourceOptionDropDown() {
		return leadSourceOptionDropDown;
	}
	/**
	 * This is generic method  is used to pass the  no of employees
	 * @return
	 */
	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}
	/**
	 * This is generic method is used to pass the mobile Number 
	 * @return
	 */

	public WebElement getMobileNumnerTextField() {
		return mobileNumnerTextField;
	}
	/**
	 * This is generic method is used to pass the email text field
	 * @return
	 */
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	/**
	 * This is a generic method is used to pass the country name  to the text Field
	 * @return
	 */
	public WebElement getCityTextField() {
		return cityTextField;
	}
	/**
	 * This is the generic method is used to pass the city text field
	 * @return
	 */
	
	public WebElement getStateTextField() {
		return stateTextField;
	}

	/**
	 * This is a generic method is used to pass the state  text field 
	 * @return
	 */

	public WebElement getCountryTextField() {
		return countryTextField;
	}
	/**
	 * This is generic method is used to save the details
	 * @return
	 */
	
	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * This is a business library  to create  new lead
	 * @param fName
	 * @param lName
	 * @param compay
	 */
	public void createNewLeads(String fName, String lName, String company)
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getSaveButton().click();
	}
		/**
		 * This is business library to create new lead
		 * @param fName
		 * @param lName
		 * @param company
		 * @param title
		 * @param mobile
		 * @param email
		 */
	
	public void createNewLead(String fName, String lName, String company, String title, String mobile, String email  )
	{
		getFirstNameTextField().sendKeys(fName);
		getLastNameTextField().sendKeys(lName);
		getCompanyTextField().sendKeys(company);
		getTitleOfTheEmployee().sendKeys(title);
		getMobileNumnerTextField().sendKeys(mobile);
		getEmailTextField().sendKeys(email);
		getSaveButton().click();

	}
		/**
		 * This is business to library to create a new lead
		 * @param lName
		 * @param company
		 * @param leadSource
		 * @param noOfEmployees
		 * @param city
		 * @param country
		 * @param state
		 */
	public void createNewLead(String lName, String company, String leadSource, String noOfEmployees, String city,String  country, String state )
	{
		getLastNameTextField().sendKeys(lName);
		getCityTextField().sendKeys(company);
		Select sel=new Select(getLeadSourceOptionDropDown());
		sel.selectByValue(leadSource);
		getNoOfEmployeesTextField().sendKeys(noOfEmployees);
		getCompanyTextField().sendKeys(company);
		getCountryTextField().sendKeys(country);
		getStateTextField().sendKeys(state);
		getSaveButton().click();
	}
	
	
	
}
