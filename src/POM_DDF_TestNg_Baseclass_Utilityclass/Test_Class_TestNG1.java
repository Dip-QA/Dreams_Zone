package POM_DDF_TestNg_Baseclass_Utilityclass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class_TestNG1 extends Base_Class1
{
	// WebDriver driver;
	// initializeBrouser(){}
	
	OrangeHRMLoginpage1 Login;
	OrangeHrmPMIpage1 PIMPage1;
	
	int TestCaseId;
	
	@BeforeClass
	public void OpenBrouser() throws InterruptedException 
	{
		 initializeBrouser();
		
		// create object of POM I
		Login=new OrangeHRMLoginpage1(driver);
		
		
		//create object of POM II
		 PIMPage1=new OrangeHrmPMIpage1(driver);
		
	}
	
	@BeforeMethod 
	public void Login() throws IOException 
	{
		Login.EnterUn(Utility_Class1.getdatafromPF("UN")); //Admin
		Login.EnterPw(Utility_Class1.getdatafromPF("PWS"));//admin123
		Login.Login();
	}
	
	@Test(priority=1)
	public void TC1() throws EncryptedDocumentException, IOException 
	{
		TestCaseId=100;
		
	  String ActualResult=PIMPage1.getUserName();
	  String ExpectedResult=Utility_Class1.getdataofEs(0, 0);
	  
	   Assert.assertEquals(ActualResult,ExpectedResult);
	   
	}
	
	@Test(priority=2)
	public void Tc2() throws EncryptedDocumentException, IOException 
	{
		 TestCaseId=200;

		String ActualResult=driver.getCurrentUrl();
		  String ExpectedResult=Utility_Class1.getdataofEs(0, 1);
		
		  Assert.assertEquals(ActualResult, ExpectedResult);
	}
	
	@AfterMethod
	public void LogOut(ITestResult Result) throws IOException//TC status stored
	{                          //FAIL
		if(Result.getStatus()==ITestResult.FAILURE) 
		{                                           //100
			Utility_Class1.Capturscreenshot(driver, TestCaseId);
			
		}
		
		PIMPage1.ClickOnUn();
		PIMPage1.ClickOnLogOutbtn();
		
	}
	
	@AfterClass
	public void CloseBrouser() 
	{
		driver.close();
		
	}
	
	

}
