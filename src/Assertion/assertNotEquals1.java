package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertNotEquals1 
{
	@Test
	public void TC1() 
	{
		String S1="Hii";
		String S2="Hello";
		
	Assert.assertNotEquals(S2, S1);	//Pass
		
		
	}

	@Test
	public void TC2() 
	{
		String S1="Hii";
		String S2="Hii";
		
		Assert.assertNotEquals(S2, S1);//Fail
	}
	
	
	
	
	
	
	
	
}
