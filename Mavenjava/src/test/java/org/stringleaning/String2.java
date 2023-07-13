package org.stringleaning;


// split method with int defined to to split the string at definat characters
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bharath kumar nandhala is mechanical ";
		String[] splitt =s.split("a",0);
		
		for(String w :splitt)
		{
			System.out.println(w);
			System.out.println(w.trim());
			// trim() method is used to remove the spaces before the string.
		}
	}

}
