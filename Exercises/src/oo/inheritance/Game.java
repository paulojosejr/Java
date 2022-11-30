package oo.inheritance;

public class Game {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.x = 10;
		p1.y = 10;
		p1.moved(Direction.NORTH);
		p1.moved(Direction.EAST);
		p1.moved(Direction.NORTH);
		p1.moved(Direction.EAST);
		
		System.out.println(p1.y);
		System.out.println(p1.x);
	}
}
