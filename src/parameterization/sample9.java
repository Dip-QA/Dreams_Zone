package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample9 
{
	// how to get last index of cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		int Value=WorkbookFactory.create(File).getSheet("Sheet4").getRow(0).getLastCellNum()-1;
		
		 System.out.println(Value);//5
		
		
		
		
		
		
		
	}

}
