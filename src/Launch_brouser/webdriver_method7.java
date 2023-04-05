package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method7
{
	public static void main(String[] args) throws InterruptedException
	{
		// open brouser
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		 WebDriver driver=new ChromeDriver();
		
		// to provide wait
		 Thread.sleep(2000);
		
		
		// to enter url or open brouser
		 driver.get("https://www.amazon.in");
		 
		 // to wait 
		 Thread.sleep(2000);
		 
		 // to maximize the brouser 
		    driver.manage().window().maximize();
		
		    // to wait 
		    Thread.sleep(2000);
		    
		// to minimize
		    driver.manage().window().minimize();
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
