package qsp;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemotestNG 
{
	
	ExtentReports report;
	ExtentTest test;
	
	@BeforeSuite
	public void init()
	{
		String filepath="./result/report.html";
		report=new ExtentReports(filepath);
		
	}
	
	
	@BeforeMethod
	public void preconditio(Method testMethod)
	{
		String name=testMethod.getName();
		test=report.startTest(name);
		
		
	}
	
	
	@Test
	public void createUser(Method testMethod)
	{
		
		test.log(LogStatus.INFO, "create User ....");
		
		
	}
	
	@Test
	public void deleteUser()
	{
		
		test.log(LogStatus.INFO, "delete User ....");
		Assert.fail();
		
	}
	
	@AfterMethod
	public void postcondition(ITestResult res)
	{
		int status=res.getStatus();
		
		if(status ==1)
		{
			test.log(LogStatus.PASS, "details");
		}
		else
		{
			//test.log(LogStatus.FAIL, "details");
			test.log(LogStatus.FAIL, test.addScreenCapture("../photo/delete.png"));
			//test.addScreenCapture("../photo/delete.png");
		}
		
		report.endTest(test);
		
	}
	
	
	@AfterSuite
	public void end()
	{
		report.flush();
	}
	
	
	
	

}
