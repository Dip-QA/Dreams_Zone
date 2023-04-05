package Selenium_practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Po_up1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		// Enter the info in customer id 
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("ABC");
		 Thread.sleep(2000);
		 
		// click on submit button 
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		      Thread.sleep(5000);
		      
		 // to shift the focus of selenium on Alert pop_up
		   Alert Alt=driver.switchTo().alert();
		 
		 // click on ok button 
		     Alt.accept();
		  Thread.sleep(5000);
		     
		// click on ok button 
		   Alt.accept();
		  Thread.sleep(2000);
		  
		// click on reset button  
		    driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		  
		  
	}
	
	
	
	

}
