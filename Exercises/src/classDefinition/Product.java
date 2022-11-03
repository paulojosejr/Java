package classDefinition;

public class Product {
	String name;
	double price;
	double discount;
	
	double discountPrice(double extraDiscount) {
		double result = price * (1 - (discount + extraDiscount));
		return result;
	}
	
	double discountPrice() {
		double result = price * (1 - discount);
		return result;
	}
}
