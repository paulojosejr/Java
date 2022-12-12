package oo.polymorphism;

public class Dinner {
	public static void main(String[] args) {
	
		People guest = new People(99.65);
		
		Rice ingredient1 = new Rice(0.21);
		Bean ingredient2 = new Bean(0.1);
		
		System.out.println(guest.getWeight());
		
		guest.eat(ingredient1);
		guest.eat(ingredient2);
		
		System.out.println(guest.getWeight());
		
		IceCream dessert = new IceCream(0.4);
		
		guest.eat(dessert);
		
		System.out.println(guest.getWeight());
		
	}
}
