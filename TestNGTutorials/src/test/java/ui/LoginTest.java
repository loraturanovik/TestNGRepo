package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication(){
		System.out.println("Login to Application");
	}
	
	@AfterTest
	public void logoutToApplication(){
		System.out.println("Logout from Application");
	}
	
	@BeforeMethod
	public void connectToDB() {
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("DB Disconnected");
	}
	
	@Test
	public void loginTest() {
		System.out.println("test1");
	}
	
	@Test
	public void logoutTest() {
		System.out.println("test2");
	}
}
