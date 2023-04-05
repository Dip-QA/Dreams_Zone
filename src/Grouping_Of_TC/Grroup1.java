package Grouping_Of_TC;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grroup1 
{
	@Test (groups="Login")
	public void Tc1() 
	{
		Reporter.log("TC1 is running", true);
		
	}
  
	@Test (groups="Login")
	public void Tc2() 
	{
		Reporter.log("TC2 is running", true);
		
	}
	
	@Test (groups="Admin")
	public void Tc3() 
	{
		
		Reporter.log("TC3 is running", true);
	}
	
	@Test (groups="Admin")
	public void Tc4() 
	{
		
		Reporter.log("TC4 is running", true);
	}
	
	
	@Test (groups="PMI")
	public void Tc5() 
	{
		Reporter.log("TC5 is running", true);
		
	}
	
	@Test (groups="PMI")
	public void Tc6() 
	{
		Reporter.log("TC6 is running", true);
		
	}
	
	
	
	
}
