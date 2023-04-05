package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("file:///C:/Users/com/Downloads/Table1.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		// identify "300"
	WebElement	Value=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[3]"));
		
		String S1=Value.getText();
		
		System.out.println(S1);
		
		
		
		
		
	}

}
