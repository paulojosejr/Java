package oo.composition;

public class Motor {
	final Car car;
	boolean on = false;
	double injection = 1;
	
	Motor(Car car){
		this.car = car;
	}
	
	int spins() {
		if(!on) {
			return 0;
		}else {
			return (int) Math.round(injection * 3000);
		}
	}
}
