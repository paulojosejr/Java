package lambda;

import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		
		Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";
		
		Function<String, String> result= value -> "The result is: " + value;
		
		Function<String, String> excited = value -> value + "!!!";
		
		Function<String, String> doubt = value -> value + "???";
		
		String finalResult1 = evenOrOdd.andThen(result).andThen(excited).apply(32);
		System.out.println(finalResult1);
		
		String finalResult2 = evenOrOdd.andThen(result).andThen(doubt).apply(33);
		System.out.println(finalResult2);
		
		System.out.println(evenOrOdd.apply(32));
	}
}
