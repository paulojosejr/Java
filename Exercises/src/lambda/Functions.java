package lambda;

import java.util.function.Function;

public class Functions {
	public static void main(String[] args) {
		
		Function<Integer, String> evenOrOdd = number -> number % 2 == 0 ? "Even" : "Odd";
		
	}
}
