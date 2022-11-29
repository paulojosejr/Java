package oo.composition.store;

public class Program {
	public static void main(String[] args) {

		Purchase purchase1 = new Purchase();
		purchase1.addItem("Pen", 4.22, 32);
		purchase1.addItem(new Product("Notebook", 1897.22), 3);
		
		Purchase purchase2 = new Purchase();
		purchase2.addItem("Copybook", 10.22, 16);
		purchase2.addItem(new Product("Printer", 297.22), 7);
		
		Client client = new Client("Rick Grimes");
		client.addPurchase(purchase1);
		client.purchases.add(purchase2);
		
		System.out.println(client.getTotalValue());
		System.out.println(client.getAverage());
	}
}
