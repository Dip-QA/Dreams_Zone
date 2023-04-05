package Custamized_ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver  driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// implicit wait 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// Enter un 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		//Enter Pw
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		//click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		//identify an element and stored it into an object 
	 WebElement	Custom=driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
		
		Actions Act=new Actions(driver);
		
		  Act.click(Custom).perform();
		  Thread.sleep(2000);
		  
		  
		  
		  for(int i=1;  i<=4;  i++)
		  {
			  Act.sendKeys(Keys.ARROW_DOWN).perform();
			  
		  }
		
	}

}
