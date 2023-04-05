package Launch_brouser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method4
{
 public static void main(String[] args) throws InterruptedException 
 {
	 System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver=new ChromeDriver();
	 
	 // to wait 
	  Thread.sleep(2000);
	  
	  
	 // to enter url/open application
	  //  driver.get("https://www.mozilla.org/en-US/firefox/products");
	 
	  
	 // to enter url/ open the brouser but it opens multiple brousers
	     driver.navigate().to("https://www.mozilla.org/en-US/firefox/products/");
	 
	     
	     // to wait
	     Thread.sleep(2000);
	     
	     
	 // to enter url
	     driver.navigate().to("https://www.opera.com");
	 
	     
	     
	     // to wait 
	     Thread.sleep(2000);
	     
	     
	     
	     
	     
	 // to move backword
	     driver.navigate().back();
	     
	  // to wait 
	     Thread.sleep(2000);
	     
   // to move forword
	     driver.navigate().forward();
	     
	     // to wait 
	     Thread.sleep(2000);
	     
	     // to refresh the page  
	      driver.navigate().refresh();
}
	
	
	
	
	
	
	
	
	
	
	
	
}
