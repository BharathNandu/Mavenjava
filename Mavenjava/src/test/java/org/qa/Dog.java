package org.qa;

public class Dog extends Animal{
	
	String color ="black";
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	void eat()
	{
		System.out.println("eating bread");
	}
	void work() {
		super.eat();
		eat();
	}
	

}
