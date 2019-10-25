package lab3;

public class Cube extends Shape{
	
	private double a;
	private double b;
	
	public Cube() {
		super();
	}
	
	public Cube(double a, double b, double height)
	{
		super(height);
		this.a = a;
		this.b = b;
	}
	
	public void volume()
	{	
		v = a*b*height;
	}
	
	public void surfaceArea()
	{
		area = (2*(a+b))*height;
	}
}
