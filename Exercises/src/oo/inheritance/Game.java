package oo.inheritance;

public class Game {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.x = 10;
		p1.y = 10;
		
		Player p2 = new Player();
		p2.x = 10;
		p2.y = 11;
	
		
		System.out.println(p1.life);
		System.out.println(p2.life);
		
		p1.attack(p2);
		
		System.out.println(p1.life);
		System.out.println(p2.life);
		
	}
}
