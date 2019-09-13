package lab2;

import java.util.Scanner;

public class Analyzer {
	
	static Data data;
	
	public Analyzer()
	{
		data = new Data();
	}
	
	public void run(double x)
	{
		data.addValue(x);
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		Analyzer analyzer = new Analyzer();
		
		String s;
		
		while(true)
		{
			System.out.print("Enter number (Q to quit): ");s = in.nextLine();
			if(s.charAt(0) != 'Q')
			{
				analyzer.run(Double.parseDouble(s));
			}
			else break;
		}
		
		System.out.println("Average = " + Analyzer.data.getAvg());
		System.out.println("Maximum = " + Analyzer.data.getMaxi());
		
		in.close();
	}
}
