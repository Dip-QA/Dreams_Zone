package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelected6 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  Thread.sleep(2000);
		
		driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		  Thread.sleep(2000);
		
		// identify the listbox and stored it into an object
		  WebElement D1= driver.findElement(By.xpath("//select[@id='1234']"));
		       Select S1=new Select(D1);
		       
		 // to get all options --> no need weather selected or not 
		     List<WebElement> C1= S1.getOptions();
		       
		     for(WebElement L1:C1) 
		     {
		    	 System.out.println(L1.getText());// Ind Sri Pak Aus 
		     }
		     
		       
	}

}
