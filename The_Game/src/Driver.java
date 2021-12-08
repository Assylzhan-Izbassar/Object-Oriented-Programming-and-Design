import java.util.Scanner;

public class Driver {
	
	public static void play(Game g) {
		
		MyPlayer mp = new MyPlayer();
		
		for(int i=0; i < g.gameMap.getSize(); ++i) {
			for(int j=0; j < g.gameMap.getSize(); ++j) {
				if(g.gameMap.inputArray[i][j] == 'P') {
					mp.playerPos = new Position(i,j);
				}
			}
		}
		
		mp.setMap(g.gameMap);
		
		Scanner t = new Scanner(System.in);
		
		String gameMoving = t.nextLine();
		
		for(int i=0; i < gameMoving.length(); ++i) {
			switch (gameMoving.charAt(i)) {
			case 'U':
				mp.moveUp();
				break;
			case 'D':
				mp.moveDown();
				break;
			case 'L':
				mp.moveLeft();
				break;
			case 'R':
				mp.moveRight();
				break;
			default:
				break;
			}
		}
		
		System.out.println("Player final position");
		System.out.println(mp.getPosition().toString());
		
		t.close();
	}

	public static void main(String[] args) {
		
		try {
			
			Scanner s = new Scanner(System.in);
			Game g = new Game(new Map(s));
			
			play(g);
			
			s.close();
			
		} catch (InvalidMapException ex) {
			System.out.println("Not enough map elements");  
		}
	}
}
