package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample3
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		  Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		  Thread.sleep(2000);
		
		 // click on create new buttton 
		  driver.findElement(By.xpath("(//a[contains(@class,'_42ft _4jy0 ')])[1]")).click();
		  Thread.sleep(2000);
		
		// identify the listbox and stored it into the object 
		  WebElement D1= driver.findElement(By.xpath("//select[@id='day']"));
		     Select S1=new Select(D1);
		         S1.selectByVisibleText("29");
		     
		// to get text of selected option 
		        String A1=S1.getFirstSelectedOption().getText();
		          System.out.println(A1);
		     
		   
		         List<WebElement> A2=S1.getAllSelectedOptions();
		          for(WebElement G1:A2) 
		          {
		        	  System.out.println(G1.getText());
		          }
		          
	}

}
