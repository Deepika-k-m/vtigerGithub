package TestCaseRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectrepo_pomclass.CreatingNewLeadPage;
import objectrepo_pomclass.HomePage;
import objectrepo_pomclass.LeadPage;

public class TC_003 extends BaseClass{
	@Test(groups= {"Smoke"})
	public void LE_003() throws EncryptedDocumentException, IOException
	{
		HomePage hp = new HomePage(driver);
		hp.clickOnLeadsMenu();
		
		LeadPage lep = new LeadPage(driver);
		lep.clickOnCreateNewLeadIcon();
		
		String lName = eUtil.getDataFromExcelFile("Leads", 7, 1);
		
		
		String company = eUtil.getDataFromExcelFile("Leads", 7, 2);
		String lead = eUtil.getDataFromExcelFile("Leads", 7, 3);
		String noofemployees = eUtil.getDataFromExcelFile("Leads", 7, 4);
		String city = eUtil.getDataFromExcelFile("Leads", 7, 5);
		String country = eUtil.getDataFromExcelFile("Leads", 7, 6);
		String state = eUtil.getDataFromExcelFile("Leads", 7, 7);
		
		CreatingNewLeadPage cnlp = new CreatingNewLeadPage(driver);
		cnlp.createNewLead(lName, company, lead, noofemployees, city, country, state);
	}

}
