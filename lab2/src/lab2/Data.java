package lab2;

public class Data {
		
	private double sum;
	private double max;
	private int count;
	
	public Data()
	{
		sum = 0;
		max = 0;
		count = 0;
	}
	
	public void addValue(double x)
	{	
		sum += x;
		count++;
		max = maxi(max, x);
	}
	public double maxi(double max, double x)
	{
		if(x >= max)
			max = x;
		return max;
	}
	public double getAvg()
	{
		if(count == 0)
			return 0;
		return sum/count;
	}
	public double getMaxi()
	{
		return max;
	}
}

