package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestParametars {
	
	public static WebDriver driver;
    
	@Parameters({"browser"})
	@Test
	public void launchApplication(String browser) {
		
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
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(password)).sendKeys("standard_user");
		
		WebElement username = driver.findElement(By.id("user-name"));
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(username)).sendKeys("secret_sauce");
		
		
		driver.findElement(By.id("login-button")).click();
		
		try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

		driver.close();
	}

}

//test.xml