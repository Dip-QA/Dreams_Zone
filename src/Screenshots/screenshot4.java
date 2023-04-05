package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot4 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.linkedin.com/login");
		
		// to capture Screeenshot
		
	File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	// to move screenshot 
	 File Destination=new  File("D:\\Screenshots\\sample4.jpg");
	 FileHandler.copy(Soarce,Destination);
	
	
	
	
	
		
	}

}
