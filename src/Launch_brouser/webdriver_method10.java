package Launch_brouser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_method10 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		driver.get("https://www.makemytrip.com");
		
		// to get default size of the brouser
		
		 Dimension S1=driver.manage().window().getSize();
		
		System.out.println(S1);
		
	}
	
	
	
	
	
	
	
	
	
	

}
