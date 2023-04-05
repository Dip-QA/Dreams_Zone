package Utilization;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Shakti
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		
		 Thread.sleep(2000);
		
		 driver.get("https://www.facebook.com");
		 Thread.sleep(2000);
		
		Window S1=driver.manage().window();
		 S1.maximize();
		 Thread.sleep(2000);
		 
		 // click on create new account button 
		 driver.findElement(By.xpath("//a[contains(@class,'_42ft _4jy0 _6')]")).click();
		 Thread.sleep(5000);
		
		 //enter FN
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dipali");
		 Thread.sleep(2000);
		
		 // enter Surname
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pawar");
		 Thread.sleep(2000);
		 
		 //Enter MB 
		 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9021837648");
		  Thread.sleep(2000);
		 
		 // Enter Pw 
		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Dipa@2910");
		  Thread.sleep(2000);
		  
		  // getPosition of the webpage //-8,-8
		    Point  P1=S1.getPosition();
		   System.out.println(P1);
		   Thread.sleep(2000);
		   
		  // Select "Birthdate"
		 WebElement D1=driver.findElement(By.xpath("//select[@id='day']"));
		  Select S2=new Select(D1);
		     S2.selectByVisibleText("29");
		        Thread.sleep(2000);
		     
		     
		 // Select BirthMonth
		  WebElement D2=driver.findElement(By.xpath("//select[@id='month']"));     
		     Select S3=new Select(D2);
		        S3.selectByIndex(9);
		         Thread.sleep(2000);
		         
		 // select Birthyear        
		     WebElement D3=driver.findElement(By.xpath("//select[@name='birthday_year']"));   
		         Select S4=new Select(D3);
		               S4.selectByValue("2000");
		               Thread.sleep(2000);
		               
		               
		 // select gender
		      driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		        Thread.sleep(2000);
		        
		   // verify radio buttton selected or not 
		       boolean J1=driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		           System.out.println(J1);
		        Thread.sleep(2000);
		        
		  // click on sign in button
		        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		            Thread.sleep(5000);
		    
		        
		 // takes screenshot
		            
		   File Soarce=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
		               
		      File Destination=new File("D:\\Screenshots\\sample10.jpg");
		        FileHandler.copy(Soarce, Destination);
		     Thread.sleep(2000);   
		        
		        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).sendKeys("57978");
		             Thread.sleep(2000); 
		             
		     // click on continue button 
		          driver.findElement(By.xpath("//button[contains(@class,'_42ft _4')]")).click();   
		              Thread.sleep(2000);
		             
		    // setsize 
		            Dimension A1=new Dimension(500, 600);  
		              S1.setSize(A1);
		              
	}

}
