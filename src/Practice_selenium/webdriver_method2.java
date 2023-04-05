package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method2
{
	
    public static void main(String[] args) throws InterruptedException
    { 
    	
         System.setProperty("webdriver.chrome.driver", 
        		 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");    	
    	
    	
    	 WebDriver driver=new ChromeDriver();
    	
    	 // to provide wait
    	   Thread.sleep(2000);
    	 
    	 
    	// to enter url or to open application 
    	  driver.navigate().to("https://www.ilovepdf.com");
    	
    	  // to provide wait 
    	   Thread.sleep(2000);
    	   
    	// to enter url
    	   driver.navigate().to("https://www.myntra.com");
    	  
    	   // to provide wait 
    	    Thread.sleep(2000);
    	   
    	// to go backward
    	   driver.navigate().back();
    	   
    	   // to provide wait 
    	   Thread.sleep(2000);
    	   
    	   // to go forword 
    	    driver.navigate().forward();
    	   
    	   
    	   
    	   
		// to close multiple tab of the brouser
    	   driver.quit();
    	   
    	   
    	   
    	   
    	   
	}
	
	
	
	
	
	
	

}
