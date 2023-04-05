package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		// create object of POM I
		FaceBookLoginPage1 LoginPage=new FaceBookLoginPage1(driver);
		LoginPage.EnterUN();
		Thread.sleep(2000);
		
		LoginPage.EnterPws();
		Thread.sleep(2000);
		
		LoginPage.EnterPws();
		Thread.sleep(2000);
		
		//create object of POM II
		 FaceBookHomePage1 HomePge=new  FaceBookHomePage1(driver);
		 HomePge.VerifyUN();
		
		
		
	}

}
