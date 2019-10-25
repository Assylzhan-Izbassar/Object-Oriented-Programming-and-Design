package lab3;

public class Pow extends Piece{

	public Pow() {
		// TODO Auto-generated constructor stub
	}

	public boolean isLegalMove(Position a, Position b)
	{
		if(b.column <= 4)
		{
			if(a.row == b.row && a.column + 2 == b.column)
			{
				return true;
			}
			else if(a.row == b.row && a.column + 1 == b.column)
			{
				return true;
			}
		}
		if(a.row == b.row && a.column + 1 == b.column)
		{
			return true;
		}
		
		return false;
	}
}
