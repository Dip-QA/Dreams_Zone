package NotePad_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator1
{
	public static void main(String [] args) throws InterruptedException
	{
	   System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");

	   WebDriver driver=new ChromeDriver();
	     Thread.sleep(2000);

	     driver.get("https://www.facebook.com/login");
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Dipali");
	     Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Dipa@2910");
	    Thread.sleep(2000);
	  
	driver.findElement(By.xpath("//button[text()='Log in']")).click();


	}

}
