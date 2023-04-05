package POM_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1_Guru99
{
	  @FindBy(xpath="//input[@name='cusid']")    private       WebElement    Customer_Id;
	  @FindBy(xpath="//input[@name='submit']")    private        WebElement     Submit;
	
	public   Pom1_Guru99(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
	  }
	  
	  public void EnterId() 
	  {
		 Customer_Id.sendKeys("ABC"); 
		  
	  }
	  
	  public void Subbmit() 
	  {
		  Submit.click();
		  
	  } 
	  public void Popup(WebDriver driver) throws InterruptedException 
	  {
		 Alert S1=driver.switchTo().alert();
		  S1.accept();
		  S1.dismiss();
		 
	  }
	  
	  
	  
	  
	  
	  
	  
}
