package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 
{
	@BeforeClass          // tehn search @BeforeClass--->execute the code 
	public void Open() 
	{
		Reporter.log("Open brouser",true);
	}
	
	@BeforeMethod          //Then search @BeforeMethod
	public void Login() 
	{
		Reporter.log("Login",true);
	}
	
	@Test                   // search @Test annotaion 
	public void Tc1() 
	{
		Reporter.log("Running Tc1",true);
		
	}
	
	@AfterMethod             // after excute the tc --->execute the @AfterMethod
	public void Logout() 
	{
		Reporter.log("Logout",true);
		
	}
	
	@AfterClass               //@AfterClass ---> execute the code 
	public void Close() 
	{
		Reporter.log("Brouser close",true);
	}
	
	
	

}
