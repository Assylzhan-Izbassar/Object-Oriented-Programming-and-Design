package testComp;

public class Factory implements Comparable<Factory>{
	
	public String name;
	private int numberOfEmployees;
	protected double income;
	
	public Factory(String name, int numberOfEmployees, double income )
	{
		this.name = name;
		this.numberOfEmployees = numberOfEmployees;
		this.income = income;
	}
	
	public int getNumberOfEmployees()
	{
		return this.numberOfEmployees;
	}

	@Override
	public int compareTo(Factory f) {
		if(this.numberOfEmployees > f.numberOfEmployees)return 1;
		else if(this.numberOfEmployees < f.numberOfEmployees) return -1;
		return 0;
	}
	
	public String toString()
	{
		return this.name + " " + this.numberOfEmployees + " " + this.income;
	}
}
