
public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int radius)
	{
		super();
		this.radius = radius;
	}
	public Circle(Color c,int radius)
	{
		super(c);
		this.radius = radius;
	}
	public Circle(Color c, int x,int radius)
	{
		super(c,x);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		
		position();
		
		if(c == Color.BLACK)
			System.out.print("()" + "\n");
		else
			System.err.print("()" + "\n");
	}
	
	public void drawWithRadius()
	{
		position();
		
		if(c == Color.BLACK)
		{	
			System.out.print("(");
			for(int i=0; i < 2*radius; ++i)
			{
				System.out.print(" ");
			}
			System.out.print(")"+ "\n");
		}
		
		else
		{
			System.err.print("(");
			for(int i=0; i < 2*radius; ++i)
			{
				System.out.print(" ");
			}
			System.err.print(")"+ "\n");
		}
	}
	
}
