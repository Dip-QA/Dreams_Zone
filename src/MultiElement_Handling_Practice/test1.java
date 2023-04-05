package MultiElement_Handling_Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

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
		
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// Select multiple link
	List<WebElement>	S1=driver.findElements(By.xpath("//div"));
		
		for(WebElement D1:S1) 
		{
		  System.out.println(D1.getText());
		}
		
	}

}
