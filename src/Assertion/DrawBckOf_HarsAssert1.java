package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DrawBckOf_HarsAssert1
{
	@Test
	public void TC1() 
	{
		String S1="Hii";
		String S2="Hello";
		String S3="Good Morning";
		
	
		Assert.assertNotEquals(S2, S1);//Pass
		
		Assert.assertEquals(S2, S1);   //Fail
		
		Assert.assertEquals(S2, S3);   //Fail
		
		
		Assert.assertNotEquals(S1, S3);  //Pass
		
		
	}

}
