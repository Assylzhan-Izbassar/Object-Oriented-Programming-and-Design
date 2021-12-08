import java.util.Scanner;

public class Map {
	
	public char inputArray[][];
	
	public Map(Scanner scan) throws InvalidMapException {
		
		int n = scan.nextInt();
		
		int rows = n, cols = n;

		inputArray = new char[rows][cols];

		for (int i = 0; i < rows; i++)
		{ 
		    for (int j = 0; j < cols; j++)
		    {
		    	String val = scan.next();
		    	
		    	if (val.equals("0") || val.equals("1") || val.equals("P")){
		    		inputArray[i][j] = scan.next().charAt(0);
		    	}
		    	else {
		    		throw new InvalidMapException("Not enough map elements");
		    	}
		    } 
		} 
	}
	
	public int getSize() {
		return this.inputArray.length;
	}
	
	public char getValueAt(int x, int y) {
		return this.inputArray[x][y];
	}
	
	public void print() { 
		int rows = this.inputArray.length;
		int cols = this.inputArray.length;
		
		for (int i = 0; i < rows; i++)
		{ 
		    for (int j = 0; j < cols; j++)
		    { 
		        System.out.print(this.inputArray[i][j] + " ");
		    } 
		    System.out.println();
		} 
	}
}
