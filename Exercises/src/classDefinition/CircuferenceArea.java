package classDefinition;

public class CircuferenceArea {
	double radius;
	final static double PI = 3.14;
	
	CircuferenceArea(double startRadius){
		radius = startRadius;
	}
	
	double area() {
		return PI * Math.pow(radius, 2);
	}
}
