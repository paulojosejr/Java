package classDefinition;

public class TestProduct {
	public static void main(String[] args) {
		
		Product prod1 = new Product("Notebook", 2399.50);
		
		var prod2 = new Product();
		prod2.name = "Black pen";
		prod2.price = 12.56;
		
		Product.discount = 0.50;
		
		System.out.println(prod1.name);
		System.out.println(prod1.discountPrice());
		
		System.out.println(prod2.name);
		System.out.println(prod2.discountPrice(0.2));
	}
}
