package WebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class single_info1
{
	   public static void main(String[]args) throws InterruptedException
	   {
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	       	
	        WebDriver driver=new ChromeDriver();       	
	       	Thread.sleep(2000);
	       	
	           driver.get("file:///D:/Automation_Testing/Table1.html");  	
	       	Thread.sleep(2000);
	       	
	     //to get size of Row
	     WebElement D1=driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[3]")) ;	
	       	
	        String	S1= D1.getText();
	       	
	       	System.out.println(S1);

	    }

}
