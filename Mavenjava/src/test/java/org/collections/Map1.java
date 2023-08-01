package org.collections;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "bharath");
		map.put(4, "tuif");
		
		Set set = map.entrySet();
		//converting to set for iternation
		Iterator itr =set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry  =(Map.Entry)itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		

	}

}
