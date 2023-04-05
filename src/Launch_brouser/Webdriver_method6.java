package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_method6
{
	public static void main(String[] args) throws InterruptedException
	{
		// open brouser 
		System.setProperty ("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// to wait 
		 Thread.sleep(2000);
		 
		 
		 // to enter url or open application 
		   driver.get("https://www.google.com");
		
		// to provide wait 
		   Thread.sleep(2000);
		   
		   
		// to get cuurent url
		    String Url1=driver.getCurrentUrl();
		    System.out.println(Url1);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
