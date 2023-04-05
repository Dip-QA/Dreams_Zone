package Customize_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe" );	
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// click on create new account button
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		Thread.sleep(5000);
		
		// To handle the customized listBox
		   // identify the listbox and stored it into an object
	        WebElement	D1=driver.findElement(By.id("month"));
		    Thread.sleep(2000);
		
		 // create object of Actions class
		    Actions A1=new Actions(driver);
		
		    // call the methods 
		       A1.click(D1).perform();
		      Thread.sleep(2000);
		    
		    // press down key
		      A1.sendKeys(Keys.ARROW_DOWN).perform();
		      A1.sendKeys(Keys.ARROW_DOWN).perform();
		    
		    
		    
		    
		    
		    
		    
	}

}
