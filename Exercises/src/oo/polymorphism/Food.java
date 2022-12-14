package oo.polymorphism;

public abstract class Food {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
	
	public Food (double weight) {
		this.weight = weight;
	}
}
