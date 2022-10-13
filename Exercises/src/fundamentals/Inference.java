package fundamentals;

public class Inference {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		//a = "..."; you can't change the type
		
		var b = 4.5;
		System.out.println(b);
		
		b = 5;
		System.out.println(b);
		
		//b = "..."; it's the same for inferences.
		
		var c = "text";
		System.out.println(c);
		
		c = "other text";
		System.out.println(c);
	}
}
