package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginpage1 
{
	//POM I
	//Data member should be declared globally with access  level private by using @findBy annotation
	    @FindBy(xpath="//input[@name='username']")   private   WebElement  UN;//private webelement UN findElement(By.xpath("//input[@name='username']"));
	
	    @FindBy(xpath="//input[@name='password']")   private    WebElement PSW;
	
	    @FindBy(xpath="//button[@type='submit']")    private    WebElement Loginbtn;
	
	
	 //Initialize within cunstructor with access level public by using PageFactory   
	  public  OrangeHRMLoginpage1( WebDriver driver)
	    {
	    	PageFactory.initElements ( driver , this);
	    	
	    }
	
	  //Utilize within methods with access level public 
       public void EnterUn() 
       {
    	   UN.sendKeys("Admin");
    	   
       }
	  
	   public void EnterPWD() 
	   {
		   PSW.sendKeys("admin123");
		   
	   }
	  
	   public void HitLoginBtn() 
	   {
		   Loginbtn.click();
	   }
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
