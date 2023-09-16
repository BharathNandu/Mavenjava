package org.testpackage;

import org.testng.annotations.*;


public class CarLoan {
	
	@Parameters({"URL","UserName"})
	@Test(groups="smoke")
	public void webloginCarloan(String Urlname,String uname)
	{
		System.out.println("Weblogin car loam");
		System.out.println("Url name  " +Urlname);
		System.out.println("Url name  " +uname);
	}
	@Test
	public void mobileloginCarloan()
	{
		System.out.println("mobilelogin car loam");
	}
	@Test
	public void apiloginCarloan()
	{
		System.out.println("Apilogin car loam");
	}

}
