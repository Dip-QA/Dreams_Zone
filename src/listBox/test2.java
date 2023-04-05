package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// to click on create login button 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		// step1--> identify listbox and stoared into an object 
	WebElement	Month=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(2000);
		
		//step2-->create of of an select class
		Select S1=new Select(Month);
		
		//step3--> call the methods
		  S1.selectByValue("10");
		
		
		
		
		
	}

}
