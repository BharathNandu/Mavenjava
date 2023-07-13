package org.stringleaning;

public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer(); //1 way
		
		StringBuffer sb1 = new StringBuffer("Bharath"); //2 way
		
		StringBuffer sb2 =new StringBuffer(10); //3 way
		StringBuffer sb4 = new StringBuffer("Bharath");
		sb.append("Java");
		System.out.println(sb);
		sb1.append("Hero");
		System.out.println(sb1);
		sb.insert(1, "Hi");
		System.out.println(sb);//JHiava
		
		sb2.append("Bhqwert");
		System.out.println(sb2);
		sb2.replace(1, 3, "abcd");
		System.out.println(sb2); //Babcdwert
		sb2.delete(1, 3);
		System.out.println(sb2); //Bcdwert
		sb4.reverse();
		System.out.println(sb4);
		
	}

}
