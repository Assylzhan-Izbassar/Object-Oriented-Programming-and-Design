package lab2;
import java.util.Scanner;

public class StarTrangle {
	
	private int width;
	
	public StarTrangle(int width)
	{
		this.width = width;
	}
	
	public String toString()
	{
		String s = "";
		int i = 0, count = 0, prevCount = 0;
		while(prevCount != width)
		{
			for(int j=0; j<i; ++j)
			{
				s += "[*]";
				if(j == i-1)
				{
					s += '\n';
					prevCount = count;
					count = 0;
				}
				count++;
			}
			i++;
		}
		return s;
	}
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int width = in.nextInt();
		StarTrangle s = new StarTrangle(width);
		System.out.println(s.toString());
		
		in.close();
	}

}
