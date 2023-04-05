package Selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi_selected1
{
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(0);
		
		driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		  Thread.sleep(200);
		
	 WebElement	D1=driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select S1=new Select(D1);
		
		// verify is it multiselected or not 
		  boolean P1= S1.isMultiple();
		    System.out.println(P1);
		Thread.sleep(2000);
		
		// select options
		  S1.selectByVisibleText("Ind");
		  Thread.sleep(2000);
		  S1.selectByIndex(3);
		  Thread.sleep(2000);
		  
		// get first selected option
		   String U1=S1.getFirstSelectedOption().getText();
		  System.out.println(U1);
		  Thread.sleep(2000);
		  
		//get all selected options
		 List<WebElement> O1=S1.getAllSelectedOptions();
		  
		  for( WebElement  H1:O1) 
		  {
			  System.out.println(H1.getText());
		  }
		  
		  
		 //get all otions 
		 List<WebElement> A1=S1.getOptions();
		  
		 for( WebElement  W1:A1) 
		  {
			  System.out.println(W1.getText());
		  }
		  
		  
		
	}

}
