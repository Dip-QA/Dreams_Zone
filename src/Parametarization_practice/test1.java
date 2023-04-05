package Parametarization_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class test1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");
		
	Sheet	Sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		
		    int Size=Sh.getLastRowNum()+1;//size get
		
		 System.out.println(Size);
		
		
		
		
		
		
		
	}

}
