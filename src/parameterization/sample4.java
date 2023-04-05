package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample4
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// how to featch Numeric data from execSheet
		
		// to reach to excelsheet
		 FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		// to navigate to excelSheet
		 Double Value=WorkbookFactory.create(File).getSheet("Sheet2").getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(Value);
		
		
		
		
		
		
		
		
	}

}
