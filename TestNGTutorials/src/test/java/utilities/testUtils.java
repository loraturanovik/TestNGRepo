package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{
	
	public void getScreenshot() throws IOException {
		
	Date currentdate = new Date();
	
	String screenshotfilenames = currentdate.toString().replace(" ", "-").replace(":", "-");
	
	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	
    FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilenames + ".png"));

	
	}

}
