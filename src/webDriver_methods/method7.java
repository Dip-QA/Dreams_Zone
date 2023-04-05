package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method7 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("https://www.facebook.com");
		
		 Thread.sleep(2000);
		
		 // to verify logo is displayed or not 
		 WebElement Logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		    boolean S1=Logo.isDisplayed();
		 System.out.println(S1);
		 
		 
	}

}
