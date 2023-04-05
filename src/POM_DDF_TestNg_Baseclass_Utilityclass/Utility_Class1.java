package POM_DDF_TestNg_Baseclass_Utilityclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Utility_Class1
{
	//Automation TE:@Dipali Pawar
	//Day : Thursday
	//Date : 20-10-22
	// Featch Data from property file
	
	
	  @Test                                       //PSW
	public static String getdatafromPF(String key) throws IOException 
	{
		// to reach Property file 
   FileInputStream File=new FileInputStream("C:\\Users\\com\\eclipse-workspace\\11th_june_selenium\\Orangepf.properties");		
		
		// to oen property file 
          Properties Prop=new Properties();
		    Prop.load(File);
		
		// To get data of property file  //PSW
		  String  Value1=Prop.getProperty(key);   //admin123
		
		  return Value1;
		
		  
	}
	
	//Automation TE:@Dipali
		 //Day:Friday
		 //Date:22-10-22
		 // To featch data from ExcelSheet
		@Test                             //0            //0
	  public static String getdataofEs(int RowIndex, int CellIndex) throws EncryptedDocumentException, IOException 
	  {
		  FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");
			
	Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet2");
	                               //0                //0
	      String Value1= Sh.getRow(RowIndex).getCell(CellIndex).getStringCellValue();
		  
	          return  Value1;
	      
	  }
	  
	  
	  //Automation TE:@Dipali
	   //Date:22-10-22	
	   //Day:Friday	
	   // Capture screenshot
		@Test                                                    //100
		public static void Capturscreenshot(WebDriver driver, int TestCaseId) throws IOException 
		{
			
			File   Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			                                                //100
			  File Destination=new File("D:\\Screenshots\\."+TestCaseId +".jpg");
			
			 FileHandler.copy(Soarce, Destination);
			
		}
	  
	  
	  
	  
	  
	  
	  
	  
}
