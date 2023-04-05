package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1
{
	
	@Test
	public void TC1() 
	{
		String S1="Hii";
		String S2="Hello";
		String S3="Good Morning";
		
		SoftAssert Soft=new SoftAssert();
		
		Soft.assertEquals(S1, S2);//Fail
		
		Soft.assertNotEquals(S2, S3);//pass
		
		Soft.assertEquals(S1, S3);//Fail
		
		Soft.assertNotEquals(S3, S1);//Pass
		
		Soft.assertAll();
		
	}
	
	
	
	

}
