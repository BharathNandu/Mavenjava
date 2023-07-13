package org.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ln = new LinkedList<String>();
		ln.add("Bharath");
		ln.add("Bharath");
		ln.add("sharath");
		ln.add("strty");
		
		Iterator<String> itr = ln.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
