package POM_WithDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_class1
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//navigate to sheet
		FileInputStream File=new FileInputStream("D:\\parameterization\\New Microsoft Excel Worksheet.xlsx");
		
	Sheet	sh=WorkbookFactory.create(File).getSheet("Sheet11");		
		
		
		//create object of POMI
	OrangeHRMLoginpage1 D1=new OrangeHRMLoginpage1(driver);
	// featch username
	  String UserName=sh.getRow(0).getCell(0).getStringCellValue();
	   D1.EnterUn(UserName);
	   
	   // FEATCH pW
	  String   Password=sh.getRow(0).getCell(1).getStringCellValue();
		D1.EnterPw(Password);
		
		D1.Login();
		
		
	// create object of POM II
	OrangeHrmPMIpage1  G1=new OrangeHrmPMIpage1(driver);
	// featch Expected Result
	String ExpectedUN=sh.getRow(0).getCell(2).getStringCellValue();
	
	  G1.VerifyResult(ExpectedUN);
	
	
	
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
}
