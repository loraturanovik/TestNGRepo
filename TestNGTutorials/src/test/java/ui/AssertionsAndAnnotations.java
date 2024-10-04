package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class AssertionsAndAnnotations {
	
	// Ova se izvrsuva 2 ro 
	@BeforeClass
	public void beforeClass() {
		System.out.println("Start of this test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("End of this test");
	}
	
	@BeforeGroups(value ="test")
	public void beforeGroup() {
		System.out.println("Run this before group regression");
	}
	
	@AfterGroups(value ="test")
	public void afterGroup() {
		System.out.println("Run this after group regression");
	}
	
	// Ova se izvrsuva najprvo !
	@BeforeTest
	public void loginToApplication(){
		System.out.println("Login to Application");
	}
	
	// Ova se izvrsuva najposledno !
	@AfterTest
	public void logoutToApplication(){
		System.out.println("Logout from Application");
	}
	
	@Test(priority=1,groups="test")
	public void titleTest() {
		
		SoftAssert softassert = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
	
		
		driver.get("http://www.ebay.com"); 
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println("Verifying title");
		softassert.assertEquals(actualTitle, expectedTitle);
		
		System.out.println("Closing browser");
		driver.close();
		
		softassert.assertAll();
	}
	
	@Test(priority=2,groups="test")
	public void textTest() {
		
		SoftAssert softassert = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String expectedText = "Search";
		
		driver.get("http://www.ebay.com"); 
		driver.manage().window().maximize();
	
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying text");
		softassert.assertEquals(actualText, expectedText,"Text verification failed");
		
		System.out.println("Closing browser");
		driver.close();
		
		softassert.assertAll();
	}

}


//Login to Application
//Start of this test
//Run this before group regression

