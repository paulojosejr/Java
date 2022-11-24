package oo.composition;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println(c1.isOn());
		
		c1.turnOn();
		System.out.println(c1.isOn());
		System.out.println(c1.motor.spins());
		
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		c1.speedUp();
		System.out.println(c1.motor.spins());
		
		c1.brake();
		c1.brake();
		c1.brake();
		c1.brake();
		System.out.println(c1.motor.spins());
	}
}
