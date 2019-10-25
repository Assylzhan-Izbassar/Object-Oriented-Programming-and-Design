package lab3;

public abstract class Shape {

	protected double v;
	protected double area;
	
	public Shape() {}
	
	public abstract void volume();
	
	public  abstract void surfaceArea();
	
	public double getArea()
	{
		return area;
	}
	public double getVolume()
	{
		return v;
	}

}
