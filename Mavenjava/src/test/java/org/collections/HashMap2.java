package org.collections;
import java.util.*;


public class HashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Book> hm = new HashMap<Integer,Book>();
		Book b1= new Book(101,"C","Bharath","Schard",2);
		Book b2= new Book(101,"C++","Bharathctyu","Schard2",25);
		
		//Adding Books to map
		hm.put(1,b1);
		hm.put(2, b2);
		
		for (Map.Entry<Integer,Book> w:hm.entrySet())
		{
			int key= w.getKey();
			Book b= w.getValue();
			System.out.println(key+ "details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
		}
	}

}
