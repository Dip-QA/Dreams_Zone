package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot1
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		 
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		// to capture the screenshot
		  File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  System.out.println(Soarce);
		
		 // to move from lc machine to destination
		  
		  File Destination=new File("D:\\Screenshots\\Sample1.jpg");
		  FileHandler.copy( Soarce, Destination);
		
		
	}

}
