package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		 WebDriver driver=new ChromeDriver();
		 
		    driver.get("https://www.linkedin.com/signup");
		
		    Thread.sleep(2000);
		    
	 driver.findElement(By.xpath("//input[@name='email-or-phone']")).sendKeys("dipalipawar@2910.gmail.com");
		
		
		
	}
	
	
	
	
	
	
	
	

}
