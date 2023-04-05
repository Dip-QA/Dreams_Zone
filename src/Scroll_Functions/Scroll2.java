package Scroll_Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scroll2 
{
	@Test
	public void M1() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		
	 driver.get("https://demo.guru99.com/test/guru99home");	
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// identify that element 
	WebElement	V1=driver.findElement(By.xpath("//img[@alt='guru99']"));
		
		
		//scroo down to perticuler point 
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",V1);
		
		
		
		
		
		
	}

}
