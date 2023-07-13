package org.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arrayl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		Arr.add(1);
		ArrayList<String> A =new ArrayList<String>();
		A.add("Bharath");
		A.add("Sharath");
		A.add("cghharath");
		A.add("Sccrath");
		A.add("Scbnrath");
		A.add(0, "cat");
		System.out.println(A);
		System.out.println(A.get(0));
		//A.remove(0);
		//A.get(0);
		//System.out.println(A.remove(0));
		System.out.println(A.get(1));
		for(int i=0;i<A.size();i++)
		{
			System.out.println(A.get(i));
		}
		
		for (String val:A)
		{
			System.out.println(val);
		}
		
		System.out.println(A.contains("Sharath"));
		
		Collections.sort(A);
		for (String val:A)
		{
			System.out.println(val);
		}
		A.clear();
		//System.out.println(A.get(0));
		
	}

}
