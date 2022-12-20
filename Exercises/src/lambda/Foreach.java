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
		
		System.out.println("\n#01 Lambda way");	
		approved.forEach(name -> System.out.println(name + "."));
		
		System.out.println("\n#01 Method Reference");
		approved.forEach(System.out::println);
		
		System.out.println("\n#02 Lambda way");	
		approved.forEach(name -> myPrintOut(name + "."));
		
		System.out.println("\n#02 Method Reference");
		approved.forEach(Foreach::myPrintOut);
	}
	
	static void myPrintOut(String name) {
		System.out.println("Hello my name is " + name);
	}
}
