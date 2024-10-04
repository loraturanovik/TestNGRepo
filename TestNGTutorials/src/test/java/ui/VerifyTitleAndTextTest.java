package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndTextTest {
	
	@Test
	public void titleTest() {
		
		SoftAssert softassert = new SoftAssert();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		String expectedTitle = "Electronics, Cars,htrew Fashion, Collectibles & More | eBay";
		String expectedText = "Search";
		
		driver.get("http://www.ebay.com"); 
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		System.out.println("Verifying title");
		softassert.assertEquals(actualTitle, expectedTitle);
		
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying text");
		softassert.assertEquals(actualText, expectedText,"Text verification failed");
		
		System.out.println("Closing browser");
		driver.close();
		
		softassert.assertAll();
	}
}
