package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.CreatingNewLeadPage;
import objectrepo_pomclass.HomePage;
import objectrepo_pomclass.LeadPage;

public class TC_Practice extends BaseClass {
	@Test
	public void testCase() throws EncryptedDocumentException, IOException {
		String fName = eUtil.getDataFromExcelFile("Leads", 1,1);
		String lName= eUtil.getDataFromExcelFile("Leads", 1, 2);
		String company = eUtil.getDataFromExcelFile("Leads", 1, 3);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadPage lep = new LeadPage(driver);
		lep.clickOnCreateNewLeadIcon();
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLeads(fName, lName, company);
				
	}
	

}
