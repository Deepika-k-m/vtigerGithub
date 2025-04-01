package genericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListernersImplimentation  implements ITestListener {
	
	JavaUtility jUtil=new JavaUtility();
	String dateStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	
	ExtentReports report;
	ExtentTest test;
	ThreadLocal<ExtentTest>extentTest=new ThreadLocal();

	public void onTestStart(ITestResult result) {
		//System.out.println("On Test start");
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"->On test start");
		Reporter.log(methodName+"->On test start");
		
		
		//create a field in the generated extent report
		 test=report.createTest(methodName);
		 
		 //Sets the current thread's copy of this thread-local variable to the specified value
		 extentTest.set(test);
	}

	public void onTestSuccess(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"->On test success");
		Reporter.log(methodName+"->On test success");
		
		//Logging the status
		//test.log(Status.PASS,methodName+"-executed succesfully");
		extentTest.get().log(Status.PASS,methodName+"-executed succesfully");

	}

	public void onTestFailure(ITestResult result) {
	
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"->On test failure");
		Reporter.log(methodName+"->On test failure");
		
		//Loggin the status
			//test.log(Status.FAIL,methodName+"test failed");
		extentTest.get().log(Status.FAIL,methodName+"test failed");

		//Logging the throwable messages
		//test.log(Status.INFO,result.getThrowable());
		extentTest.get().log(Status.INFO,result.getThrowable());

		
		//It will take the screenshot
		SeleniumUtility sUtil=new SeleniumUtility();
		try {
			
			String path=sUtil.takeScreenShot(BaseClass.sDriver, dateStamp);
			extentTest.get().addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On Test Skipped");
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"->On test Skipped");
		Reporter.log(methodName+"->On test Skipped");
		
		
		//login the status
		test.log(Status.SKIP,methodName+"-test skipped");
		extentTest.get().log(Status.SKIP,methodName+"-test skipped");

	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
		System.out.println("On Suite start");
		
		//COnfiguration of the extent report
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\ExtentReport\\report-"+dateStamp+".html");
		reporter.config().setDocumentTitle("VTiger Execution Report");
		reporter.config().setReportName("Build 1 VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
				
		//create an empty Extent Report
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("Base OS", "Windows");
		report.setSystemInfo("Base URL","http://localhost:8888");
		report.setSystemInfo("Base platform","Testing-Env");
		report.setSystemInfo("Reporter","Thaher");


	}

	
	public void onFinish(ITestContext context) {
		System.out.println("On Suite Finish");
		
		//Flushing the report
		report.flush();
	}

}