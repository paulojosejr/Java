package oo.polymorphism;

public class People {
	private double weight;
	
	public double getWeight() {
		return weight;
	}

	public void eat(Rice rice) {
		this.weight += rice.getWeight();
	}
	
	public void eat(Bean bean) {
		this.weight += bean.getWeight();
	}
	
	public void eat(IceCream iceCream) {
		this.weight += iceCream.getWeight();
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
