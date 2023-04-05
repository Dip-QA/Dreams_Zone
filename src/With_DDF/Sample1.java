package With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();	
		Thread.sleep(2000);
		
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		
	// to navigate ExcelSheet
	
	 FileInputStream File=new FileInputStream("D:\\parameterization\\New Microsoft Excel Worksheet.xlsx");
	
	   Sheet Sh=WorkbookFactory.create(File).getSheet("Sheet11");
	
	
	    //Enter UN
	 String  Username=Sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
	Thread.sleep(2000);
	
	  // Enter Pw
	          String  Password=Sh.getRow(0).getCell(1).getStringCellValue();
	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	   Thread.sleep(2000);
	   
	  // click on login button
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(2000);
	   
	   // Expected result
	    String   ActualUN=Sh.getRow(0).getCell(2).getStringCellValue();
	    String  ExpectedUN="Paul Collings";
	 
	    		
	    
	    if(ExpectedUN.equals(ActualUN)) 
	    {
	    	System.out.println("Pass");
	    }
	    else 
	    {
	    	System.out.println("Fail");
	    }
	    
	    driver.close();
	
	}
	

}
