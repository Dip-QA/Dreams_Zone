package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_selected_ListBox1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		Thread.sleep(2000);
		
		// identify the listbox and stored it into an object
		    WebElement S1=driver.findElement(By.xpath("//select[@id='year']"));
		
		    Select D1=new Select(S1);
		
		// call the method 
		   D1.selectByVisibleText("2003");
		    Thread.sleep(2000);
		    D1.selectByValue("2000");
		   D1.selectByIndex(0);
		   Thread.sleep(2000);
		 
		   
		// get first selected option
		   
		 String V1=D1.getFirstSelectedOption().getText();
	         System.out.println(V1);
		   Thread.sleep(2000);
		   
		
		
	}
	

}
