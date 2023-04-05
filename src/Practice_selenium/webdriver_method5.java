package Practice_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method5
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		
		 WebDriver driver=new ChromeDriver();
		
		   // to open application 
		  driver.get("https://www.ilovepdf.com");
		
		 Thread.sleep(2000);
		 
		 // to set size of the brouser 
		 Dimension D1=new Dimension(517,789);
		  driver.manage().window().setSize(D1);
		 
		  Thread.sleep(2000);
		  
		  // to get size of the brouser 
		 Dimension S1=driver.manage().window().getSize();
		System.out.println(S1);
		
		 Thread.sleep(2000);
		 
		 // to set position of the brouser 
		 Point P1=new Point(500,700);
		  driver.manage().window().setPosition(P1);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
