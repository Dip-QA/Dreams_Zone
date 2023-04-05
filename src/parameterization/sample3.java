package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// how to featch the data from Excell sheet
		
		// to reatch to excelsheet
			FileInputStream  File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		// to open the excelsheet
		String	Value=WorkbookFactory.create(File).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(Value);
		
		
		
		
		
		
		
	}

}
