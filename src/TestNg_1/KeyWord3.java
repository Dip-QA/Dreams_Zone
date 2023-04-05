package TestNg_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeyWord3
{
	@Test(enabled=false)
	public void Tc1() 
	{
		Reporter.log("Hii", true);
		
	}

	@Test
	public void Tc2() 
	{
		
		Reporter.log("Good morning ", true);
		
	}
	
	
	
	
	
	
	
	
}
