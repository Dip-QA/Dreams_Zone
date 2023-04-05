package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMPMIpage1
{
	//POM II
	
	          @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")  private  WebElement  UserName;
	
	
	       public OrangeHRMPMIpage1(WebDriver driver)
	          {
	        	  PageFactory.initElements(driver, this);
	        	  
	          }
	
          public void UserName() 
          {
        	  String ExpectedUN="Paul Collings";
        	  
        	  String ActualUN=UserName.getText();
        	  
        	  //Poll collings
        	  if(ExpectedUN.equals(ActualUN)) 
        	  {
        		  System.out.println("Pass");
        	  }
        	  else 
        	  {
        		  System.out.println("Fail");
        	  }
          }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
}
