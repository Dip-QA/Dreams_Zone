package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample12
{
	// How to featch the data from the cell
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		// navigate to excelsheet
		
		FileInputStream File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	Sheet	Sh=WorkbookFactory.create(File).getSheet("Sheet7");
		
		int LastRowIndex=Sh.getLastRowNum();
		
		// take for loop for Rows
		
		       //i=0    0<=5                 1
		               //1<=5                2
		              //2<=5                 3
		               //3<=5                4
		               //4<=5                5
		               //5<=5                6
		               //6<=5
		for(int i=0;    i<=LastRowIndex;    i++) 
		{                         //5
		    String  Value=Sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Value);//Dipa Arun Pawar Dinu Subha Suna
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
		
}
