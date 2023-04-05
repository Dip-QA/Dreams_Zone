package Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitlywait1
{
	
	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "D:\\selenium_imp\\geckodriver-v0.32.0-win64\\geckodriver.exe");	
		
	WebDriver driver=new FirefoxDriver();	
	
  
	
	driver.get("https://www.naukri.com/mnjuser/performance");
		
	WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(10));	
	
	//Until(ExcetedCondition.ElementToBeclickable(By.xpath("//span[text()='Sign in with Google']")));
		
	}
	
	
	
	
	
	

}
