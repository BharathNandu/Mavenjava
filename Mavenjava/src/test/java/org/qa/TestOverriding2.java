package org.qa;

public class TestOverriding2  extends Testoverriding1 {

	static void play()
	{
		System.out.println("static method is calling for child class");
	}
	void run() {
		System.out.println("method is calling for child class");

	}
	int add(int a ,int b)
	{
	return(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverriding2 obj = new TestOverriding2();
		
		obj.run();
		play();
		int k =obj.add(10, 20);
		System.out.println(k);
		
		
	}

}
