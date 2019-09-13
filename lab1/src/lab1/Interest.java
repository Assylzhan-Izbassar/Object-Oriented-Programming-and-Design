package lab1;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double value = in.nextInt();
		double interest = in.nextInt();
		
		print_interest(value, interest);
		in.close();
	}
	static void print_interest(double value, double interest)
	{
		double delta = (value)*(interest/100);
		System.out.print((value+delta));
	}

}
