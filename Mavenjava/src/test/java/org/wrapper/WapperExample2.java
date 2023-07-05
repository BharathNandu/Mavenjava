package org.wrapper;

public class WapperExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//unboxing
		Integer a =new Integer(3);
		int i = a.intValue();
		//converting Integer value into primitive int explicitly
		Integer i1 = Integer.valueOf(0);
		System.out.println(i1);
		int j= i;
		System.out.println(j);
	}

}
