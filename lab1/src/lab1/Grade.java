package lab1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		print_grade(n);
		
		in.close();
	}

	static void print_grade(int n)
	{
		if(n >= 95 && n <= 100)
			System.out.println('A');
		
		else if(n >= 90 && n < 95)
			System.out.println("A-");
		
		else if(n >= 85 && n < 90)
			System.out.println("B+");
		
		else if(n >= 80 && n < 85)
			System.out.println('B');
		
		else if(n >= 75 && n < 80)
			System.out.println("B-");
		
		else if(n >= 70 && n < 75)
			System.out.println("C+");
		
		else if(n >= 65 && n < 70)
			System.out.println('C');
		
		else if(n >= 60 && n < 65)
			System.out.println("C-");
		
		else if(n >= 55 && n < 60)
			System.out.println("D+");
		
		else if(n >= 50 && n < 55)
			System.out.println('D');
		
		else if(n >= 0 && n < 50)
			System.out.println('F');
		
		else
			System.out.println("Incorrect grade!");
	}
}
