package Scroll_Fun_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample1 
{
	
	@Test
	public void M1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("https://demo.guru99.com/test/guru99home");
		 
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 // scroll down
		 
		 ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 500)");
		 
		  Thread.sleep(2000);
		  
		  
		// scroll up (-ve pixel value)
		  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
		
	}
	
	

}
