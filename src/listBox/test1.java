package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class test1 
{
	// how to handle/locate/findelement of listbox
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		// click on create new account 
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		// step 1-> identify the listbox and stored it into an object 
	WebElement	Month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		// step 2--> create object of select class
		Select S1=new Select(Month);		
		Thread.sleep(2000);
		
		
		// step 3-->call the method 
	          S1.selectByVisibleText("Oct");
		
		
		
	}

}
