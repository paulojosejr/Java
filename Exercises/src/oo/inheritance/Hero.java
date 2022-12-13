package oo.inheritance;

public class Hero extends Player{
	
	public Hero(int x, int y){
		super(x, y);
	}
	boolean attack = true;
	public boolean attack(Player enemy) {
		boolean attack = super.attack(enemy);
		return attack;
	}
	
	public boolean Critical(Player enemy) {
		boolean attack1 = super.attack(enemy);
		boolean attack2 = super.attack(enemy);
		return attack1 || attack2;
	}
	
	public boolean SuperCritical(Player enemy) {
		boolean attack1 = super.attack(enemy);
		boolean attack2 = super.attack(enemy);
		boolean attack3 = super.attack(enemy);
		return attack1 || attack2 || attack3;
	}
	
	public boolean SuperHeadCritical(Player enemy) {
		boolean attack1 = super.attack(enemy);
		boolean attack2 = super.attack(enemy);
		boolean attack3 = super.attack(enemy);
		boolean attack4 = super.attack(enemy);
		return attack1 || attack2 || attack3 || attack4;
	}
}
