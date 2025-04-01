package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	/**
	 * @author deepika
	 * @version 25.03.11
	 */
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement createNewContactIcon;
	
	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCreateNewContactIcon() {
		return createNewContactIcon;
	}
	
	/**
	 * This is a business library to click on Create new contact icon
	 */
	public void clickOnCreateNewContactIcon() {
		getCreateNewContactIcon().click();
	}
}
