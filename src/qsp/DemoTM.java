package qsp;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTM 
{
	//Method obj will store upcoming TestMethod
	@BeforeMethod
	public void preCondition(Method testMethod)
	{
		Reporter.log(testMethod.getName(), true);
		
	}
	//ITest Results will store result of Just Executed Test Method
	//Status=1 means PASS Status=2 is Fail
	@AfterMethod
	public void postCondition(ITestResult res)
	{
		int s=res.getStatus();
		Reporter.log("Status:"+s, true);
		
	}
	
	@Test
	public void test1()
	{
		
		Reporter.log("this is Test 1", true);
		Assert.fail();
		
	}
	
	@Test
	public void test2()
	{
		
		Reporter.log("this is Test 2", true);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
