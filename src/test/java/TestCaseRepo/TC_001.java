package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.CreatingNewLeadPage;
import objectrepo_pomclass.HomePage;
import objectrepo_pomclass.LeadPage;
@Listeners(genericUtility.ListernersImplimentation.class)
public class TC_001 extends BaseClass {

	@Test(groups= {"Regression","Smoke"})
	public void LE_001() throws EncryptedDocumentException, IOException
	
	{
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadPage lep = new LeadPage(driver);
		lep.clickOnCreateNewLeadIcon();
		String fName = eUtil.getDataFromExcelFile("Leads", 1,1);
		String lName= eUtil.getDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 1, 3);
		Assert.fail();
		
		
		
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLeads(fName, lName, company);
	}
}
