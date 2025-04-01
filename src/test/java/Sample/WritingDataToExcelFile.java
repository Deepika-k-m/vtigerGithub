package Sample;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.JavaUtility;

public class WritingDataToExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
			//FileInputStream fis = new FileInputStream(""C:\Users\kmdee\OneDrive\Pictures\Documents\Desktop\AnimalDataDrivenFrameWorkPractice.xlsx"");
		//	Workbook wb = WorkbookFactory.create(fis);
		//	Sheet sh = wb.getSheet("cat");
		//	Row r = sh.createRow(2);
		//	Cell c = r.createCell(2);
		//	c.setCellValue("lotus");
		//	FileOutputStream fos = new FileOutputStream(""C:\Users\kmdee\OneDrive\Pictures\Documents\Desktop\AnimalDataDrivenFrameWorkPractice.xlsx"");
		//	wb.write(fos);
		//ExcelUtility eUtil = new ExcelUtility();
		//eUtil.writeDataToExcelFile("cat", 1, 1, "heee");
		
			JavaUtility jUtil = new JavaUtility();
			int value = jUtil.generateRandomNumber(1000);
			System.out.println(value);
			
			String datestamp = jUtil.getCalendarDetails("dd-MM-YYYY");
			System.out.println(datestamp);
			
			
			String datetimestamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
			System.out.println(datetimestamp);
			

	}

}
