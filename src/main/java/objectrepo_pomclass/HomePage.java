package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="//a[text()='Leads' and @href='index.php?module=Leads&action=index']")
	private WebElement leadsMenu;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement contactsMenu;

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement accountsIcon;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signoutOption;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLeadsMenu() {
		return leadsMenu;
	}

	public WebElement getContactsMenu() {
		return contactsMenu;
	}

	public WebElement getAccountsIcon() {
		return accountsIcon;
	}

	public WebElement getSignoutOption() {
		return signoutOption;
	}
	/**
	 *  this is a business library which click on contact menu
	 */
	
	public void clickOnLeadsMenu() {
		getLeadsMenu().click();
	}
    /**
     * this is a business library which click on contact menu
     
     */
	public void clickonContactsMenu() {
		getContactsMenu().click();
	}
	
	/**
	 *  this is a business library is to perform signout operation
	 */
	public void signoutOperation( WebDriver driver) {
		Actions act = new Actions(driver);
		act.moveToElement(getAccountsIcon()).perform();
		getSignoutOption().click();
	}
}
