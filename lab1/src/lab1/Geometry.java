package lab1;

import java.util.Scanner;

public class Geometry {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		
		System.out.println("An area of a square with side a is:");
		System.out.print(area(a) + "\n");
		
		System.out.println("A perimeter of a square with side a is:");
		System.out.print(perimeter(a) + "\n");
		
		System.out.println("A length of diagonal of a square with side a is:");
		System.out.print(length_of_diagonal(a));
		
		in.close();

	}
	static int area(int a)
	{
		int S = a*a;
		return S;
	}
	static int perimeter(int a)
	{
		int P = 4*a;
		return P;
	}
	static double length_of_diagonal(double a)
	{
		double length = Math.sqrt((a*a) + (a*a));
		return length;
	}

}
