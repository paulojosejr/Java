package oo.composition;

public class Car {
	final Motor motor;
	
	Car(){
		this.motor = new Motor(this);
	}
	
	void speedUp() {
		if(motor.injection < 2.6) {
			motor.injection += 0.4;
		}
	}
	
	void brake() {
		if(motor.injection > 0.5) {
			motor.injection -= 0.4;
		}
	}
	
	void turnOn() {
		motor.on = true;
	}
	
	void turnOff() {
		motor.on = false;
	}
	
	boolean isOn() {
		return motor.on;
	}
}
