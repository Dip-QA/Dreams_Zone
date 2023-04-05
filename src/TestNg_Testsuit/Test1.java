package TestNg_Testsuit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
	@Test 
	public void Tc1() 
	{
		Reporter.log("Tc1 is running ",true);
	}

	@Test
	public void Tc2() 
	{
		//Assert.fail();
		Reporter.log("Tc2 is running ",true);
	}
	
	
	
	
	
	
	
	
}
