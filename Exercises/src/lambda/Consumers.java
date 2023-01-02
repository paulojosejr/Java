package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumers {
	public static void main(String[] args) {
		Consumer<Product> print = p -> System.out.println(p.name);
		
		Product p1 = new Product("Pen", 5.32, 0.05);
		print.accept(p1);
		
		Product p2 = new Product("Backpack", 20.30, 0.05);
		Product p3 = new Product("Book", 10.22, 0.03);
		Product p4 = new Product("Eraser", 1.25, 0.02);
		Product p5 = new Product("Pencil", 8.05, 0.09);
		Product p6 = new Product("Highlighter", 6.45, 0.07);
		
		List<Product> products = Arrays.asList(p2, p3, p4, p5, p6);
		
		products.forEach(print);
		
		products.forEach(p -> System.out.println(p.price));
		products.forEach(System.out::println);
	}
}
