package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test4
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");	
		
    Sheet	Sh=WorkbookFactory.create(File).getSheet("Sheet1");	
		
		// featch data from perticular row
    
       for(int i=0;  i<=2;   i++) 
       {
    	  String S1=Sh.getRow(3).getCell(i).getStringCellValue();
    	   System.out.println(S1);
       }
		
		
		
		
	}

}
