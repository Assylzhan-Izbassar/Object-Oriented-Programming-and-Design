
abstract class Shape {
	
	Color c;
	int x;
	static int cnt;
	
	public Shape()
	{
	}
	
	public Shape(Color c)
	{
		this.c = c;
	}
	public Shape(Color c, int x)
	{
		this(c);
		this.x = x; 
	}
	public abstract void draw();
	
	public void draw(int cnt)
	{
		for(int i=0; i < cnt; ++i)draw();
	}
	
	public void position()
	{
		for(int i=0; i < x; ++i)
		{
			System.out.print(" ");
		}
	}
}
