package org.qa;

public class Testoverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testoverload2 a =new Testoverload2();
		Testoverload2 b =new Testoverload2();
		int Add2=a.add(10, 20);
		int Add3= b.add(20, 30,40);
		System.out.println(Add2);
		System.out.println(Add3);
		
		System.out.println(Testoverloading3.add(10, 20));
		System.out.println(Testoverloading3.add(10.2, 4));
	}

}
