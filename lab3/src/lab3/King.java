package lab3;

public class King extends Piece {

	public King() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLegalMove(Position a, Position b)
	{
		if(a.row + 1 == b.row && a.column == b.column)
		{	
			return true;
		}
		else if(a.row + 1 == b.row && a.column - 1 == b.column)
		{	
			return true;
		}
		else if(a.row + 1 == b.row && a.column + 1 == b.column)
		{	
			return true;
		}
		else if(a.row - 1 == b.row && a.column == b.column)
		{	
			return true;
		}
		else if(a.row - 1 == b.row && a.column - 1 == b.column)
		{	
			return true;
		}
		else if(a.row - 1 == b.row && a.column + 1 == b.column)
		{	
			return true;
		}
		else if(a.row == b.row && a.column -1 == b.column)
		{	
			return true;
		}
		else  if(a.row == b.row && a.column + 1 == b.column)
		{	
			return true;
		}

		return false;
	}
}
