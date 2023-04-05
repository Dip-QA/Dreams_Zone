package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method4 
{
	 public static void main(String[] args) throws InterruptedException {
		
		 
		 System.setProperty("webdriver.chrome.driver",
				 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");
		 
		 WebDriver  driver=new ChromeDriver();
		 
		 
		  Thread.sleep(2000);
		 
		 driver.get("https://www.youtube.com");
		 
		 Thread.sleep(2000);
		 
		 // to maximize the brouser 
		  driver.manage().window().maximize();
		 
		  Thread.sleep(2000);
		  
		 // to minimize the brouser
		  driver.manage().window().minimize();
		 
	}
	
	
	
	
	
	
	
	
	

}
