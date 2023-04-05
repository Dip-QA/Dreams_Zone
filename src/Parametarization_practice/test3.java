package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");
		
	Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		
	// to featch data from perticular column
	
	       //i=0     0<=5
	 for(int i=0;    i<=5;  i++) 
	 {                      //0
		 String S1=Sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println(S1);//Shakti
	 }
		
		
		
		
		
		
		
	}

}
