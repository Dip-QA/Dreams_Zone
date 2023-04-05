package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idex1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		// switch to frame page int index
		driver.switchTo().frame(1);
		
		 Thread.sleep(2000);
		// click on iframe button 
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 Thread.sleep(2000);
		// switch to main page 
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 
		// click on home page button 
		 driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		 
		 
		
	}

}
