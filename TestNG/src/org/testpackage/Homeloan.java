package org.testpackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Homeloan {

	@Test(groups="smoke")
	public void webloginHomeloan() {
		System.out.println("Weblogin home loam");
	}

	@Test(groups="smoke")
	public void mobileloginHomeloan() {
		System.out.println("mobilelogin home loam");
	}

	@Test
	public void apiloginHomeloan() {
		System.out.println("Apilogin home loam");
	}
	@BeforeTest
	public void apiloginHomeloan1() {
		System.out.println("Apilogin home loam");
	}

}
