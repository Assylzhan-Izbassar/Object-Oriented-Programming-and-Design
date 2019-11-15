package task4;

public class Chocolate implements Comparable<Chocolate>{
	
	public String name;
	public double weight;
	
	public Chocolate()
	{
	}
	
	public Chocolate(String name, double weight)
	{
		this.name = name;
		this.weight = weight;
	}
	
	public String toString()
	{
		return this.name + " " + this.weight;
	}

	@Override
	public int compareTo(Chocolate o) {
		
		if(this.weight > o.weight) return 1;
		else if(this.weight < o.weight) return -1;
		
		return 0;
	}
}
