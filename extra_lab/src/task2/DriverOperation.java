package task2;

import java.util.Scanner;

public class DriverOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Boolean execute = true;
		
//		while(execute) {
			
			System.out.println("Enter a number: ");
			int number = in.nextInt();
			
			System.out.println("Enter an operation: ");
			String operation = in.nextLine();
			
			switch(operation) {
			case " +":
				System.out.println("+");
				break;
			case " -":
				System.out.println("-");
				break;
			case " *":
				System.out.println("*");
				break;
			case " /":
				System.out.println("/");
				break;
			case " c":
				System.out.println("c");
				break;
			default:
				System.out.println("default");
				System.out.println(operation);
				execute = false;
				break;
			}
//		}
		
		System.out.println("Hello, world!");
		
		in.close();
	}
}
