package Assertion;


import org.testng.Assert;
import org.testng.annotations.Test;

public class aseertEquals1 
{
	@Test
	public void TC1() 
	{
		String ExpectedResult="Hii";
		String ActualResult="Hii";
		
		Assert.assertEquals(ActualResult, ExpectedResult);//Pass
		
	}
	
	@Test
	public void TC2() 
	{
		String ExpectedResult="Hii";
		String ActualResult="Hello";
		
		Assert.assertEquals(ActualResult, ExpectedResult);//fail
		
	}
	
	
	

}
