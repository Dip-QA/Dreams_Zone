package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Progress_report 
{
	// Featch all data from Progress report
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Documents\\Progress report.xlsx");
		
             Sheet	Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		  int LastRowIndex=Sh.getLastRowNum();
		
		for(int i=0; i<=LastRowIndex;  i++) 
		{
		     int LastCellIndex=Sh.getRow(i).getLastCellNum()-1;
			
		      for(int a=0; a<=LastCellIndex; a++) 
		      {
		    	 String  Value=Sh.getRow(i).getCell(a).getStringCellValue();
		    	 System.out.print(Value+" ");
		      }
			   System.out.println();
			
			
		}  
		  
		  
		  
		  
		  
		
		
		
		
		
		
	}

}
