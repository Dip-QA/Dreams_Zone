package Launch_brouser;

import org.openqa.selenium.chrome.ChromeDriver;

public class open_brouser1
{
       // how to open/launch/communicate with brouser
	
	// parameter 1--> Name of the brouser(small letters)
	// parameter 2--> path of the brouser(chrome.driver.exe file )(convert \ into \\)   
	
	   public static void main(String[] args) 
	   {
		   
		   
		   
		       System.setProperty("webdriver.chrome.driver",
		    		   "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");

		          ChromeDriver D1=new ChromeDriver();

   
		   
	   }
	
	
	
	
	
	
	
}
