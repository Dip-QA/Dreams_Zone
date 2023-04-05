package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselected3
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		 Thread.sleep(2000);
		
		// identify the listbox and store it into an object 
		WebElement D1=driver.findElement(By.xpath("//select[@id='1234']"));
		 Thread.sleep(2000);
		
		 // create object select class
		 Select S1=new Select(D1);
		 Thread.sleep(2000);
		
		// call the method 
		  S1.selectByVisibleText("Ind");
		   Thread.sleep(1000);
		 
		  S1.selectByIndex(2);
		  Thread.sleep(1000);
		 
		  S1.selectByVisibleText("Aus");
		  Thread.sleep(1000);
		  
		  S1.selectByIndex(3);
		  Thread.sleep(1000);
		  
		  S1.deselectAll();
		  Thread.sleep(1000);
		 
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  driver.close();
	}

}
