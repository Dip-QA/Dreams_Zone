package TestNg_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWord2 
{
	@Test(priority=2)
	public void Tc1() 
	{
		Reporter.log("GoodMrng",true);
		
	}

	@Test(priority=1)
	public void Tc2() 
	{
		Reporter.log("Smile", true);
		
	}
	
	@Test
	public void Tc3() 
	{
		Reporter.log("Subah", true);
		
	}
	
	@Test(priority=-1)
	public void Tc4() 
	{
		Reporter.log("Dipavali",true);
		
	}
	
	
	
	
	
	
}
