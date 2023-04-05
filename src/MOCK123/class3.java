package MOCK123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class3
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(2000);
		
	WebElement	S1=driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		
		Select S2=new Select(S1);
		
		S2.selectByVisibleText("2000");
		  Thread.sleep(2000);
		
	boolean	D1=S2.isMultiple();
		System.out.println(D1);
	}

}
