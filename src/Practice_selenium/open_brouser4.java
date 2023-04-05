package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_brouser4
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		 Thread.sleep(5000);
		
		
		
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.whatsapp.com");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
