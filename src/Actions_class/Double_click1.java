package Actions_class;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click1
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		  Thread.sleep(2000);
		
		  driver.manage().window().maximize();
		  
		//Identify an element and stored it into an object
		 WebElement Button=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		// create object of Actions class
		 Actions Alt=new Actions(driver);
		
		// call the method(Double click)
		   Alt.doubleClick(Button).perform();
		
		// switch to Alert pop_up
		  Alert A1=driver.switchTo().alert();
		   Thread.sleep(2000);
		   
		   // to getText of alert popup
		    String D1=A1.getText();
		    System.out.println(D1);
		    Thread.sleep(2000);
		   
		//clcik on ok button
		      A1.accept();
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
		
	}

}
