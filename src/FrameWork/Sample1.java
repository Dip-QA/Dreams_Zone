package FrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// provide implicit wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Enter UN
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		
		// Enter Pw
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		
		// click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(2000);
		
		//Expected result
		 String ExtectedResult="Shah Wassem";
		
		//Actual result
		WebElement S1=driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		 
		    String  ActualResult=S1.getText();
		 
		    //shah Wassem      //shah Wassem
		if(ExtectedResult.equals(ActualResult)) 
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}  
		    
		    
		    
		    
	}

}
