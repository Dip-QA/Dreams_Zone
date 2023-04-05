package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe2 
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		  Thread.sleep(2000);
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		 // switch to frame(String FrameId)
		   driver.switchTo().frame("iframeResult");
		
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		 // to switch main method
		 driver.switchTo().defaultContent();
		 
		 Thread.sleep(2000);
		 
		 // to click on home button 
		 
		 driver.findElement(By.xpath("//a[text()='JS HOME']")).click();
		 
	}

}
