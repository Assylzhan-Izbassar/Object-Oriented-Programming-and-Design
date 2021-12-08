
public class Game {
	
	public Map gameMap;
	public MyPlayer mp;
	
	public Game(Map m) {
		this.gameMap = m;
	}
	
	public void setMap(Map nm) {
		this.gameMap = nm;
	}
	
	public void addPlayer(Player p) {
		if (p instanceof MyPlayer) {
			mp = (MyPlayer) p;
		}
	}
}
