package Multi_Brouser_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sample1 
{
	
	@Parameters("BrouserName")  //chrome  firefox
	
	@Test                 //chrome  firefox
	public void TC1(String BrouserName) throws InterruptedException 
	{
		WebDriver driver=null;
		
		   //chrome  firefox
		if(BrouserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
			     driver=new ChromeDriver();
			
		}
		       //firefox
		else if(BrouserName.equals("firefox")) 
		{
	    System.setProperty("webdriver.gecko.driver", "D:\\selenium_imp\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	WebElement	S1=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		   String   ActualResult= S1.getText();
		
		 String ExpectedResult="SUNDER 123# PICHAI 567%";  
		   
		  Assert.assertEquals(ActualResult, ExpectedResult);
		
	}

}
