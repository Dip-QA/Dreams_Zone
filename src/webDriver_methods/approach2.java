package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class approach2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		// to enter url 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(0);;
		
		// to enter UN 
	WebElement	UN=driver.findElement(By.xpath("//input[@type='text']"));
		
		      UN.sendKeys("Dipa");
		      
		      
	         Thread.sleep(2000);	      
		      
	   // to clear un 
	         UN.clear();
	         
	         Thread.sleep(2000);
	         
	         
	    // to enter un 
	         UN.sendKeys("Pawar");
		      
	  Thread.sleep(2000);
	  
	  // close the brouser 
	      driver.close();
		
	}

}
