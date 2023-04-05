package TestNg_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWord1
{
	// execute thid 10 times 
	
	@Test(invocationCount=10)
	public void Tc1() 
	{
		Reporter.log("Hii", true);
		
	}
	
	
	
	
	

}
