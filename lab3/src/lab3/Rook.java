package lab3;

public class Rook extends Piece{

	public Rook() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLegalMove(Position a, Position b)
	{
		if(a.row == b.column || a.column == b.column)
		{
			return true;
		}
		return false;
	}

}
