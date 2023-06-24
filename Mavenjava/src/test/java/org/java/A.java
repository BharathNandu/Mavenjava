package org.java;

public class A {
	
	void m()
	{
		System.out.println("Method m is calling");
	}
	void n()
	{
		System.out.println("Method n is calling");
		m();
	}

}
