package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6
{
	// How to get Size of the roe
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	Double	Value=(double) WorkbookFactory.create(File).getSheet("Sheet4").getRow(0).getLastCellNum();
		
		System.out.println(Value);//6
		
		
		
	}

}
