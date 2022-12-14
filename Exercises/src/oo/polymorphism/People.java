package oo.polymorphism;

public class People {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void eat(Food food) {
		this.weight += food.getWeight();
	}
	
	public void setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
	
	public People (double weight) {
		this.weight = weight;
	}
}
