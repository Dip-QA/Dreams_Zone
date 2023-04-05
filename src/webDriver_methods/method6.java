package webDriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class method6
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		 
		 Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		
		// click on create new button 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(2000);
		
		// female radio button selected or not 
		WebElement  SL1=driver.findElement(By.xpath("//label[text()='Female']"));
		     boolean D1=SL1.isSelected();
		 System.out.println(D1);
	}

}
