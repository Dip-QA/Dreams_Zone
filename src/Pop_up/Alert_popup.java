package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/v4/index.php");
		 Thread.sleep(2000);
		
		// enter the un 
		 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("ABC");
		  Thread.sleep(2000);
		
		  // enter Pw
		  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		  Thread.sleep(2000);
		  
		  // click on subbmit button 
		  driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		    Thread.sleep(2000);
		  
		  //handle the pop_up
		    //step1= selenium focus shift to pop_up
		   Alert Alt=driver.switchTo().alert();
		   
		   // methods call
		     Alt.accept();
		   
		   
		   
		   
		   
		  
		
	}

}
