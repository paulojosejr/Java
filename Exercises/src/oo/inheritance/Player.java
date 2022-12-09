package oo.inheritance;

public class Player {
	
	private int life = 100;
	private int x;
	private int y;
	
	protected Player(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getPositionX() {
		return x;
	}
	
	public void setPositionX(int x) {
		this.x = x;
	}
	
	public int getPositionY() {
		return y;
	}
	
	public void setPositionY(int y) {
		this.y = y;
	}
	
	public int getLife() {
		return life;
	}
	
	public boolean attack(Player enemy) {
		
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
	
	public boolean move(Direction direction) {
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