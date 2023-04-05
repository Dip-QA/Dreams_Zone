package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// how to featch the boolean data from ExcelSheet
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
		 boolean Value=WorkbookFactory.create(File).getSheet("Sheet3").getRow(0).getCell(0).getBooleanCellValue();
		 System.out.println(Value);
		
		
				
	}

}
