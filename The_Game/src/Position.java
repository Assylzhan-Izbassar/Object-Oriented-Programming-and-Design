
public class Position {
	
	private int x, y;
	
	public Position (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX (int x) { 
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	public boolean equals (Position p) {
		if (this.x == p.x && this.y == p.y) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return "Row: " + this.x + "\n" + "Col: " + this.y;
	}
}
