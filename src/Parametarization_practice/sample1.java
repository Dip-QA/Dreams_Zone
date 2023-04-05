package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// how to featch String data
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	 String	Value=WorkbookFactory.create(File).getSheet("Sheet4").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(Value);//Welcome
		
		
		
		
		
	}

}
