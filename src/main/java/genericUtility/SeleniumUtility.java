package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility{
	/** 
	 * this is a generic method to access a wed application
	 * @param url
	 */
	public void navigateToApplication(WebDriver driver,String url) {
		driver.get(url);
	}
	
	/**
	 * this is a generic method to maximize the browser
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}
	/** this is generic method to provide the implicit wait
	 * @param driver
	 * @param maxtime
	 */
	public void implicitWait(WebDriver driver, int maxTime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	
	/** This is a generic method to scroll the webpage to a webelement
	 * @param <WebEelement>
	 * @param driver
	 * @param element
	 
	 */
	public void scrollingOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
		
		
	}
	
	/** this is generic method to perform mouse hovering action on a webelement
	 * @param driver
	 * @param element
	 
	 */
	public void mouseHoveringAction(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	/** this is generic method to perform double click operation on a webelement
	 * @param driver
	 * @param element
	 */
	public void doubleClickOperation(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	////////////////HANDLING ALERT////////////////
 
	
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	/** this is generic method used to cancel alert popup
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	
	/** this is generic method used to get alert popup message
	 * @param driver
	 */
	public String getAlertMesage(WebDriver driver) {
		String value = driver.switchTo().alert().getText();
		return value;
		
		
	}
	/** this is generic method used to send 
	 * @param driver
	 * @param value
	 */
	public void sendValuetoAlert(WebDriver driver, String value) {
		driver.switchTo().alert().sendKeys(value);
		
	}
	//////////////HANDLING DROPDOWN/////////////
	/** this generic method is used to  select an option in dropdown using its index
	 * @param driver
	 * @param index
	 */
	public void selectOptionByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	}
	/** this generic method used to select an option in dropdown using its value attribute
	 * @param element
	 * @param value
	 */
	public void selectOptionByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);
		
	}

	/** this generic method used to select an option in dropdown using its visible text
	 * @param element
	 * @param visbleText
	 */
	public void selectOptionByVisibleText(WebElement element, String visibleText) {
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
		
	}
	////////////// TAKING SCREENSHOT/////////////
	/**
	 * this is a generic method to take the screenshot of the webpage
	 * @param driver
	 * @param dateTimeStamp
	 * @return
	 * @throws IOException
	 */
	public String takeScreenShot(WebDriver driver, String dateTimeStamp) throws IOException {
		TakesScreenshot ts =(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshot\\image - "+dateTimeStamp+" .png");
	    Files.copy(src, dest);
		return dest.getAbsolutePath();     // for listener
				
	}

		
	}
	
	



