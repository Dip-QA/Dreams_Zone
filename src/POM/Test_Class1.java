package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class1
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//create object of POM I
		 OrangeHRMLoginpage1 LoginPage=new  OrangeHRMLoginpage1(driver);
		  LoginPage.EnterUn();
		  Thread.sleep(2000);
		  
		  LoginPage.EnterPWD();
		  Thread.sleep(2000);
		  
		  LoginPage.HitLoginBtn();
		  Thread.sleep(2000);
		
		// create object of POM II
		 OrangeHRMPMIpage1 Pmipage=new OrangeHRMPMIpage1(driver);
		   Pmipage.UserName();
		
		
	}

}
