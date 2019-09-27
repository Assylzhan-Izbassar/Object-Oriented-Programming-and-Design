
public class Triangle extends Shape {
	
	public Triangle()
	{
		super();
	}
	
	public Triangle(Color c)
	{
		super(c);
	}
	
	public Triangle(Color c, int x)
	{
		super(c,x);
	}
	
	@Override
	public void draw() {
		for(int i=0; i < x; ++i)
		{
			System.out.print(" ");
		}
		// TODO Auto-generated method stub
		if(c == Color.BLACK)
			System.out.print("|>" + "\n");
		else
			System.err.print("|>" + "\n");
	}
}
