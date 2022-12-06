package oo.inheritance;

public class Game {
	public static void main(String[] args) {
		Hero h1 = new Hero(10, 10);
		
		Creature c1 = new Creature();
		c1.x = 10;
		c1.y = 11;
		
		System.out.println("The hero have " + h1.life + " of life");
		System.out.println("The creature have " + c1.life + " of life");
		
		h1.attack(c1);
		c1.attack(h1);
		
		System.out.println("The hero have " + h1.life + " of life");
		System.out.println("The creature have " + c1.life + " of life");
		
		h1.attack(c1);
		c1.attack(h1);
		
		h1.attack(c1);
		c1.attack(h1);
		
		c1.move(Direction.NORTH);
		h1.attack(c1);
		c1.attack(h1);
		
		System.out.println("The hero have " + h1.life + " of life");
		System.out.println("The creature have " + c1.life + " of life");
		
	}
}
