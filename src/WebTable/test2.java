package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("file:///D:/Automation_Testing/Table1.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// to get column size
	List<WebElement>	Column=driver.findElements(By.xpath("//table[@id='1234']//tr[4]/td"));
		
		    int   S1=Column.size();
		
		System.out.println(S1);
	}

}
