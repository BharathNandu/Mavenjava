package org.collections;
import java.util.*;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list =new ArrayList<String>();
		list.add("Bharath");
		list.add("India");
		list.add("herovi");
		list.add("Bharath");
		
		Iterator<String> itr =list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.hashCode());
			System.out.println(itr.next());
		}
		
		
	}

}
