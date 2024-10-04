package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test
	public void titleTest() {
		
		String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.ebay.com"); 
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
