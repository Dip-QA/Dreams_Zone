package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class you_tube1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		// open you tube 
		driver.get("https://www.youtube.com");
		
		Thread.sleep(2000);
		// enter song 
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Radha rani lage");
		 Thread.sleep(2000);
		 
		 // click on search button 
		 driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 
		 // click on vedio
		 driver.findElement(By.xpath("(//a[@id='video-title'])[3]")).click();
		 Thread.sleep(5000);
		 
		 //click on play buton 
		 driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		
	}
	
	
	
	
	
	
	
	

}
