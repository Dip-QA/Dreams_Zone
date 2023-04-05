package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class aseertNull1 
{
	@Test
	public void TC1() 
	{
		String S1=null;
		Assert.assertNull(S1);//Pass
		
	}

	@Test
	public void TC2() 
	{
		String S1="abcd";
		
		Assert.assertNull(S1);//Fail
		
	}
	
	
	
	
	
}
