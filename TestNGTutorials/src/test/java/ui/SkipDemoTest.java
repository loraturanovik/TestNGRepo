package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = false;
	
	@Test(enabled= false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not complete");
	}
	
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on conditions");
		if(datasetup == true) {
			System.out.println("Execute the test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Do not execute further steps");
		}
	}

}
