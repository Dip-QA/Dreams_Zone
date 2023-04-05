package Organization_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBbaseClass1 
{
	WebDriver driver;
	
	@Test
	public void initializeBrouser() throws InterruptedException 
	{
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
	     driver=new ChromeDriver();	
		Thread.sleep(0);;
		
		driver.get("https://www.facebook.com");;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	
	

}
