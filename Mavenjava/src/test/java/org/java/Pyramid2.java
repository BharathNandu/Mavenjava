package org.java;

public class Pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		printpattern(n);
		
	}
	public static void printpattern(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
