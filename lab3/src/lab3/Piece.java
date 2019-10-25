package lab3;

public class Piece {
	
	Position p;
	String type;
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}
	public Piece(Position p, String type)
	{
		this.p = p;
		this.type = type;
	}
	public boolean isLegalMove(Position a, Position b)
	{
		return true;
	}
	
	public String getType()
	{
		return type;
	}
	public Position getPostion()
	{
		return p;
	}
}
