package org.testing;

import org.reusefunctions.browserSetup;

public class A extends browserSetup {

	public A(String browser, String urltopen) {
		super(browser, urltopen);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser ="chrome";
		String urltopen ="https://www.google.com/";
		
		A b = (A) new browserSetup( browser,urltopen);
	}

}
