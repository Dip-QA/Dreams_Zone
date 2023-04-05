package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample6
{  // how to get last row index
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");	
		
	// To get last Row index 	
		
	  int  	Value=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum();
		
		System.out.println(Value);//5
		
		
	}

}
