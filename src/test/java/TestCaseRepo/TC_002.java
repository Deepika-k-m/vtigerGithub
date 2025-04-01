package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.CreatingNewLeadPage;
import objectrepo_pomclass.HomePage;
import objectrepo_pomclass.LeadPage;

public class TC_002 extends BaseClass {
	@Test(groups= {"Regression"})
	public void LE_002() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadPage lep = new LeadPage(driver);
		lep.clickOnCreateNewLeadIcon();
		
		String fName = eUtil.getDataFromExcelFile("Leads", 4, 1);
		String lName = eUtil.getDataFromExcelFile("Leads", 4, 2);
		
		String company = eUtil.getDataFromExcelFile("Leads", 4, 3);
		String title = eUtil.getDataFromExcelFile("Leads", 4, 4);
		String mobile = eUtil.getDataFromExcelFile("Leads", 4, 5);
		String email = eUtil.getDataFromExcelFile("Leads", 4, 6);
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(fName, lName, company, title, mobile, email);
		
	}

}
