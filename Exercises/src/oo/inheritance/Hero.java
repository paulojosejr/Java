package oo.inheritance;

public class Hero extends Player{
	boolean attack(Player enemy) {
		boolean attack1 = super.attack(enemy);
		boolean attack2 = super.attack(enemy);
		boolean attack3 = super.attack(enemy);
		return attack1 || attack2 || attack3;
	}
}
