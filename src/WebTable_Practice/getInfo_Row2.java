package WebTable_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getInfo_Row2
{
	
	   public static void main(String[]args) throws InterruptedException
	   {
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	       	
	        WebDriver driver=new ChromeDriver();       	
	       	Thread.sleep(2000);
	       	
	           driver.get("file:///D:/Automation_Testing/Table1.html");  	
	       	Thread.sleep(2000);
	       	
	     // to featch data from row 3
	       	//i=1    1<=3    2
       for(int i=1;  i<=3;  i++) 
       {                                                                              //1
    	  WebElement Info=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td["+ i +"]"));
    	        
    	       String  S1=Info.getText();
    	  
    	  System.out.print(S1+ " ");//3 
       }	       	
	       	
	       	
	     
	   }

}
