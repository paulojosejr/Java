package lambda;

import java.util.function.UnaryOperator;

public class UnaryOperators {
	public static void main(String[] args) {
		UnaryOperator<Integer> plusTwo = n -> n + 2;
		UnaryOperator<Integer> timesTwo = n -> n * 2;
		UnaryOperator<Integer> sqrt = n -> n * n;
		
		int result1 = plusTwo.andThen(timesTwo).andThen(sqrt).apply(0);
		
		System.out.println(result1);
	}
}
