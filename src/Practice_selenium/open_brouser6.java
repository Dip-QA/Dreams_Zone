package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_brouser6 
{
	public static void main(String[] args) throws InterruptedException
	{
		// open the brouser
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		  WebDriver driver=new ChromeDriver();
		
		 // to wait
		  Thread.sleep(5000);
		  
		  
		// to enter url
		  
		  driver.get("https://www.opera.com");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
