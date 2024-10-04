package common;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.setProperty("org.uncommons.reporting.title", "NASLOVVVVVVVVVVVV");

		Reporter.log("Method name is - " +result.getName()); 
		System.out.println("Test is starting ...");
	}
	
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - " +result.getStatus());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("The test failed - screeenshot captured");
		
	
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("org.uncommons.reporting.escape-output", "false");
		
		Reporter.log("<a href=\"C:\\Users\\Lora.Turanovikj\\eclipse-workspace\\TestNGTutorials\\screenshot\\new.png\">Test Results</a>");
		
	}
	

}
