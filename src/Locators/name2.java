package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name2
{
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		  Thread.sleep(2000);
		  
		  driver.get("file:///C:/Users/com/Downloads/name2.html");
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("1234")).sendKeys("Dipali");
		  Thread.sleep(2000);
		  
		  driver.findElement(By.name("1234")).sendKeys("2910");
		  Thread.sleep(2000);
		  
		  driver.close();
	}

}
