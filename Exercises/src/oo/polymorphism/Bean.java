package oo.polymorphism;

public class Bean {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
	
	public Bean (double weight) {
		this.weight = weight;
	}
}
