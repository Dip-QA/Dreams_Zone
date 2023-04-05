package WebTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("file:///D:/Automation_Testing/Table1.html");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		// featch the info of Column 2
		
		for(int i=1;  i<=4;  i++) 
		{
			WebElement ColumnData=driver.findElement(By.xpath("//table[@id='1234']//tr/td["+ i+"]"));
			
			    String S1=ColumnData.getText();
			System.out.println(S1);
			
			
		}
		
		
		
		
	}

}
