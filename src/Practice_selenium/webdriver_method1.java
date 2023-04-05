package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method1
{
	
	public static void main(String[] args) throws InterruptedException
	{
		// to open brouser
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		// to provide wait 
		  Thread.sleep(2000);
		
		// to enter url 
		  driver.get("https://www.youtube.com");
		
		  // to provide wait
		   Thread.sleep(2000);
		
		// to close cuurent tab of the appliaction 
		   driver.close();
		
		   
		
	}
	
	
	
	
	

}
