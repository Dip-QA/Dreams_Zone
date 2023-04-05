package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkaet1 
{
   public static void main(String[] args) throws InterruptedException
   {
	   
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	   
	   
	   WebDriver driver=new ChromeDriver();	   
	   
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9021837648");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Dipa@2910");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
	   Thread.sleep(2000);
	   
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  
	  driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]")).click();
	  
	  
	  
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
