package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1
{
	
	public static void main(String[] args)
	{
		
		 System.setProperty("webdriver.chrome.driver",
				 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		String sname="dipali";
		int  rollno=12;
		
		 if("dipali"==sname) 
		 {
			 
			 driver.get("https://www.facebook.com");
			 
			 if(12==rollno) 
			 {
				 driver.get("https://www.ilovepdf.com");
				 
			 }
			 else {
			 
				driver.close();
			 
			 }
			
			 
		 }
		 else 
		 {
			 driver.get("https://www.amazon.in");
		 }
		
		
		
	}
	
	
	
	
	
	
	
	

}
