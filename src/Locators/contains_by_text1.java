package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_by_text1
{
 public static void main(String[] args) throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver =new ChromeDriver();
	 
	  Thread.sleep(2000);
	 
	 driver.get("https://www.facebook.com");
	  Thread.sleep(2000);
	 
	  // to click on "create new account"
	  driver.findElement(By.xpath("//a[contains(text(),'Create New')]")).click();
	 
	 Thread.sleep(5000);
	 
	 // to enter fn
	 
	 driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _5dba _2ph-')]) [1]")).sendKeys("Dipali");
}
	
	
	
	
	
	
	
	
	
}
