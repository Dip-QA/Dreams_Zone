package Selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Elelement1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// Enter the "audiance song"
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("audiance song");
		Thread.sleep(2000);
		
		// Click on search button
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		
		//identify element
	WebElement	Song=driver.findElement(By.xpath("(//ytd-video-renderer//span)[4]"));
		    String S1=Song.getText();
		System.out.println(S1);
		
		
	}

}
