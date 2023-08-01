package org.collections;
import java.util.*;


public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "");
		hm.put(1, "");
		hm.put(0, "bharath");
		hm.put(2, "Bharath");
		hm.put(3, "India");
		 System.out.println("Iterating Hashmap...");  
		 
		 for(Map.Entry  m : hm.entrySet())
		 {
		 	System.out.println(m.getKey()+" "+m.getValue());
		 }
		
		
	}

}
