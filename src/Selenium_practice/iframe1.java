package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iframe1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 RemoteWebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html_quotes");
		Thread.sleep(2000);
		
		// shift focus of the selenium to the frame 
		  driver.switchTo().frame("iframeResult");
		  
		  // click on try me button
		driver.findElement(By.xpath("//button[text()='Click Me!']")).click();
		Thread.sleep(2000);
		
		// shift focus to the main page
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		
		// click on open menu
		 driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		
		
		
		
	}

}
