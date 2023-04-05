package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe3 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		 // shift to frame WebElement
		 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));
		 
		 Thread.sleep(2000);
		 //Click me to display date and time
		driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 // to switch main page 
		driver.switchTo().parentFrame();
		 
		 
		// to click on home button 
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
		
	}

}
