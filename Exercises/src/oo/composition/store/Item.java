package oo.composition.store;

public class Item {
	final int quantity;
	final Product product;
	
	Item(Product product, int quantity){
		this.product = product;
		this.quantity = quantity;
	}
}
