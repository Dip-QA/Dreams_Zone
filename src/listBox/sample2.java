package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample2 
{
	// to print the text present on the listbox 
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// to click on create new button 
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		 Thread.sleep(2000);
		
		// indetify listbox and stoared into an object 
	WebElement	 D1=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		
		// create object of select class
		Select S1=new Select(D1);
		Thread.sleep(2000);
		
		//call the method 
	String	D2=S1.getFirstSelectedOption().getText();
		System.out.println(D2);
	}

	

}
