package lambda;

public class NewCalculator {
	public static void main(String[] args) {
		
		Calculation calculation = (a, b) -> { return a + b; };
		System.out.println(calculation.run(5, 4));
		
	}
}
