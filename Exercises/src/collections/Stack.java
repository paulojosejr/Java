package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
	public static void main(String[] args) {
		
		Deque<String> books = new ArrayDeque<>();
		
		books.add("The little prince");
		books.push("Harry Potter");
		books.push("Hobbit");
		books.push("Lord of the rings");
		
		for(String book: books) {
			System.out.println(book);
		}
		
		System.out.println("");
		System.out.println(books.peek());
		System.out.println(books.element());
		
		System.out.println(books.poll());
		System.out.println(books.poll());
		System.out.println(books.poll());
		
		System.out.println(books.size());
	}
}
