package qspiders.day3;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo1 {

	/*static
	{
		System.setProperty("webdriver.chrome.driver","E:\\seleniumAdvance3.6NewJars\\SeleniumChromeDriver\\chromedriver.exe");
		
	}
	*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String fiePath="./result/report.html";
		
		ExtentReports report=new ExtentReports(fiePath);
		
		ExtentTest t=report.startTest("Test1");
		t.log(LogStatus.PASS, "details");
		report.endTest(t);
		
		ExtentTest t2=report.startTest("Test2");
		t2.log(LogStatus.FAIL, "details");
		report.endTest(t2);
		
		report.flush();

	}

}
