package Sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import genericUtility.PropertiesUtility;

public class FetchingDataFromPropertiesFile_Practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		FileInputStream fis=new FileInputStream("C:\\Users\\kmdee\\OneDrive\\Pictures\\Documents\\Desktop\\TestData.properties");
//		Properties prop = new Properties();
//		prop.load(fis);
//		String value = prop.getProperty("Url");
//		driver.get(value);
//		String UN=prop.getProperty("username");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(UN);
//		String PWD=prop.getProperty("password");
//		Thread.sleep(2000);
//		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
//		pass.sendKeys(PWD);
//		pass.submit();
		
	//	System.out.println(value);
//		System.out.println(UN);
//		System.out.println(PWD);
		
		PropertiesUtility putil=new PropertiesUtility();
		String value=putil.getDataFromPropertiesFile("url");
		driver.get(value);
		System.out.println(value);
		String uName=putil.getDataFromPropertiesFile("username");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys(uName);
		driver.get(uName);

		String passWord=putil.getDataFromPropertiesFile("password");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys(passWord);
		driver.get(passWord);
		
	}        

}
