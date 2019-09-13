package lab1;
import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(calc_D(a,b,c) > 0)
		{	
			double D = calc_D(a,b,c);
			double x1 = ((-1)*b + Math.sqrt(D))/(2*a);
			double x2 = ((-1)*b - Math.sqrt(D))/(2*a);
			
			System.out.println("x1 = " + (int)x1 + "\n" + "x2 = " + (int)x2);
		}
		else if(calc_D(a,b,c) == 0)
		{
			double x = ((-1)*b)/(2*a);
			System.out.println("x = " + (int)x);
		}
		else
			System.out.println("This eqation have not answer!");
		
		in.close();

	}
	static double calc_D(int a, int b, int c)
	{
		double D = b*b - 4*a*c;
		
		return D;
	}

}
