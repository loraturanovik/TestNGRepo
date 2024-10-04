package testemailsent;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SalesforceLoginPage {
	
	public static String browser = "edge";
	public static WebDriver driver;
	private static String testStatus;  // Variable to hold the test status

	    @BeforeClass
	    public static void beforeClass() {
	        System.out.println("========Starting the test===========");
	    }

	    @Test
	    public void f() throws InterruptedException {
	    	if(browser.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else if(browser.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browser.equals("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
			
			driver.get("https://test.salesforce.com/");
			driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("team.seavus@partner-prod.com.vlocitysbx");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("seavusQA123!");
			
			driver.findElement(By.id("rememberUn")).click();
			Thread.sleep(1500);
			driver.findElement(By.id("Login")).click();
			
			Thread.sleep(5000);
			
			 // Check if login was successful by looking for a specific element that appears only on the home page
	        try {
	            // Wait for the element that is present after a successful login (modify this according to your application)
	            WebElement homePageElement = driver.findElement(By.xpath("//span[@class='uiImage']/img")); 
	            // If the element is found, login is successful
	            testStatus = "Test Passed"; // Set the status to Passed
	            System.out.println("Login was successful and the execution is finished. Test status: " + testStatus);
	        } catch (NoSuchElementException e) {
	            // If the element is not found, login failed
	            testStatus = "Test Failed"; // Set the status to Failed
	            System.out.println("Login failed and the execution is finished. Test status: " + testStatus);
	        }
			
			
	        System.out.println("========TestDone===========");
	        Thread.sleep(5000);
	        driver.close();
	    }

	    @AfterClass
	    public static void afterClass() throws EmailException {
	        // Include test status in the email
	        String emailBody = "The execution has finished !! The test execution status for Salesforce Login test is: " + testStatus;
	        SendEmailTemplate.sentEmail(emailBody);
	    }
}
