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

public class Shiva 
{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
			
		WebDriver driver = new ChromeDriver ();
		
		Thread.sleep(2000);
			
		driver.get("https://www.facebook.com/login");
			
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Nitinkumar");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Rathod");

		Thread.sleep(1000);

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9067486795");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ashu@123");

		Thread.sleep(1000);

		WebElement listbox_day= driver.findElement(By.xpath("//select[@name='birthday_day']"));

		Select s1 = new Select (listbox_day);
		
		Thread.sleep(1000);

		s1.selectByVisibleText("18");
		
		WebElement listbox_month= driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select s2 = new Select (listbox_month);
		
		Thread.sleep(1000);

		s2.selectByVisibleText("Feb");
		
		WebElement listbox_year= driver.findElement(By.xpath("//select[@name='birthday_year']"));

		Select s3 = new Select (listbox_year);
		
		Thread.sleep(1000);

		s3.selectByVisibleText("1998");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		Thread.sleep(1000);

		boolean B1=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();

		System.out.println(B1);
		
		//Thread.sleep(1000);

		//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File Dest = new File ("C:\\Users\\Shree\\Desktop\\Screenshot\\ssface1st.jpg");
		
		//FileHandler .copy(source , Dest);
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		// hya page chya pudhe aapan automate nahi karu shakat, karan tithe capta code yetoy (I am not a robot wala)

		Thread.sleep(20000);

	  //  File sourc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File est = new File ("C:\\Users\\Shree\\Desktop\\Screenshot\\ssfac2nd.jpg");
		
		//FileHandler .copy(sourc , est);
		
		//Thread.sleep(20000);

		String  D1 = driver.findElement(By.xpath("(//span[@dir='auto'])[2]")).getText();
		
		System.out.println(D1);//
		
		boolean  p1 = driver.findElement(By.xpath("(//span[@dir='auto'])[2]")).isDisplayed();
		
		System.out.println(p1);//true
		
		

		//=============================================================================================	
		
		
		Thread.sleep(2000);


	Window A1=driver.manage().window();
		
		Thread.sleep(2000);
		
	Point N3=A1.getPosition();//(-8,-8 )
	
		 
		
		Thread.sleep(2000);

		System.out.println(N3);
		
		Thread.sleep(2000);
		
	    Dimension N1=A1.getSize();//(1382, 744)
		
	    System.out.println(N1);
	    
	    //=======================================================================================
	    
		Thread.sleep(2000);

		Dimension r1 = new Dimension (400,700);
		A1.setSize(r1);
		
		Thread.sleep(2000);

		Point r2 = new Point (2,2);
		
	    A1.setPosition(r2);
		
		Thread.sleep(2000);

		A1.minimize();
	    
		driver.close();
		
		
		
		
		
		
		
		
		}
		
		
		

		
		
		
		
		
		
		
		

	

}
