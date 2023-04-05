package Selenium_practice;

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
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		 Thread.sleep(2000);
		 
		// add info in customer id 
		 driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Dipa");
		 Thread.sleep(2000);
		 
		 // click on submit button 
		 driver.findElement(By.xpath("//input[@name='submit']")).click();
		 Thread.sleep(5000);
		 
		 //shift focus to alert pop_up
		    Alert  Alt=driver.switchTo().alert();
		    Thread.sleep(2000);
		
		    // to gettext of pop up
		      String  S1=Alt.getText();
		    System.out.println(S1);
		    Thread.sleep(2000);
		    
		// click on cancel button 
		    Alt.dismiss();
		    
		    
		    
		    
		    
		    
		    
	}

}
