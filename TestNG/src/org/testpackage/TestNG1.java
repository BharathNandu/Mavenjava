package org.testpackage;

import org.testng.annotations.*;

public class TestNG1 {
    @Parameters({"URL"})
	@Test(dependsOnMethods = {"test3"})
	public void test(String URL) {
		System.out.println("hello world 0");
		System.out.println(URL);
	}
	@Test(groups="smoke")
	public void test1() {
		System.out.println("hello world 1");
	}
	@Test(priority=-1)
	public void test2() {
		System.out.println("hello world 2");
	}
	@Test
	public void test3() {
		System.out.println("hello world 3");
	}
}
