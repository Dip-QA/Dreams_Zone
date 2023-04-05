package POM_Practice;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookHomePage1 
{
	      @FindBy(xpath="(//div[@data-visualcompletion='ignore-dynamic'])[4]") private  WebElement  UserName;
	
	
	   public FaceBookHomePage1(WebDriver driver)
	      {
	    	  PageFactory.initElements(driver, this);
	      }
	
	   public void VerifyUN() 
	   {
		  String ExpectedUN="Dipali Pawar" ;
		  String ActualUn=UserName.getText();
		  
		  if(ExpectedUN.equals(ActualUn)) 
		  {
			  System.out.println("Pass");
		  }
		  else 
		  {
			  System.out.println("Fail");
		  }
		  
		  
		  
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   

}
