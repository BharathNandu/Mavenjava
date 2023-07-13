package org.stringleaning;

public class String7 {
	 
	static String str ;
	
		public static String reverseWord(String str){
			
		    String words[]=str.split("\\s");  
		    String reverseWord="";  
		    for(String w:words){  
		        StringBuilder sb=new StringBuilder(w);  
		        sb.reverse();  
		        reverseWord+=sb.toString()+" ";  
		    }  
		    return reverseWord.trim();  
		}  
	  

	public static void main(String[] args) {
		
		str = "Bharath kumar Nandhala";
		String str1 =str.concat("tester");
		reverseWord(str);
		System.out.println(str1);
		
	}

}
