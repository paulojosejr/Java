package classDefinition;

public class Product {
	String name;
	double price;
	double discount;

	Product() {

	}

	Product(String startName) {
		name = startName;
	}

	Product(String startName, double startPrice, double startDiscount) {
		name = startName;
		price = startPrice;
		discount = startDiscount;
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
