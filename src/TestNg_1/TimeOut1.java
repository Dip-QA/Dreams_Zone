package TestNg_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut1 
{
	
	@Test(timeOut=4000)
	public void Tc1() throws InterruptedException 
	{
		Thread.sleep(9000);
		Reporter.log("Hello",true);
		
	}
	
	@Test
	public void Tc2() 
	{
		Reporter.log("hii",true);
		
	}
	
	
	
	
	
	

}
