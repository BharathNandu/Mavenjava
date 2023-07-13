package org.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> lr = new LinkedList<String>();
		lr.add("Bharath");
		lr.add("Bharath");
		lr.add(2, "India");
		for(String w: lr)
		{
			System.out.println(w);
		}
		LinkedList<String> lr2 = new LinkedList<String>();
		lr2.add("cake");
		lr.add("bake");
		lr.addAll(lr2);
		System.out.println(lr);
		Collections.sort(lr);
	}

}
