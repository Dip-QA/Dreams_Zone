package WebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[]args) throws InterruptedException
	   {
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	       	
	        WebDriver driver=new ChromeDriver();       	
	       	Thread.sleep(2000);
	       	
	           driver.get("https://www.instagram.com/directory/profiles");  	
	       	Thread.sleep(2000);
	       	
	     //to get size of Row
	     WebElement D1=driver.findElement(By.xpath("//div[@class='GBPOY']//ul[2]/li[25]")) ;	
	       	
	        String S1= D1.getText();
	       	
	       	System.out.println(S1);//29

	    }

}
