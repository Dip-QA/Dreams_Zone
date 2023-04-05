package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertFalse1
{
	@Test
	public void TC1() 
	{
		 boolean ActualResult=false;
		 
		 Assert.assertFalse(ActualResult);//Pass
		
	}

	@Test
	public void TC2() 
	{
		 boolean  ActualResult=true;
		
		Assert.assertFalse(ActualResult);//fail
		
	}
	
}
