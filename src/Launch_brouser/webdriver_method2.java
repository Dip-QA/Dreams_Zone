package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method2
{
	public static void main(String[] args) throws InterruptedException
	{
		// open brouser
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		// to wait
		Thread.sleep(5000);
		
		
		// to enter url/open the application
		   driver.get("https://www.apple.com/in/safari");
		
		   // wait
		   Thread.sleep(2000);
		   
		// to close the current tab
		   driver.close();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
