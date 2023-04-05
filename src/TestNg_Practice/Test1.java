package TestNg_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1
{
	
	@BeforeClass
	public void OpenBrouser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@BeforeMethod
	public void Login(WebDriver driver) 
	{
		
	}
	
	@Test
	public void Tc1() 
	{
		
	}

	@AfterMethod
	public void LogOut()
	{
		
		
	}
	
	@AfterClass
	public void Close() 
	{
		
		
	}
	
	
	
	
	
	
	
	
}
