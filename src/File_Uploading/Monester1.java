package File_Uploading;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monester1 
{
	 public static void main(String[] args) throws Exception 
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver.exe");
			
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.foundit.in/");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.manage().window().maximize();
		 
driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();
 
      // 1 st method- by using Sendkeys (attribute type=file )
       //driver.findElement(By.id("file-upload"));	 
	
     // if file attribut type= other than file then use robot class

       // click on file upload
      
       WebElement   button=driver.findElement(By.id("file-upload"));	 
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("arguments[0].click();", button );

      // create instance of robot class
          Robot rb=new Robot();
          rb.delay(2000);
        
          /* Steps
         Copy to clicpboard
         * cntrol+v
         * and enter  
         */
          
           
       // copy to clipboard 
          StringSelection ss=new StringSelection("\"C:\\Users\\com\\Desktop\\Resumes\\Dipali_arun_pawar.pdf\"");
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    
      // press control
          rb.keyPress(KeyEvent.VK_CONTROL);
          rb.keyPress(KeyEvent.VK_V);

       // Release press control
          rb.keyRelease(KeyEvent.VK_CONTROL);
          rb.keyRelease(KeyEvent.VK_V);
 
       // press Enter   
          rb.keyPress(KeyEvent.VK_ENTER);
          rb.keyRelease(KeyEvent.VK_ENTER);
          
          
	 }

}
