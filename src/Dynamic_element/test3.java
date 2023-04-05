package Dynamic_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// Enter the value 
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Titan watches");
		Thread.sleep(2000);
		
		//click on search buttton
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		// click on image
		driver.findElement(By.xpath("//img[@class='_bGlmZ_image_1pfbQ _bGlmZ_center_2savA']")).click();
		Thread.sleep(2000);
		
		//Identify prize
	WebElement	Prize=driver.findElement(By.xpath(""));
	      String S1=Prize.getText();
	
	    System.out.println(S1);
	
	
	
	
	
	
		
	}

}
