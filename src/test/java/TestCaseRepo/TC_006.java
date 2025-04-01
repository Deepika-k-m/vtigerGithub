package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.ContactsPage;
import objectrepo_pomclass.CreatingNewContactPage;
import objectrepo_pomclass.HomePage;

public class TC_006 extends BaseClass {
	@Test(groups= {"Regression","Smoke","Yellow box"})
	public void Con_003() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickonContactsMenu();
		
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateNewContactIcon();
		
		 String lName = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 1);
	       String email = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 2);
	       String mobile = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 3);
	       String mailingCity  = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 4);
	       String mailingState  = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 5);

	       String mailingCountry  = eUtil.getDataFromExcelFile("ContactsTC ID", 7, 6);

	       
	       CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
	       cncp.createNewContact(lName, email, mobile, mailingCity, mailingState, mailingCountry);
}
}