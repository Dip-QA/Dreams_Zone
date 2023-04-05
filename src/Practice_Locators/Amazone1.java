package Practice_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone1
{
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		
		 Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
	  Thread.sleep(2000);
		
	  // click on sign in button
	  driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		Thread.sleep(5000);
	  
		// to enter un 
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9021837648");
		Thread.sleep(2000);
		
		// to click on continue button
		driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		Thread.sleep(5000);
		
		// to enter pw
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dipa@2910");
		Thread.sleep(2000);
		
		// to click on sign in button 
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(5000);
		
		// to search watches
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("watches for girls ");
		Thread.sleep(5000);
		
		// to click on search
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		
		//to click on image
		driver.findElement(By.xpath("//img[@class='_bGlmZ_img_1R5u3']")).click();
		Thread.sleep(5000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
