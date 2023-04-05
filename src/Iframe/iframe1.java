package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		 Thread.sleep(2000);
		
		 //to switch to frame (String FrameName)
		 driver.switchTo().frame("iframeResult");
		 
		  Thread.sleep(2000);
		  
		 driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}

}
