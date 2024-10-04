package ui;


import org.testng.annotations.Test;

import common.CommonDataSetup;

@Test(groups="user-registration")
public class GroupDemoTest2 extends CommonDataSetup {
	

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
