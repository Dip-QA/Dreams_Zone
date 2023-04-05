package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample7 
{ 
	// how to get size of the Row 
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	// To navigate Excelsheet
		
  FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	int  Value=WorkbookFactory.create(File).getSheet("Sheet4").getLastRowNum()+1;	
		
		System.out.println(Value);//6
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
