package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class printingObjects {
	public static void main(String[] args) {
		
		List<String> approveds = Arrays.asList("Juliana", "Paulo", "Jon", "Rick");
		
		System.out.println("With foreach");
		for(String name: approveds) {
			System.out.println(name);
		}
		
		System.out.println("\nWith Iterator");
		
		Iterator<String> iterator = approveds.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nWith Stream");
		Stream<String> stream = approveds.stream();
		stream.forEach(System.out::println);
	}
}
