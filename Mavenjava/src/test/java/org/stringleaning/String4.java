package org.stringleaning;

public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// concat() method is used to append the string
		String s =" Bharath";
		String b = s.concat(" Tendulkar");
		System.out.println(b);
		System.out.println(s);
		
		String c = "BHARATH";
		System.out.println(s.equals(c)); //false
		System.out.println(s.equalsIgnoreCase(s)); //true
		
		System.out.println(s==b);// false
		System.out.println(s.substring(4));
		System.out.println(s.substring(0,5)); 
		System.out.println(s.toUpperCase());//BHARATH
		System.out.println(s.toLowerCase()); //bharath
		System.out.println(s.replace("B", "C"));
		
		
	}

}
