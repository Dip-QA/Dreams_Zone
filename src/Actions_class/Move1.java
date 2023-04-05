package Actions_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move1 
{   // to move curser 
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		
		// Identify the Element and stored it into an Object
		 WebElement Dropdown=driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		// create object of Actions class
		    Actions Act=new Actions(driver);
		     Thread.sleep(2000);
		 
		  // call the methods (Move mouse operation)
		     Act.moveToElement(Dropdown).perform();
		     Thread.sleep(2000);
		
		// click on window button 
		  driver.findElement(By.xpath("//a[text()='Windows']")).click();   
		     
		     
		
	}

}
