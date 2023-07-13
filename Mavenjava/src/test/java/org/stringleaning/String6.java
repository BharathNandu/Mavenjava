package org.stringleaning;

public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="This is bharath kumar nandhala";
		System.out.println(s.split("\\n"));
		int countofspaces = 0;
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)== ' ')
			{
				countofspaces++;
				
			}
		}
		System.out.println("the spaces count is " +countofspaces);
	}

}
