package Pop_up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		 Thread.sleep(2000);
		
		// enter un 
		 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9021837648");
		  Thread.sleep(2000);
		
		// enter pw 
		  driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Dipa@2910");
		    Thread.sleep(2000);
		
		// click on login button 
		    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		
		
		
		
		
	}

}
