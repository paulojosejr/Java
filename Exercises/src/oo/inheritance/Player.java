package oo.inheritance;

public class Player {
	int x;
	int y;
	
	boolean moved(Direction direction) {
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