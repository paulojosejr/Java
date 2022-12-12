package oo.polymorphism;

public class IceCream {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if(weight >= 0) {
			this.weight = weight;
		}
	}
	
	public IceCream (double weight) {
		this.weight = weight;
	}
	
}
