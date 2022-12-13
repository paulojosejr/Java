package oo.inheritance.program;

import oo.inheritance.Creature;
import oo.inheritance.Direction;
import oo.inheritance.Hero;

public class Game {
	public static void main(String[] args) {
		Hero h1 = new Hero(10, 10);
		
		Creature c1 = new Creature();
		c1.setPositionX(10);
		c1.setPositionY(11);
		
		System.out.println("The hero has " + h1.getLife() + " of life");
		System.out.println("The creature has " + c1.getLife() + " of life");
		
		h1.attack(c1);
		c1.attack(h1);
		
		System.out.println("The hero has " + h1.getLife() + " of life");
		System.out.println("The creature has " + c1.getLife() + " of life");
		
		h1.Critical(c1);
		c1.attack(h1);
		
		h1.SuperCritical(c1);
		c1.attack(h1);
		
		c1.move(Direction.NORTH);
		h1.attack(c1);
		c1.attack(h1);
		
		System.out.println("The hero has " + h1.getLife() + " of life");
		System.out.println("The creature has " + c1.getLife() + " of life");
		
	}
}
