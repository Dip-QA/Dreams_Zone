package WebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Size_Row1 
{
            public static void main(String[]args) throws InterruptedException
        {
	  System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
            	
             WebDriver driver=new ChromeDriver();       	
            	Thread.sleep(2000);
            	
                driver.get("file:///D:/Automation_Testing/Table1.html");  	
            	Thread.sleep(2000);
            	
          //to get size of Row
          List<WebElement> D1=driver.findElements(By.xpath("//table[@id='1234']//tr")) ;	
            	
             int	S1= D1.size();
            	
            	System.out.println(S1);

         }

}
