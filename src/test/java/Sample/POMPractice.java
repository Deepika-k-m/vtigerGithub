package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class POMPractice
{
   @FindBy(id = "name")
   WebElement element;
   
   
   public POMPractice(WebDriver driver) {
	   PageFactory.initElements(driver,this);
   }
   
   
	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility sUtil = new SeleniumUtility();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		sUtil.navigateToApplication(driver,"https://demoapps.qspiders.com/ui?scenario=1");
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver, 15);
		POMPractice p = new POMPractice(driver);
		p.element.sendKeys("robin");
		driver.navigate().refresh();
		p.element.sendKeys("robin");
		
	}	
		

}


