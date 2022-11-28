package oo.composition.store;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
	final List<Item> items = new ArrayList<>();
	
	void addItem(Product p, int qtt) {
		this.items.add(new Item(p, qtt));
	}
	
	void addItem(String name, double price, int qtt) {
		var product = new Product(name, price);
		this.items.add(new Item(product, qtt));
	}
	
	double getTotalValue() {
		double total = 0;
		
		for(Item item: items) {
			total += item.quantity * item.product.price;
		}
		
		return total;
	}
}
