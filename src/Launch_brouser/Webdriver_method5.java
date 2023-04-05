package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method5
{
	
	public static void main(String[] args) throws InterruptedException
	{
		// open brouser 
		System.setProperty ("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		 WebDriver driver=new ChromeDriver();
		
		
		// to wait 
		Thread.sleep(2000);
		
		// to enter url/open brouser
		   driver.get("https://www.flipkart.com");
		
		// to wait 
		   Thread.sleep(2000);
		
		// to get title of the application
		    String Title1=driver.getTitle();
		  System.out.println(Title1);
		  
		  
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
