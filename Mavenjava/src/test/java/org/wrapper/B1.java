package org.wrapper;

public class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Boolean b1 = true;
			boolean b2= false;
			
			Boolean b3 = b1.booleanValue();
			//boolean value method is used for the b3
			String s1 = "value of Boolean object "+b1+"is"+b3;
			System.out.println(s1);
			System.out.println(b3);
			
			// compare method is used in Boolean
			int v1 =Boolean.compare(b1, b2);
			
			if (v1>0)
			{
				System.out.println("b1 is true");
			}
			else 
			{
				System.out.println("b2 is true");
			}
			Boolean val2 = Boolean.logicalAnd(b1, b2);
			System.out.println("Logical And and also returns the same" +val2);
			Boolean val3 = Boolean.logicalOr(b1, b2);
			System.out.println("LogicalOR and also returns the " +val3);
			
	}

}
