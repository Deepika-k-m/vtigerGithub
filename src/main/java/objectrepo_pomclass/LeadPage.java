package objectrepo_pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {
	@FindBy(xpath="//img[@title='Create Lead...']")
	private WebElement createNewLeadIcon;

	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateNewLeadIcon() {
		return createNewLeadIcon;
	}
	
	/** 
	 * this is a business library to click on new lead icon
	 */
	
	public void clickOnCreateNewLeadIcon() {
		getCreateNewLeadIcon().click();
	}
	
}
