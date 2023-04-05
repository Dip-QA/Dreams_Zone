package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3
{  // How to get Boolean type of info
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		 boolean Value=WorkbookFactory.create(File).getSheet("Sheet4").getRow(3).getCell(2).getBooleanCellValue(); 
		
		System.out.println(Value);
	}

}
