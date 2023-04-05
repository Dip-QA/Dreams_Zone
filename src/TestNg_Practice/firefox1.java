package TestNg_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox1
{
	@Test
	public void TC1() throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\selenium_imp\\geckodriver-v0.32.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.close();
		
		
		
	}

}
