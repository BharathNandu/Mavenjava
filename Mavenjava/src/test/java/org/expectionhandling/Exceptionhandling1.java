package org.expectionhandling;

public class Exceptionhandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		try {
			try {
			a = 100/0;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		} catch (ArithmeticException e) {
		
			e.printStackTrace();
			System.out.println("ArithmeticException");
		}
		finally
		{
			System.out.println("finally is executed");
		}
		System.out.println("reste of the code" +a);
	}

}
