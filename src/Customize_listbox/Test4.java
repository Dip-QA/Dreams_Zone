package Customize_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4
{
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
	      WebDriver driver=new ChromeDriver();	
		 Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		Thread.sleep(2000);
		
		// identify an element and stored it into an object
         WebElement D1=driver.findElement(By.id("month"));
		
        // create object of Action class
            Actions A1=new Actions(driver);
            
        // to click on listbox
            A1.click(D1).perform();
            Thread.sleep(2000);
            
        // to move top
            A1.sendKeys(Keys.HOME).perform();
            Thread.sleep(2000);
            
        for(int i=1; i<=5; i++) 
        {
        	A1.sendKeys(Keys.ARROW_DOWN).perform();//June
        	
        }    
            
            
            
            
            
            
            
            
            
		
	}

}
