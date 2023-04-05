package Practice_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice2 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		 driver.get("https://www.amazon.in");
		
		 Thread.sleep(2000);
		
		 //driver.close();
		  String S1=driver.getCurrentUrl();
		 System.out.println(S1);
		
		  Thread.sleep(2000);
		  
		Dimension  D1=driver.manage().window().getSize();
		System.out.println(D1);
		
		 Thread.sleep(2000);
		 Dimension G1=new Dimension(600,700);
		 driver.manage().window().setSize(G1);
		 
		 Thread.sleep(2000);
		  Point P1=new Point(1000,700);
		 driver.manage().window().setPosition(P1);
		  Thread.sleep(2000);
		  
		  driver.manage().window().maximize();
		  
	}
	
	
	
	
	
	
	
	
	
	

}
