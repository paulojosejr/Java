package oo.composition;

public class TestPurchase {
	public static void main(String[] args) {
		Purchase p1 = new Purchase();
		p1.client = "Rick";
		
		p1.items.add(new Item("Pen", 20, 1.25));
		p1.items.add(new Item("Pencil", 112, 0.23));
		p1.items.add(new Item("Eraser", 14, 0.40));
		p1.items.add(new Item("Sharpener", 22, 0.19));
		p1.items.add(new Item("Notebook", 9, 5.45));
		p1.items.add(new Item("Bag", 4, 15.95));
		
		System.out.println(p1.items.size());
		System.out.println(p1.getTotalValue());
	}
}
