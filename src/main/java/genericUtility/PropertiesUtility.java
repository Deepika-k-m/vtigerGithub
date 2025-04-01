package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is an utility class which deals with properties file
 * @author Deepika
 * @version 28.02.25
 *
 */
public class PropertiesUtility {
	/***
	 * This is a generic method to fetch a data from properties file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
public String getDataFromPropertiesFile(String key) throws IOException {
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData\\TestData.properties");
	Properties prop=new Properties();
	prop.load(fis);
	String value=prop.getProperty(key);
	return value;
	
}
}
