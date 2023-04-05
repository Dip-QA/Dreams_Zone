package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class test5
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");	
		
		
	Sheet	Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		// featch all data 
	
	  int  RowINdex=Sh.getLastRowNum();
	
	  for(int i=0;   i<=RowINdex;   i++) 
	  {
		 int CellIndex=Sh.getRow(i).getLastCellNum()-1;
		 
		  for(int a=0;  a<=CellIndex;     a++) 
		  {
			  
			 String  Value=Sh.getRow(i).getCell(a).getStringCellValue();
			  System.out.print(Value+ " ");
		  }
		  System.out.println();
		  
		  
		  
		  
	  }
	
	
	
	
		
		
	}

}
