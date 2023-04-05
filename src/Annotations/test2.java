package Annotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 
{                                   //open brouser
	                               //Login
	                               //tc1 is running 
	                               //Logout
	                              //Login
	                              //Tc2 is running 
	                              //Logout
	                              // brouser close
	@BeforeClass
	public void Open()             //III) search @BeforeClass-->execute
	{
		Reporter.log("Open Brouser",true);
	}

	@BeforeMethod                  //II) search @BeforeMethod---2-->execute--tc2--login
	public void Login() 
	{
		Reporter.log("Login",true);
	}
	
	@Test
	public void Tc1()                 //I) search @Test---3-->execute(alphabetically)
	{
		Reporter.log("Tc1 is running",true);
		
	}
	
	@Test
	public void Tc2()                // search any other tc is tere or not --> execute
	{
		Reporter.log("Tc2 is running ",true);
	}
	
	@AfterMethod
	public void Logout()               //Iv) seacrch--> execute-->execute for Tc2
	{
		Reporter.log("LogOut",true);
		
	}
	@AfterClass
	public void Close()                 // execute 
	{
		Reporter.log("Close Brouser",true);
	}
	
	
	
	
	
	
	
}
