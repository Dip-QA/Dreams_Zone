package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test2
{
	@Test
	public void Tc1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		
		//create object of pom I 
		Pom1_Guru99 Guru=new Pom1_Guru99(driver);
		Guru.EnterId();
		Thread.sleep(2000);
		
		Guru.Subbmit();
		Thread.sleep(2000);
		
		Guru.Popup(driver);
		
		
		
	}

}
