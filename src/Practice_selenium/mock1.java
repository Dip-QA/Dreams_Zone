package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mock1 
{
	
	  public static void main (String []args) throws InterruptedException
	  {


	      System.setProperty("webdriver.chrome.driver",
	    		  "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");
	      

	        WebDriver driver=new ChromeDriver();


	        driver.get("https://www.facebook.com");

	    
	        Thread.sleep(2000);

	       //driver.close();
	        
	      driver.get("https://www.facebook.com ");


              System.out.println("hii");

	  }
	
	
	
	
	
	
	
	
	
	
	

}
