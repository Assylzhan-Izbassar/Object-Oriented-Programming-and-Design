package lab1;

import java.util.Scanner;

public class PrintMyName {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		
		printMyName(s);
		
		in.close();
	}
	
	static void printMyName(String name)
	{
		int lenght = name.length();
		
		System.out.print('+');
		
		for(int i=0; i < lenght; ++i)
		{
			System.out.print('-');
		}
		System.out.println('+');
		
		System.out.println('|' + name + '|');
		
		System.out.print('+');
		
		for(int i=0; i < lenght; ++i)
		{
			System.out.print('-');
		}
		System.out.println('+');
	}
}
