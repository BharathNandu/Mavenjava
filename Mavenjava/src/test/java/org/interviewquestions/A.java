package org.interviewquestions;

import java.util.*;

// Program to print the count of volues and constants in the Class
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string ");
		Scanner s =new Scanner (System.in);

		String str = s.nextLine();
		int Vcount =0;
		int Ccount =0;
		int specialchar =0;

		str =str.toLowerCase();

		for(int i=0;i<str.length();i++)
		{
			
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				{
				Vcount++;
				}
			else if  (str.charAt(i) >= 'a' && str.charAt(i)<= 'z')
			{
				Ccount++;
			}
			else
			{	
				specialchar++;
			}
	
		}
		System.out.println( "the volues count is " +Vcount);
		System.out.println( "the consotant count is " +Ccount);
		System.out.println( "the specual  count is " +specialchar);

	}

}
