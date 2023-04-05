package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
	
	WebDriver driver=new ChromeDriver();
	 Thread.sleep(2000);	
	
	driver.get("file:///D:/Automation_Testing/Table1.html");	
		
	// implicit wait(Synchronization)
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	// to get info of Row 2
	          //i=1        1<=3        2
		                  //2<=3       3
		                 //3<=3
		for(int i=1;       i<=3;      i++) 
		{                                                                                   //3
			WebElement	Address=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td["+ i+"]"));
			                                                //rhd- String ["+ i +"] LHS-String 
			     
			      String S1=Address.getText();//"1"   "100"
			
			System.out.print(S1+" ");//1 manual  100
		}
		
		
		
		
		
		
		
		
	}

}
