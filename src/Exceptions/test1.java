package Exceptions;

import org.testng.annotations.Test;

public class test1
{
	//Illegal Argument exception
	@Test
	public void Tc1() throws InterruptedException 
	{
		Thread.sleep(-5000);
	}

}
