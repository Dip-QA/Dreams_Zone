package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 
{
	
  public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login");
		
		Thread.sleep(2000);
		
		// to enter username
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Nitinkumar");
		
		Thread.sleep(2000);

		// to enter pass
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashu@#$1");
		
		
	}
	
	
	
	
	
	
	
	

}
