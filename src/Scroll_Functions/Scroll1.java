package Scroll_Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Scroll1
{
 @Test
 public void M1() throws InterruptedException 
 {
	 
	 System.setProperty("webdriver.gecko.driver","D:\\selenium_imp\\geckodriver-v0.32.0-win64\\geckodriver.exe");
	 
	 WebDriver driver=new FirefoxDriver();
	 
	 Thread.sleep(2000);
	 
	 driver.get("https://demo.guru99.com/test/guru99home");
	 
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 
	  //Scroll Down:Enter 2nd parameter's +ve pixel value
	 
	   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	 
	  Thread.sleep(2000);
	 
	 
	 // scroll up :Enter 2nd parameter -ve pixel value
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0, -1000)");
	 
	 
	 
	 
	 
	 
 }

}
