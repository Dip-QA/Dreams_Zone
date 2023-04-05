package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test3
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 Thread.sleep(2000);
	 
	 driver.get("https://www.facebook.com");
	 
	 Thread.sleep(2000);
	 
	 // click on create new account button 
	 driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
	 
	 Thread.sleep(5000);
	 
	// step1-indetify the listbox and stored it into an object
	WebElement Day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
	 
	 Thread.sleep(2000);
   //step2-->create object of an select class
	 Select S1=new Select(Day);
	 
	 Thread.sleep(2000);
	 
	//step3-->call the methods
	  S1.selectByValue("29");
	 
	 
}

}
