package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_brouser3 
{
	
	public static void main(String[] args) throws InterruptedException   
	{
		// open brouser
		 System.setProperty("webdriver.chrome.driver", 
				 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");
		
		
		 // wait fot run
		Thread.sleep(5000);
		 
		 WebDriver  driver=new ChromeDriver();
		
		// to enter url 
		  driver.get("https://www.facebook.com");
		
		
		
	}
	
	
	
	
	
	
	
	

}
