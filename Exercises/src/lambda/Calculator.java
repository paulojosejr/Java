package lambda;

public class Calculator {
	public static void main(String[] args) {
		Calculation calculation = new Sum();
		System.out.println(calculation.run(5, 4));
		
		calculation = (Calculation) new Multiply();
		System.out.println(calculation.run(2, 4));
	}
}
