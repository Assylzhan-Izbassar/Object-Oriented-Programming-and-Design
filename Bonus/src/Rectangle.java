
public class Rectangle extends Shape{
	
	public Rectangle()
	{
		super();
	}
	public Rectangle(Color c)
	{
		super(c);
	}
	
	public Rectangle(Color c, int x)
	{
		super(c,x);
	}
	
	@Override
	public void draw() {
		
		position();

		if(c == Color.BLACK)
			System.out.print('H'+"\n");
		else
			System.err.print('H'+ "\n");
	}
}
