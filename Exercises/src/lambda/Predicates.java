package lambda;

import java.util.function.Predicate;

public class Predicates {
	public static void main(String[] args) {
		
		Predicate<Product> isExpensive = product -> product.price * (1 - product.discount) >= 750;
		Product product = new Product("Notebook", 2499.80, 0.15);
		System.out.println(isExpensive.test(product));
	}
}
