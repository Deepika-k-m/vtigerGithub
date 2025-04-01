package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.ContactsPage;
import objectrepo_pomclass.CreatingNewContactPage;
import objectrepo_pomclass.HomePage;

public class TC_005 extends BaseClass {
	@Test(groups= {"Regression","Smoke","functionality"})
	public void Con_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickonContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		 String lName = eUtil.getDataFromExcelFile("ContactsTC ID", 4, 1);
	       String email = eUtil.getDataFromExcelFile("ContactsTC ID", 4, 2);
	       String mobile = eUtil.getDataFromExcelFile("ContactsTC ID", 4, 3);
	       String mailing  = eUtil.getDataFromExcelFile("ContactsTC ID", 4, 4);
	       
	       CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
	       cncp.createNewContact(lName, email, mobile, mailing);
	}

}
