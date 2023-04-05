package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameName1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		// switch to frame FrameName
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		
		// click on that iframe button
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(2000);
		
		// switch to main page 
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		
		// click on home page
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
	}

}
