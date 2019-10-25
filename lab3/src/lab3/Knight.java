package lab3;

public class Knight extends Piece {

	public Knight() {
		// TODO Auto-generated constructor stub
	}
	public boolean isLegalMove(Position a, Position b)
	{
		if(a.row + 1 == b.row && a.column + 2 == b.column)
		{
			return true;
		}
		else if(a.row - 1 == b.row && a.column + 2 == b.column)
		{
			return true;
		}
		if(a.row + 1 == b.row && a.column - 2 == b.column)
		{
			return true;
		}
		else if(a.row - 1 == b.row && a.column - 2 == b.column)
		{
			return true;
		}
		else if(a.row + 2 == b.row && a.column + 1 == b.column)
		{
			return true;
		}
		else if(a.row - 2 == b.row && a.column + 1 == b.column)
		{
			return true;
		}
		else if(a.row + 2 == b.row && a.column - 1 == b.column)
		{
			return true;
		}
		else if(a.row - 2 == b.row && a.column - 1 == b.column)
		{
			return true;
		}
		return false;
	}

}
