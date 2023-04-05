package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop1
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		
	WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		 Thread.sleep(2000);
		
		 driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Identify an element an stored it into an object
  WebElement Soarce=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
  WebElement Destination=driver.findElement(By.xpath("(//ol[@class='field13 ui-droppable ui-sortable'])[2]"));
		
		    // crate object of actions class
                  Actions A1=new Actions(driver);
		           Thread.sleep(2000);
                  
		  // call the method
		           
                  A1.dragAndDrop(Soarce, Destination).perform();
		
		
		   
		
		
	}

}
