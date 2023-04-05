package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample2
{
	@Test 
	public void TC2() throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://kite.zerodha.com");
		
		
		
	}
	
	
	
	
	
	
	

}
