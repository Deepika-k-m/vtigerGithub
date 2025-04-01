package Sample;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetachingDataFromExcelFilePractice {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream("C:\\Users\\kmdee\\OneDrive\\Pictures\\Documents\\Desktop\\AnimalDataDrivenFrameWorkPractice.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Tiger");
//		Row r=sh.getRow(1);
//		Cell c=r.getCell(0);
//		String value=c.getStringCellValue();
//		System.out.println(value);
		ExcelUtility eutil = new ExcelUtility();
		
		String value1 = eutil.getDataFromExcelFile( "cat", 3, 3);
		String value2 = eutil.getDataFromExcelFile( "dog", 1, 1);
		System.out.println(value1);
		System.out.println(value2);
	}

}
