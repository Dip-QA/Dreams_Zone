package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method3 
{
	
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", 
				 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		 
		  WebDriver driver=new ChromeDriver();
		 
		 
		  driver.get("https://www.amazon.in");
		 
		 // to copy the tital 
		 String Tital1=driver.getTitle();
		 System.out.println(Tital1);
		 
		 
		 Thread.sleep(2000);
		 
		 
		// to get url
		String Url1=driver.getCurrentUrl();
		System.out.println(Url1); 
		
		driver.close();
		
		 
	}
	
	
	
	
	
	
	
	

}
