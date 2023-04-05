package Organization_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBook_Login1
{
	
	     @FindBy(xpath="//input[@id='email']")      private   WebElement    UN;
	
	     @FindBy(xpath="//input[@id='pass']")        private   WebElement   PWS;
	
	     @FindBy(xpath="//button[@id='loginbutton']")  private   WebElement Login;
	
	
	  public  FaceBook_Login1(WebDriver driver)
	     {
	    	PageFactory.initElements(driver, this); 
		  
	     }
	 
	
	    public void EnterUN() 
	    {
	    	
	    	
	    }
	  
	   public void EnterPWS() 
	   {
		   
		   
	   }
	  
	   public void ClickLogin() 
	   {
		   
		   
		   
	   }
	  
	  
	  
	  
	
	
	

}
