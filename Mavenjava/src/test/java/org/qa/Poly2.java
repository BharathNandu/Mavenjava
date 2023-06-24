package org.qa;

public class Poly2 extends Poly1{
	void run()
	{
		System.out.println("runing in Poly 2");
	}
	int speedlimit = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly1 obj =new Poly2();
		obj.run();
		System.out.println(obj.speedlimit);
	}

}
