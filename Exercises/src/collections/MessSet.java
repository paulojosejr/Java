package collections;

import java.util.HashSet;
import java.util.Set;

public class MessSet {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add(1.3);
		set.add(true);
		set.add("test");
		set.add(1);
		set.add('x');
		
		System.out.println("The size is: " + set.size());
		
		set.add("test");
		set.add('x');
		System.out.println("The size is: " + set.size());
		
		System.out.println(set.remove("test"));
		
		System.out.println("The size is: " + set.size());
		
		System.out.println(set.contains('x'));
		
		System.out.println(set);
		
		Set numbers = new HashSet();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		System.out.println(numbers);
		
		set.retainAll(numbers);
		System.out.println(set);
	}
}
