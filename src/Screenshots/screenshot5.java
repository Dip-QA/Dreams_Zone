package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot5 
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/watch?v=nsiTLovc5oU&ab_channel=PanditPradeepJiMishraSehoreWale");
		
		Thread.sleep(2000);
		
		// to capture screenshot
	File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	// to move the ss
	 File Destination=new File("D:\\Screenshots\\sample5.jpg");
	 FileHandler.copy(Soarce, Destination);
		
		
		
	}

}
