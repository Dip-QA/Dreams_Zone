package MultiElement_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

;

public class sample2
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// closed hidden division popup
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2000);
		
		// Identify all img
		
	 List<WebElement> Img=driver.findElements(By.xpath("(//div)[33]"));
		
		  for(WebElement S1:Img) 
		  {
			  System.out.println(S1.getText());
			  
		  }
		
		
		
		
	}

}
