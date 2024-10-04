package ui;

import org.testng.annotations.Test;

public class DataProviderDemoTest {
	
	@Test(dataProvider="dataSet",dataProviderClass=DataProviderDemo.class)
	public void test(String username,String password) {
		System.out.println(username+"-----------"+password);
	}
	
	@Test(dataProvider="dataSet1",dataProviderClass=DataProviderDemo.class)
	public void test(String username,String password,String test) {
		System.out.println(username+"-----------"+password+"----"+test);
	}

}
