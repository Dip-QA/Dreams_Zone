package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class name1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/com/Downloads/name1.html");
		
		Thread.sleep(2000);
		
		// to enter un
		driver.findElement(By.name("1234")).sendKeys("Dipali");
		
		Thread.sleep(2000);
		
		// to enter pw
		driver.findElement(By.name("5678")).sendKeys("2910");
	}
	
	
	
	
	
	
}
