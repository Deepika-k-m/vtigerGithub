package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.ContactsPage;
import objectrepo_pomclass.CreatingNewContactPage;
import objectrepo_pomclass.HomePage;

public class TC_004 extends BaseClass {
	@Test(groups= {"Regression","Smoke","Sanity"})
	public void Con_001() throws EncryptedDocumentException, IOException
	{
       HomePage hp = new HomePage(driver);
       hp.clickonContactsMenu();
       
       ContactsPage cp = new ContactsPage(driver);
       cp.clickOnCreateNewContactIcon();
       
       String lName = eUtil.getDataFromExcelFile("ContactsTC ID", 1, 1);
       String title = eUtil.getDataFromExcelFile("ContactsTC ID", 1, 2);
       String company = eUtil.getDataFromExcelFile("ContactsTC ID", 1, 3);
       
       CreatingNewContactPage cncp = new CreatingNewContactPage(driver);
       cncp.createNewConatct(lName, title, company);
}
}