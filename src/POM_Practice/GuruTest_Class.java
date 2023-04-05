package POM_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GuruTest_Class
{
	@Test
	public void main () throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/v4/index.php");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// navigate to excelsheet
		FileInputStream File=new FileInputStream("D:\\parameterization\\excellSheet.xlsx");
	 Sheet	sh=WorkbookFactory.create(File).getSheet("Sheet1");
		
		
		
		//CREATE OBJECT OF POM i
		Guru99_homepage1 Login=new Guru99_homepage1(driver);
	 String	UserName=sh.getRow(0).getCell(0).getStringCellValue();
		Login.EnterUn(UserName);
		
		Thread.sleep(2000);
		
	String	Password=sh.getRow(0).getCell(1).getStringCellValue();
		Login.EnterPsw(Password);
		
		
		Thread.sleep(2000);
		
		Login.Login();
		
		Thread.sleep(2000);
		
		//create object of POM II
		Guru99_2 Pop=new Guru99_2();
		Pop.PopUp(driver);
		
		
		
		
		
	}

}
