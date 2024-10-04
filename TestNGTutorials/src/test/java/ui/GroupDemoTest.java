package ui;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import utilities.testUtils;

@Test
public class GroupDemoTest extends testUtils implements ITestListener{
	
//	@BeforeClass
//	public void beforeClass() {
//		System.out.println("Run this before class");
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		System.out.println("Run this after class");
//	}
//	
//	@BeforeGroups(value ="regression")
//	public void beforeGroup() {
//		System.out.println("Run this before group regression");
//	}
//	
//	@AfterGroups(value ="regression")
//	public void afterGroup() {
//		System.out.println("Run this after group regression");
//	}
	
	public void onTestStart(ITestResult result) {
		
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
		
		Reporter.log("<a href=\"C:\\Users\\Lora.Turanovikj\\eclipse-workspace\\TestNGTutorials\\screenshotnew\\Thu-Oct-03-13-47-02-CEST-2024.png\">Test Results</a>");
		
	}
	
	
	@Test(groups= {"regression"})
	public void bTest1()
	{
		System.out.println("test1");
	}
	
	@Test(groups= {"bvt"})
	public void bTest2()
	{
		System.out.println("test2");
	}

	@Test(groups= {"regression", "bvt"})
	public void bTest3()
	{
		System.out.println("test3");
	}
	
	@Test(groups= {"bvt"})
	public void bTest4()
	{
		System.out.println("test4");
	}
}
