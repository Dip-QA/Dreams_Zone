package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_homepage1
{
	  @FindBy(xpath="//input[@name='uid']")         private       WebElement UN;
	  @FindBy(xpath="//input[@name='password']")     private       WebElement PWS;
	  @FindBy(xpath="//input[@name='btnLogin']")     private       WebElement  Login;
	
	public  Guru99_homepage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void EnterUn(String UserName) 
	{
		UN.sendKeys(UserName);
	}
	
	public void EnterPsw(String Password) 
	{
		PWS.sendKeys(Password);
		
	}
	
	public void Login() 
	{
		Login.click();
		
	}
	
	
	
	
	

}
