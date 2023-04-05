package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains_by_attributes1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'inputtex')]) [1]")).sendKeys("Dipali");
		
		Thread.sleep(2000);
		
		// enter pw
		driver.findElement(By.xpath("(//input[contains(@class,'inputtex')]) [2]")).sendKeys("9021837648");
		
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Log ')]")).click();
	}
	
	
	
	
	
	
	
	

}
