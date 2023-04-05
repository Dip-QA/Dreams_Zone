package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click1
{  // Right click by using curser
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		
		//to clicse Hidden division pop_up window
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		
		// Identify an elemenet and stored it into an object
		 WebElement Cart=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		
		// create object of actions class
		 Actions Alt=new Actions(driver);
		
		 // call the method(Right click operation)
		     Alt.contextClick(Cart).perform();
		
		
		
	}
	

}
