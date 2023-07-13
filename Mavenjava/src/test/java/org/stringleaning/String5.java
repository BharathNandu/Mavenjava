package org.stringleaning;

import java.util.Scanner;

public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		String s=S.nextLine();
		
		int strlenth =s.length();
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0) {
			System.out.println("char of i is : " +s.charAt(i));
		}
		}
		
		
	}

}
