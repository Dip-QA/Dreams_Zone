package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// how to featch data from excelsheet
		
		// reach to excel sheet
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		// to open the file 
	Workbook S1=WorkbookFactory.create(File);
		
		// to enter perticular sheet 
	     Sheet S2=S1.getSheet("Sheet1");
		
		// to highlight the row 
	     Row S3=S2.getRow(0);
		
		// to highlight column index
	       Cell S4=S3.getCell(0);
		
		//to get sring info
	       String Value=S4.getStringCellValue();
	       
	       System.out.println(Value);
	       
	       
	       
	       
	       
		
	}

}
