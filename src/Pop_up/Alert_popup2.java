package Pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup2
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/v4/index.php");
		 Thread.sleep(2000);
		
		// enter un 
		 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("DIPA");
		   Thread.sleep(2000);
		   
		// enter pw
		   driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		      Thread.sleep(2000);
		   
		 // click on login button 
		      driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		        Thread.sleep(2000);
		   
		// shift the focus of selenium from main page to alert
		       Alert Alt=driver.switchTo().alert();
		        
		 // To get text of the popup
		      String S1=Alt.getText();
		      System.out.println(S1);  
		        
		        
	}

}
