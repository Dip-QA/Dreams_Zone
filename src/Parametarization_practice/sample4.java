package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample4
{
	// How to get last roe index
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// to naviugate to Excelsheet
		
	FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");	
		
	int	Value=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum();
		System.out.println(Value);//6
		
	}

}
