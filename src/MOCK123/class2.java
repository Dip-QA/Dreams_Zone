package MOCK123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Dipali");
		
		
		
		
	}

}
