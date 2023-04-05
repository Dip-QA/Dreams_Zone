package POM_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginpage1
{
	     @FindBy(xpath="//input[@name='username']")     private        WebElement            UN;
	     @FindBy(xpath="//input[@name='password']")     private         WebElement           Pws;
	     @FindBy(xpath="//button[@type='submit']")      private         WebElement           Login;
	                   
	                   
	  public OrangeHRMLoginpage1(WebDriver driver)
	     {
	    	 PageFactory.initElements(driver, this);
	     }
	     
	   
	  public void EnterUn(String UserName) 
	  {
		  UN.sendKeys(UserName);
	  }
	     
	  public void EnterPw(String Password) 
	 {
		   
		  Pws.sendKeys(Password);
		  
	 }  
	  public void Login() 
	  {
		  
		 Login.click(); 
		  
		  
	  }   
	     
	     
	     
	     
	                   
	                   
	                   
	                   
}
