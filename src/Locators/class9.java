package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class9
{
	// xpath by index
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
	 driver.get("https://www.facebook.com");	
		
		Thread.sleep(2000);
		
		// to click on new account 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
