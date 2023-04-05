package Pop_up;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_popup1 
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links");
		 Thread.sleep(2000);
		
		 // click on new tab button
		 driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		 Thread.sleep(5000);
		 
		 // to get the id of the mainpage and window pop_up 
		Set<String> AllIds=driver.getWindowHandles();
		 
		ArrayList<String> ar1=new ArrayList<String>(AllIds);
		 
		      String   MainpageId=ar1.get(0);
		   System.out.println( MainpageId);
		 
		String WindowPopupId=ar1.get(1);
		   System.out.println(WindowPopupId);
		   
		   Thread.sleep(2000);
		   
		 // to shift the focus of the selenium on windowpop_up
		 driver.switchTo().window(WindowPopupId);
		 
		 Thread.sleep(2000);
		 
		 //click on training button 
		 driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		 
		 // to shift the focus of selenium on mainpage 
		 driver.switchTo().window(MainpageId);
		 Thread.sleep(5000);
		
		
		 // click on new window button
		 driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		  Thread.sleep(5000);
		  
		 // driver.manage().window().maximize();
		 
		// to shift the focus on window popup2
		  Set<String> AllIds1=driver.getWindowHandles();
			 
			ArrayList<String> ar2=new ArrayList<String>(AllIds1);
	                String Window2=ar2.get(2);
	               Thread.sleep(2000);
		 
	          // shift focus to the 2windowPopup      
		  driver.switchTo().window(Window2);
		  Thread.sleep(2000);
		  
		// click on selenium
		  driver.findElement(By.xpath("(//div[@class='lines-button '])[2]")).click();
		  
		 
	}

}
