package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {
	public static void main(String[] args) {
		
		Supplier<List<String>> listOne = () -> Arrays.asList("Paulo", "Juliana", "Lucas");
		
		System.out.println(listOne.get());
	}
}
