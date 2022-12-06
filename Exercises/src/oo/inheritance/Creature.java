package oo.inheritance;

public class Creature extends Player{
	
	Creature(){
		this(0, 0);
	}
	
	Creature(int x, int y){
		super(x, y);
	}
}
