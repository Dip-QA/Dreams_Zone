package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 
{
	// identify the list box is single selected or multiselected 
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// click on continue button 
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		Thread.sleep(5000);
		
		//identify the listbox and copy it into object
	WebElement	Day=driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		
		// create object of select class
		Select S1=new Select(Day);
		Thread.sleep(2000);
		
		// call the method 
	boolean D1=S1.isMultiple();
		System.out.println(D1);
		
		
	}
	
	
	
	
	
	
	

}
