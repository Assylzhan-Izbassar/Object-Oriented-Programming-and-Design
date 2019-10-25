package lab3;

public class Sphere extends Shape{

	public Sphere() {
		super();
	}

	public Sphere(double height) {
		this.height = height;
	}
	
	public void volume()
	{	
		v = (4/3)*Math.PI*radius*radius*radius;
	}
	
	public void surfaceArea()
	{
		area = 4*Math.PI*radius*radius;
	}
	
}
