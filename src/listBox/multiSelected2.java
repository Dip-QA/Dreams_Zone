package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiSelected2
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium_imp\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(2000);
		
		 driver.get("file:///C:/Users/com/Downloads/MultiselectableListbox%20(1).html");
		 Thread.sleep(2000);
		
		 // identify the listbox and store it into an object 
		WebElement D1=driver.findElement(By.xpath("//select[@id='1234']"));
		  Thread.sleep(2000);
		 
		 // create object of select class
		  Select S1=new Select(D1);
		    Thread.sleep(2000);
		
		    
		  //call the method 
		    S1.selectByVisibleText("Ind");
		    Thread.sleep(1000);
		   
		   S1.selectByIndex(3);
		   Thread.sleep(1000);
		    
		    S1.selectByVisibleText("Pak");
		    Thread.sleep(1000);
		    
		    S1.selectByIndex(1);
		    Thread.sleep(1000);
		    
		    // listbox is selected or not 
		   boolean D2=D1.isSelected();
		    System.out.println(D2);
		    
		   // deselect the list box 
		     S1.deselectByVisibleText("Ind");
		     Thread.sleep(1000);
		    
		     S1.deselectByIndex(3);
		     Thread.sleep(1000);
		    
		     S1.deselectByVisibleText("Pak");
		     Thread.sleep(1000);
		     
		     S1.deselectByIndex(1);
		     Thread.sleep(1000);
		    
		    boolean G1=D1.isSelected();
		     System.out.println(G1);
		     
		   driver.close();  
		     
	}

}
