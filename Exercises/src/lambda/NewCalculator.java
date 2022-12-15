package lambda;

public class NewCalculator {
	public static void main(String[] args) {
		
		Calculation calc = (a, b) -> { return a + b; };
		System.out.println(calc.run(5, 4));
		
		calc = (a, b) -> a * b;
		System.out.println(calc.run(3, 5));
	}
}
