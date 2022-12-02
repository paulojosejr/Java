package oo.inheritance;

public class Game {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.x = 10;
		h1.y = 10;
		
		Creature c2 = new Creature();
		c2.x = 10;
		c2.y = 11;
	
		
		System.out.println(h1.life);
		System.out.println(c2.life);
		
		h1.attack(c2);
		
		System.out.println(h1.life);
		System.out.println(c2.life);
		
	}
}
