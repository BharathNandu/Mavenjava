package org.java;

public class Operator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//logical and and Bitwise and
		int a=10;
		int b=20;
		int c=30;
		int d=1;
		int e =2;
		System.out.println(a>b && b<c); //false && false =false
		System.out.println(a>b && b>d); //false && true =false
		System.out.println( a<b & ++d>=e); //true && true =true
		
		//Logical and Bitwise OR
		System.out.println(a<b || b>c); //false
		System.out.println(a<b | b>c);
	}

}
