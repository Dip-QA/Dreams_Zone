package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage1 
{
	    @FindBy(xpath="//input[@id='email']")                private    WebElement     UN;
	    @FindBy(id="pass")    private     WebElement    PWS;
	    @FindBy(xpath="//button[@name='login']")            private     WebElement    Login;
	
	
	  public  FaceBookLoginPage1(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	
	  public void EnterUN() 
	  {
		  UN.sendKeys("9021837648");
	  }
	
	 public void EnterPws() 
	 {
		 PWS.sendKeys("Dipa@2910");
	 }
	
	 public void HitLoginBtn() 
	 {
		 Login.click();
	 }

}
