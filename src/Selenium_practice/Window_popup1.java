package Selenium_practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_popup1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(2000);
		
		// click on on new window
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(5000);
		
		// to finds the IDs of the window popup
		      Set<String> AllID=driver.getWindowHandles();
		
		 ArrayList<String> ar=new ArrayList<String>(AllID);
		         // get id of mainpage
		             String MainpageId=ar.get(0);
		         // get Id of window popup
		              String   WindowPageID=ar.get(1);
		
		// to shift focus of seleniun towards the window popup
		   driver.switchTo().window(WindowPageID);
		    Thread.sleep(2000);
		
		//clcik on home button
		    driver.findElement(By.xpath("//span[text()='Home']")).click();
		      Thread.sleep(2000);
		
		// to shift focus on main page
		      driver.switchTo().window(MainpageId);
		   Thread.sleep(2000);
		   
		 // click on home button
		   driver.findElement(By.xpath("//input[@name='home']")).click();
		
	}
	
	
	
	
	
	
	
}
