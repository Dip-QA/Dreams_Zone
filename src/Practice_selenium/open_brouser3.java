package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_brouser3
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");
		
		
		
		    WebDriver driver=new ChromeDriver();
		
		       driver.get("https://www.ilovepdf.com//");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
