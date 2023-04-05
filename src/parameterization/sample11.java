package parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample11
{
	// How to get data of perticular  Row
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream  File=new FileInputStream("C:\\Users\\com\\Downloads\\parametarization\\New Microsoft Excel Worksheet.xlsx");
		
	Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet6");
		// to find lastIndex of cell
	  int  LastCellIndex=Sh.getRow(0).getLastCellNum()-1;//6-1
		
		
	  // take for loop for cell
	        //i=0    0<=5                   1
	                 //1<=5                 2
	                 //2<=5                 3
	                 //3<=5                 4
	                 //4<=5                 5
	                 //5<=5
	 for(int i=0;     i<=LastCellIndex;    i++) 
	 {                                    //5
		String  Value=Sh.getRow(0).getCell(i).getStringCellValue();
		 System.out.print(Value+" ");//Dipa Dinu Suna Subha Aaru Pawar
		 
	 }
	
	
	
		 
	}

}
