package fundamentals;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		final double ADJUSTMENT = 32;
		final double FACTOR = 5.0/9.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit");
		int fahrenheit = sc.nextInt();
		double celsius = (fahrenheit - ADJUSTMENT) * FACTOR;
		System.out.println("Fahrenheit = " + fahrenheit + " | Celsius = " + celsius);
		sc.close();
	}
}
