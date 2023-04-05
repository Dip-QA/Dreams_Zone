package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
			
		driver.get("https://www.youtube.com");
		
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("Audience choice mashup 2020 | Multilingual | 15 tracks | Nithyashree | Caveman's Studio");
			Thread.sleep(2000);

		driver.findElement(By.xpath("(//yt-icon[contains(@class,'style-scope ytd-searchbox')])[2]")).click();
			
		Thread.sleep(2000);
		

	    driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();		


		}

}
