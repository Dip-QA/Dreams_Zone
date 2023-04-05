package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample8 
{
	// How to get size cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
 int Value=WorkbookFactory.create(File).getSheet("sheet4").getRow(0).getLastCellNum();	
		
		System.out.println(Value);//5
		
		
		
		
	}

}
