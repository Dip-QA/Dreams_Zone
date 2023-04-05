package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Left_click1
{
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// close Hidden Divisison Pop_up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 Thread.sleep(2000);
		
		// Identify an element and stored it into an object 
		 WebElement S1=driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		
		// create object of Actions Class
		 Actions Act=new Actions(driver);
		
		// call the method(Left click operation)
		    Act.click(S1).perform();
		 
		 
		 
		
	}

}
