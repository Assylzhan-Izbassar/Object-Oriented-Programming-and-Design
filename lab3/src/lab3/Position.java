package lab3;

public final class Position {

	public char row;
	public int column;
	
	public Position() {
		// TODO Auto-generated constructor stub
	}
	
	public Position(char row, int column)
	{
		this.row = row;
		this.column = column;
	}
	
	public String toString()
	{
		String p = "";
		p+=row;
		p+= column;
		return p;
	}
}
