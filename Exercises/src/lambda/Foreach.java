package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		
		List <String> approved = Arrays.asList("Ana", "Luk", "Jon", "Guy");
		
		System.out.println("Traditional way");
		for(String name: approved) {
			System.out.println(name);
		}
		
		System.out.println("\nLambda way");	
		approved.forEach(name -> System.out.println(name + "."));
		
		System.out.println("\nMethod Reference");
		approved.forEach(System.out::println);
	}
}
