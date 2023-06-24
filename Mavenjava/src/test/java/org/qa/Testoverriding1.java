package org.qa;

public class Testoverriding1 {
	
	
	static void play()
	{
		System.out.println("static method is calling for parent class");
	}
	void run() {
		System.out.println("method is calling for parent class");

	}
	int add(int a ,int b)
	{
	return(a+b);
	}

}
