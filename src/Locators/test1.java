package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		 
		 driver.get("https://www.facebook.com");
		 
		  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9021837648");
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
