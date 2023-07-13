package org.stringleaning;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bharath kumar Nandhala";
		String[] splittedarray = s.split(" ");
		// here s.split method gives the 3 returntype arrays so, we have converted String into Array
		
		for(int i =0;i<splittedarray.length;i++)
		{
		System.out.println(splittedarray[i]);
		}
		
		for(String w : splittedarray)
		{
			System.out.println(w);
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
	
		
	}

}
