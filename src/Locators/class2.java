package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 
{
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/com/Downloads/class2.html");
		Thread.sleep(2000);
		
		// to enter un
		driver.findElement(By.className("xyz12")).sendKeys("Dipali");
		Thread.sleep(2000);
		
		// to enter pw 
		driver.findElement(By.className("xyz12")).sendKeys("291020");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		
		
		
		
		
	}

}
