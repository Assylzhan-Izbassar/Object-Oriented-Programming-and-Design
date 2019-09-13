package lab1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		
		if(isPalin(s))
			System.out.println("This string is a Palindrome.");
		else
			System.out.println("This string is not a Palindrome.");
		
		in.close();
	}
	//function, that check a String is a palindrome or not
	static boolean isPalin(String s)
	{
		for(int i =0; i < s.length(); ++i)
		{
			if(s.charAt(i) != s.charAt(s.length()-i-1))
				return false;
		}
		return true;
	}
}
