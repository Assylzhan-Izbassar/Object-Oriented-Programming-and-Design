package task4;

public class MinMax{

	static class Pair
	{
		private int minimum;
		private int maximum;
		
		public Pair() {}
		
		public int getMin()
		{
			return minimum;
		}
		public int getMax()
		{
			return maximum;
		}
		public void setMin(int minimum)
		{
			this.minimum = minimum;
		}
		public void setMax(int maximum)
		{
			this.maximum = maximum;
		}
		public String toString()
		{
			return "Minimum: " + this.minimum + "; "  + " Maximum: " + this.maximum;
		}
	}
	
	static Pair minmax(int value[])
	{
		Pair p = new Pair();
		p.setMax(value[0]);
		p.setMin(value[0]);
		
		for(int i = 1; i < value.length; ++i)
		{
			if(p.getMax() < value[i])
			{
				p.setMax(value[i]);
			}
			if(p.getMin() > value[i])
			{
				p.setMin(value[i]);
			}
		}
		return p;
	}
	
	
	public static void main(String[] args) {
		int a[] = {0, 8 , -3, 20};
		MinMax m = new MinMax();
		
		System.out.print(MinMax.minmax(a));
	}
}
