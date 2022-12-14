package oo.abstracts;

public class Dog extends Mammal {
	
	@Override
	public String move() {
		return "With paws";
	}
	
	@Override
	public String nurse() {
		return "With milk";
	}
}
