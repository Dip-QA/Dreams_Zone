package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2
{
	// How to get Numeric Value
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// to naviagate to Excelsheet
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	 Double	Value=WorkbookFactory.create(File).getSheet("Sheet4").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(Value);
		
		
	}

}
