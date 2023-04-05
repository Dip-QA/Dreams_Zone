package POM_DDF_TestNg_Baseclass_Utilityclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class1 
{ 
	      WebDriver driver;         // globally declare
	
	public void initializeBrouser() throws InterruptedException 
	{
		
  System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 driver=new ChromeDriver();
		 
		Thread.sleep(2000);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		 
		 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
