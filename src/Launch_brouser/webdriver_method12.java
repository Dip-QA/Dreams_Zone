package Launch_brouser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method12
{
	 public static void main(String[] args) throws InterruptedException
	 {
		
		 System.setProperty("webdriver.chrome.driver",
				 "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe" );
		 
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.ilovepdf.com");
		 Thread.sleep(2000);
		 
		 Point position=new Point(1000,700);
		  driver.manage().window().setPosition(position);
		 
		Point  P1=driver.manage().window().getPosition();
		 System.out.println(P1);
		 
	}
	
	
	
	
	
	
	

}
