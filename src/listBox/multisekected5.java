package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multisekected5
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		   Thread.sleep(2000);
		  
		driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		 Thread.sleep(2000);
		
		// identify the listboc and stored it into an object 
		 WebElement D1=driver.findElement(By.xpath("//select[@id='1234']"));
		       
		// create object of select class
		       Select S1=new Select(D1);
		       
		  // call the methods 
		       S1.selectByVisibleText("Ind");
		       S1.selectByVisibleText("Pak");
		       S1.selectByVisibleText("Sri");
		       S1.selectByVisibleText("Aus");
		       
		  // to get text of first selected option 
		    //  String S2=S1.getFirstSelectedOption().getText();
		      // System.out.println(S2);
		       
		 // to get text of all selected optiopns 
		     List<WebElement>  S3=S1.getAllSelectedOptions();
		       
		    for(WebElement S4:S3) // Ind Pak Sri Aus
		    {
		    	System.out.println(S4.getText());
		    } 
		     
		     
		     
		     
		     
		     
	}

}
