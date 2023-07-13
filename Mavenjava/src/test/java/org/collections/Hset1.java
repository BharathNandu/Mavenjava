package org.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs =new HashSet<String>();
		hs.add("Bharath");
		hs.add("Bharath");
		hs.add("qwert");
		hs.add("");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for( String w:hs)
		{
			System.out.println(w);
		}
		
	}

}
