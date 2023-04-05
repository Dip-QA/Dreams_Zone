package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		// to enter url 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		// to enter un
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7517889411");
	
		Thread.sleep(2000);
		
		// to enter pw
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dipa@2910");
		
		 Thread.sleep(2000);
		 
		 // to click login button 
		 driver.findElement(By.xpath("//button[text()='Log In']")).click();
		 
		 Thread.sleep(3000);
		 // to maximize 
		 
		  driver.manage().window().maximize();
		 
		 
		
		
	}
	
	
	
	
	
	
	

}
