package Sample;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingMultipleDataFromExcelFilePractice {
	public static void main(String[] args) throws Exception{
	FileInputStream fis=new FileInputStream("C:\\Users\\kmdee\\OneDrive\\Pictures\\Documents\\Desktop\\AnimalDataDrivenFrameWorkPractice.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Tiger");
	DataFormatter df=new DataFormatter();
	for(int i=1;i<=sh.getLastRowNum();i++)
	{
		Row r=sh.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++)
		{
		Cell c=r.getCell(j);
		String value =df.formatCellValue(c);
		System.out.println(value);
		
		
		}
	
}
}
}
