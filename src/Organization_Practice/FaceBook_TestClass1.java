package Organization_Practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook_TestClass1 extends FBbaseClass1
{
	//initializeBrouser()
	//WebDriver driver;    

	FaceBook_Login1 Login;
	FaceBook_HomePage1 Home;
	 
	@BeforeClass
	public void OpenBrouser() throws InterruptedException 
	{
		initializeBrouser();
		
		//object of POM I
		 Login=new FaceBook_Login1(driver);
		
		// object of POM II
		 FaceBook_HomePage1 Home=new FaceBook_HomePage1();
	}
	
	@BeforeMethod
	public void Login() 
	{
		Login.EnterUN();
		
		
	}
	
	@Test
	public void TC1() 
	{
		
	}
	
	@AfterMethod
	public void LOgOut() 
	{
		
		
		
	}
	
	@AfterClass
	public void CloseBrouser() 
	{
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
