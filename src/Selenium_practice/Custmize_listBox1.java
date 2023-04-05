package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Custmize_listBox1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		//Identify element and stored it into an object
	WebElement	S1=driver.findElement(By.xpath("(//yt-icon[@id='guide-icon'])[1]"));
		
		// create object of Actions Class
	        Actions Act=new Actions(driver);
		
		// call the methods
	        Act.click(S1).perform();
		   Thread.sleep(2000);
		
		   // click
		
		
		
	}

}
