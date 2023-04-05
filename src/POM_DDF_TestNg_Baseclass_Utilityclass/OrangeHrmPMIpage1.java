package POM_DDF_TestNg_Baseclass_Utilityclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmPMIpage1 
{
	
	  @FindBy(xpath="//span[@class='oxd-userdropdown-tab']")  private   WebElement   UserName;
	  @FindBy(xpath="//a[text()='Logout']")                   private          WebElement   Logoutbtn;
	
	 public OrangeHrmPMIpage1(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
		  
		  
	  }
	
	 public String getUserName() 
	 {
		String ActResult=UserName.getText();
		 
		 return ActResult;
	 }
	 
	 public void ClickOnUn() 
	 {
		 UserName.click();
	 }
	
	 public void ClickOnLogOutbtn() 
	 {
		 Logoutbtn.click();
		 
	 }
	
	

}
