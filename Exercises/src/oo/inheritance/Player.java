package oo.inheritance;

public class Player {
	
	int life = 100;
	int x;
	int y;
	
	Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean attack(Player enemy) {
		
		int deltaX = Math.abs(x - enemy.x);
		int deltaY = Math.abs(y - enemy.y);
		
		if(deltaX == 0 && deltaY == 1) {
			enemy.life -= 10;
			return true;
		}else if (deltaX == 0 && deltaY == 1) {
			enemy.life -= 10;
			return true;
		}else {
			return false;
		}
	}
	
	boolean move(Direction direction) {
		switch(direction) {
		case NORTH:
			y--;
			break;
		case EAST:
			x++;
			break;
		case SOUTH:
			y++;
		case WEST:
			x--;
		}
		return true;
	}
}