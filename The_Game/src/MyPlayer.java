
public class MyPlayer implements Player {
	
	public Map playerMap;
	public Position playerPos;
	
	public void setMap (Map m) {
		this.playerMap = m;
	}
	
	public void moveRight() {
		if (this.playerMap.getValueAt(playerPos.getX(), playerPos.getY()+1) != '1') {
			if(playerPos.getY()+1 < playerMap.getSize()) {
				playerPos.setY(playerPos.getY()+1);
			}
		}
	}
	
	public void moveLeft() {
		if (this.playerMap.getValueAt(playerPos.getX(), playerPos.getY()-1) != '1') {
			if(playerPos.getY()-1 >= 0) {
				playerPos.setY(playerPos.getY()-1);
			}
		}
	}
	
	public void moveUp () {
		if (this.playerMap.getValueAt(playerPos.getX()-1, playerPos.getY()) != '1') {
			if(playerPos.getX()-1 >= 0) {
				playerPos.setX(playerPos.getX()-1);
			}
		}
	}
	
	public void moveDown() {
		if (this.playerMap.getValueAt(playerPos.getX()+1, playerPos.getY()) != '1') {
			if(playerPos.getX()+1 < playerMap.getSize()) {
				playerPos.setX(playerPos.getX()+1);
			}
		}
	}
	
	public Position getPosition() {
		return this.playerPos;
	}
}
