package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test9
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver =new ChromeDriver ();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/login");
		
		// enter username
		driver.findElement(By.xpath("//input[contains(@placeholder ,'Email address ')]")).sendKeys("9067486794");
		
		Thread.sleep(2000);

		// enter password
		driver.findElement(By.xpath("//input[contains(@class,'inputtext _55r1 inputtext _9')]")).sendKeys("Ashu4#$1");
		                            
		Thread.sleep(2000);

		// click on login
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _52e0 ')]")).click();

		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
