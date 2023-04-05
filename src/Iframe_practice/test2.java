package Iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		Thread.sleep(2000);
		
		// switch the focus to frame
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(2000);
		
		
	WebElement	Drop=driver.findElement(By.xpath("//select[@id='cars']"));
		
	 Thread.sleep(0);
		Select S1=new Select(Drop);
		
		 Thread.sleep(2000);
		
		S1.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		
		// switch the focus of selenium to main page
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		
	}

}
