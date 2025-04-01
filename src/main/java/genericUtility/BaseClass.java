package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectrepo_pomclass.HomePage;
import objectrepo_pomclass.LoginPage;

public class BaseClass {
	public WebDriver driver;
	//public static WebDriver sDriver;   //used only for listeners
	public SeleniumUtility sUtil = new SeleniumUtility();
	public PropertiesUtility pUtil = new PropertiesUtility();
	public ExcelUtility eUtil = new ExcelUtility();
	
	
	@BeforeSuite(alwaysRun = true)
	public void dbConnection()
	{
		System.out.println("DB connection wass created");
	}
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser() throws IOException
	{
	driver = new ChromeDriver();
	sUtil.maximizeWindow(driver);
	sUtil.implicitWait(driver, 15);
	String URL = pUtil.getDataFromPropertiesFile("url");
	sUtil.navigateToApplication(driver, URL);
	System.out.println("application opened successfully");
	}
	@BeforeMethod(alwaysRun=true)
	public void loginOperation() throws IOException {
		LoginPage lp = new LoginPage(driver);
		String UN = pUtil.getDataFromPropertiesFile("username");
		String PWD = pUtil.getDataFromPropertiesFile("password");
		lp.LoginToApplication(UN, PWD);
		System.out.println("Login successful");
	}
	@AfterMethod(alwaysRun=true) 
	public void signOutOperation()
	{
		HomePage hp = new HomePage(driver);
		hp.signoutOperation(driver);
		System.out.println("logout successful");
			
	}
	@AfterClass(alwaysRun=true) 
	public void closeBrowser() {
		driver.quit();
		System.out.println("browser closed succesfully");
	}
	@AfterSuite(alwaysRun=true)
	public void closeDBConnection() {
		System.out.println("DB connection closed");
	}
	
}		
		

