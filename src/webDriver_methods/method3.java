package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method3
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		// to enter url 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		// to click on login button 
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		
		 Thread.sleep(2000);
		 
		// to maximise the brouser 
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 driver.close();
		 
		
	}

}
