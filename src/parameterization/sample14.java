package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample14 
{
	// How to get all data from excelsheet
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	        Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet10");
		
		     int  LasRowIndex=Sh.getLastRowNum();//6
		
		for(int i=0;    i<=LasRowIndex;      i++) 
		{
		     int LastCellIndex=Sh.getRow(i).getLastCellNum()-1;
			
		     for(int a=0; a<=LastCellIndex;  a++) 
		     {
		    	 String Value=Sh.getRow(i).getCell(a).getStringCellValue();
		    	 System.out.print(Value+" ");
		     }
			  System.out.println();
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
