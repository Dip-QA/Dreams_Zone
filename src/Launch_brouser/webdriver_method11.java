package Launch_brouser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method11
{
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe" );
	
	         WebDriver driver=new ChromeDriver();
	
	          Thread.sleep(2000);
	
	   driver.get("https://www.myntra.com");
	
	   Thread.sleep(2000);
	   
	// to set position of the brouser 
	   Point P1=new Point(400,500);
	   driver.manage().window().setPosition(P1);
	   
	   
	   
	   
}

}
