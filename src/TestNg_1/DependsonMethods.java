package TestNg_1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods 
{
	@Test
	public void login() 
	{
		Assert.fail();
		Reporter.log("Hii",true);
		
	}
	
	@Test(dependsOnMethods= {"login"})
	public void LogOut() 
	{
		
		Reporter.log("Hello",true);
		
	}
	
	
	
	
	
	
	

}
