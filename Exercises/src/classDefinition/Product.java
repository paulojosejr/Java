package classDefinition;

public class Product {
	String name;
	double price;
	static double discount = 0.25;

	Product() {

	}

	Product(String startName) {
		name = startName;
	}

	Product(String startName, double startPrice) {
		name = startName;
		price = startPrice;
	}

	double discountPrice(double extraDiscount) {
		double result = price * (1 - (discount + extraDiscount));
		return result;
	}

	double discountPrice() {
		double result = price * (1 - discount);
		return result;
	}
}
