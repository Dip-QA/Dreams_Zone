package POM_WithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPMIpage1 
{
	
	  @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")  private   WebElement   UserName;
	
	
	 public OrangeHrmPMIpage1(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  
	  }
	
	 public void VerifyResult(String ExpectedUN) 
	 {
	      String ActualUn= UserName.getText();
		 
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
