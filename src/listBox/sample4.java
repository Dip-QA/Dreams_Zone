package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample4
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		   Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		 Thread.sleep(2000);
		
		// to click on create new account button 
		 driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6l')]")).click();
		 Thread.sleep(2000);
		 
		 
		 // identify the listBox and stored it into an object 
		   WebElement D1=driver.findElement(By.xpath("//select[@id='month']"));
		         Select S1=new Select(D1);
		
		// to get all option in the listbox 
		        List<WebElement> F1=S1.getOptions();
		        
		for(WebElement J1:F1) //jan feb march ------dec
		{
			System.out.println(J1.getText());// Jan 
		}
		
		
		
		
		
		
		
		
	}

}
