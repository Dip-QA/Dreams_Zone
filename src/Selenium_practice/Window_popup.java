package Selenium_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(2000);
		
		// click on new button 
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(5000);
		
		//To findout Ids
		 Set<String>   Allids=driver.getWindowHandles();
		
		ArrayList<String>  ar=new ArrayList<String>(Allids);
		           String MainpageId=ar.get(0);
		          String windowpageId=ar.get(1);
		
		
		// to switch focus on window popup
		   driver.switchTo().window(windowpageId);
		    Thread.sleep(5000);
		// click on youtube button(iframe) 
		   // switch focus to fram
		     driver.switchTo().frame("(//i[@class='fa-fw fab fa-youtube'])[1]");
		
		driver.findElement(By.xpath("(//i[@class='fa-fw fab fa-youtube'])[1]")).click();
		
		
		
	}

}
