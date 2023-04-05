package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_webelement_methods 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		// to enter the url--->get-->webdriver 
		driver.get("https://www.instagram.com");
		
		 Thread.sleep(2000);
		
		// to enter value in element we usee webelement method 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("dipali4585");
		
		 Thread.sleep(2000);
		 
		 // to enter pw
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("dipa@2910");
		 
		 Thread.sleep(2000);
		 // click on login 
		 driver.findElement(By.xpath("//div[text()='Log In']")).click();
		 
		 Thread.sleep(2000);
		 // maximize the brouser-->action perform on brouser-->webdriver mehtod 
		 driver.manage().window().maximize();
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
