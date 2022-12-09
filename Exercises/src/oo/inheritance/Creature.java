package oo.inheritance;

public class Creature extends Player{
	
	public Creature(){
		this(0, 0);
	}
	
	public Creature(int x, int y){
		super(x, y);
	}
}
