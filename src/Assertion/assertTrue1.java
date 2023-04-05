package Assertion;

import org.testng.annotations.Test;

import graphql.Assert;

public class assertTrue1 
{
	@Test
	public void TC1() 
	{
		boolean   ActualResult=true;
		Assert.assertTrue(ActualResult);//Pass
		
	}

	@Test
	public void TC2() 
	{
		boolean ActualResult=false;
		Assert.assertTrue(ActualResult);//Fail
		
	}
	
	
	
	
	
}
