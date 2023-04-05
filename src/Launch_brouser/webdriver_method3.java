package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method3
{
	
	public static void main(String[] args) throws InterruptedException
	{
		// to open brouser
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		
		// to wait 
		Thread.sleep(2000);
		
		
		
		// to enter url/ open application
		  driver.get("https://meet.google.com/kct-wxzg-gbk");
		  
		Thread.sleep(2000);
		
		
		// to close multiple tabs or closed brouser
		  driver.quit();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
