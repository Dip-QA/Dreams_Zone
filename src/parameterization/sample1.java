package parameterization;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1
{
	// how to fetch/get/retrive/ data from excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// to reach the excelsheet
		FileInputStream  File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		// to open excelsheet
  		      Workbook S1=WorkbookFactory.create(File);
		
		//to enter perticular sheet
  		     Sheet Sh=S1.getSheet("Sheet1");
		
		//To select perticular row 
  		    Row S2=Sh.getRow(0);
		
		// to select perticular cell
  		     Cell S3=S2.getCell(0); 
		
  		// to featch string info 
  		        String Value=S3.getStringCellValue();
  		     System.out.println(Value);
  		     
		
	}
	

}
