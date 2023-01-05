package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Store {
	public static void main(String[] args) {

		Function<Product, Double> finalPrice = product -> product.price * (1 - product.discount);
		UnaryOperator<Double> cityTax = price -> price >= 2500 ? price * 1.085 : price;
		UnaryOperator<Double> freight = price -> price >= 3000 ? price + 100 : price + 50;
		UnaryOperator<Double> round = price -> Double.parseDouble(String.format("%.2f", price));
		Function<Double, String> format = price -> ("€" + price).replace(".", ",");
		
		Product p = new Product("Notebook", 1525.20, 0.13);
		
		String price = finalPrice.andThen(cityTax).andThen(freight).andThen(round).andThen(format).apply(p);
		System.out.println("The final price is " + price);
	}
}
