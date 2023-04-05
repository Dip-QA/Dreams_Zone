package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_opening
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.instagram.com");
		
		Thread.sleep(2000);
		
		// to enter UN 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("9307142212");
		
		Thread.sleep(2000);
		
		// to enter pw
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dinu2073");
		
		Thread.sleep(2000);
		 
		// to click on login button
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
