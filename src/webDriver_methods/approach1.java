package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class approach1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		// to enter url 
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		// enter un 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dipa");
		
		Thread.sleep(2000);
		
		// clear un 
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		
		 Thread.sleep(2000);
		 
		 
		 // enter un 
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pawar");
		
		
	}

}
