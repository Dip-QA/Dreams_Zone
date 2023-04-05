package Dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1
{
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// closed hideen division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		
		// Enter the value in search box
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10");
		Thread.sleep(2000);
		
		// click on search button 
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		
		//Identify rating element 
	WebElement	Rating=driver.findElement(By.xpath("(//div[@class='_2kHMtA']//span)[6]"));
		
		  String S1= Rating.getText();
		
		System.out.println(S1);
		
		
		
		
	}

}
