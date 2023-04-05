package listBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class multiselectable1 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		 driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		 Thread.sleep(2000);
		
		// identify the listbox and store it into object
		WebElement S1=driver.findElement(By.xpath("//select[@id='1234']"));
		  Thread.sleep(2000);
		
		// create the object of the select class
		  Select D1=new Select(S1);
		   Thread.sleep(2000);
		
		// call the method 
		   D1.selectByVisibleText("Ind");
		   Thread.sleep(1000);
		   
		   D1.selectByVisibleText("Pak");
		     Thread.sleep(1000);
		
		     D1.selectByIndex(1);
		     Thread.sleep(1000);
		     
		     D1.selectByIndex(3);
		     Thread.sleep(2000);
		     
		// takes screenshot 
		     
		     File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		     System.out.println(Soarce);

		    File Destination=new File("D:\\Screenshots\\sample9.jpg");
		   FileHandler.copy(Soarce,Destination);
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	}

}
