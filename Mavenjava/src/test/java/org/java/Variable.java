package org.java;

public class Variable {

	int b=20; //global variable
	static int c=5;//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		//local variable
		System.out.println(a);
			//System.out.println(b);
		
		//Global variable are called when object is created
		Variable v =new Variable();
	
		System.out.println(v.b);
	
		System.out.println(c);
		
		Sum s= new Sum();
		//s.sumofnumber();
		//System.out.println(d);
		
	}
	
}
