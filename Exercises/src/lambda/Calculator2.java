package lambda;

import java.util.function.BinaryOperator;

public class Calculator2 {
	public static void main(String[] args) {
		BinaryOperator<Double> calculation = (x , y) -> { return x + y;};
		System.out.println(calculation.apply(5.0, 4.0));
		
		calculation = (x, y) -> x * y;
		System.out.println(calculation.apply(2.0, 4.0));
	}
}
