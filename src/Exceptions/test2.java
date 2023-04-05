package Exceptions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/v4/index.php");
		Thread.sleep(2000);
		
		// Enter un 
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("abc");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		
	 Alert	S1=driver.switchTo().alert();
		  S1.accept();
		  S1.dismiss();
		
	}

}
