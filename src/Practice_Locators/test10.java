package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test10
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver ();
		
		Thread.sleep(2000);
		
		
		driver.get("https://www.facebook.com/login");
		
		// to enter un
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 inputtext _1')]")).sendKeys("123xyz");
		
		Thread.sleep(2000);
		
		// to enter pw 
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 inputtext _9')]")).sendKeys("9021837648");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
