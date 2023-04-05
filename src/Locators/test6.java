package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6
{
  public static void main(String[] args) throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver",
			  "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	   Thread.sleep(2000);
	  
	   driver.get("https://www.instagram.com/accounts/login");
	  
	   Thread.sleep(2000);
	  
	  // to enter un
	   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("7517889411");
	  
	   Thread.sleep(2000);
	   
	   // to enter pw
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dipa@2910");
	   
	   Thread.sleep(2000);
	   
	   // to click login button 
	   //driver.findElement(By.xpath(""))
	// to click on "login with facebook 
	// driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
	 
	 Thread.sleep(2000);
	 
	 // to click on "sign up " button 
	 //driver.findElement(By.xpath("//span[text()='Sign up']")).click();
	 
	 // to click on app store--> by atrribut 
	 driver.findElement(By.xpath("//img[@class='Rt8TI ']")).click();
	 
	 
	 
	 
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
