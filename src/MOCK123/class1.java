package MOCK123;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class class1 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.youtube.com");
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("shivmahapuran");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1]")).click();
		
		
	File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(Soarce);
		
		File Destination=new File("D:\\Screenshots\\sample7.jpg");
		FileHandler.copy(Soarce, Destination);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
