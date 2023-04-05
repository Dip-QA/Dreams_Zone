package listbox_practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class test1
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// click on create new account button 
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		
		 Thread.sleep(2000);
		
		// select birthdate
		 
		 // step1-->identify listbox and stoare it into object 
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		  Thread.sleep(2000);
		  
		 // step2-->create object of select class
		  Select S1=new Select(Day);
		   Thread.sleep(2000);
		 
		 // step3-->call the methods
		   S1.selectByVisibleText("29");
		 
		   Thread.sleep(2000);
		// select BirthMonth
		   
     	WebElement	Month=driver.findElement(By.xpath("//select[@id='month']"));   
		   Thread.sleep(2000);
		   
	     Select S2=new Select(Month);	   
		   
		  Thread.sleep(2000); 
		   
		  S2.selectByValue("10");   
		   Thread.sleep(2000);
		   
		// select birthyear
		  WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		    Thread.sleep(2000);
		   
		  Select S3=new Select(Year); 
		   Thread.sleep(2000);
		   
		   S3.selectByIndex(22);   
		    Thread.sleep(2000);
		   
		 driver.manage().window().maximize();
		    Thread.sleep(2000);
		    
		 // to captur screenshot
		   File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     System.out.println(Soarce);
		    
		    Thread.sleep(2000);
		    File Destination=new File("D:\\Screenshots\\sample8.jpg");
		   FileHandler.copy(Soarce, Destination); 
		    
		   driver.close(); 
		    
		    
	}

}
