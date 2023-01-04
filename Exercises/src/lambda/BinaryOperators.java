package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperators {
	public static void main(String[] args) {
		
		BinaryOperator<Double> average = (n1, n2) -> (n1 + n2) / 2;
		
		System.out.println(average.apply(9.9, 3.0));
		
		BiFunction<Double, Double, String> result = (n1 , n2) -> {
			double finalGrade = (n1 + n2) / 2;
			return finalGrade >= 7 ? "Approved" : "Fail";
		};
		
		System.out.println(result.apply(9.9, 3.0));
		
		Function<Double, String> concept = m -> m >= 7 ? "Approved": "Fail";
		
		System.out.println(average.andThen(concept).apply(9.9, 3.0));
	}
}
