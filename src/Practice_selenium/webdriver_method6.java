package Practice_selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method6 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		Dimension D1=new Dimension(600,700);
		driver.manage().window().setSize(D1);
		
		Thread.sleep(2000);
		
	Dimension size=driver.manage().window().getSize();
		System.out.println(size);
		
	}
	
	
	
	
	
	
	

}
