package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class HomogeneousSet {
	public static void main(String[] args) {
		SortedSet<String> names = new TreeSet<>();
		
		names.add("Carl");
		names.add("Matheus");
		names.add("Rick");
		names.add("Peter");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		Set<Integer> numbers = new HashSet<>();
		
		numbers.add(22);
		numbers.add(15);
		numbers.add(26);
		numbers.add(37);
		
		for(int number: numbers) {
			System.out.println(number);
		}
	}
}