package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiselected4
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		 Thread.sleep(2000);
		 
		 // identify the listbox an store it into an object 
		 WebElement D1=driver.findElement(By.xpath("//select[@id=\"1234\"]"));
		   Thread.sleep(2000);
		 
		  // create the object of select class
		   Select S1=new Select(D1);
		     Thread.sleep(2000);
		   
		   // call method
		    boolean M1=S1.isMultiple();
		    System.out.println(M1);
		   
		   
		   
		   
		 
	}

}
