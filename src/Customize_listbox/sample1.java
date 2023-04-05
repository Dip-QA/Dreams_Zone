package Customize_listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		//closed the hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		//identify the element and stord it into an object
	WebElement	D1=driver.findElement(By.xpath("//div[text()='More']"));
		
		// create object of Actions class
	           Actions A1=new Actions(driver);
		
	     // call the methods 
	           A1.moveToElement(D1).perform();
	           Thread.sleep(2000);
	           
	      //click on first option
	          WebElement V1=driver.findElement(By.xpath("(//a[@class='_2kxeIr'])[3]"));
	           A1.contextClick(V1).perform();
	           
		
	}

}
