package Dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		 Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// closed the hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		// Enter the value
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(" Redmi note 10s");
		Thread.sleep(2000);
		
		// click on search button 
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		
		// Identify the reviews element
	 WebElement	Review=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]"));
		
	       String	S1=Review.getText();
		System.out.println(S1);
		
	}

}
