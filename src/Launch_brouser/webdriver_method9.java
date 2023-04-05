package Launch_brouser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method9
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe\\");
		
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.makemytrip.com");
		
		// to set size of the brouser
		 Dimension D1=new Dimension(400,500);
		 driver.manage().window().setSize(D1);
		
	}
	
	
	
	
	
	
	

}
