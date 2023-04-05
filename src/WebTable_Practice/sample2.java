package WebTable_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2
{

	   public static void main(String[]args) throws InterruptedException
	   {
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	       	
	        WebDriver driver=new ChromeDriver();       	
	       	Thread.sleep(2000);
	       	
	           driver.get("https://www.instagram.com/directory/profiles");  	
	       	Thread.sleep(2000);
	       	
	     // to get info from coluumn 2
	       	
	       	for(int i=1; i<=25; i++) 
	       	{
	         	WebElement	S1=driver.findElement(By.xpath("//div[@class='GBPOY']//ul[2]/li["+ i +"]"));
	       	
	       		  String D1=S1.getText();
	       		  
	       		  System.out.println(D1);
	       	}
	       	
	       	
	       	

	    }

}
