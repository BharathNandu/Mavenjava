package org.interviewquestions;

public class Counting {

	String s;

	public int countingthechar(String s) {
		this.s = s;
		int Count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 0) {
				Count++;

			}
		}
		System.out.println("The Charcters in the sentence " + Count);
		return Count;

	}

	public int countingthecaptial(String s) {
		this.s = s;
		int Captialcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				Captialcount++;

			}
		}
		System.out.println("The Captital Charcters in the sentence " + Captialcount);
		return Captialcount;
	}

	public int countingthesamllest(String s) {
		this.s = s;
		int smallestcount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				smallestcount++;

			}
		}

		System.out.println("The smallest count in the sentence is " + smallestcount);
		return smallestcount;
	}

	public int countingthedigits(String s) {
		this.s = s;
		int digitspresent = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				digitspresent++;

			}
		}

		System.out.println("The digits count in the sentence is " + digitspresent);
		return digitspresent;
	}

	public int spacesinsentence(String s)
	{
	this.s=s;
	int spacespresent=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i) == ' ')
			{
			spacespresent++;
				}
		}

		System.out.println("Whites spaces is " +spacespresent);
		return spacespresent;
	
	}
	
	public String reverse(String s)
	{
		this.s=s;
		char ch[ ] =s.toCharArray();
		String reverseString = "";
		for(int i=ch.length-1;i>0;i--)
		{
			reverseString = reverseString + ch[i];
		}
		System.out.println("The resvers string is " + reverseString);
		return reverseString;
	}
}
