package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotNull1
{
	@Test
	public void TC1() 
	{
		String S1=null;
		
		Assert.assertNotNull(S1);//Fail
	}
	
	@Test
	public void TC2() 
	{
		String S1="abcd";
		
		Assert.assertNotNull(S1);//Pass
	}
	

}
