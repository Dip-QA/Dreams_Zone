package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5 
{
	// How to get Size of thr Row
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	int Value=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum()+1;
		
		System.out.println(Value);//7
		
		
	}

}
