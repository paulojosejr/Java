package classDefinition;

public class TestProduct {
	public static void main(String[] args) {
		
		Product prod1 = new Product();
		prod1.name = "Notebook";
		prod1.price = 2399.50;
		prod1.discount = 0.3;
		
		var prod2 = new Product();
		prod2.name = "black pen";
		prod2.price = 12.56;
		prod2.discount = 0.25;
		
		System.out.println(prod1.name);
		System.out.println(prod1.discountPrice());
		
		System.out.println(prod2.name);
		System.out.println(prod2.discountPrice(0.2));
	}
}
