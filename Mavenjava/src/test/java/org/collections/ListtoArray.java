package org.collections;

import java.util.*;
public class ListtoArray {

	
	//Coverting list to array 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		al.add("Bharath");
		al.add("Bharath");
		al.add("sharath");
		
		for (String w: al)
		{
			System.out.println(w);
		}
		
		String [] str = al.toArray(new String[al.size()]);
		
		System.out.println(Arrays.toString(str));
		
	}

}
